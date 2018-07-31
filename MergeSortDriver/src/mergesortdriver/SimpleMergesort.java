/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mergesortdriver;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Random;

/**
 *
 * @author alexguntermann && Scott Ivan
 */
public class SimpleMergesort {

    private int size;
    private static RandomAccessFile F, A, B;
    private static int maxPass;
    private int n;
    private Random rand;
    private StringBuffer runInfo;


    // size dictates how big the data set is
    public SimpleMergesort() throws IOException {
        this(1024*32);
    }

    public SimpleMergesort(int size) throws FileNotFoundException {
        rand = new Random();
        this.size = size;
        F = new RandomAccessFile("F.dat", "rw");
        A = new RandomAccessFile("A.dat", "rw");
        B = new RandomAccessFile("B.dat", "rw");
        runInfo = new StringBuffer(2048);

        maxPass = (int) Math.ceil(Math.log(size) / Math.log(2));
        runInfo.append("MaxPass = " + maxPass + "\n\n");

    }

    public void addData() throws IOException {
        rand = new Random();

        F = new RandomAccessFile("F.dat", "rw");
        A = new RandomAccessFile("A.dat", "rw");
        B = new RandomAccessFile("B.dat", "rw");
        F.seek(0L);
        A.seek(0L);
        B.seek(0L);

        for (int i = 0; i < size; i++) {
            F.writeInt(rand.nextInt(100) + 1);

        }
        for (int i = 0; i < size / 2; i++) {
            A.writeInt(0);
            B.writeInt(0);

        }
    }

    public void split(RandomAccessFile F, RandomAccessFile A, RandomAccessFile B, int n) throws IOException {
        F.seek(0L);
        A.seek(0L);
        B.seek(0L);

        for (int i = 0; i < size / (2 * n); i++) {
            for (int j = 0; j < n; j++) {
                A.writeInt(F.readInt());
            }
            for (int k = 0; k < n; k++) {
                B.writeInt(F.readInt());

            }

        }

    }

    public void readFile(RandomAccessFile ex) throws IOException {

        ex.seek(0L);
        for (int i = 0; i < size; i++) {
            System.out.println(ex.readInt());

        }
    }

    // main driver method that performs the operation
    public static void main(String[] args) throws IOException {
        SimpleMergesort a = new SimpleMergesort();

        a.addData();
        //a.readFile(F);    - - Test to see unsorted data
        System.out.println("The number of passes needed are: " + maxPass);
        long startTime = System.nanoTime();
        a.mergesort();

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

        System.out.println(a.getRunInfo());
        System.out.printf("%nTime: %02d:%02d:%03d %n%n", minutes, seconds, milliSeconds);
        System.out.println("MergeSort Complete!");
//        a.split(F, A, B, 1);
//        //a.split(F, A, B, );
//        //a.readFile(A);
//        System.out.println("next file");
//        //a.readFile(B);
//        a.merge(F, A, B, 1);
    }

    public void merge(RandomAccessFile F, RandomAccessFile A, RandomAccessFile B, int n) throws IOException {
        F.seek(0L);
        A.seek(0L);
        B.seek(0L);

        int a, b;

        int aCount = 0;
        int bCount = 0;

//        
        for (int i = 0; i < size / (2 * n); i++) {
            aCount = bCount = n;

            a = A.readInt();
            b = B.readInt();

            while (aCount != 0 && bCount != 0) {
                if (a < b) {
                    F.writeInt(a);
                    aCount--;

                    if (aCount != 0) {
                        a = A.readInt();
                    }
                } else {
                    F.writeInt(b);
                    bCount--;

                    if (bCount != 0) {
                        b = B.readInt();
                    }
                }

            }  // while

            while (aCount-- != 0) {
                F.writeInt(a);
                if (aCount != 0) {
                    a = A.readInt();
                }
            }

            while (bCount-- != 0) {
                F.writeInt(b);
                if (bCount != 0) {
                    b = B.readInt();
                }
            }

        }
    }

    // method that performs the splits and merges based on the number of max passes (calculated as maxPass)
    public void mergesort() throws IOException {

        for (int pass = 0, count = 1; pass < maxPass; pass++, count *= 2) {
            split(F, A, B, count);
            merge(F, A, B, count);
        }
    }

    public String getRunInfo() {
        return runInfo.toString();
    }
}
