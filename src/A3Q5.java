
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
 * @author kangh4484
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City A = new City();
        Robot a = new Robot(A, 0, 0, Direction.EAST);

        new Thing(A, 0, 0, Direction.EAST);
        new Thing(A, 0, 0, Direction.EAST);
        new Thing(A, 0, 0, Direction.EAST);
        new Thing(A, 0, 0, Direction.EAST);
        new Thing(A, 0, 0, Direction.EAST);
        new Thing(A, 0, 0, Direction.EAST);
        new Thing(A, 0, 0, Direction.EAST);
        new Thing(A, 0, 0, Direction.EAST);
        new Thing(A, 0, 0, Direction.EAST);
        new Thing(A, 0, 0, Direction.EAST);
        int count1 = 0;
        int count2 = 0;
        while (a.frontIsClear()) {

            while (count1 < 10) {
                a.pickThing();
                a.move();
                a.putThing();
                count1 = count1 + 1;
                break;
            }
            while (count2 < 9) {


                a.turnLeft();
                a.turnLeft();
                a.move();
                a.turnLeft();
                a.turnLeft();
                count2 = count2 + 1;
                break;
            }
        }

    }
}
