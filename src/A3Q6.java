
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
 * @author fostp4040
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kitchener = new City();
        Robot karel = new Robot(Kitchener, 3,3, Direction.SOUTH);
        new Wall(Kitchener, 1,1, Direction.WEST);
        new Wall(Kitchener, 1,1, Direction.NORTH);
        new Wall(Kitchener, 1,2, Direction.EAST);
        new Wall(Kitchener, 1,2, Direction.NORTH);
        new Wall(Kitchener, 2,2, Direction.EAST);
        new Wall(Kitchener, 2,2, Direction.SOUTH);
        new Wall(Kitchener, 2,1, Direction.WEST);
        new Wall(Kitchener, 2,1, Direction.SOUTH);
        new Wall(Kitchener, 4,1, Direction.WEST);
        new Wall(Kitchener, 4,1, Direction.NORTH);
        new Wall(Kitchener, 4,2, Direction.EAST);
        new Wall(Kitchener, 4,2, Direction.NORTH);
        new Wall(Kitchener, 5,2, Direction.EAST);
        new Wall(Kitchener, 5,2, Direction.SOUTH);
        new Wall(Kitchener, 5,1, Direction.WEST);
        new Wall(Kitchener, 5,1, Direction.SOUTH);
        new Wall(Kitchener, 1,4, Direction.WEST);
        new Wall(Kitchener, 1,4, Direction.NORTH);
        new Wall(Kitchener, 1,5, Direction.EAST);
        new Wall(Kitchener, 1,5, Direction.NORTH);
        new Wall(Kitchener, 2,5, Direction.EAST);
        new Wall(Kitchener, 2,5, Direction.SOUTH);
        new Wall(Kitchener, 2,4, Direction.WEST);
        new Wall(Kitchener, 2,4, Direction.SOUTH);
        new Wall(Kitchener, 4,4, Direction.WEST);
        new Wall(Kitchener, 4,4, Direction.NORTH);
        new Wall(Kitchener, 4,5, Direction.EAST);
        new Wall(Kitchener, 4,5, Direction.NORTH);
        new Wall(Kitchener, 5,5, Direction.EAST);
        new Wall(Kitchener, 5,5, Direction.SOUTH);
        new Wall(Kitchener, 5,4, Direction.WEST);
        new Wall(Kitchener, 5,4, Direction.SOUTH);
        
        for(int num=0;num<3;num=num+1){
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        }
        for(int num=0;num<3;num=num+1){
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        karel.move();
        karel.move();
        karel.move();
        karel.turnLeft();
        }
        karel.move();
        karel.move();
        karel.move();
    }
}
