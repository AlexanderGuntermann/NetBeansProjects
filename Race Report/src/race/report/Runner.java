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
public class Runner {
    private Name name;
    private TimeClass time;
    
    public Runner(){
        name = new Name();
    time = new TimeClass();
    
}
    public Runner(Name name, TimeClass time){
        this.name = name;
        this.time = time;
    }
    public Name getName(){
        return name;
        
    }
    public TimeClass getTime(){
        return time;
    }
    @Override
    public String toString(){
        return name + " " + time;
    }
}
