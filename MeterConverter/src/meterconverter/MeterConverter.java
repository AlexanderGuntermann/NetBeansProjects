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
public class MeterConverter {
    
    private double meter;
    private double feet;
    
   
    public MeterConverter (){
        this.meter = 0;
        this.feet = 0;
     }
    public MeterConverter(double meter, double feet){
        this.meter = meter;
        this.feet = feet;
    }
    
    public double getMeter(){
        return this.meter;
    }
    public double getFeet(){
        return this.feet;
    }
    public double setMeter(){
        return this.meter;
    }
    public double setFeet(){
      return this.feet;
    }
    
    public String toString(){
        String Conversion =  " "+this.meter * 3.28084;
        return Conversion;
        
    }
    
}






    



