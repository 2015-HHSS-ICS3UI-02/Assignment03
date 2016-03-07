
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author fostp4040
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
        Robot karel = new Robot(Kitchener, 0,0, Direction.EAST);
        new Thing(Kitchener, 0,0);
        new Thing(Kitchener, 0,0);
        new Thing(Kitchener, 0,0);
        new Thing(Kitchener, 0,0);
        new Thing(Kitchener, 0,0);
        new Thing(Kitchener, 0,0);
        new Thing(Kitchener, 0,0);
        new Thing(Kitchener, 0,0);
        new Thing(Kitchener, 0,0);
        new Thing(Kitchener, 0,0);
        for(int num=0;num<10;num=num+1){
            karel.pickThing();
            karel.move();
            karel.putThing();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
        }
        karel.move();
    }
}
