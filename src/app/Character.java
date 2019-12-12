package app;

import javax.lang.model.util.ElementScanner6;

class Character {
    
    int lives;

    Character (){
  
    }

    Character(int number){
        lives = number;
    }

    private int getLives() {
        return lives;
    }
    private  void addLife() {
        lives++;      
    }
    private  void loseLife () {
        lives--;        
    }
    private  boolean haslive () {
        boolean result;
        if(lives>0){
            result = true;
        }    else { 
            result = false;
        }
        return result;
        
    }



}

