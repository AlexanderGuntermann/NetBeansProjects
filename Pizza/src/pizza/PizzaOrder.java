/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

/**
 *
 * @author alexguntermann
 */
public class PizzaOrder {
    private static int numPizza = 0;
    private static double finalCost = 0;
    Pizza pizza;
public PizzaOrder(){
    pizza = new Pizza();
}   
    
public PizzaOrder(Pizza pizza){
    this.pizza = pizza;
    numPizza++;
}
public void addPizza(Pizza pizza){
    numPizza++;
    finalCost += (pizza.getnumToppings() + pizza.getSizeCost());
}
public int getNumPizzas(){
    return numPizza;
}
public double getfinalCost(){
    return finalCost;
}



}