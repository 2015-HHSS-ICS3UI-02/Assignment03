


import becker.robots.City;
import becker.robots.Direction;
import becker.robots.RobotSE;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author dhalt0019
 */
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City kw = new City();

        RobotSE Tina = new RobotSE(kw, 0, 2, Direction.WEST);

        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.NORTH);

        int count = 0;

        while (count < 1) {

            Tina.move();
            Tina.move();
            Tina.turnLeft();

            count = count + 1;
        }

        count = 0;

        while (count < 7) {

            Tina.move();
            Tina.move();
            Tina.move();
            Tina.turnLeft();

            count = count + 1;
        }

        Tina.move();
    }
}
