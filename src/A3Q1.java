
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
 * @author tatad6701
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kw = new City();
        Robot alfio = new Robot(Kw, 0, 0, Direction.EAST);

        new Wall(Kw, 0, 4, Direction.WEST);
        new Thing(Kw, 0, 3);
        new Thing(Kw, 0, 2);

        alfio.setLabel("A");

        //|| = or / && = and
        while (true) {
            if (alfio.frontIsClear()) {
                alfio.move();
            }

            if (alfio.canPickThing() || !alfio.frontIsClear()) {
                break;
            }
        }
    }
}