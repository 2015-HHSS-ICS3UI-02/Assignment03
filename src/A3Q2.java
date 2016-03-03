
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
 * @author voigr4865
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City kw = new City();

        Robot bot = new Robot(kw, 0, 0, Direction.EAST);

        new Wall(kw, 0, 0, Direction.NORTH);
        new Wall(kw, 0, 0, Direction.WEST);
        new Wall(kw, 0, 1, Direction.NORTH);
        new Wall(kw, 0, 2, Direction.NORTH);
        new Wall(kw, 0, 3, Direction.NORTH);
        new Wall(kw, 0, 3, Direction.EAST);
        new Wall(kw, 1, 3, Direction.EAST);
        new Wall(kw, 2, 3, Direction.EAST);
        new Wall(kw, 2, 0, Direction.SOUTH);
        new Wall(kw, 2, 3, Direction.SOUTH);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 0, Direction.WEST);
        new Wall(kw, 1, 0, Direction.WEST);
        new Thing(kw, 0, 1);
        new Thing(kw, 1, 1);
        new Thing(kw, 1, 2);
        new Thing(kw, 1, 3);
        new Thing(kw, 2, 3);
        new Thing(kw, 2, 0);

        while (true) {

            while (bot.canPickThing()) {
                bot.pickThing();
            }

            if (bot.frontIsClear()) {
                bot.move();
            }

            if (bot.getAvenue() == 0) {
                bot.turnLeft();
                if (bot.frontIsClear()) {
                    bot.move();
                    bot.turnLeft();
                } else {
                    break;
                }
                if (bot.canPickThing()) {
                    bot.pickThing();
                }


            }




            if (!bot.frontIsClear()) {
                bot.turnLeft();
                bot.turnLeft();

            }


        }
        
         while(bot.getDirection()!= Direction.WEST){
            
         bot.turnLeft();
              
          }
        while(bot.getAvenue()>0){
            bot.move();
        }
       
        while(bot.getDirection()!= Direction.NORTH){
            bot.turnLeft();
        }
        while(bot.getStreet()>0){
            bot.move();
        }
        
        while(bot.getDirection()!=Direction.EAST){
            bot.turnLeft();
        }
        
    }
}
