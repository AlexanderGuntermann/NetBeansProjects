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
public class PersonGeneric {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Person<ComputerScience> p1 = new Person<>();
        p1.setFirstName("Alex");
        p1.setLastname("Guntermann");
        p1.setMiddleName("Lucas");
        p1.setAge(21);
        p1.setWeight(180);

        ComputerScience cpsc = new ComputerScience("Computer Science", //each argument separated by ,
                "College of Computer Science and Engineering", 33);

        p1.setMajor(cpsc);
        System.out.println("Person Personal and Major Information");
        System.out.println(p1.toString());
        System.out.println("");

        Person p2 = new Person();
        p2 = p1.deepCopy(); //deep copy of p1!!!

        ComputerEngineering cpeg = new ComputerEngineering("Computer Engineering",
                "College of Computer Science of Engineering", 55);

        p2.setMajor(cpeg);
        System.out.println("Person Personal and Major Information");
        System.out.println(p2.toString());
        System.out.println("");

        Person p3 = new Person();
        p3 = p1.deepCopy();
        
        Psychology psych = new Psychology("Psychology", "College of Humanities and Social Sciences", 23);

        p3.setMajor(psych);
        System.out.println("Person Personal and Major Information");
        System.out.println(p3.toString());
        System.out.println("");
    }

}
