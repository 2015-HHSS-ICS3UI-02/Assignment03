
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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City A = new City();
        Robot a = new Robot(A, 0, 2, Direction.WEST);

        new Wall(A, 1, 1, Direction.NORTH);
        new Wall(A, 1, 1, Direction.WEST);
        new Wall(A, 2, 1, Direction.WEST);
        new Wall(A, 2, 1, Direction.SOUTH);
        new Wall(A, 2, 2, Direction.SOUTH);
        new Wall(A, 2, 2, Direction.EAST);
        new Wall(A, 1, 2, Direction.EAST);
        new Wall(A, 1, 2, Direction.NORTH);
        int count = 0;
        while (count == 0) {
            a.move();
            a.move();
            a.turnLeft();
            count = count + 1;
            break;
        }
        while (count <= 7) {
            a.move();
            a.move();
            a.move();
            a.turnLeft();
            count = count + 1;
            while (count == 8) {
                a.move();
                break;
            }
        }

    }
}
