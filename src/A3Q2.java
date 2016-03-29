/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment03;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author howen2217
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();

        RobotSE dag = new RobotSE(kw, 1, 1, Direction.EAST);

        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.WEST);
        new Wall(kw, 3, 1, Direction.SOUTH);
        new Wall(kw, 3, 2, Direction.SOUTH);
        new Wall(kw, 3, 3, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.SOUTH);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);

        new Thing(kw, 1, 2);
        new Thing(kw, 2, 2);
        new Thing(kw, 3, 1);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 4);
        new Thing(kw, 3, 4);


        while (dag.frontIsClear()) {
            dag.move();
            if (dag.canPickThing()) {
                dag.pickThing();
            }
            if (!dag.frontIsClear()) {

                if (dag.getDirection() == Direction.EAST) {
                    dag.turnRight();
                    if (!dag.frontIsClear()) {
                        break;
                    }
                    dag.move();
                    dag.turnRight();
                    if (dag.canPickThing()) {
                        dag.pickThing();
                    }
                } else {
                    dag.turnLeft();
                    if (!dag.frontIsClear()) {
                        break;
                    }
                    dag.move();
                    dag.turnLeft();
                    if (dag.canPickThing()) {
                        dag.pickThing();
                    }
                }

            }
            
                
        }
while (dag.getAvenue() > 1) {

            if (dag.getDirection() == Direction.WEST) {
                dag.move();
            } else {
                dag.turnLeft();
            }
        }
        
        while (dag.getStreet() > 1) {

            if (dag.getDirection() == Direction.NORTH) {
                dag.move();
            } else {
                dag.turnLeft();
            }
        }
        dag.turnLeft();
        dag.turnLeft();
        dag.turnLeft();



    }
}
