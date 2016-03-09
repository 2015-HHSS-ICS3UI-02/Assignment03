/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment03;

import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/**
 *
 * @author dhila4674
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Ajay = new City();
        new Wall(Ajay,1,1,Direction.WEST);
        new Wall(Ajay,1,1,Direction.NORTH);
        new Wall(Ajay,1,2,Direction.NORTH);
        new Wall(Ajay,1,3,Direction.NORTH);
        new Wall(Ajay,1,4,Direction.NORTH);
        new Wall(Ajay,1,4,Direction.EAST);
        new Wall(Ajay,2,1,Direction.WEST);
        new Wall(Ajay,2,4,Direction.EAST);
        new Wall(Ajay,3,1,Direction.WEST);
        new Wall(Ajay,3,1,Direction.SOUTH);
        new Wall(Ajay,3,2,Direction.SOUTH);
        new Wall(Ajay,3,3,Direction.SOUTH);
        new Wall(Ajay,3,4,Direction.SOUTH);
        new Wall(Ajay,3,4,Direction.EAST);
        Robot Mario = new Robot(Ajay,1,1,Direction.EAST);
        new Thing(Ajay,1,2);
        new Thing(Ajay,2,2);
        new Thing(Ajay,2,3);
        new Thing(Ajay,2,4);
        new Thing(Ajay,3,1);
        new Thing(Ajay,3,4);
       while(true){
            if(Mario.canPickThing())
                Mario.pickThing();
          
            if(Mario.frontIsClear())
                Mario.move();
            if(!Mario.frontIsClear())
                Mario.turnLeft();
            
            if(Mario.countThingsInBackpack()==4){
                Mario.turnLeft();
               }
            
          
            
            if(Mario.countThingsInBackpack()==4){
                Mario.move();
                Mario.turnLeft();
                Mario.turnLeft();
                Mario.turnLeft();
                Mario.move();
                Mario.pickThing();
                Mario.move();
                Mario.pickThing();
                Mario.move();
                Mario.turnLeft();
                Mario.turnLeft();
                Mario.turnLeft();
                Mario.move();
                Mario.turnLeft();
                Mario.turnLeft();
                Mario.turnLeft();
                break;}

            }
        }
    }


    

