/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author rares
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City kw = new City();
        RobotSE karel = new RobotSE(kw, 1, 1, Direction.EAST);

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

        for (int i = 0; i < 10; i++) {

            karel.move();
            karel.pickThing();
            karel.move();
            karel.putThing();
            karel.turnAround();
            karel.move();
            karel.move();
            karel.turnAround();

        }
    }
}
