/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraymanipulator;

/**
 *
 * @author alexguntermann
 */
public class ArrayManipulator <T> {

    private int size, location;
    private T [] data;

    /**
     * @param args the command line arguments
     */
    public ArrayManipulator(int s) {
        this.size = s;
        this.location = -1;
        this.data = (T[])(new Object[size]);
    }

    public ArrayManipulator() {
        this(5);
    }

    public boolean isEmpty() {
        return location == -1;
    }

    public boolean isFull() {
        return location == (size - 1);
    }

    public boolean insert(T element) {
        if (!isFull()) {
            this.data[++location] = element;
            System.out.println("You inserted an element. Awesome!");
            
            

            return true;
            

        }
        System.out.println("Sorry! The Array is full");
        return false;
    }

    public int search(T element) {
        if (!isEmpty()) {
            for (int i = 0; i <= location; i++) {
                if (element == data[i]) {
                    return i;

                }
            }
        }
        System.out.println("That element doesn't exist, sorry!");
        return -1;
    }

    public boolean delete(T element) {
        if (isEmpty()) {
            System.out.println("The array is empty, you cant delete anything!");
            return false;

        }

        int foundLocation = search(element);
        if (foundLocation != -1) {
            for (int i = foundLocation; i < location; i++) {
                data[i] = data[i + 1];
            }
            location--;
            return true;
        }
        return false;
    }

    public void display() {
        if (!isEmpty()) {
            for (int i = 0; i <= location; i++) {
                System.out.print(data[i]+"\n");
            }
        } else {
            System.out.println("empty");

        }
    }
}
