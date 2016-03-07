
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author kangh4484
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        City A = new City();
        Robot a = new Robot(A, 1, 1, Direction.SOUTH);

        new Wall(A, 0, 0, Direction.NORTH);
        new Wall(A, 0, 0, Direction.WEST);
        new Wall(A, 1, 0, Direction.WEST);
        new Wall(A, 2, 0, Direction.WEST);
        new Wall(A, 2, 0, Direction.SOUTH);
        new Wall(A, 2, 1, Direction.SOUTH);
        new Wall(A, 2, 2, Direction.SOUTH);
        new Wall(A, 2, 3, Direction.SOUTH);
        new Wall(A, 2, 3, Direction.EAST);
        new Wall(A, 1, 3, Direction.EAST);
        new Wall(A, 0, 3, Direction.EAST);
        new Wall(A, 0, 3, Direction.NORTH);
        new Wall(A, 0, 2, Direction.NORTH);
        

        int count = 0;
        
        while (!a.canPickThing()) {
            while (count == 0) {
                if (a.frontIsClear()) {
                    a.move();
                } else {
                    a.turnLeft();
                    if (a.frontIsClear()) {
                        a.move();
                        a.turnLeft();
                        count = count + 1;
                    }
                    if (!a.frontIsClear()) {
                        a.turnLeft();
                        a.turnLeft();
                        count = count + 1;
                        while (a.frontIsClear()) {
                            a.move();
                            

                        }
                    }

                }
            }
            while (count == 1) {
                if (a.frontIsClear()) {
                    a.move();
                } else {
                    a.turnLeft();
                    a.turnLeft();
                    a.turnLeft();
                    if (a.frontIsClear()) {
                        a.move();
                        a.turnLeft();
                        a.turnLeft();
                        a.turnLeft();
                        count = count - 1;
                    }
                    if (!a.frontIsClear()) {
                        a.turnLeft();
                        a.turnLeft();
                        count = count -1;
                        while (a.frontIsClear()) {
                            a.move();
                            

                        }
                    }
                    

                }
            }
            
            
        }
        
    }
}
