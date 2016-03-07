
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
 * @author kangh4484
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City A = new City();
        Robot a = new Robot(A, 3, 3, Direction.SOUTH);

        new Wall(A, 1, 1, Direction.NORTH);
        new Wall(A, 1, 2, Direction.NORTH);
        new Wall(A, 1, 1, Direction.WEST);
        new Wall(A, 2, 1, Direction.WEST);
        new Wall(A, 1, 2, Direction.EAST);
        new Wall(A, 2, 2, Direction.EAST);
        new Wall(A, 2, 1, Direction.SOUTH);
        new Wall(A, 2, 2, Direction.SOUTH);
        new Wall(A, 1, 4, Direction.NORTH);
        new Wall(A, 1, 5, Direction.NORTH);
        new Wall(A, 1, 4, Direction.WEST);
        new Wall(A, 2, 4, Direction.WEST);
        new Wall(A, 1, 5, Direction.EAST);
        new Wall(A, 2, 5, Direction.EAST);
        new Wall(A, 2, 4, Direction.SOUTH);
        new Wall(A, 2, 5, Direction.SOUTH);
        new Wall(A, 4, 1, Direction.NORTH);
        new Wall(A, 4, 2, Direction.NORTH);
        new Wall(A, 4, 1, Direction.WEST);
        new Wall(A, 5, 1, Direction.WEST);
        new Wall(A, 4, 2, Direction.EAST);
        new Wall(A, 5, 2, Direction.EAST);
        new Wall(A, 5, 1, Direction.SOUTH);
        new Wall(A, 5, 2, Direction.SOUTH);
        new Wall(A, 4, 4, Direction.NORTH);
        new Wall(A, 4, 5, Direction.NORTH);
        new Wall(A, 4, 4, Direction.WEST);
        new Wall(A, 5, 4, Direction.WEST);
        new Wall(A, 4, 5, Direction.EAST);
        new Wall(A, 5, 5, Direction.EAST);
        new Wall(A, 5, 4, Direction.SOUTH);
        new Wall(A, 5, 5, Direction.SOUTH);

        int bigloop = 0;
        int smallloop = 0;
        while (bigloop < 4) {

            while (smallloop < 3) {
                a.move();
                a.move();
                a.move();
                a.turnLeft();
                smallloop = smallloop + 1;
                bigloop = +1;
            }
            while (smallloop == 3) {
                a.move();
                a.move();
                a.move();
                bigloop = +1;
                smallloop = smallloop -3;
            }

        }



    }
}
