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
 * @author dhila4674
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        City Ajay = new City();
        new Wall(Ajay, 1, 5, Direction.WEST);
        new Thing(Ajay, 1, 4);
        new Thing(Ajay, 1, 3);
        Robot dick = new Robot(Ajay, 1, 1, Direction.EAST);
        
        //creating a new integer
        int CountThingsInBackpack = 0;
        if (CountThingsInBackpack == 0);{
        // robot doing something
            dick.move();
            dick.move();
            if(dick.canPickThing()) 
            break;
    }   
    }
}
