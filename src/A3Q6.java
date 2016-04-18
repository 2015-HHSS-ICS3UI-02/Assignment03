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
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 0;
        City AM = new City();
        new Wall(AM, 1, 1, Direction.NORTH);
        new Wall(AM, 1, 2, Direction.NORTH);
        new Wall(AM, 1, 2, Direction.EAST);
        new Wall(AM, 2, 2, Direction.EAST);
        new Wall(AM, 2, 2, Direction.SOUTH);
        new Wall(AM, 2, 1, Direction.SOUTH);
        new Wall(AM, 2, 1, Direction.WEST);
        new Wall(AM, 1, 1, Direction.WEST);
        new Wall(AM, 4, 1, Direction.NORTH);
        new Wall(AM, 4, 2, Direction.NORTH);
        new Wall(AM, 4, 2, Direction.EAST);
        new Wall(AM, 5, 2, Direction.EAST);
        new Wall(AM, 5, 2, Direction.SOUTH);
        new Wall(AM, 5, 1, Direction.SOUTH);
        new Wall(AM, 5, 1, Direction.WEST);
        new Wall(AM, 4, 1, Direction.WEST);
        new Wall(AM, 4, 4, Direction.NORTH);
        new Wall(AM, 4, 5, Direction.NORTH);
        new Wall(AM, 4, 5, Direction.EAST);
        new Wall(AM, 5, 5, Direction.EAST);
        new Wall(AM, 5, 5, Direction.SOUTH);
        new Wall(AM, 5, 4, Direction.SOUTH);
        new Wall(AM, 5, 4, Direction.WEST);
        new Wall(AM, 4, 4, Direction.WEST);
        new Wall(AM, 1, 4, Direction.NORTH);
        new Wall(AM, 1, 5, Direction.NORTH);
        new Wall(AM, 1, 5, Direction.EAST);
        new Wall(AM, 2, 5, Direction.EAST);
        new Wall(AM, 2, 5, Direction.SOUTH);
        new Wall(AM, 2, 4, Direction.SOUTH);
        new Wall(AM, 2, 4, Direction.WEST);
        new Wall(AM, 1, 4, Direction.WEST);

        Robot Andrew = new Robot(AM, 3, 3, Direction.SOUTH);

        while (Andrew.frontIsClear() && num < 48) {
            Andrew.move();
            num = num + 1;
            if (num == 3 || num == 6 || num == 9 || num == 15 || num == 18 || num == 21 || num == 27 || num == 30 || num == 33 || num == 39 || num == 42 || num == 45) {
                Andrew.turnLeft();
            }
        }
    }
}
