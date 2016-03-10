
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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City city = new City();
        Robot bot = new Robot(city, 0, 2, Direction.WEST);
        new Wall(city, 1, 1, Direction.NORTH);
        new Wall(city, 1, 2, Direction.NORTH);
        new Wall(city, 1, 1, Direction.WEST);
        new Wall(city, 2, 1, Direction.WEST);
        new Wall(city, 2, 1, Direction.SOUTH);
        new Wall(city, 2, 2, Direction.SOUTH);
        new Wall(city, 1, 2, Direction.EAST);
        new Wall(city, 2, 2, Direction.EAST);
        
        for(int count = 0; count < 8; count = count + 1){
            bot.move();
            bot.move();
            bot.turnLeft();
            bot.move();
        }
    }
}
