/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friends;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

/**
 *
 * @author alexguntermann
 */
public class DriverCreate {

    private static Friends friend;
    private static RandomAccessFile file;
    private static String[] last = {"Smith", "Jones", "Thomas", "Williams", "Randolph"};
    private static String[] first = {"Joe", "Fred", "Erin", "Ron", "Ed"};
    private static String[] phone1 = {"5556667788", "1112234455", "4401234212", "1112223100", "2011109021"};
    private static String[] phone2 = {"748-904924", "9990015544", "11122233344", "5556660011", "5554321234"};
    private static int[] age = {20, 30, 40, 60, 60};

    public static void main(String[] args) {
        friend = new Friends();

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

            System.out.println("1 – Display all Friends\n" + "2 - Search for a Friend\n" + "3 – Modify a Friend\n"
                    + "4 – Add a Friend\n"
                    + "5 – Delete a Friend\n"
                    + "6 – File Dump\n"
                    + "7 – Quit the Program");
            Scanner input = new Scanner(System.in);
            int numberChoice = input.nextInt();

            if (numberChoice == 1) {
                System.out.println("Displaying all friends - ");
                System.out.println(friend);
            } else if (numberChoice == 2) {
                System.out.println("Please input the name you would like to search for: ");
                String name = input.next();

            }

            if (numberChoice == 2) {
                System.out.println("Please input the friends first name: ");
                String friendName = input.next();

                for (int i = 0; i < last.length; i++) {
                    if (first[i].equalsIgnoreCase(friendName)) {
                        System.out.println(String.format("%-15s %-15s %10d %-15s %-15s", first[i], last[i], age[i], phone1[i], phone2[i]));

                    } else {
                        System.out.println("The friend you are looking for doesn't exist");
                        break;
                    }

                }

            }

            //  write to file
        } // try
        catch (IOException e) {
            System.err.println("File not opened properly\n" + e.toString());
            System.exit(1);
        }

    }
}
