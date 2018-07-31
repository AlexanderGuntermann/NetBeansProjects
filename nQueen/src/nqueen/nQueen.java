/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nqueen;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author alexguntermann
 */
public class nQueen {

    private int[] data;
    private int size, fitness;

    Random rand = new Random();

    public nQueen(int size) { //overidden constructor
        this.size = size;
        this.data = new int[size];
        this.fitness = 0;

        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(4) + 1;
        }

    }

    public void fitness() {
//n^2 for loop to solve for each position pair
        for (int i = 1; i < data.length; i++) {
            for (int j = 0; j < i; j++) {
                if (data[i] == data[j]) { //if two positions are the same, this means they are attacking. increment fitness
                    fitness++;
                } else { //if the difference between the iterated variable - data[i] & [j] are equal, then increment fitness
                    if (Math.abs(i - data[i]) == Math.abs(j - data[j])) {
                        fitness++;
                    }
                }

            }

        }
    }

    public int getFitness() {
        return this.fitness;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return Arrays.toString(data);
    }

    public nQueen crossover(nQueen member) { //crossover method that takes an nQueen object as parameter

        int randomPosition = rand.nextInt(4); //random number from 1-4 

        nQueen crossover = new nQueen(size); //new nQueen object that is the result of the crossover

        for (int i = 0; i < randomPosition; i++) { //start from 0 -> randomPosition and set it to data[i]
            crossover.data[i] = data[i];
        }
        for (int j = randomPosition; j < data.length; j++) { //start from the random position to the end of the data object
            crossover.data[j] = member.data[j];

        }

        return crossover;

    }

    public void mutation(double rate) {
        int mutateRandom = rand.nextInt((int) (1.0 / rate)) + 1; //random number for mutation rate
        int mutatePosition = rand.nextInt(size); //random position that is affected by the mutation
        if (1.0 / mutateRandom == rate) { //if the given probability occurs, mutation happens
            System.out.println("mutatation occurs");
            data[mutatePosition] = rand.nextInt(size) + 1; //randomly selected position randomly mutates to a number within the size
        }
        
    }  public nQueen clone(){ //copy method used to create new parents for reproducing the next generation
            nQueen copy = new nQueen(size);
            for (int i = 0; i < data.length; i++) {
                copy.data[i] = data[i];
                
            }
            return copy;
            
        }
    }


