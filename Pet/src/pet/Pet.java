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
public class Pet {

    private String petName;
    private String ownerName;
    private String color;
    private int sex;

    public Pet(String name, String ownerName, String color) {
        petName = name;
        this.ownerName = ownerName;      //this. makes the variable classwide
        this.color = color;

    }
    //constructor is a template.

    public String getPetname() {
        return petName;
    }

    public String getOwnername() {
        return ownerName;
    }

    public String getcolor() {
        return color;
    }

    public void setSex(int sexid) {
        sex = sexid;
    }

    public String getSex() {
        if (sex == PetDriver.FEMALE){
            return "Female";
        }else if (sex == PetDriver.MALE){
                        return "Male";

       }else if (sex == PetDriver.NEUTERED){
           return "Neutered";
       }else if (sex == PetDriver.SPAYED){
           return "Spayed";
       }else {
           return "Invalid sex";
       }
       
    }

    public String toString() {
        String output = petName + " owned by " + ownerName + "\nColor: " + color + "\nSex: " + getSex();
        return output;

    }

}
