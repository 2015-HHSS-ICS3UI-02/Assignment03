
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rahmf8586
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        RobotSE tim = new RobotSE (kw, 2, 1, Direction.EAST);
        new Wall (kw, 2, 5, Direction.EAST);
        new Thing (kw, 2, 6);
        
        while (tim.frontIsClear()) {
        tim.move();
    }
}
}
