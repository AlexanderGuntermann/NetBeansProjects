/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizza;

public class Pizza {

    boolean pepperoni;
    boolean sausage;
    boolean mushrooms;
    char size;

    public Pizza() {
        pepperoni = false;
        sausage = false;
        mushrooms = false;
        size = ' ';

    }

    public Pizza(boolean pepperoni, boolean sausage, boolean mushrooms, char size) {
        this.pepperoni = pepperoni;
        this.sausage = sausage;
        this.mushrooms = mushrooms;
        this.size = size;
    }

    public String getSize() {
        if (size == 's'){
            return "Small";
        }else if (size == 'm'){
            return "Medium";
        }else 
          return "Large";
    }

    public int getnumToppings() {
        int count = 0;
        if (pepperoni == true) {
            count++;
        }
        if (sausage == true) {
            count++;
        }
        if (mushrooms == true){
        count++;
        }
        return count;
    }

    public int getSizeCost() {
        if (getSize().equals("Small")) {
            return 8;
        } else if (getSize().equals("Medium")) {
            return 10;
        } else if (getSize().equals("Large")){
            return 12;
        } else return 0; //if you put a value other than s, m, l it will result in 0

    }
public String displayToppings(){
    String result = "";
    if (pepperoni == true)
        result += " pepperoni";
    if (mushrooms == true)
        result += " mushroom";
    if (sausage == true)
        result += " sausage";
    if (pepperoni==false&& mushrooms==false&& sausage == false)  //&& is kind of like a comma
        result += " no toppings";
    return result;
    

}
}
