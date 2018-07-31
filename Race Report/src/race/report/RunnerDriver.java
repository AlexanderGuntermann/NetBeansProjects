/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package race.report;

import java.util.Scanner;

/**
 *
 * @author alexguntermann
 */
public class RunnerDriver {

    public static void main(String[] args) {

        System.out.println("For each runner, enter the data in the following format\nLast First Middle time\n"
                + "For Example: Smith Jane Jouise 87.491");
        System.out.println("");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the name and time for Runner 1:");
        String lastName = input.next();
        String firstName = input.next();
        String middleName = input.next();
        double time = input.nextDouble();
        TimeClass time1 = new TimeClass(time);

        Name name1 = new Name(firstName, lastName, middleName);
        Runner runner1 = new Runner(name1, time1);

        System.out.print("Enter the name and time for Runner 2:");
        lastName = input.next();
        firstName = input.next();
        middleName = input.next();
        time = input.nextDouble();
        System.out.println("Race Report");
        Name name2 = new Name(firstName, lastName, middleName);
        TimeClass time2 = new TimeClass(time);
        System.out.println("");
        Runner runner2 = new Runner(name2, time2);

        System.out.println("Runner 1: " + runner1);
        System.out.println("Runner 2: " + runner2);
        System.out.println("");
        
        if (runner1.getTime().getTime() < runner2.getTime().getTime()) {
            System.out.println("Winning time: Runner 1: " + runner1);
        } else if (runner1.getTime().getTime() > runner2.getTime().getTime()) {
            System.out.println("Winning time: Runner 2: " + runner2);

        double differenceTime = time1.minus(time2).getTime();
            System.out.println("Difference: " + String.format("%.3f", differenceTime)+" secs");
            
        }
        double averageTime = time1.plus(time2).getTime();
        double averageHours = averageTime/3600;
        double averageMinutes = averageTime/60;
         
        System.out.println(averageHours + " hr : " + averageMinutes+ " mins : " + ");
        

    }
    
    

}
