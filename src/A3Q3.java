
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
 * @author Fostp4040
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
        Robot karel = new Robot(Kitchener, 1,1, Direction.EAST);
        new Wall(Kitchener, 1,1, Direction.WEST);
        new Wall(Kitchener, 1,1, Direction.NORTH);
        new Wall(Kitchener, 1,2, Direction.NORTH);
        new Wall(Kitchener, 1,4, Direction.NORTH);
        new Wall(Kitchener, 1,4, Direction.EAST);
        new Wall(Kitchener, 2,4, Direction.EAST);
        new Wall(Kitchener, 3,4, Direction.EAST);
        new Wall(Kitchener, 3,4, Direction.SOUTH);
        new Wall(Kitchener, 3,3, Direction.SOUTH);
        new Wall(Kitchener, 3,2, Direction.SOUTH);
        new Wall(Kitchener, 3,1, Direction.SOUTH);
        new Wall(Kitchener, 3,1, Direction.WEST);
        new Wall(Kitchener, 2,1, Direction.WEST);
        
        
        }
}
