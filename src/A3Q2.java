
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rahmf8586
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        RobotSE ty = new RobotSE(kw, 1, 1, Direction.EAST);
        
        new Wall (kw, 1, 1, Direction.NORTH);
        new Wall (kw, 1, 2, Direction.NORTH);
        new Wall (kw, 1, 3, Direction.NORTH);
        new Wall (kw, 1, 4, Direction.NORTH);
        new Wall (kw, 1, 4, Direction.EAST);
        new Wall (kw, 2, 4, Direction.EAST);
        new Wall (kw, 3, 4, Direction.EAST);
        new Wall (kw, 3, 4, Direction.SOUTH);
        new Wall (kw, 3, 3, Direction.SOUTH);
        new Wall (kw, 3, 2, Direction.SOUTH);
        new Wall (kw, 3, 1, Direction.SOUTH);
        new Wall (kw, 3, 1, Direction.WEST);
        new Wall (kw, 2, 1, Direction.WEST);
        new Wall (kw, 1, 1, Direction.WEST);
        
        new Thing (kw, 1, 2);
        new Thing (kw, 2, 2);
        new Thing (kw, 3, 1);
        new Thing (kw, 2, 3);
        new Thing (kw, 2, 4);
        new Thing (kw, 3, 4);
        
       int count = 0;
        
       while (count <3) { 
           while (ty.frontIsClear()) {
            ty.move();
              
            if (ty.canPickThing()) {
                ty.pickThing();
            }
            }
           while (!ty.frontIsClear()) {
                ty.turnRight();
                ty.turnRight();
                while (ty.frontIsClear()) {
                    ty.move(); 
               }
                while (ty.canPickThing()) {
                    ty.pickThing();
                    }   
                ty.turnLeft();
                if (ty.frontIsClear()) {
                ty.move();
                }
                ty.turnLeft();
                
                if (ty.countThingsInBackpack()==5) {
                    break;
                }
                
                count = count + 1;
                }
           }

                ty.turnLeft();
                while (ty.frontIsClear()) {
                    ty.move();
                }
                ty.turnRight();

    }
}
