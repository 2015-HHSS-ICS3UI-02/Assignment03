
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
 * @author fostp4040
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
        Robot karel = new Robot(Kitchener, 1,1, Direction.EAST);
        new Wall(Kitchener, 1,1, Direction.WEST);
        new Wall(Kitchener, 1,1, Direction.NORTH);
        new Wall(Kitchener, 1,2, Direction.NORTH);
        new Wall(Kitchener, 1,3, Direction.NORTH);
        new Wall(Kitchener, 1,4, Direction.NORTH);
        new Wall(Kitchener, 1,4, Direction.EAST);
        new Wall(Kitchener, 2,4, Direction.EAST);
        new Wall(Kitchener, 3,4, Direction.EAST);
        new Wall(Kitchener, 3,4, Direction.SOUTH);
        new Wall(Kitchener, 3,3, Direction.SOUTH);
        new Wall(Kitchener, 3,2, Direction.SOUTH);
        new Wall(Kitchener, 3,1, Direction.SOUTH);
        new Wall(Kitchener, 3,1, Direction.WEST);
        new Wall(Kitchener, 2,1, Direction.WEST);
        new Thing(Kitchener, 1,2);
        new Thing(Kitchener, 2,2);
        new Thing(Kitchener, 2,3);
        new Thing(Kitchener, 2,4);
        new Thing(Kitchener, 3,4);
        new Thing(Kitchener, 3,1);
        for(int num=0;num<4;num=num+1){
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.turnLeft();
        karel.turnLeft();
        }
    }
}