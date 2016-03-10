
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
 * @author pawar5658
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City city = new City();
        Robot bot = new Robot(city, 1, 1, Direction.EAST);
        new Wall(city, 1, 5, Direction.WEST);
        new Thing(city, 1, 4);
        new Thing(city, 1, 3);

        while (bot.frontIsClear()) {
            if (bot.canPickThing()) {
                break;
            }
            bot.move();

        }
    }
}
