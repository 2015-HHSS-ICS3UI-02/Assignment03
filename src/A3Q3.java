
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.IPredicate;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author pawar5658
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City city = new City();
        Robot bot = new Robot(city, 1, 1, Direction.SOUTH);
        new Wall(city, 1, 1, Direction.WEST);
        new Wall(city, 2, 1, Direction.WEST);
        new Wall(city, 3, 1, Direction.WEST);
        new Wall(city, 4, 1, Direction.WEST);
        new Wall(city, 4, 1, Direction.SOUTH);
        new Wall(city, 4, 2, Direction.SOUTH);
        new Wall(city, 4, 3, Direction.SOUTH);
        new Wall(city, 4, 4, Direction.SOUTH);
        new Wall(city, 4, 5, Direction.SOUTH);
        new Wall(city, 4, 5, Direction.EAST);
        new Wall(city, 2, 5, Direction.EAST);
        new Wall(city, 1, 5, Direction.EAST);
        new Wall(city, 1, 1, Direction.NORTH);
        new Wall(city, 1, 2, Direction.NORTH);
        new Wall(city, 1, 3, Direction.NORTH);
        new Wall(city, 1, 4, Direction.NORTH);
        new Wall(city, 1, 5, Direction.NORTH);

        while (true) {
            if (bot.isBesideThing(IPredicate.aWall)) {
                bot.move();
            }
            if (!bot.isBesideThing(IPredicate.aWall)) {
                break;
        }
        if (!bot.frontIsClear()) {
            bot.turnLeft();
        }
    }
        bot.turnLeft();
        bot.turnLeft();
        bot.turnLeft();
        bot.move();
        bot.move();
}
}
