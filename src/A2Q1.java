/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author maxia2242
 */
public class A2Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City AM = new City();

        new Wall(AM, 0, 0, Direction.NORTH);
        new Wall(AM, 0, 1, Direction.NORTH);
        new Wall(AM, 0, 2, Direction.NORTH);
        new Wall(AM, 0, 3, Direction.NORTH);
        new Wall(AM, 0, 4, Direction.NORTH);
        new Wall(AM, 0, 4, Direction.EAST);
        new Wall(AM, 1, 4, Direction.EAST);
        new Wall(AM, 2, 4, Direction.EAST);
        new Wall(AM, 3, 4, Direction.EAST);
        new Wall(AM, 3, 4, Direction.EAST);
        new Wall(AM, 3, 4, Direction.SOUTH);
        new Wall(AM, 3, 3, Direction.SOUTH);
        new Wall(AM, 3, 2, Direction.SOUTH);
        new Wall(AM, 3, 1, Direction.SOUTH);
        new Wall(AM, 3, 0, Direction.SOUTH);
        new Wall(AM, 4, 0, Direction.WEST);
        new Wall(AM, 3, 0, Direction.WEST);
        new Wall(AM, 2, 0, Direction.WEST);
        new Wall(AM, 1, 0, Direction.WEST);
        new Wall(AM, 0, 0, Direction.WEST);

        new Thing(AM, 1, 1);
        new Thing(AM, 3, 4);
        new Thing(AM, 3, 2);
        new Thing(AM, 4, 3);
        new Thing(AM, 2, 4);
        new Thing(AM, 4, 2);
        new Thing(AM, 2, 2);
        new Thing(AM, 1, 4);

        Robot Andrew = new Robot(AM, 0, 0, Direction.EAST);
        double num1 = 0;

        int ave = 0;
        int num = 0;
        int num2 = 0;
        int street = 0;
        int Avenue = 0;

        
            while (Andrew.frontIsClear()) {
                Andrew.move();
                if (!Andrew.frontIsClear()) {
                    ave = Andrew.getAvenue();
                }
                if (Andrew.canPickThing()) {
                    Andrew.pickThing();
                }

                if (!Andrew.frontIsClear() && ave >= 2) {
                    Andrew.turnLeft();
                    Andrew.turnLeft();
                    //Andrew.turnLeft();
                    //Andrew.move();
                    //Andrew.turnLeft();
                    // Andrew.turnLeft();
                    //Andrew.turnLeft();
                    Andrew.move();
                    ave = ave + 1;

                }

                if (!Andrew.frontIsClear() && Andrew.getDirection() == Direction.WEST) {
                    Andrew.turnLeft();
                    Andrew.move();
                    Andrew.turnLeft();
                    num = num + 1;


                }
                while ((Andrew.getAvenue() == 0) && Andrew.getDirection() == Direction.WEST && num >= 3) {
                    Andrew.turnLeft();
                    Andrew.turnLeft();
                    Andrew.turnLeft();
                    if (!Andrew.frontIsClear()) {
                        Andrew.turnLeft();
                        Andrew.setSpeed(0);
                    }
                }






















            }
        }
    }

