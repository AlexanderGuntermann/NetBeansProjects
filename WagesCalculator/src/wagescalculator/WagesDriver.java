/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wagescalculator;


/**
 *
 * @author alexguntermann
 */
public class WagesDriver {

    public static void main(String[] args) {
        
        WagesCalculator w = new WagesCalculator(44);
        System.out.println("Number of hours worked in a week: 44");
        System.out.println("Calculating gross pay and witholdings...");
        System.out.println("Gross pay:               $     " + w.getGrossPay());
        System.out.println("Fed income tax:          $      " + w.getFederalTax());
        System.out.println("Medicare:                $      " + w.getMedicare());
        System.out.println("Social Security:         $      " + w.getSocialSecurity());
        System.out.println("NYS income tax:          $      " + w.getNYSIncomeTax());
        System.out.println("NYC income tax:          $      " + w.getNYCIncomeTax());
        System.out.println("Union due:               $      " +w.getUnionFee());
        System.out.println("                         -----------");
        System.out.println("Net-take home pay:       $" + w.getNetTakeHomePay());
        
        System.out.println("");
        
        WagesCalculator w1 = new WagesCalculator(75);
        System.out.println("Number of hours worked in a week: 75");
        System.out.println("Calculating gross pay and witholdings...");
        System.out.println("Gross pay:               $    " + w1.getGrossPay());
        System.out.println("Fed income tax:          $     " + w1.getFederalTax());
        System.out.println("Medicare:                $     " + w1.getMedicare());
        System.out.println("Social Security:         $     " + w1.getSocialSecurity());
        System.out.println("NYS income tax:          $     " + w1.getNYSIncomeTax());
        System.out.println("NYC income tax:          $     " + w1.getNYCIncomeTax());
        System.out.println("Union due:               $     " +w1.getUnionFee());
        System.out.println("                         -----------");
        System.out.println("Net-take home pay:       $" + w1.getNetTakeHomePay());

    }
    
}
