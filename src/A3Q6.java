
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
 * @author voigr4865
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City kw = new City();
        
        Robot bot = new Robot(kw, 3, 3, Direction.SOUTH);
        
        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.EAST);
        new Wall(kw, 2, 2, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.SOUTH);
        new Wall(kw, 2, 1, Direction.WEST);
        
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 1, 4, Direction.WEST);
        new Wall(kw, 1, 5, Direction.NORTH);
        new Wall(kw, 1, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.EAST);
        new Wall(kw, 2, 5, Direction.SOUTH);
        new Wall(kw, 2, 4, Direction.SOUTH);
        new Wall(kw, 2, 4, Direction.WEST);
        
        new Wall(kw, 4, 4, Direction.NORTH);
        new Wall(kw, 4, 4, Direction.WEST);
        new Wall(kw, 4, 5, Direction.NORTH);
        new Wall(kw, 4, 5, Direction.EAST);
        new Wall(kw, 5, 5, Direction.EAST);
        new Wall(kw, 5, 5, Direction.SOUTH);
        new Wall(kw, 5, 4, Direction.SOUTH);
        new Wall(kw, 5, 4, Direction.WEST);
        
        new Wall(kw, 4, 1, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 4, 2, Direction.NORTH);
        new Wall(kw, 4, 2, Direction.EAST);
        new Wall(kw, 5, 2, Direction.EAST);
        new Wall(kw, 5, 2, Direction.SOUTH);
        new Wall(kw, 5, 1, Direction.SOUTH);
        new Wall(kw, 5, 1, Direction.WEST);
        
        int a = 0;
        
        while(a < 3){
             bot.move();
             bot.move();
             bot.move();
             bot.turnLeft();
             a = a + 1;
             
             
        }
        while(bot.getAvenue()!=0){
            bot.move();
            
            
        }
        while(bot.getAvenue()==0){
            int b = 0;
            while(b < 3){
                bot.turnLeft();                
                bot.move();
                bot.move();
                bot.move();
                b = b + 1;
            }
            while(bot.getStreet()!=0){
                bot.move();
            }
            while(bot.getStreet()==0){
                int c = 0;
                while(c < 3){
                    bot.turnLeft();
                    bot.move();
                    bot.move();
                    bot.move();
                    c = c + 1;
                }
            }
            while(bot.getAvenue()!=6){
                bot.move();
            }
            while(bot.getAvenue()==6){
                int d = 0;
                        while(d < 3){
                            bot.turnLeft();
                            bot.move();
                            bot.move();
                            bot.move();
                            d = d + 1;
                        }
            }
        }
    }
}
