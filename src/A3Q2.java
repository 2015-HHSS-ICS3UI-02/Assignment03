/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author dhalt0019
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City kw = new City();

        RobotSE Tina = new RobotSE(kw, 1, 1, Direction.EAST);

        // Walls
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);

        // Things
        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 3, 1);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 4);
        new Thing(kw, 3, 4);


        while (Tina.frontIsClear()) {

            Tina.move();

            if (Tina.canPickThing()) {

                Tina.pickThing();

            }

            if (!Tina.frontIsClear()) {

                if (Tina.getDirection() == Direction.WEST) {

                    Tina.turnLeft();
                    Tina.move();
                    Tina.turnLeft();

                }

                if (Tina.canPickThing()) {

                    Tina.pickThing();
                }

                if (!Tina.frontIsClear()) {

                    if (Tina.getDirection() == Direction.EAST) {

                        Tina.turnRight();
                        Tina.move();
                        Tina.turnRight();

                    }
                }

                if (Tina.canPickThing()) {

                    Tina.pickThing();
                }

                if (Tina.getAvenue() == 3) {

                    if (Tina.getStreet() == 4) {

                        int count = 0;

                        while (count < 1) {

                            Tina.turnLeft();
                            Tina.turnLeft();
                            

                            count = count + 1;
                        }
                    }
                }
            }
        }
    }
}