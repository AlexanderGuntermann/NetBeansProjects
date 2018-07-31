/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

import java.util.Scanner;

/**
 *
 * @author alexguntermann
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        menuOptions();
        // TODO code application logic here
    }

    public static void menuOptions() {

        System.out.println("High Adventure Travel Agency\n"
                + "............................\n"
                + "1) Devil's Courthouse Adventure Weekend\n"
                + "2) Scuba Bahama\n"
                + "3) Sky-Dive Colorado\n"
                + "4) Barron Cliff Spelunk\n"
                + "5) Exit Program\n"
                + "Enter 1, 2, 3, 4, or 5:");

                 int userChoice = 0;
                 
        boolean isValidNumber = false;
        do {
            try {
                System.out.println("Which of the four options would you like to do?");
                 userChoice = input.nextInt();
                if (userChoice <= 0 || userChoice > 5) {
                    System.out.println("Please input a number less than 5");
                }else{
                    isValidNumber = true;
                }
            } catch (Exception ex) {
                System.err.println("Not a number. Try again...");
                isValidNumber = false;
                input.nextLine();
            }
        } while (!isValidNumber);

        
        
        
        switch (userChoice) {

            case 1:
                Climbing climbing = new Climbing();

                System.out.println("Devil's Courthouse Adventure Weekend\n"
                        + "....................................");

                System.out.println("Please input the number of people needing instruction");
                int numOfPeopleInstruction = input.nextInt();
                climbing.setNumOfPeople_instruct(numOfPeopleInstruction);

                System.out.println("Please input the number of Advanced Climbers");
                int numOfAdvance = input.nextInt();
                climbing.setNumOfPeople_advancedClimbers(numOfAdvance);

                System.out.println("Please input number of party members renting equipment");
                int numOfRent = input.nextInt();
                climbing.setNumOfPeople_renting(numOfRent);
                

                System.out.println(climbing.toString());

                break;

            case 2:

                Scuba scuba = new Scuba();

                System.out.println("Scuba Bahama\n"
                        + "....................................");
                
                System.out.println("Please input the total amount of people who are in the party: ");
                int totalPeople = input.nextInt();
                scuba.setNumOfPeople(totalPeople);
                
                
                System.out.println("Please iput the number of people who need instruction: ");
                int numOfInstruction = input.nextInt();
                scuba.setNumOfPeople_instruct(numOfInstruction);

                System.out.println(scuba.toString());

                break;

            case 3:
                System.out.println("Sky Dive Colorado\n"
                        + "....................................");

                SkyDive skydive = new SkyDive();
                
                System.out.println("Please input the total number of people");
                int totals = input.nextInt();
                skydive.setNumOfPeople(totals);
                
                

                System.out.println("Please input the number of people staying at the Wilderness Lodge");
                int wildy = input.nextInt();
                skydive.setNumOfWildernesss(wildy);

                System.out.println("Please input the number of people staying at the Luxury");
                int lux = input.nextInt();
                skydive.setNumOfLodge(lux);

                System.out.println(skydive.toString());

                break;

            case 4:

                System.out.println("Baron Cliff Spelunk\n"
                        + "....................................");

                Spelunk spelunk = new Spelunk();
                System.out.println("Please input the number of people in your party");
                int party = input.nextInt();
                spelunk.setNumOfPeople(party);

                System.out.println("Please input the number of pople in your party renting equipment");
                int rent = input.nextInt();
                spelunk.setNumOfPeopleRenting(rent);

                System.out.println(spelunk.toString());
                break;

            case 5:
                System.out.println("Now exiting. Thank you!");          
                System.exit(0);
                break;

        }
    }

}
