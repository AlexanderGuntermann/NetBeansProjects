/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package example1;

import java.util.logging.Logger;

/**
 *
 * @author alexguntermann
 */
public class Example1 {

    
    int hello = 1;
    String helloOne;
    String that;

    public Example1(String helloOne, String that) {
        this.helloOne = helloOne;
        this.that = that;
    }

    public int getHello() {
        return hello;
    }

    public String getHelloOne() {
        return helloOne;
    }

    public String getThat() {
        return that;
    }

    public void setHello(int hello) {
        this.hello = hello;
    }

    public void setHelloOne(String helloOne) {
        this.helloOne = helloOne;
    }

    public void setThat(String that) {
        this.that = that;
    }

    

    @Override
    public String toString() {
        return "Example1{" + "hello=" + hello + ", helloOne=" + helloOne + ", that=" + that + '}';
    }
    
    
    
    
          
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
