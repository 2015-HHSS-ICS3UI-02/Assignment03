
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author halll7908
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City town = new City();
    Robot sam = new Robot(town, 0, 0, Direction.EAST);
    //|| = or / && = and
    new Wall(town, 0, 4, Direction.WEST);
    new Thing(town, 0, 3);
    new Thing(town, 0, 2);
    
    while(true)
    {
        if(sam.frontIsClear())
        {   sam.move(); }
        if(sam.canPickThing()||!sam.frontIsClear())
        {   break;  }
    }
}
}
