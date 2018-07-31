/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themepark;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author alexguntermann
 */
public class ThemePark {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Random randForRides = new Random();
        String rider1 = " ";
        String rider2 = " ";
        int rideGenerator = randForRides.nextInt(10) + 1;

        Ride[] rides = new Ride[rideGenerator];
        ArrayList<String> rideArray = new ArrayList<>();
        Ride examp = new Ride();

        int numberOfSuccessfulRides = 0;
        int numberOfPeopleInLine = 0;

        for (int i = 0; i < rides.length; i++) {
            rides[i] = new Ride();

        }

        for (int totalTime = 1; totalTime <= 60; totalTime++) {

            int arrival = randForRides.nextInt(100) + 1;
            int totalRiders;

            //if 50% probablilty then 0 riders
          if (arrival > 10 && arrival <= 50) {
                totalRiders = 1;

            } //if 10% probability then 2 riders
            else {
                totalRiders = 2;
            }

            int lineProbability = randForRides.nextInt(10);

            boolean regularLine = false;

            boolean fastPass = false;

            //if greater than 5 then fast pass else regular line
            if (lineProbability <= 5 && lineProbability >= 0) {
                fastPass = true;

            } else {
                regularLine = true;
            }

            int rideSelection = randForRides.nextInt(rideGenerator);

            int lineSelection = randForRides.nextInt(10) + 1;
            //names stored to an array then randomly selected
            String[] names = {"Josefine",
                "Caryl",
                "Geraldine",
                "Erich",
                "Ouida",
                "Corina",
                "Hyun",
                "Jaimie",
                "Shonta",
                "Raymundo",
                "Glen",
                "Pearline",
                "Kendal",
                "Yadira",
                "Chery",
                "Lakenya",
                "Jackqueline",
                "Douglass",
                "Micheal",
                "Tai",
                "Magdalene",
                "Marquerite",
                "Edith",
                "Roderick",
                "Vanetta",
                "Leanne",
                "Nicol",
                "Shery",
                "Rafaela",
                "Mozell"};
            
            if (totalRiders == 2) {
                int randomNumberForNames = randForRides.nextInt(names.length);
                String randomName = names[randomNumberForNames];

                //fast pass line
                if (lineSelection >= 5) {
                    rides[rideSelection].enqueueFast(randomName);
                    rides[rideSelection].enqueueFast(randomName);
                    numberOfPeopleInLine++;
                    numberOfPeopleInLine++;

                }

                //regular line
                if (lineSelection < 5) {
                    rides[rideSelection].enqueueRegular(randomName);
                    rides[rideSelection].enqueueRegular(randomName);
                    numberOfPeopleInLine++;
                    numberOfPeopleInLine++;

                }

            } else if (totalRiders == 1) {

                int randomNumberForNames = randForRides.nextInt(names.length);

                String randomName = names[randomNumberForNames];

                //fast pass line 50% join rate
                if (lineSelection >= 5) {
                    rides[rideSelection].enqueueFast(randomName);
                    numberOfPeopleInLine++;

                }

                //regular line 50% join rate
                if (lineSelection < 5) {
                    rides[rideSelection].enqueueRegular(randomName);
                    numberOfPeopleInLine++;

                }

            }
            //statements for dequeing riders and keeping count of how many people rode a ride
            if (totalTime % rides[rideSelection].getTime() == 0) {
                
                
                
                rides[rideSelection].dequeueFast();
                numberOfSuccessfulRides++;
            }
            

            if (totalTime % rides[rideSelection].getTime() == 0) {
                
                rides[rideSelection].dequeueRegular();

                numberOfSuccessfulRides++;

            
            }
            System.out.println("Time: " + totalTime);
            System.out.println("");
            System.out.println("Number of rides: " + rideGenerator);
            System.out.println("");
            if(numberOfSuccessfulRides != 0){
            System.out.println("Number of happy riders: " + numberOfSuccessfulRides);
            } else {
                System.out.println("No one has ridden a ride yet");
            }
            System.out.println("");


           // System.out.println(rideArray);

//            if (numberOfPeopleInLine != 0) {
//                System.out.println("Average waiting time: "  +   "minutes");
//                
//            } else {
//                System.out.println("Average waiting time: 0");
//            }
//            System.out.println("");
//            
//            if (numberOfSuccessfulRides != 0) {
//                System.out.println("Average time spent on a ride: " + totalTime * 1.0 / numberOfSuccessfulRides);
//                System.out.println("");
//            } else {
//                System.out.println("Average waiting time: 0");
//                System.out.println("");
            
            for (int i = 0; i < rides.length; i++) {

                System.out.println("Ride number: " + i);
                System.out.println(rides[i]);

            }

           

        }

    }
}

