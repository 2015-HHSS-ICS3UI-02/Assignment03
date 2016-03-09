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
 * @author dhila4674
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
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
        new Wall(Ajay, 5, 2, Direction.WEST);
        new Wall(Ajay, 6, 2, Direction.WEST);
        new Wall(Ajay, 5, 2, Direction.NORTH);
        new Wall(Ajay, 5, 3, Direction.NORTH);
        new Wall(Ajay, 5, 3, Direction.EAST);
        new Wall(Ajay, 6, 3, Direction.EAST);
        new Wall(Ajay, 6, 2, Direction.SOUTH);
        new Wall(Ajay, 6, 3, Direction.SOUTH);
        new Wall(Ajay, 3, 5, Direction.WEST);
        new Wall(Ajay, 2, 5, Direction.WEST);
        new Wall(Ajay, 2, 5, Direction.NORTH);
        new Wall(Ajay, 2, 6, Direction.NORTH);
        new Wall(Ajay, 2, 6, Direction.EAST);
        new Wall(Ajay, 3, 6, Direction.EAST);
        new Wall(Ajay, 3, 5, Direction.SOUTH);
        new Wall(Ajay, 3, 6, Direction.SOUTH);
        new Wall(Ajay, 5, 5, Direction.WEST);
        new Wall(Ajay, 6, 5, Direction.WEST);
        new Wall(Ajay, 5, 6, Direction.NORTH);
        new Wall(Ajay, 5, 5, Direction.NORTH);
        new Wall(Ajay, 5, 6, Direction.EAST);
        new Wall(Ajay, 6, 6, Direction.EAST);
        new Wall(Ajay, 6, 6, Direction.SOUTH);
        new Wall(Ajay, 6, 5, Direction.SOUTH);
        Robot neo = new Robot(Ajay, 4, 4, Direction.SOUTH);

        {
            int timesTurned = 0;

            while (timesTurned < 12) {
                neo.move();
                neo.move();
                neo.move();
                neo.turnLeft();
                timesTurned = timesTurned + 1;
            
                while (timesTurned == 3) {
                neo.move();
                neo.move();
                neo.move();
                neo.move();
                neo.move();
                neo.move();
                neo.turnLeft();
                timesTurned = timesTurned + 1;
            }
                while (timesTurned == 6) {
                neo.move();
                neo.move();
                neo.move();
                neo.move();
                neo.move();
                neo.move();
                neo.turnLeft();
                timesTurned = timesTurned + 1;
            }
                while (timesTurned == 9) {
                neo.move();
                neo.move();
                neo.move();
                neo.move();
                neo.move();
                neo.move();
                neo.turnLeft();
                timesTurned = timesTurned + 1;
            }     
            } 
            neo.move();
            neo.move();
            neo.move();
        }
    }
}
