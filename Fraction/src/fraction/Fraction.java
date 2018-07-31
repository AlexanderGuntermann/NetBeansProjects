/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraction;

/**
 *
 * @author alexguntermann
 */
public class Fraction {

    private int numer;
    private int denom;
    
      public Fraction(int numerator, int denominator){
          this.numer = numerator;
          this.denom = denominator;
    }
  public String toString(){
      return this.numer + "/" + this.denom;
      
  }  
      public Fraction add(Fraction f){
          Fraction result = new Fraction((this.numer+f.numer),(this.denom+f.numer));
          return result;
      }
  
}
