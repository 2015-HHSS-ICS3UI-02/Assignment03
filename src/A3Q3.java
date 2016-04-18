/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author maxia2242
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 0;
        City AM = new City();
        new Wall(AM, 0, 0, Direction.NORTH);
        new Wall(AM, 0, 1, Direction.NORTH);
        new Wall(AM, 0, 2, Direction.NORTH);
        new Wall(AM, 0, 3, Direction.NORTH);
        new Wall(AM, 0, 4, Direction.NORTH);
        new Wall(AM, 0, 4, Direction.EAST);
        //new Wall(AM, 1, 4, Direction.EAST);
        new Wall(AM, 2, 4, Direction.EAST);
        new Wall(AM, 3, 4, Direction.EAST);
        new Wall(AM, 3, 4, Direction.EAST);
        new Wall(AM, 3, 4, Direction.SOUTH);
        new Wall(AM, 3, 3, Direction.SOUTH);
        new Wall(AM, 3, 2, Direction.SOUTH);
        new Wall(AM, 3, 1, Direction.SOUTH);
        new Wall(AM, 3, 0, Direction.SOUTH);
        new Wall(AM, 3, 0, Direction.WEST);
        new Wall(AM, 2, 0, Direction.WEST);
        new Wall(AM, 1, 0, Direction.WEST);
        new Wall(AM, 0, 0, Direction.WEST);

        Robot Andrew = new Robot(AM, 1, 2, Direction.NORTH);

        while (Andrew.frontIsClear()) {
            Andrew.move();
        }

        while (true) {
            Andrew.turnLeft();
            Andrew.turnLeft();
            Andrew.turnLeft();
            if (Andrew.frontIsClear()) {
                Andrew.move();
                Andrew.turnLeft();
                if (Andrew.frontIsClear()) {
                    Andrew.move();
                    break;
                }
            }
        }

    }
}
