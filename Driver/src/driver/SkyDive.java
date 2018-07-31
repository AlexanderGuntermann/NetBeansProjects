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
    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alexguntermann
 *
 */
public class SkyDive {

    private int numOfPeople, numOfLodge, numOfLux;
    private double baseCharge, discount, totalCharges, minimum_deposit, costOfLodge, costOfLux;

    public SkyDive() {

        this.numOfPeople = 0;
        this.baseCharge = 400;
        this.discount = 0;
        this.minimum_deposit = 0;
        this.costOfLodge = 65;
        this.numOfLodge = 0;
        this.costOfLux = 120;
        this.numOfLux = 0;

    }

    public SkyDive(int numOfPeople,
            int numOfLodge, int numOfLux, double baseCharge,
            double discount,
            double rent_cost, double totalCharges,
            double minimum_deposit, int totalPeople, double costOfLodge, double costOfLux) {

        this.numOfPeople = numOfPeople;
        this.numOfLodge = numOfLodge;
        this.baseCharge = baseCharge;
        this.discount = discount;
        this.minimum_deposit = minimum_deposit;
        this.costOfLodge = costOfLodge;
        this.costOfLux = costOfLux;
        
    }

    public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople_instruct) {
        this.numOfPeople = numOfPeople_instruct;
    }

    public int getNumOfLodge() {
        return numOfLodge * 4 * 65;
    }

    public void setNumOfLodge(int numOfLodge) {
        this.numOfLodge = numOfLodge;
    }

    public double getBaseCharge() {
        return this.baseCharge * (numOfPeople);
    }

    public void setBaseCharge(double baseCharge) {
        this.baseCharge = baseCharge;
    }

    public double getDiscount() {
        double discount = 0;
        if (eligibilityDiscount() == true) {
            discount = 0.1 * getBaseCharge();
        }
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getNumOfWilderness() {
        return numOfLux * 4;
    }

    public void setNumOfWildernesss(int numOfWilderness) {
        this.numOfLux = numOfWilderness;
    
    }
    public double getTotalCharges() {
        
        return getBaseCharge() + getNumOfLodge()+ getNumOfWilderness() - getDiscount();
    }

    public void setTotalCharges(double totalCharges) {
        this.totalCharges = totalCharges;
    }

    public double getMinimum_deposit() {
        return getTotalCharges() /2;
    }

    public void setMinimum_deposit(double minimum_deposit) {
        this.minimum_deposit = minimum_deposit;
    }

    public boolean eligibilityDiscount() {
        return numOfPeople >= 5;

    }

   

    public int getNumOfLux() {
        return numOfLux;
    }

    public double getCostOfLodge() {
        return costOfLodge;
    }

    public double getCostOfLux() {
        return costOfLux;
    }

    public void setNumOfLux(int numOfLux) {
        this.numOfLux = numOfLux;
    }

    public void setCostOfLodge(double costOfLodge) {
        this.costOfLodge = costOfLodge;
    }

    public void setCostOfLux(double costOfLux) {
        this.costOfLux = costOfLux;
    }
    
    

    
    
    

    @Override
    public String toString() {
        return "Number of people in the party: " + getNumOfPeople() + "\nBase Charges: " + getBaseCharge()
                  + "\nDiscount: $"
                + getDiscount() + "\nTotal Charges: $"
                + getTotalCharges() + "\nRequired Deposit: $" + getMinimum_deposit();

    }
}

    

