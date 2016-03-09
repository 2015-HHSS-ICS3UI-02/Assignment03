/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment03;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Wall;

/**
 *
 * @author dhila4674
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Ajay = new City();
        new Wall(Ajay, 3, 2, Direction.WEST);
        new Wall(Ajay, 2, 2, Direction.WEST);
        new Wall(Ajay, 2, 2, Direction.NORTH);
        new Wall(Ajay, 2, 3, Direction.NORTH);
        new Wall(Ajay, 2, 3, Direction.EAST);
        new Wall(Ajay, 3, 3, Direction.EAST);
        new Wall(Ajay, 3, 2, Direction.SOUTH);
        new Wall(Ajay, 3, 3, Direction.SOUTH);
        Robot jack = new Robot(Ajay,1,3,Direction.WEST);
        
        int timesTurned = 0; 
        while (timesTurned < 8){
            jack.move();
            jack.move();
            jack.turnLeft();
            jack.move();
           timesTurned = timesTurned + 1;
        }
        
         }
    }

