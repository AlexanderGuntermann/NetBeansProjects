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
public class FrontFacing {
    
    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author alexguntermann
 */


    private int size, rear, front, count;
    private int[] data;

    //default constructor
    public FrontFacing() {
        this(5);
    }

    //overidden contstructor 
    public FrontFacing(int size) {
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
            data[rear++] = element;
            count++;

            return true;
        } else
        return false;
    }
    //Dequeue element
    public int dequeue(){
        if(!isEmpty()){
            int element = data[front++];
            count --;
            return element;
        }
        return -1;
    }
    public String toString(){
        String result = "";
        int num = count;
        
       
        
        if(!isEmpty()){
            for(int i = front; i<size; i++){
                result += "|" + data[i] + "|\n";
                num--;
            }
        }
            else {
            result = "| |";
            
        }
        return result;
    }
    //print method 
    public void print(){
        System.out.println(this);
        }
            
        }
    


    

