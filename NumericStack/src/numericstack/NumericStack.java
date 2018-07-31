/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numericstack;

/**
 *
 * @author alexguntermann
 */
public class NumericStack {
    

    private int top, size;
    private int [] data;

    //@overridden
    public NumericStack(int size) {
        this.size = size;
        this.top = -1;
        this.data = new int[size];
    }

    //default construcotor
    public NumericStack() {
        this(5);
    }

    public boolean isEmpty() {
        return (top == -1);
    }
    public boolean isFull() {
        return (top == size-1);
        
    } //peek is option 3
    public int peek(){
        if(!isEmpty()){
            return data[top];
        }
        return -1;
    } //push is menu option 1
    public boolean push(int element){
        if(!isFull()){
            top++;
            this.data[top] = element;
            return true;
                   
        }
        return false;
    } //pop is menu option 2
    public int pop(){
        if(!isEmpty()){
            int topValue = data[top];
            top--;
            return topValue;
        }
        return -1;
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


    
