
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
 * @author pintm1551
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   becker.robots.City kw = new becker.robots.City(); 
   Robot karel = new Robot(kw, 1, 1, Direction.EAST);              
   new Wall(kw, 1, 1, Direction.NORTH);
   new Wall(kw, 1, 2, Direction.NORTH);
   new Wall(kw, 1, 3, Direction.NORTH);
   new Wall(kw, 1, 4, Direction.NORTH);
   new Wall(kw, 1, 1, Direction.WEST);
   new Wall(kw, 1, 4, Direction.EAST);
   new Wall(kw, 2, 1, Direction.WEST);
   new Wall(kw, 2, 4, Direction.EAST);
   new Wall(kw, 3, 1, Direction.WEST);
   new Wall(kw, 3, 4, Direction.EAST);
   new Wall(kw, 4, 1, Direction.WEST);
   new Wall(kw, 4, 4, Direction.EAST);
   new Wall(kw, 5, 1, Direction.WEST);
   new Wall(kw, 5, 4, Direction.EAST);
   new Wall(kw, 5, 1, Direction.SOUTH);
   new Wall(kw, 5, 2, Direction.SOUTH);
   new Wall(kw, 5, 3, Direction.SOUTH);
   new Wall(kw, 5, 4, Direction.SOUTH);
   new Thing(kw,1,1);
   new Thing(kw,1,2);
   new Thing(kw,2,1);
   new Thing(kw,2,3);
   new Thing(kw,3,2);
   new Thing(kw,3,3);
   new Thing(kw,3,1);
   new Thing(kw,1,3);
   new Thing(kw,4,3);
   new Thing(kw,3,4);
   int x = 0;
   while(karel.frontIsClear() && x < 2){
        karel.move();
            if(karel.canPickThing()){
                karel.pickThing();
            }
            if(!karel.frontIsClear()){
                karel.turnLeft();
                karel.turnLeft();
                karel.turnLeft();
            x = x + 1;
            }
    }
   while(karel.frontIsClear()){
        karel.move();
            if(karel.canPickThing()){
                karel.pickThing();
         }
            if(karel.getAvenue() == 1 && karel.getStreet() == 1){
                karel.turnLeft();
                karel.turnLeft();
                break;
            }
            if(!karel.frontIsClear()){
                if(karel.getDirection() == Direction.WEST){
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.move();
                    if(karel.canPickThing()){
                        karel.pickThing();
                    }
                    karel.turnLeft();
                    karel.turnLeft();
                    karel.turnLeft();
                }else{
                    karel.turnLeft();
                    karel.move();
                    if(karel.canPickThing()){
                        karel.pickThing();
                    }  
                    karel.turnLeft();
                }
            }
   }
}
}