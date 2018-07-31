package pizza;

import java.util.Scanner;

/**
 *
 * @author alexguntermann
 */
public class PizzaDriver {
    static Scanner input = new Scanner(System.in);
         static boolean mushrooms;
         static boolean pepperoni;
         static boolean sausage;
         static char size;
         static int counter = 0;
         static int numPizzas = 0;
         static PizzaOrder order;
         static String result = "";
         static Pizza numberTwo;
         
    public static void main(String[]args){
        System.out.print("Please enter the number of pizzas you want: ");
        numPizzas = input.nextInt();
        order = new PizzaOrder();
    Order();    
        System.out.println("Order Summary:************* \n"+result);
        System.out.println("Total number of Pizzas Ordered: "+order.getNumPizzas());
        System.out.println("Total Cost: $" + order.getfinalCost());    
    }
    public static void Order(){
        System.out.print("What size Pizza do you want? ");
        char pizzaSize = input.next().charAt(0);
        System.out.print("Do you want mushrooms? ");
        if( input.next().charAt(0)== 'y'){
            mushrooms = true;
        } else mushrooms = false;
        System.out.print("Do you want pepperoni? ");
        if (input.next().charAt(0)== 'y'){
            pepperoni = true;
        } else pepperoni = false;
        System.out.print("Do you want sausage? ");
        {if (input.next().charAt(0)== 'y'){
                sausage = true;
       
        }else sausage = false;        
    }
        numberTwo = new Pizza(pepperoni, mushrooms, sausage, pizzaSize);
        order.addPizza(numberTwo);  
     //   System.out.println(order.getfinalCost());
        counter++;
        Result();

    if (counter != numPizzas){
        Order();
    }
    
    }
    public static String Result(){
        result+="Pizza: "+counter+" "+numberTwo.getSize()+" Pizza with: "+ numberTwo.displayToppings()+"\n";
        return result;
    }
}
