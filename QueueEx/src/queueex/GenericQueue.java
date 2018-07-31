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
public class GenericQueue<T> {
    
 
    private int size, rear, front, count;
    private T [] data;

    //default constructor
    public GenericQueue() {
        this(5);
    }

    //overidden contstructor 
    public GenericQueue(int size) {
        this.front = 0;
        this.rear = -1;
        this.count = 0;
        this.size = size;
        this.data = (T[])new Object[this.size];
        
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

    public boolean enqueue(T element) {
        if (!isFull()) {
            rear = (rear + 1) % size;
            data[rear] = element;
            count++;

            return true;
        } else{
        return false;
    }}
    //else int top value = data[front++];
    //count--;
   // return topvalue;
    //Dequeue element
    public T dequeue(){
        if(!isEmpty()){
            T element = data[front];
            front = (front + 1 % size);
            count --;
            return element;
        }
        return null;
    }
    //print method 
    public String toString(){
        String result = "";
        int num = count;
        
        if(!isEmpty()){
            for(int i = front; num > 0; i =((i+1)%size)){
                result += "|" + data[i] +  "|\n";
                num--;
            }
        }
            else {
            result = "| |";
            
        }
        return result;
    }
    public void print(){
        System.out.println(this);

} 


}



