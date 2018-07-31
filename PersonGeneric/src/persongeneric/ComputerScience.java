/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persongeneric;

/**
 *
 * @author alexguntermann
 */
public class ComputerScience {

    private String name, school;
    private int numberOfCredits;

    public ComputerScience() {
        
       this.name = "";
       this.school = "";
       this.numberOfCredits = 0;
       
        
    }

    public ComputerScience(String name, String school, int numberOfCredits) {
        this.name = name;
        this.school = school;
        this.numberOfCredits = numberOfCredits;
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    @Override
    public String toString() {
        return "Computer Science"+ "\n"+
                "School: " + school + "\n"+ "Number of Credits are: " + numberOfCredits;
        
    }
    

}
