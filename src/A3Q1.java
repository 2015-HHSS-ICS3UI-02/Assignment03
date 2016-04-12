/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author dhalt0019
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City kw = new City();

        Robot Tina = new Robot(kw, 2, 2, Direction.EAST);

        new Wall(kw, 2, 5, Direction.WEST);
        new Thing(kw, 2, 3);

        while (Tina.frontIsClear()) {

            Tina.move();


            if (!Tina.frontIsClear()) {


                if (Tina.canPickThing()) {
                    
                }
            }
            break;
        }
    }
}
