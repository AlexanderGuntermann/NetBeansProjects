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
public class Soccer {
                                    //Properties are a piece of data within a class
    private int score1;
    private int score2;
    private String team1;
    private String team2;
            
    public Soccer(){
        this.score1 = 0;
        this.score2 = 0;
        
    
       }
    public Soccer (String team1,int score1, String team2, int score2){
        this.score1 = score1;
        this.team1 = team1;
        this.score2 = score2;
        this.team2 = team2;
    }
    public String getTeam1(){
        return this.team1;
    }
    public String getTeam2(){
        return this.team2;
    }
    public int getScore1(){
        return this.score1;
        
    }
    public int getScore2(){
        return this.score2;
    }
    public void setTeam1(String team1){
        this.team1 = team1;
    }
    public void setTeam2(String team2){
        this.team2 = team2;
    }
    public void setScore1(int score1){
        this.score1 = score1;
    }
    public void setScore2(int score2){
        this.score2 = score2;
    }
    @Override
    public String toString(){
        String scoreBoard = "Team 1:" + this.team1+" "+ " " + "Score:" + this.score1+" " + "Team 2:"+ this.team2 +" "+"Score:"+" "+this.score2;
        
        return scoreBoard;
        
    }
    public void updateScore(){
        this.score1++;
        this.score2++;
        this.score1++;
        this.score2++;
    }
}

    

