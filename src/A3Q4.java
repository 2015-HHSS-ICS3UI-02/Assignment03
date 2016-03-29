/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment03;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author howen2217
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    City kw = new City();
    new Wall(kw, 1, 1, Direction.WEST);
    new Wall(kw, 1, 1, Direction.NORTH);
    new Wall(kw, 2, 1, Direction.WEST);
    new Wall(kw, 2, 1, Direction.SOUTH);
    new Wall(kw, 1, 2, Direction.EAST);
    new Wall(kw, 1, 2, Direction.NORTH);
    new Wall(kw, 2, 2, Direction.EAST);
    new Wall(kw, 2, 2, Direction.SOUTH);
    
    Robot dag = new Robot(kw, 0, 2, Direction.WEST);
    
    int count = 0;
    
    while(count < 8){
    dag.move();
    dag.move();
    dag.turnLeft();
    dag.move();
    count = count + 1;
    }
    }
}
