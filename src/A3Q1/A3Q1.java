/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package A3Q1;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author fostp4040
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
        Robot karel = new Robot(Kitchener, 0,0, Direction.EAST);
        new Wall(Kitchener, 0,4, Direction.EAST);
        new Thing(Kitchener, 0,5);
        new Thing(Kitchener, 0,6);
        int count = 0;
        while(count<4){
            karel.move();
            count = count + 1;
        }
    }
}
