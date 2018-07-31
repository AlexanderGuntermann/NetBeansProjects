/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nqueen;

/**
 * @author alexguntermann
 */
public class Driver {

    public static void main(String[] args) {

        int n = 4; //N number of queens
        int populationSize = 100; //size of population
        double mutationRate = 0.025; //rate of mutation
        int generation = 100; //amount of generations that the algorithm will run

        nQueen[] population = new nQueen[populationSize]; //nQueen object array wth size populationSize
        for (int h = 0; h < population.length; h++) {
            population[h] = new nQueen(n);

            population[h].fitness();

        }
        int highestScore = population[0].getFitness();
        int bestFitness = 0;
        int secondBest = 0;


        for (int l = 0; l < generation; l++) {

            highestScore = n * (n - 1) / 2;
            for (int i = 0; i < population.length; i++) {
                if (population[i].getFitness() < highestScore) {
                    bestFitness = i;
                    highestScore = population[i].getFitness();
                }

            }

            highestScore = n * (n - 1) / 2;
            for (int i = 1; i < population.length; i++) {
                if (population[i].getFitness() < highestScore && i != bestFitness) {
                    secondBest = i;
                    highestScore = population[i].getFitness();

                }
            }
            if (population[bestFitness].getFitness() == 0) { // if the best fitness is found, break

                System.out.println(population[bestFitness].toString());
                break;
            }
            //displays the highest fitness and second best fitness after each iteration
            System.out.println("The population at position: " + bestFitness + " has the highest " +
                    "fitness " + population[bestFitness].toString());
            System.out.println("");
            System.out.println("The population at position: " + secondBest + " has the second highest " +
                    "fitness " + population[secondBest].toString());

            nQueen parentOne = population[bestFitness].clone();

            nQueen parentTwo = population[secondBest].clone();

            for (int i = 0; i < population.length; i++) { //run a crossover of parentOne and parentTwo and probability of mutation. Return fitness
                population[i] = parentOne.crossover(parentTwo);
                population[i].mutation(mutationRate);
                population[i].fitness();

            }
        }
    }

}
