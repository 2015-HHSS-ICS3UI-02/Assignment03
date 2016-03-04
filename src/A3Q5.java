
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rahmf8586
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        RobotSE ri = new RobotSE(kw, 1, 1, Direction.EAST);
        
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 1);
        new Thing (kw, 1, 1);
        
        int count = 0;
        
        while (count < 9) {
        
        while (ri.canPickThing()) {
            ri.pickThing();
            ri.move();
            ri.putThing();
            ri.turnLeft();
            ri.turnLeft();
            ri.move();
            ri.turnLeft();
            ri.turnLeft();
        }
        count = count + 1;
    }
        ri.move();
    }
}
