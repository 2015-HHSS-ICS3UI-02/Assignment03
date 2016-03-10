
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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kw = new City();
        Robot angelo = new Robot(Kw, 0, 2, Direction.WEST);

        new Wall(Kw, 1, 1, Direction.NORTH);
        new Wall(Kw, 1, 1, Direction.WEST);
        new Wall(Kw, 2, 1, Direction.SOUTH);
        new Wall(Kw, 2, 1, Direction.WEST);
        new Wall(Kw, 2, 2, Direction.SOUTH);
        new Wall(Kw, 2, 2, Direction.EAST);
        new Wall(Kw, 1, 2, Direction.EAST);
        new Wall(Kw, 1, 2, Direction.NORTH);

        angelo.setLabel("A");

        int count = 0;
        while (count < 8) {
            angelo.move();
            angelo.move();
            angelo.turnLeft();
            angelo.move();
            count = count + 1;
        }
    }
}