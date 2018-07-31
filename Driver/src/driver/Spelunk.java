/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

/**
 *
 * @author alexguntermann
 */
public class Spelunk {

    private int numOfPeople, numOfPeopleRenting;
    private double baseCharge, discount, costOfEquip, totalCharges, minimumDeposit;
    private int totalPeople;

    public Spelunk() {

        this.numOfPeople = 0;
        this.numOfPeopleRenting = 0;
        this.baseCharge = 700;
        //this.discount = 0;
        this.minimumDeposit = 0;
        this.costOfEquip = 40;
        this.totalCharges = 0;
        this.totalPeople = 0;
        // this(0, 0, 700

    }

    public Spelunk(int numOfPeople, int numOfPeopleRenting, double baseCharge, double costOfEquip, double totalCharges, double minimumDeposit, int totalPeople) {
        this.numOfPeople = numOfPeople;
        this.numOfPeopleRenting = numOfPeopleRenting;
        this.baseCharge = baseCharge;
        //this.discount = discount;
        this.costOfEquip = costOfEquip;
        this.totalCharges = totalCharges;
        this.minimumDeposit = minimumDeposit;
        this.totalPeople = totalPeople;
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public int getNumOfPeopleRenting() {
        return numOfPeopleRenting;
    }

    public double getBaseCharge() {
        return baseCharge;
    }

    public double getDiscount() {
        double discount = 0;
        if (eligibilityDiscount() == true) {
            discount = 0.1 * getBaseCharge();
        }
        return discount;

    }
    public double getCostOfEquip() {
        return costOfEquip * 8 * numOfPeopleRenting;
    }

    public double getTotalCharges() {
        return  getBaseCharge() + getCostOfEquip() - getDiscount();
    }

    public double getMinimumDeposit() {
        return getTotalCharges() /2;
    }

    public int getTotalPeople() {
        return totalPeople = numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    public void setNumOfPeopleRenting(int numOfPeopleRenting) {
        this.numOfPeopleRenting = numOfPeopleRenting;
    }

    public void setBaseCharge(double baseCharge) {
        this.baseCharge = baseCharge;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setCostOfEquip(double costOfEquip) {
        this.costOfEquip = costOfEquip;
    }

    public void setTotalCharges(double totalCharges) {
        this.totalCharges = totalCharges;
    }

    public void setMinimumDeposit(double minimumDeposit) {
        this.minimumDeposit = minimumDeposit;
    }

    public void setTotalPeople(int totalPeople) {
        this.totalPeople = totalPeople;
    }
     public boolean eligibilityDiscount() {
        return getTotalPeople() >= 5;

    }
     
     @Override
    public String toString() {
        return "Number of people in the party: " + getTotalPeople() + "\nBase Charges: $" + getBaseCharge() + "\nEquipment cost: " + getCostOfEquip()
                  + "\nDiscount: $"
                + getDiscount() + "\nTotal Charges: $"
                + getTotalCharges() + "\nRequired Deposit: $" + getMinimumDeposit();

    
    
    

    
    
    
}
}