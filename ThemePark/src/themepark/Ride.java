/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package themepark;

import java.util.Random;

/**
 *
 * @author alexguntermann
 */
public class Ride {

    LinkedListQueue regular = new LinkedListQueue();
    LinkedListQueue fastLine = new LinkedListQueue();

    private int time, numberOfRiders;

    Random randOne = new Random();
    int randomRideLength = randOne.nextInt(5) + 1;
    //duration of the ride is a number from 1-5 in minutes
    int lengthOfRide = randomRideLength;
    //capacity of the ride ranges from 1 to 10 people

    public Ride(int time, int numberOfRiders) {
        this.time = time;
        this.numberOfRiders = numberOfRiders;
    }

    public Ride() {
        this.time = lengthOfRide;
        this.numberOfRiders = 5;
    }

    public int getTime() {
        return time;
    }

    public int getNumberOfRiders() {
        return numberOfRiders;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setNumberOfRiders(int numberOfRiders) {
        this.numberOfRiders = numberOfRiders;
    }

    public void enqueueFast(String rider) {
        fastLine.insert(rider);
    }

    public void enqueueRegular(String rider) {
        regular.insert(rider);
    }

    public void dequeueFast() {
        fastLine.dequeue();
        
    
    }

    public void dequeueRegular() {
         regular.dequeue();
    }
   

    @Override
    public String toString() {
        return "Ride: " + "Duration of Ride: " + time + ", Capacity: " + numberOfRiders + "\n\n" + "This is the fast line: "
            + fastLine.toString() + "\n\n" + "This is the regular line: " + regular.toString() +"\n\n";
    }

}
