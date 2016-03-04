
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
 * @author halll7908
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    City town = new City();
    Robot sam = new Robot(town, 0, 2, Direction.WEST);
    
    new Wall(town, 1, 1, Direction.NORTH);
    new Wall(town, 1, 1, Direction.WEST);
    new Wall(town, 2, 1, Direction.SOUTH);
    new Wall(town, 2, 1, Direction.WEST);
    new Wall(town, 1, 2, Direction.NORTH);
    new Wall(town, 1, 2, Direction.EAST);
    new Wall(town, 2, 2, Direction.SOUTH);
    new Wall(town, 2, 2, Direction.EAST);
    
    for(int num = 0; num < 8; num = num + 1)
        {   sam.move();
            sam.move();
            sam.turnLeft();
            sam.move();
        }
    }
}
