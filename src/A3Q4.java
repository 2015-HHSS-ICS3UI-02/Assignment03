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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 0;
        int move = 0;
        City AM = new City();
        new Wall(AM, 1, 1, Direction.NORTH);
        new Wall(AM, 1, 2, Direction.NORTH);
        new Wall(AM, 1, 2, Direction.EAST);
        new Wall(AM, 2, 2, Direction.EAST);
        new Wall(AM, 2, 2, Direction.SOUTH);
        new Wall(AM, 2, 1, Direction.SOUTH);
        new Wall(AM, 2, 1, Direction.WEST);
        new Wall(AM, 1, 1, Direction.WEST);

        Robot Andrew = new Robot(AM, 0, 2, Direction.WEST);

        while (Andrew.frontIsClear() && move <= 23) {
            Andrew.move();
            num = num + 1;

            if (num == 2 || num == 5 || num == 8 || num == 11 || num == 14 || num == 17 || num == 20 || num ==23 ) {
                Andrew.turnLeft();
            }
            move = move+1;
        }
    }
}
