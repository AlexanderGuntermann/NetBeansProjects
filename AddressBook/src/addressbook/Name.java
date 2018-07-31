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
public class Name {
    private String first;
    private String last;
    private String middle;
    
    public Name(){
        first = " ";
        middle = " ";
        last = " ";
        
        
    }
    
    public Name (String first, String middle, String last){
        this.first = first;
        this.middle = middle;
        this.last = last;
        
    }
    public String getFirst(){
        return first;
        
    } public String getMiddle () {
        return middle;
        
    } public String getLast() { 
        return last;
        
    } public String toString() {
        return first + " " + middle + " " + last;
    } public void setFirst(String first){
        this.first = first;
    } public void setMiddle(String middle){
        this.middle = middle;
        
    } public void setLast(String last) {
        this.last = last;
    }
    
    
}
