/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

/**
 *
 * @author alexguntermann
 */
public class Entry {

    private Name name1;
    private Address address1;
    private Phone phone1;

    public Entry() {
    }
    
    
    public Entry(Name name1, Address address1, Phone phone1) {
        this.name1 = name1;
        this.address1 = address1;
        this.phone1 = phone1;
    }

    public Name getName1() {
        return name1;
    }

    public Address getAddress1() {
        return address1;
    }

    public Phone getPhone1() {
        return phone1;
    }

    public void setName1(Name name1) {
        this.name1 = name1;
    }

    public void setAddress1(Address address1) {
        this.address1 = address1;
    }

    public void setPhone1(Phone phone1) {
        this.phone1 = phone1;
    }

    @Override
    public String toString() {
        return "Entry{" + "name1=" + name1 + ", address1=" + address1 + ", phone1=" + phone1 + '}';
    }

}
