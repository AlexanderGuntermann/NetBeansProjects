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
public class WagesCalculator {

    private int hour;

    public static final double PAY_RATE = 23.67;
    public static final double FEDERAL_TAX = 0.1218;
    public static final double MEDICARE = 0.0145;
    public static final double SOCIAL_SECURITY = 0.042;
    public static final double NYS_TAX = 0.0355;
    public static final double NYC_TAX = 0.0228;
    public static final double UNION_FEE = 10;

    public WagesCalculator() {  //Default Constructor
        this.hour = 0;

    }

    public WagesCalculator(int hour) {  // Overridden Constructor
        this.hour = hour;

    }

    public int getHour() {
        return this.hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public double getGrossPay() {
        return this.hour * PAY_RATE;

    }

    public double getFederalTax() {
        return getGrossPay() * FEDERAL_TAX;
    }

    public double getMedicare() {
        return getGrossPay() * MEDICARE;
    }

    public double getSocialSecurity() {
        return getGrossPay() * SOCIAL_SECURITY;
    }

    public double getNYSIncomeTax() {
        return getGrossPay() * NYS_TAX;
    }

    public double getNYCIncomeTax() {
        return getGrossPay() * NYC_TAX;
    }

    public double getUnionFee() {
        return UNION_FEE;
    }

    public double getNetTakeHomePay() {
        return getGrossPay() - (getMedicare() +getFederalTax()+ getSocialSecurity() + getNYSIncomeTax() + getNYCIncomeTax()
                + getUnionFee());
    }
}
