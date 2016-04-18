
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author singk4158
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
     City kw = new City();

        Robot tina =
                new Robot(kw, 0, 3, Direction.WEST);
    
    
    new Wall(kw,1,2, Direction.NORTH); 
    new Wall(kw,1,3, Direction.NORTH);
    new Wall(kw,1,2, Direction.WEST);
    new Wall(kw,2,2, Direction.WEST);
    new Wall(kw,2,2, Direction.SOUTH);
    new Wall(kw,2,3, Direction.SOUTH);
    new Wall(kw,1,3, Direction.EAST);
    new Wall(kw,2,3, Direction.EAST);
    
    int count =0;
    while(count< 8){
     tina.move();
     tina.move();
     tina.turnLeft();
     tina.move();
     count = count +1;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
