/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccer;

/**
 *
 * @author alexguntermann
 */
public class SoccerDriver {
    public static void main(String [] args){
        Soccer teams = new Soccer("blue", 0, "Red" , 0);
        System.out.println(teams.toString());
        
        teams.updateScore();
        System.out.println(teams.toString());
       
    }
  
}
