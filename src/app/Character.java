package app;

import javax.lang.model.util.ElementScanner6;
import javax.sound.sampled.LineListener;

class Character {
    
    int lives;
      boolean isBig;
      boolean isInvulnerable;
     
    Character (){
  
    }

    Character(int number){
        lives = number;
    }

    public int getLives() {
        return lives;
    }
    public  void addLife() {
        lives++;      
    }
    public  void loseLife () {
        lives--;        
    }
    public  boolean hasLives () {
        boolean result;
        if(lives>0){
            result = true;
        }    else { 
            result = false;
        }
        return result;
        
    }

       
   
    public boolean getIsBig() {
       return isBig;
    } 
    public void  pickUpMushroom () {
       isBig = true;

    }
    public void takeHit() {
        if(isInvulnerable){

        }
        else {
                if(isBig){
                     isBig = false;
           
                }else {
                    lives--;
         }
        }
       
            
        }
        public boolean getIsInvulnerable() {
            return isInvulnerable;
        }
    public void pickUpStar() {
        isInvulnerable = true;   
        
    }
    public void invulnerableWearsOff() {
        isInvulnerable = false;
    }
}

