/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment03;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;

/**
 *
 * @author howen2217
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    City kw = new City();
    RobotSE dag = new RobotSE(kw, 1, 1, Direction.EAST);
    new Thing(kw, 1, 1);
    new Thing(kw, 1, 1);
    new Thing(kw, 1, 1);
    new Thing(kw, 1, 1);
    new Thing(kw, 1, 1);
    new Thing(kw, 1, 1);
    new Thing(kw, 1, 1);
    new Thing(kw, 1, 1);
    new Thing(kw, 1, 1);
    new Thing(kw, 1, 1);
    
    int count = 0;
    
    while(count < 10){
        dag.pickThing();
        dag.move();
        dag.putThing();
        dag.turnAround();
        dag.move();
        dag.turnAround();
        count = count + 1;
        
    }
        dag.move();
    }
}
