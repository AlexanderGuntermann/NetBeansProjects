/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alexguntermann
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueex;

/**
 *
 * @author alexguntermann
 */
public class Driver {

    public static void main(String[] args) {
        GenericQueue();
        NormalQueue();
        FrontShifting();

    }

    public static void NormalQueue() {
        
        System.out.println("***** Integer Circular Queue *****");
        
        QueueEx queue = new QueueEx(5);

        queue.enqueue(15);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.print();

    }

    public static void GenericQueue() {

        System.out.println("***** GENERIC Circular Queue *****");
        GenericQueue<Integer> intQueue = new GenericQueue(5);

        intQueue.enqueue(15);
        intQueue.print();

        intQueue.enqueue(14);
        intQueue.print();

        intQueue.enqueue(11);
        intQueue.print();

        intQueue.enqueue(6);
        intQueue.print();
//
//        intQueue.enqueue(5);
//        intQueue.print();
//
//        intQueue.dequeue();
//        intQueue.dequeue();
//        intQueue.dequeue();
//        intQueue.dequeue();
//        intQueue.dequeue();
//
//        intQueue.print();

    }

    public static void FrontShifting() {

        
        
        System.out.println("***** Front Shifting *****");
        
        FrontFacing examp = new FrontFacing();

        examp.enqueue(20);
        examp.print();
        examp.enqueue(19);
        examp.print();
        examp.enqueue(18);
        examp.print();
        examp.enqueue(17);
        examp.print();
        examp.enqueue(15);
        examp.print();

        examp.dequeue();
       // examp.print();
        examp.dequeue();
       // examp.print();
        examp.dequeue();
        //examp.print();
        examp.dequeue();
        //examp.print();
        examp.dequeue();

//        examp.print();
//        examp.enqueue(16);
//        examp.print();
//        examp.enqueue(15);
//        examp.print();
//        examp.enqueue(14);
//        examp.dequeue();
//        examp.dequeue();
//        examp.dequeue();
//        examp.dequeue();
//        examp.dequeue();
//        examp.dequeue();
//        examp.print();
    }

}
