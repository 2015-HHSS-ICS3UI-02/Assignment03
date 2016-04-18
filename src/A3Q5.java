/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author maxia2242
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num = 0;
        City AM = new City();
        new Thing(AM, 1, 1);
        new Thing(AM, 1, 1);
        new Thing(AM, 1, 1);
        new Thing(AM, 1, 1);
        new Thing(AM, 1, 1);
        new Thing(AM, 1, 1);
        new Thing(AM, 1, 1);
        new Thing(AM, 1, 1);
        new Thing(AM, 1, 1);
        new Thing(AM, 1, 1);
        Robot Andrew = new Robot(AM, 1, 1, Direction.EAST);

        while (Andrew.frontIsClear() && num < 10 && Andrew.getAvenue() == 1) {
            Andrew.pickThing();
            num = num + 1;
            Andrew.move();
            Andrew.turnLeft();
            Andrew.putThing();

            Andrew.turnLeft();
            Andrew.move();
            Andrew.turnLeft();
            Andrew.turnLeft();






        }
        if(num == 10){
            Andrew.move();
        }
            
    }
}
