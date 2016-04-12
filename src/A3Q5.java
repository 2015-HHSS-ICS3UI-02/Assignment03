/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author dhalt0019
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City kw = new City();

        RobotSE Tina = new RobotSE(kw, 1, 2, Direction.EAST);

        new Thing(kw, 1, 2);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 2);


        int count = 0;

        while (count < 10) {

            Tina.pickThing();
            Tina.move();
            Tina.putThing();
            Tina.turnAround();
            Tina.move();

            count = count + 1;

            if (Tina.canPickThing()) {

                Tina.turnAround();
            }
        }

        Tina.turnAround();
        Tina.move();
    }
}