/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friends;

import java.io.IOException;
import java.util.*;
import java.io.RandomAccessFile;

/**
 *
 * @author alexguntermann
 */
public class Friends {

    private String firstName;
    private String lastName;
    private String phone1;
    private String phone2;
    private int age;

    private static int LENGTH = 15;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhone1() {
        return phone1;
    }

    public String getPhone2() {
        return phone2;
    }

    public int getAge() {
        return age;
    }

    public static int getLENGTH() {
        return LENGTH;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhone1(String phone1) {
        this.phone1 = phone1;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void setLENGTH(int LENGTH) {
        Friends.LENGTH = LENGTH;
    }

    public void write(RandomAccessFile file) throws IOException {
        file.writeInt(age);
        
        StringBuffer buf;

        if (phone1 != null) {
            buf = new StringBuffer(phone1);
        } else {
            buf = new StringBuffer(phone1);
        }

        buf.setLength(LENGTH);
        file.writeChars(buf.toString());

        if (phone2 != null) {
            buf = new StringBuffer(phone2);
        } else {
            buf = new StringBuffer(phone2);
        }

        buf.setLength(LENGTH);
        file.writeChars(buf.toString());

        

        if (firstName != null) {
            buf = new StringBuffer(firstName);
        } else {
            buf = new StringBuffer(LENGTH);
        }
        buf.setLength(LENGTH);
        file.writeChars(buf.toString());
        if (lastName != null) {
            buf = new StringBuffer(lastName);
        } else {
            buf = new StringBuffer(LENGTH);
        }
        buf.setLength(LENGTH);
        file.writeChars(buf.toString());
    }

    public void read(RandomAccessFile file) throws IOException {

        // read the age
        age = file.readInt();
        
        // create a character array and convert it to a string ot be written
        char telephone1[] = new char[LENGTH];
        for (int i = 0; i < telephone1.length; i++) {
            telephone1[i] = file.readChar();
            
        }
        phone1 = new String(telephone1);
        
        
        char telephone2[] = new char[LENGTH];
        for (int i = 0; i < telephone2.length; i++) {
            telephone2[i] = file.readChar();
            
        }
        
        phone2 = new String(telephone2);
        
        char first[] = new char[LENGTH];
        for (int i = 0; i < first.length; i++) {
            first[i] = file.readChar();
        }
        firstName = new String(first);
        char last[] = new char[LENGTH];
        for (int i = 0; i < last.length; i++) {
            last[i] = file.readChar();
        }
        lastName = new String(last);
    }

    public String toString() {
        return String.format("%-15s %-15s %10s %-15s %-15s",
                lastName, firstName, age, phone1, phone2);
    }

    public static int size() {
        return 124;
    }
}

/**
 * @param args the command line arguments
 */
