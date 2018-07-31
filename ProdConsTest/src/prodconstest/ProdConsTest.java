/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prodconstest;

import java.util.Random;
import java.util.concurrent.locks.Condition;

import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alexguntermann
 */
public class ProdConsTest {

    public static void main(String s[]) throws InterruptedException {
        SharedData4 data = new SharedData4();
        Producer p1 = new Producer(data);
        Producer p2 = new Producer(data);
        Producer p3 = new Producer(data);
        Consumer c1 = new Consumer(data);
        Consumer c2 = new Consumer(data);
        Consumer c3 = new Consumer(data);

        p1.start();
        p2.start();
        p3.start();
        c1.start();
        c2.start();
        c3.start();

        long startTime = System.nanoTime();

        p1.join();
        p2.join();
        p3.join();
        c1.join();
        c2.join();
        c3.join();

        long endTime = System.nanoTime();

        //System.out.println("Sorted Data");
        // data too big to print
        //sms.printData();
        long totalNanos = endTime - startTime;
        long minutes = totalNanos / 1000000000 / 60;
        totalNanos -= minutes * 60000000000L;
        long seconds = (int) (totalNanos / 1000000000.0);
        totalNanos -= seconds * 1000000000L;
        long milliSeconds = (int) (totalNanos / 1000000.0);
        System.out.printf("%nTime: %02d:%02d:%03d %n%n", minutes, seconds, milliSeconds);
        System.out.println("Complete!");

    }
}

class Producer extends Thread {

    private SharedData4 data;
    private Random random = new Random();

    public Producer(SharedData4 d) {
        data = d;
    }

    public void run() {
        for (int i = 1; i <= SharedData4.COUNT; i++) {
            try {
                data.setSharedData(i);
            } catch (InterruptedException ex) {
                Logger.getLogger(Producer.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println("Producer produced " + i);
            try {
                sleep(Math.max(1, random.nextInt(1000 / SharedData4.COUNT)));
//                sleep((int) (Math.random() * 1000));
            } catch (InterruptedException e) {
            }
        }
    }
}

class Consumer extends Thread {

    private SharedData4 data;
    private Random random = new Random();

    public Consumer(SharedData4 d) {
        data = d;
    }

    public void run() {
        int local;
        for (int i = 1; i <= SharedData4.COUNT; i++) {
            try {
                sleep((Math.max(1, random.nextInt(1000 / SharedData4.COUNT))));
            } catch (InterruptedException e) {
            }
            try {
                local = data.getSharedData();
                System.out.println("Consumer used " + local);
            } catch (InterruptedException ex) {
                Logger.getLogger(Consumer.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

class SharedData3 {

    private final int BUF = 5;
    //public static final int COUNT = 100;
    private int sharedInt[] = new int[BUF];
    private boolean writeOK = true;
    private boolean readOK = false;
    private int readLoc = 0, writeLoc = 0;

    public synchronized void setSharedData(int val) {
        while (!writeOK) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        sharedInt[writeLoc] = val;
        readOK = true;
        writeLoc = ++writeLoc % BUF;
        if (writeLoc == readLoc) {
            writeOK = false;
        }
        notify();
    }

    public synchronized int getSharedData() {
        int val;
        while (!readOK) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        writeOK = true;
        val = sharedInt[readLoc];
        readLoc = ++readLoc % BUF;
        if (readLoc == writeLoc) {
            readOK = false;
        }
        notify();
        return val;
    }
}

class SharedData4 {

    private final ReentrantLock lock = new ReentrantLock();
    final Condition notConsumed = lock.newCondition();
    final Condition notProduced = lock.newCondition();
    private boolean writeOK = true;
    private boolean readOK = false;

    private final int BUF = 10;
    public static final int COUNT = 500;
    private int sharedInt[] = new int[BUF];
    private int readLoc = 0, writeLoc = 0;

    public void setSharedData(int val) throws InterruptedException {
        lock.lock();
        try {
            while (!writeOK) {
                notProduced.await();
            }
            sharedInt[writeLoc] = val;
            readOK = true;
            writeLoc = ++writeLoc % BUF;
            if (writeLoc == readLoc) {
                writeOK = false;
            }
            notConsumed.signalAll();
        } finally {
            lock.unlock();
        }
    }

    public int getSharedData() throws InterruptedException {

        int val;
        lock.lock();
        try {
            // default of readOk is true
            while (!readOK) {
                notConsumed.await();
            }
            writeOK = true;
            val = sharedInt[readLoc];
            readLoc = ++readLoc % BUF;
            if (readLoc == writeLoc) {
                readOK = false;
            }
            notProduced.signal();
            return val;

        } finally {
            lock.unlock();

        }

    }
}
