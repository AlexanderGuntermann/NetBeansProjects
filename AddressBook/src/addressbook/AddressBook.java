/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author alexguntermann
 */
public class AddressBook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(new FileReader("Addresses.txt"));

            int count = input.nextInt();
            Entry[] entry = new Entry[count];
            int i = 0;

            while (input.hasNextLine()) {
                
                System.out.println(input.nextLine());
//                String line = input.nextLine(); //name
//                Scanner input2 = new Scanner(line);
//                Name name = new Name(input2.next(), input2.next(), input2.next());
//                System.out.println("name = " + name);
//                String lineStreet = input.nextLine(); //street, 1 line after the name line
                
//                 line = input.nextLine(); //name
//                 input2 = new Scanner(line);
//                Address a = new Address(lineStreet, input2.next(), input2.next(), input2.nextInt());
//                System.out.println("a = " + a.getCity());
//                int area = input.nextInt();
//                long last = input.nextLong();
//                Phone hi = new Phone(area, last);
//
//                Entry entry1 = new Entry(name, a, hi);
//                System.out.print(entry1);

            }

        } catch (Exception e) {

        }

    }

}
