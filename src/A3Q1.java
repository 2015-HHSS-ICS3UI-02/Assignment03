
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yuk4142
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot victor = new Robot(kw,0,0, Direction. EAST);
        new Wall(kw, 0,5, Direction. EAST);
        new Thing(kw,0,6);
       
        while(victor.frontIsClear()){
            if (victor.canPickThing()){
                break;
            }
            victor.move();
            if (victor.canPickThing()){
                break;
            }
        }
        }
    }

