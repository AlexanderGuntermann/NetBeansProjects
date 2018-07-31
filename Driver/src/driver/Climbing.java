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
public class Climbing {

    private int numOfPeople_instruct;
    private int numOfPeople_advancedClimbers;
    private int numOfPeople_renting;
    private double baseCharge,instruction_Cost, rent_cost, totalCharges, minimum_deposit;
    private int totalPpl;

    public Climbing() {

        this.numOfPeople_instruct = 0;
        this.numOfPeople_advancedClimbers = 0;
        this.numOfPeople_renting = 0;
        this.baseCharge = 350;
        //this.discount = 0;
        this.minimum_deposit = 0;
        this.instruction_Cost = 100;
        this.rent_cost = 40;
        this.totalPpl = 0;

    }

    public Climbing(int numOfPeople_instruct, int numOfPeople_advancedClimbers,
            int numOfPeople_renting, double baseCharge,
            double discount, double instruction_Cost,
            double rent_cost, double totalCharges,
            double minimum_deposit, int totalPeople) {

        this.numOfPeople_instruct = numOfPeople_instruct;
        this.numOfPeople_advancedClimbers = numOfPeople_advancedClimbers;
        this.numOfPeople_renting = numOfPeople_renting;
        this.baseCharge = baseCharge;
        //this.discount = discount;
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

    public int getNumOfPeople_advancedClimbers() {
        return numOfPeople_advancedClimbers;
    }

    public void setNumOfPeople_advancedClimbers(int numOfPeople_advancedClimbers) {
        this.numOfPeople_advancedClimbers = numOfPeople_advancedClimbers;
    }

    public int getNumOfPeople_renting() {
        return numOfPeople_renting;
    }

    public void setNumOfPeople_renting(int numOfPeople_renting) {
        this.numOfPeople_renting = numOfPeople_renting;
    }

    public double getBaseCharge() {
        return this.baseCharge * (numOfPeople_instruct + numOfPeople_renting + numOfPeople_advancedClimbers);
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

   
    public double getInstruction_Cost() {
        return instruction_Cost * numOfPeople_instruct;
    }

    public void setInstruction_Cost(double instruction_Cost) {
        this.instruction_Cost = instruction_Cost;
    }

    public double getRent_cost() {
        return rent_cost * numOfPeople_renting;
    }

    public void setRent_cost(double rent_cost) {
        this.rent_cost = rent_cost;
    }

    public double getTotalCharges() {
        return getBaseCharge() + getInstruction_Cost() + getRent_cost() - getDiscount();
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
        return getTotalPpl() >= 5;

    }

    public int getTotalPpl() {
        return getNumOfPeople_advancedClimbers() + getNumOfPeople_instruct();
    }

    @Override
    public String toString() {
        return "Number of people in the party: " + getTotalPpl() + "\nBase Charges: $" + getBaseCharge() + 
                "\nInstruction Cost: "
                + getInstruction_Cost() + "\nEquipment Rental: $" + getRent_cost() + "\nDiscount: $" + 
                getDiscount() + "\nTotal Charges: $"
                + getTotalCharges() + "\nRequired Deposit: $" + getMinimum_deposit();

    }
}
