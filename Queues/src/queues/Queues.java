/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queues;

/**
 *
 * @author alexguntermann
 */
public class Queues {
    
    private int size, rear, front, count;
    private int [] data;

    public Queues(){
        this(10);
    
    }
    public Queues(int size){
        this.front = 0;
        this.rear = -1;
        this.count = 0;
        this.data = new int [size];
        
    }
    public boolean isFull() {
        return count == size;
    }
    public boolean isEmpty(){
        return count ==0;
    }
    public boolean enqueue(int element){
        if(!isFull()){
            rear = (rear +1) % size;
            data[rear] = element;
            count++;
        
        return true;
    }   return false;
    
    
    
}
    public int dequeue(){
        if(!isEmpty()){
            int element = data[front];
            front = (front + 1 % size);
            count--;
            return element;
        }
        return -1;
    }
    public void print(){
        if(!isEmpty()){
            for(int i =0; i != rear; i = (i+1) % size){
                System.out.println(data[i]+" ");
            }
        }
    }
}
    

    

