
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
 * @author singk4158
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City kw = new City();

        Robot tina =
                new Robot(kw, 1, 1, Direction.EAST);

        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.NORTH);

        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);

        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);

        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);


        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 4);
        new Thing(kw, 3, 1);
        new Thing(kw, 3, 4);

        while (tina.frontIsClear()) {
            tina.move();

            if (tina.canPickThing()) {
                tina.pickThing();
            }

            if (!tina.frontIsClear()) {
                if (tina.getDirection() == Direction.EAST) {
                    tina.turnLeft();
                    tina.turnLeft();
                    tina.turnLeft();
                    if (tina.frontIsClear()) {
                        tina.move();
                        tina.turnLeft();
                        tina.turnLeft();
                        tina.turnLeft();
                    }


                } else if (tina.getDirection() == Direction.WEST) {
                    tina.turnLeft();
                    tina.move();
                    tina.turnLeft();

                }

                if (tina.canPickThing()) {
                    tina.pickThing();
                }

            }
        }


        while (tina.getDirection() != Direction.WEST) {

            tina.turnLeft();
        }
        while (tina.getAvenue() != 1) {
            tina.move();
        }
        while (tina.getDirection() != Direction.NORTH) {
            tina.turnLeft();


        }
        while (tina.getStreet() != 1) {
            tina.move();
        }
               tina.turnLeft();
               tina.turnLeft();
               tina.turnLeft();
    }
}
