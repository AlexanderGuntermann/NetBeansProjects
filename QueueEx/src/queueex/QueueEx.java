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
public class QueueEx {

    private int size, rear, front, count;
    private int[] data;

    //default constructor
    public QueueEx() {
        this(5);
    }

    //overidden contstructor 
    public QueueEx(int size) {
        this.front = 0;
        this.rear = 0;
        this.count = 0;
        this.size = size;
        this.data = new int[size];

    }

    //isFull method
    public boolean isFull() {
        return count == size;

    }
    //isEmpty method

    public boolean isEmpty() {
        return count == 0;

    }
    //Enqueue Element

    public boolean enqueue(int element) {
        if (!isFull()) {
            rear = (rear + 1) % size;
            data[rear] = element;
            count++;

            return true;
        }
        else
        return false;
    }

    //Dequeue element
    public int dequeue() {
        if (!isEmpty()) {
            int element = data[front];
            front = (front + 1 % size);
            count--;
            return element;
        }
        return -1;
    }

    public String toString() {
        String result = "";
        int num = count;

        if (!isEmpty()) {
            for (int i = front; num > 0; i = ((i + 1) % size)) {
                result += "|" + data[i] + "|\n";
                num--;
            }
        } else {
            result = "| |";

        }
        return result;

    }

    public void print() {
        System.out.println(this);
        
            }

        }
    


