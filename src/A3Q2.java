
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;
import becker.robots.Wall;
import java.awt.Color;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author farrb0382
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    City kw = new City();
    
    Robot bot = new Robot(kw,1,2,Direction.EAST);  
    
    bot.setColor(Color.blue);
    
    new Wall(kw, 1, 2, Direction.NORTH);
    new Wall(kw, 1, 3, Direction.NORTH);
    new Wall(kw, 1, 4, Direction.NORTH);
    new Wall(kw, 1, 5, Direction.NORTH);
    new Wall(kw, 1, 2, Direction.WEST);
    new Wall(kw, 2, 2, Direction.WEST);
    new Wall(kw, 3, 2, Direction.WEST);
    new Wall(kw, 3, 2, Direction.SOUTH);
    new Wall(kw, 3, 3, Direction.SOUTH);
    new Wall(kw, 3, 4, Direction.SOUTH);
    new Wall(kw, 3, 5, Direction.SOUTH);
    new Wall(kw, 3, 5, Direction.EAST);
    new Wall(kw, 2, 5, Direction.EAST);
    new Wall(kw, 1, 5, Direction.EAST);
    
    new Thing(kw, 1, 3);
    new Thing(kw, 2, 3);
    new Thing(kw, 2, 4);
    new Thing(kw, 2, 5);
    new Thing(kw, 3, 2);
    new Thing(kw, 3, 5);
    
    while(true){     
        
    while(bot.canPickThing()){
        bot.pickThing();
    }
   
    if(bot.frontIsClear()){
        bot.move();
            if(bot.canPickThing())
               bot.pickThing();
    }
            
     if(bot.getAvenue()==2){
        bot.turnLeft();
            if(bot.frontIsClear())
                bot.move();
                bot.turnLeft();
                       
     }  

     if(bot.getAvenue()==5 && bot.getStreet()==3){
        break;
    }
     
     
    if(!bot.frontIsClear()){
        bot.turnLeft();
        bot.turnLeft();
        bot.move();
    
    }
    
    }

    while(bot.getDirection()!=Direction.NORTH){   
            bot.turnLeft();
        }
        
        while(bot.getStreet()>1){
            bot.move();
        }
    
        while(bot.getDirection()!=Direction.WEST){
            bot.turnLeft();
        }
        while(bot.getAvenue()>2){
            bot.move();
        }
                         
         bot.turnLeft();
         bot.turnLeft();

      }
   }