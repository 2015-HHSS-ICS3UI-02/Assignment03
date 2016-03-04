
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rahmf8586
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        RobotSE dini = new RobotSE (kw, 2, 2, Direction.SOUTH);
        
        new Wall (kw, 1, 1, Direction.NORTH);
        new Wall (kw, 1, 1, Direction.WEST);
        new Wall (kw, 2, 1, Direction.WEST);
        new Wall (kw, 3, 1, Direction.WEST);
        new Wall (kw, 3, 1, Direction.SOUTH);
        new Wall (kw, 3, 2, Direction.SOUTH);
        new Wall (kw, 3, 3, Direction.SOUTH);
        new Wall (kw, 3, 4, Direction.SOUTH);
        new Wall (kw, 3, 4, Direction.EAST);
        new Wall (kw, 2, 4, Direction.EAST);
        new Wall (kw, 1, 4, Direction.EAST);
        new Wall (kw, 1, 4, Direction.NORTH);
        new Wall (kw, 1, 3, Direction.NORTH);
        
        while (dini.frontIsClear()) {
            dini.move();
        }
        while (!dini.frontIsClear()) {
            dini.turnLeft();
            if (dini.frontIsClear()) {
            dini.move();
            dini.turnRight();
        }
        }
       if (dini.frontIsClear()) {
            dini.move();
        }
}
}