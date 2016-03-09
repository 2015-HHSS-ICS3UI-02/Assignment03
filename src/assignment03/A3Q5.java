/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment03;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/**
 *
 * @author dhila4674
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Ajay = new City();
       Robot rajan = new Robot(Ajay,2,2,Direction.EAST);
       new Thing(Ajay,2,3);
       new Thing(Ajay,2,3);
       new Thing(Ajay,2,3);
       new Thing(Ajay,2,3);
       new Thing(Ajay,2,3);
       new Thing(Ajay,2,3);
       new Thing(Ajay,2,3);
       new Thing(Ajay,2,3);
       new Thing(Ajay,2,3);
       new Thing(Ajay,2,3);
       
       rajan.move();
       int timesPicked = 0;
       while(timesPicked < 10){
           rajan.pickThing();
           rajan.move();
           rajan.putThing();
           rajan.turnLeft();
           rajan.turnLeft();
           rajan.move();
           rajan.turnLeft();
           rajan.turnLeft();
           timesPicked = timesPicked + 1;
       }
       rajan.move();
    }
}
