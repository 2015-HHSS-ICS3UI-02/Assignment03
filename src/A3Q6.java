
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
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kw = new City();
        Robot anatolio = new Robot(Kw, 3, 3, Direction.SOUTH);

        new Wall(Kw, 1, 1, Direction.NORTH);
        new Wall(Kw, 1, 1, Direction.WEST);
        new Wall(Kw, 2, 1, Direction.WEST);
        new Wall(Kw, 2, 1, Direction.SOUTH);
        new Wall(Kw, 1, 2, Direction.NORTH);
        new Wall(Kw, 1, 2, Direction.EAST);
        new Wall(Kw, 2, 2, Direction.SOUTH);
        new Wall(Kw, 2, 2, Direction.EAST);

        new Wall(Kw, 1, 4, Direction.NORTH);
        new Wall(Kw, 1, 4, Direction.WEST);
        new Wall(Kw, 2, 4, Direction.WEST);
        new Wall(Kw, 2, 4, Direction.SOUTH);
        new Wall(Kw, 1, 5, Direction.NORTH);
        new Wall(Kw, 1, 5, Direction.EAST);
        new Wall(Kw, 2, 5, Direction.SOUTH);
        new Wall(Kw, 2, 5, Direction.EAST);

        new Wall(Kw, 4, 1, Direction.NORTH);
        new Wall(Kw, 4, 1, Direction.WEST);
        new Wall(Kw, 5, 1, Direction.WEST);
        new Wall(Kw, 5, 1, Direction.SOUTH);
        new Wall(Kw, 4, 2, Direction.NORTH);
        new Wall(Kw, 4, 2, Direction.EAST);
        new Wall(Kw, 5, 2, Direction.SOUTH);
        new Wall(Kw, 5, 2, Direction.EAST);

        new Wall(Kw, 4, 4, Direction.NORTH);
        new Wall(Kw, 4, 4, Direction.WEST);
        new Wall(Kw, 5, 4, Direction.WEST);
        new Wall(Kw, 5, 4, Direction.SOUTH);
        new Wall(Kw, 4, 5, Direction.NORTH);
        new Wall(Kw, 4, 5, Direction.EAST);
        new Wall(Kw, 5, 5, Direction.SOUTH);
        new Wall(Kw, 5, 5, Direction.EAST);

        anatolio.setLabel("A");

        int outside = 0;
        while (outside < 4) {

            int count = 0;
            while (count < 4) {
                anatolio.move();
                anatolio.move();
                anatolio.move();
                if (count < 3) {
                    anatolio.turnLeft();
                }

                count = count + 1;
            }

            outside = outside + 1;
        }

    }
}