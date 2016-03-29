/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment03;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author howen2217
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    City kw = new City();
    
    new Wall(kw, 1, 5, Direction.WEST);
    new Thing(kw, 1, 4);
    new Thing(kw, 1, 3);
    
    Robot dag = new Robot(kw, 1, 0, Direction.EAST);
    
    while(dag.frontIsClear()){
        dag.move();
        if(dag.canPickThing()){
            break;
        }
    }
    }
}
