/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blockfriends;

/**
 *
 * @author alexguntermann
 */
public class Block {
    
    private Friends friend;
    private long next;
    private long prev;
   

    public Block (){
        this.friend = null;
        this.next = 0L;
        this.prev = 0L;
        
    }
    public Block(long prev, long next){
        this.friend = new Friends();
        this.next = next;
        this.prev = prev;
        
    }
    public Friends getFriend() {
        return friend;
    }

    public long getNext() {
        return next;
    }

    public long getPrev() {
        return prev;
    }

    

    public void setFriend(Friends friend) {
        this.friend = friend;
    }

    public void setNext(long next) {
        this.next = next;
    }

    public void setPrev(long prev) {
        this.prev = prev;
    }

    
    @Override
    public String toString() {
        return "BlockFriends{" + "friend=" + friend + ", next=" + next + ", prev=" + prev;
    }
    
 
    }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
   
