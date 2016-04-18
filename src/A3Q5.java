
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author singk4158
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
      City kw = new City();

        Robot tina =
                new Robot(kw, 0, 0, Direction.EAST);
    
        
        new Thing(kw,0,0);
        new Thing(kw,0,0);
        new Thing(kw,0,0);
        new Thing(kw,0,0);
        new Thing(kw,0,0);
        new Thing(kw,0,0);
        new Thing(kw,0,0);
        new Thing(kw,0,0);
        new Thing(kw,0,0);
        new Thing(kw,0,0);
    
        int count = 0;
      while(count< 10){
        tina.pickThing();
        tina.move();
        tina.turnLeft();
        tina.turnLeft();
        tina.putThing();
        tina.move();
        tina.turnLeft();
        tina.turnLeft();
       count = count + 1; 
      
      }
      tina.move();
      
  }
}
