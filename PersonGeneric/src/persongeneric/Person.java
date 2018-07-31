/*/** Person user defined class

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persongeneric;

/**
 * Person user defined class
 *
 * @generic @author alexguntermann
 */
public class Person<T> {

    private String firstName;
    private String lastName;
    private String middleName;
    private int age;
    private int weight;
    private T major;

    // default constructor
    public Person() {
        this.firstName = "";
        this.lastName = "";
        this.middleName = "";
        this.age = 0;
        this.weight = 0;
        this.major = null;

    }

    // overidden constructor
    public Person(String firstName, String lastname, String middleName, int age, int weight, T major) {
        this.firstName = firstName;
        this.lastName = lastname;
        this.middleName = middleName;
        this.age = age;
        this.weight = weight;
        this.major = major;

    }

    //start of set methods - returning void!
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastname(String lastname) {
        this.lastName = lastname;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setMajor(T major) {
        this.major = major;
    }

    // start of get methods - returns the data type!
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public T getMajor() {
        return major;
    }

    public String getFullName() {
        return this.getFirstName() + " " + this.getLastName() + " " + this.getMiddleName();

    }

    public Person deepCopy() {
        Person p = new Person(firstName, lastName, middleName, age, weight, major);
        return p;
    }

    @Override
    public String toString() {
        return "Name: " + getFullName() +"\n"+ "Age: " + age + "\n" + "Weight: " + 
                weight + "\n" + "Major: " + major;
        
    }
}
