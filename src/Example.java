/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/**
 *
 * @author dhalt0019
 */
public class Example {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City kw = new City();

        Robot Karel = new Robot(kw, 2, 2, Direction.EAST);

        int count = 0;

        while (count < 4) {

            Karel.move();
            Karel.turnLeft();

            count = count + 1;
        }

        for (int num = 0; num < 4; num = num + 1) {
            Karel.move();
            Karel.move();
            Karel.turnLeft();

        }
    }
}
