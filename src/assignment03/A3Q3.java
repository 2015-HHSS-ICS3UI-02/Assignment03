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
public class A3Q3 {

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
        new Wall(Ajay,4,1,Direction.SOUTH);
        new Wall(Ajay,4,2,Direction.SOUTH);
        new Wall(Ajay,4,3,Direction.SOUTH);
        new Wall(Ajay,4,4,Direction.SOUTH);
        new Wall(Ajay,4,4,Direction.EAST);
        new Wall(Ajay,4,1,Direction.WEST);
        Robot houdini = new Robot(Ajay,1,2,Direction.SOUTH);
        new Thing(Ajay,3,5);
        
       while(true){
        if(houdini.frontIsClear())
            houdini.move();
           
        if(!houdini.frontIsClear())
            houdini.turnLeft();

        
        while(!houdini.isBesideThing(IPredicate.aWall)){
                houdini.turnLeft();
                houdini.turnLeft();
                houdini.turnLeft();
                houdini.move();
                break;}
        if(houdini.canPickThing()){
            houdini.pickThing();
            break;}
       
        if(!houdini.frontIsClear())
            houdini.turnLeft();          
        
        if(houdini.frontIsClear())
            houdini.move();
        
        while(!houdini.isBesideThing(IPredicate.aWall)){
                houdini.turnLeft();
                houdini.turnLeft();
                houdini.turnLeft();
                houdini.move();
                break;}
        if(houdini.canPickThing()){
            houdini.pickThing();
            break;}
           
        
       
        
       }
    }
}
