/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package addressbook;

/**
 *
 * @author alexguntermann
 */
public class Phone {
    private int areaCode;
    private long lastSeven;
    
    public Phone (){
        areaCode = 0;
        lastSeven = 0;
    } 

    public Phone(int areaCode, long lastSeven) {
        this.areaCode = areaCode;
        this.lastSeven = lastSeven;
    }

    public int getAreaCode() {
        return areaCode;
    }

    public long getLastSeven() {
        return lastSeven;
    }

    public void setAreaCode(int areaCode) {
        this.areaCode = areaCode;
    }

    public void setLastSeven(long lastSeven) {
        this.lastSeven = lastSeven;
    }

    @Override
    public String toString() {
        return "Phone{" + "areaCode=" + areaCode + ", lastSeven=" + lastSeven + '}';
    }
    
} 
