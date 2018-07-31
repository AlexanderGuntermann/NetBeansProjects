/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package meterconverter;


/**
 *
 * @author alexguntermann
 */
public class MeterConverterDriver {
   public static void main(String [] args){
           MeterConverter w = new MeterConverter(1, 1); 
       System.out.println("1 Meter = "+ w+ " Feet");
           MeterConverter b = new MeterConverter(8,8);
       System.out.println("8 Meters = "+ b+" Feet");
       MeterConverter c = new MeterConverter(12, 12);
       System.out.println("12 Meters = " +c+" Feet");
       MeterConverter d = new MeterConverter(24, 24);
       System.out.println("24 Meters = " +w +" Feet");
   }

    
   
}
