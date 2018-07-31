/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driver;

/**
 *
 * @author alexguntermann
 *
 */
public class Scuba {

    private int numOfPeople_instruct;
    private int numOfPeople;
    private double baseCharge, discount, instruction_Cost, rent_cost, totalCharges, minimum_deposit;
    

    public Scuba() {

        this.numOfPeople_instruct = 100;
        this.numOfPeople = 0;
        this.baseCharge = 1000;
        this.discount = 0;
        this.minimum_deposit = 0;
        this.instruction_Cost = 100;
        this.rent_cost = 40;
        

    }

    public Scuba(int numOfPeople_instruct, int numOfPeople_advancedClimbers,
            int numOfPeople_renting, double baseCharge,
            double discount, double instruction_Cost,
            double rent_cost, double totalCharges,
            double minimum_deposit, int totalPeople) {

        this.numOfPeople_instruct = numOfPeople_instruct;
        this.numOfPeople= numOfPeople;
        this.baseCharge = baseCharge;
        this.discount = discount;
        this.minimum_deposit = 0;
        this.instruction_Cost = instruction_Cost;
        this.rent_cost = rent_cost;
    }

    public int getNumOfPeople_instruct() {
        return numOfPeople_instruct;
    }

    public void setNumOfPeople_instruct(int numOfPeople_instruct) {
        this.numOfPeople_instruct = numOfPeople_instruct;
    }

        public int getNumOfPeople() {
        return numOfPeople;
    }

    public void setNumOfPeople(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }
        

    public void setNumOfPeople_renting(int numOfPeople) {
        this.numOfPeople = numOfPeople;
    }

    public double getBaseCharge() {
        return this.baseCharge * numOfPeople;
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

    public double getInstruction_Cost() {
        return instruction_Cost * numOfPeople_instruct;
    }

    public void setInstruction_Cost(double instruction_Cost) {
        this.instruction_Cost = instruction_Cost;
    }

   
    

    public void setRent_cost(double rent_cost) {
        this.rent_cost = rent_cost;
    }

    public double getTotalCharges() {
        return getBaseCharge() + getInstruction_Cost() - getDiscount();
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

   

    @Override
    public String toString() {
        return "Number of people in the party: " + getNumOfPeople() + "\nBase Charges: $" + getBaseCharge()
                + "\nInstruction Cost: $"
                + getInstruction_Cost() + "\nDiscount: $"
                + getDiscount() + "\nTotal Charges: $"
                + getTotalCharges() + "\nRequired Deposit: $" + getMinimum_deposit();

    }
}
