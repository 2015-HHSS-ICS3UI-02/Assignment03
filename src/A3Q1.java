
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
  
     City kw = new City();
  
     Robot bot = new Robot(kw,1,1,Direction.EAST);  
     
     bot.setColor(Color.black);
     
     new Wall(kw, 1, 6, Direction.WEST);
     
     new Thing(kw, 1, 4, Direction.WEST);
    
     while(true){
         
         if(bot.frontIsClear())
             bot.move();
    
         if(!bot.frontIsClear() || bot.canPickThing())
             break;
    }
    
    
    }
}
    
    
    
    
    
    
    
    
 
