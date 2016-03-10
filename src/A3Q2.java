
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
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City city = new City();
        Robot bot = new Robot(city, 1, 1, Direction.EAST);
        new Wall(city, 1, 1, Direction.NORTH);
        new Wall(city, 1, 2, Direction.NORTH);
        new Wall(city, 1, 3, Direction.NORTH);
        new Wall(city, 1, 4, Direction.NORTH);
        new Wall(city, 1, 1, Direction.WEST);
        new Wall(city, 2, 1, Direction.WEST);
        new Wall(city, 3, 1, Direction.WEST);
        new Wall(city, 3, 1, Direction.SOUTH);
        new Wall(city, 3, 2, Direction.SOUTH);
        new Wall(city, 3, 3, Direction.SOUTH);
        new Wall(city, 3, 4, Direction.SOUTH);
        new Wall(city, 1, 4, Direction.EAST);
        new Wall(city, 2, 4, Direction.EAST);
        new Wall(city, 3, 4, Direction.EAST);
        new Thing(city, 1, 2);
        new Thing(city, 2, 2);
        new Thing(city, 2, 3);
        new Thing(city, 2, 4);
        new Thing(city, 3, 1);
        new Thing(city, 3, 4);

        while (true) {
            if (bot.canPickThing()) {
                bot.pickThing();
            }
            if (bot.frontIsClear()) {
                bot.move();
            }
            if (bot.getAvenue() == 1) {
                bot.turnLeft();
                if (bot.frontIsClear()) {
                    bot.move();
                } else {
                    break;
                }
                bot.turnLeft();
            }
            if (!bot.frontIsClear()) {
                bot.turnLeft();
                bot.turnLeft();
            }
        }
        while(bot.getDirection()!=Direction.NORTH){
            bot.turnLeft();
        }
        while(bot.getStreet()!=1){
            bot.move();
            if(bot.getStreet()==1){
                break;
            }
        }
        while(bot.getDirection()!=Direction.EAST){
            bot.turnLeft();
        }
        
        
        
    }
}