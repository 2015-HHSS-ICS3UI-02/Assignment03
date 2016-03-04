
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
 * @author Fostp4040
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
        Robot karel = new Robot(Kitchener, 0,2, Direction.WEST);
        new Wall(Kitchener, 1,1, Direction.WEST);
        new Wall(Kitchener, 1,1, Direction.NORTH);
        new Wall(Kitchener, 1,2, Direction.EAST);
        new Wall(Kitchener, 1,2, Direction.NORTH);
        new Wall(Kitchener, 2,2, Direction.EAST);
        new Wall(Kitchener, 2,2, Direction.SOUTH);
        new Wall(Kitchener, 2,1, Direction.WEST);
        new Wall(Kitchener, 2,1, Direction.SOUTH);
        for(int num=0;num<8;num=num+1){
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        }
    }
}
