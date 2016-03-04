
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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        RobotSE tom = new RobotSE(kw, 0, 3, Direction.WEST);
        
        new Wall (kw, 1, 1, Direction.WEST);
        new Wall (kw, 1, 1, Direction.NORTH);
        new Wall (kw, 2, 1, Direction.WEST);
        new Wall (kw, 2, 1, Direction.SOUTH);
        new Wall (kw, 1, 2, Direction.NORTH);
        new Wall (kw, 1, 2, Direction.EAST);
        new Wall (kw, 2, 2, Direction.EAST);
        new Wall (kw, 2, 2, Direction.SOUTH);
        
        int count = 0;
        
        while (count < 8) {
            
            tom.move();
            tom.move();
            tom.move();
            tom.turnLeft();
            
            count = count + 1;
        }
    }
}
