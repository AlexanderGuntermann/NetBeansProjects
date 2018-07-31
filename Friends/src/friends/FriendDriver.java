/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package friends;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author alexguntermann
 */
public class FriendDriver {

    private Friends friend;
    private RandomAccessFile file;

    public FriendDriver() throws IOException {
        friend = new Friends();
        
        System.out.println("1 – Display all Friends\n" + "2 - Search for a Friend\n" + "3 – Modify a Friend\n"
                    + "4 – Add a Friend\n"
                    + "5 – Delete a Friend\n"
                    + "6 – File Dump\n"
                    + "7 – Quit the Program");
            Scanner input = new Scanner(System.in);
            int numberChoice = input.nextInt();
        
        
        
        try {
            file = new RandomAccessFile("rand.dat", "rw");
            // Display 5th record from File
            file.seek(4 * friend.size());
            friend.read(file);
            System.out.println(String.format("%s\n%s", "5th Record", friend));
                // File dump - add case later
            file.seek(0L); // rewind the file
            System.out.println("\nDisplay ALL records from File:\n");
            while (true) {
                friend.read(file);
                System.out.println(friend);
            }
        } // try
        catch (EOFException eof) {
        } catch (IOException e) {

            System.err.println("File not opened properly\n"
                    + e.toString());
            System.exit(1);
        }

    }

    public static void main(String args[]) throws IOException {
        FriendDriver friendDriver = new FriendDriver();
        
    }
}
