
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
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City A = new City();
        Robot a = new Robot(A, 1, 1, Direction.EAST);

        new Wall(A, 1, 1, Direction.NORTH);
        new Wall(A, 1, 1, Direction.WEST);
        new Wall(A, 1, 2, Direction.NORTH);
        new Wall(A, 1, 3, Direction.NORTH);
        new Wall(A, 1, 4, Direction.NORTH);
        new Wall(A, 2, 1, Direction.WEST);
        new Wall(A, 3, 1, Direction.WEST);
        new Wall(A, 1, 4, Direction.EAST);
        new Wall(A, 2, 4, Direction.EAST);
        new Wall(A, 3, 4, Direction.EAST);
        new Wall(A, 3, 1, Direction.SOUTH);
        new Wall(A, 3, 2, Direction.SOUTH);
        new Wall(A, 3, 3, Direction.SOUTH);
        new Wall(A, 3, 4, Direction.SOUTH);
        new Thing(A, 1, 2);
        new Thing(A, 2, 2);
        new Thing(A, 2, 3);
        new Thing(A, 2, 4);
        new Thing(A, 3, 1);
        new Thing(A, 3, 4);

        int count = 0;
        while (a.frontIsClear()) {
            while (count == 1) {
                if (a.canPickThing()) {
                    a.pickThing();
                }
                if (a.frontIsClear()) {
                    a.move();
                } else {
                    a.turnLeft();
                    if (!a.frontIsClear()) {
                        count = count + 1;
                    }
                    if (a.frontIsClear()) {
                        a.move();
                        a.turnLeft();
                        count = count - 1;
                    }


                }

            }

            while (count == 0) {
                if (a.canPickThing()) {
                    a.pickThing();
                }
                if (a.frontIsClear()) {
                    a.move();
                } else {
                    a.turnLeft();
                    a.turnLeft();
                    count = count + 1;
                }

            }
            while (count == 2) {
                a.turnLeft();
                a.turnLeft();
                while (a.frontIsClear()) {
                    a.move();
                    count = count + 1;
                    if (!a.frontIsClear()) {
                        a.turnLeft();
                        a.turnLeft();
                        a.turnLeft();
                        break;
                    }
                }
            }

        }

    }
}
