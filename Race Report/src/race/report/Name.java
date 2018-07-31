/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package race.report;

/**
 *
 * @author alexguntermann
 */
public class Name {
    private String first, last, middle;
    
    public Name() {
        first = last = middle;       //assigning default value to which is null(does not exist) 
        
        
        
    }
public Name(String first, String last, String middle){
    this.first = first;
    this.last = last;
    this.middle = middle;
}
public String getName(){
    return last + " " + first + " " + middle;
    
}
public String toString(){
    return getName();
    
}
public String getFirst(){
    return first;
}    
public String getLast(){
    return last;
}
public String getMiddle(){
    return middle;
}
public void setFirst(){
    this.first = first;
}
public void setLast(){
    this.last = last;
}
public void setMiddle(){
    this.middle = middle;
}

    
}
