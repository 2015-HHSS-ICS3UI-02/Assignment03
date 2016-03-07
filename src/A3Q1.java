
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
 * @author kangh4484
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City A = new City();
        Robot a = new Robot(A, 0, 0, Direction.EAST);

        new Wall(A, 0, 4, Direction.EAST);
        new Thing(A, 0, 5);
        
        while(a.frontIsClear()){
            a.move();
        }

    }
}
