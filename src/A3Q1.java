
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
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City kw = new City();
        
        Robot bot = new Robot(kw, 3, 0, Direction.EAST);
        
       new Wall(kw, 3, 4, Direction.WEST);
       new Thing(kw, 3, 3);
       new Thing(kw, 3, 2);
       
       
        
        while(true){
            if(bot.frontIsClear()){
                bot.move();
                
            }
            
            if(bot.canPickThing()||!bot.frontIsClear()){
                break;
            }
            
        }       
        
    }
    }

