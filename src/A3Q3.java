
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
 * @author guanv6321
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot karel = new Robot(kw, 3, 3, Direction.EAST);
        new Wall(kw, 6, 2, Direction.SOUTH);
        new Wall(kw, 6, 3, Direction.SOUTH);
        new Wall(kw, 6, 4, Direction.SOUTH);
        new Wall(kw, 6, 5, Direction.SOUTH);
        new Wall(kw, 6, 6, Direction.SOUTH);
        new Wall(kw, 6, 6, Direction.EAST);
        new Wall(kw, 4, 6, Direction.EAST);
        new Wall(kw, 3, 6, Direction.EAST);
        new Wall(kw, 2, 6, Direction.EAST);
        new Wall(kw, 2, 6, Direction.NORTH);
        new Wall(kw, 2, 5, Direction.NORTH);
        new Wall(kw, 2, 4, Direction.NORTH);
        new Wall(kw, 2, 3, Direction.NORTH);
        new Wall(kw, 2, 2, Direction.NORTH);
        new Wall(kw, 2, 2, Direction.WEST);
        new Wall(kw, 3, 2, Direction.WEST);
        new Wall(kw, 4, 2, Direction.WEST);
        new Wall(kw, 5, 2, Direction.WEST);
        new Wall(kw, 6, 2, Direction.WEST);

        while(karel.frontIsClear()){
            karel.move();
        }
        while (true) {

            if (karel.getDirection() == Direction.EAST) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                if (karel.frontIsClear()) {
                    karel.move();
                }
            }
            if (karel.getDirection() == Direction.SOUTH) {
                karel.turnLeft();
                if (karel.frontIsClear()) {
                    karel.move();
                }
            }
            if (karel.getDirection() == Direction.WEST) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                if (karel.frontIsClear()) {
                    karel.move();
                }


            }
            if (karel.getDirection() == Direction.NORTH) {
                karel.turnLeft();
                if (karel.frontIsClear()) {
                    karel.move();
                }

            }
            if(!karel.frontIsClear() && karel.getDirection() == Direction.NORTH) {
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
                
            }
            if (karel.frontIsClear()) {

                break;
            }
        }
    }
}