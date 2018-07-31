/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pet;

/**
 *
 * @author alexguntermann
 */
public class PetDriver {

    public static final int MALE = 0, FEMALE = 1, SPAYED = 2, NEUTERED = 3;

    public static void main(String[] args) {
        Pet p1 = new Pet("Spot", "Mary", "Black and White");
        p1.setSex(MALE);
        System.out.println(p1.toString());
        System.out.println("");
        Pet p2 = new Pet("Charlie", "Alex", "Black");
        p2.setSex(MALE);
        System.out.println(p2.toString());

        System.out.println("");

        Pet p3 = new Pet("Sparkle", "Lisa", "Brown");
        p3.setSex(SPAYED);
        System.out.println(p3.toString());

        System.out.println("");

        Pet p4 = new Pet("Coby", "Jayda", "White and Tan");
        p4.setSex(NEUTERED);
        System.out.println(p4.toString());

        System.out.println("");

        Pet p5 = new Pet("Pooh", "Sommer", "Grey");
        p5.setSex(MALE);
        System.out.println(p5.toString());

        System.out.println("");

        Pet p6 = new Pet("Charlie", "Alex", "Green");
        p6.setSex(FEMALE);
        System.out.println(p6.toString());

    }

}
