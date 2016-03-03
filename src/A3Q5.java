
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
 * @author halll7908
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    City town = new City();
    Robot sam = new Robot(town, 1, 1, Direction.EAST);
    
    new Thing(town, 1, 1);
    new Thing(town, 1, 1);
    new Thing(town, 1, 1);
    new Thing(town, 1, 1);
    new Thing(town, 1, 1);
    new Thing(town, 1, 1);
    new Thing(town, 1, 1);
    new Thing(town, 1, 1);
    new Thing(town, 1, 1);
    new Thing(town, 1, 1);
    
    int count = 0;
    // loop 10 times
    while(count < 10)
        {   sam.pickThing();
            sam.move();
            sam.putThing();
            sam.turnLeft();
            sam.turnLeft();
            sam.move();
            sam.turnLeft();
            sam.turnLeft();
        // add 1 to count
        count = count + 1;
        }
    
    sam.move();
    
    
    }
}
