/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dummydriver;

/**
 *
 * @author alexguntermann
 */
public class Calculator <T> {


    private int top, size;
    private T[] data;

    //@overridden
    public Calculator (int size) {
        this.size = size;
        this.top = -1;
        this.data = (T[]) new Object[size];
    }

    //default construcotor
    public Calculator () {
        this(5);
    }

    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == size-1);
        
    } //peek is option 3
    public T peek(){
        if(!isEmpty()){
            return data[top];
        }
        return null;
    } //push is menu option 1
    public boolean push(T element){
        if(!isFull()){
            top++;
            this.data[top] = element;
            return true;
                   
        }
        return false;
    } //pop is menu option 2
    public T pop(){
        if(!isEmpty()){
            T topValue = data[top];
            top--;
            return topValue;
        }
        return null;
    }
    public int count(){
        return (top+1);
    } //print is menu option 4
    public String toString(){
        String result ="";
        if(!isEmpty()){
            for(int i = top; i >= 0; i--){
                result += "|"+data[i] + "|\n";
                
            }
            
        } else
        result = "|     |";
            return result;
    }
    public void print(){
        System.out.println(this);
    }
}
