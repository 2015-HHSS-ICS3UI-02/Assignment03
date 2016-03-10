
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
 * @author tatad6701
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kw = new City();
        Robot denis = new Robot(Kw, 1, 2, Direction.EAST);

        new Wall(Kw, 0, 0, Direction.NORTH);
        new Wall(Kw, 0, 0, Direction.WEST);
        new Wall(Kw, 1, 0, Direction.WEST);
        new Wall(Kw, 2, 0, Direction.WEST);
        new Wall(Kw, 2, 0, Direction.SOUTH);
        new Wall(Kw, 2, 1, Direction.SOUTH);
        new Wall(Kw, 2, 2, Direction.SOUTH);
        new Wall(Kw, 2, 4, Direction.SOUTH);
        new Wall(Kw, 2, 4, Direction.EAST);
        new Wall(Kw, 1, 4, Direction.EAST);
        new Wall(Kw, 0, 4, Direction.EAST);
        new Wall(Kw, 0, 1, Direction.NORTH);
        new Wall(Kw, 0, 2, Direction.NORTH);
        new Wall(Kw, 0, 3, Direction.NORTH);
        new Wall(Kw, 0, 4, Direction.NORTH);

        denis.setLabel("D");

        // get direction || if front is clear = then move and break
        while (denis.frontIsClear()) {
            denis.move();
        }

        if (!denis.frontIsClear()) {
            denis.turnLeft();
            denis.move();
            denis.turnLeft();
            denis.turnLeft();
            denis.turnLeft();
        }

        while (!denis.frontIsClear()) {
            denis.turnLeft();
            if (denis.frontIsClear()) {
                denis.move();
                denis.turnLeft();
                denis.turnLeft();
                denis.turnLeft();
            }

            if (denis.frontIsClear()) {
                denis.move();
            }
        }
    }
}