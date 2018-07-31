/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockfriends;


import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class DriverCreate {

    private static Friends friend;
    private static RandomAccessFile file;
    private static String[] last = {"Smith", "Jones", "Thomas", "Williams", "Randolph"};
    private static String[] first = {"Joe", "Fred", "Erin", "Ron", "Ed"};
    private static String[] phone1 = {"123-456-7790", "999-001-5544", "111-222-3334", "555-666-0011", "123-444-5566"};
    private static String[] phone2 = {"748-904-9242", "999-001-5544", "111-222-33344", "555-666-0011", "555-432-2341"};
    private static int[] age = {20, 30, 40, 60, 60};

    public static void main(String[] args) {
        Block block = new Block(-1L,-1L);

        try {
            file = new RandomAccessFile("rand.dat", "rw");
            for (int i = 0; i < last.length; i++) {
                friend.setAge(age[i]);
                friend.setFirstName(first[i]);
                friend.setLastName(last[i]);
                friend.setPhone1(phone1[i]);
                friend.setPhone2(phone2[i]);
                System.out.println(friend); // echo to screen
                friend.write(file);
            }

        } catch (IOException e) {
            System.err.println("File not opened properly\n" + e.toString());
            System.exit(1);
        }

    }
}
