
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pawar5658
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City city = new City();
        Robot bot = new Robot(city, 2, 2, Direction.EAST);
        new Thing(city, 2, 2);
        new Thing(city, 2, 2);
        new Thing(city, 2, 2);
        new Thing(city, 2, 2);
        new Thing(city, 2, 2);
        new Thing(city, 2, 2);
        new Thing(city, 2, 2);
        new Thing(city, 2, 2);
        new Thing(city, 2, 2);
        new Thing(city, 2, 2);
        
        for(int count = 0;count < 10;count = count + 1){
        bot.pickThing();
        bot.move();
        bot.putThing();
        bot.turnLeft();
        bot.turnLeft();
        bot.move();
        bot.turnLeft();
        bot.turnLeft();
    }
        bot.move();
    }
}
