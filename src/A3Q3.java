
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pintm1551
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   for(int a = 0;a < 100;a = a + 1){
   }
      becker.robots.City kw = new becker.robots.City(); 
   Robot karel = new Robot(kw, 1, 1, Direction.EAST);              
   new Wall(kw, 1, 1, Direction.NORTH);
   new Wall(kw, 1, 2, Direction.NORTH);
   new Wall(kw, 1, 3, Direction.NORTH);
   new Wall(kw, 1, 4, Direction.NORTH);
   new Wall(kw, 1, 1, Direction.WEST);
   new Wall(kw, 1, 4, Direction.EAST);
   new Wall(kw, 2, 4, Direction.EAST);
   new Wall(kw, 2, 1, Direction.WEST);
   new Wall(kw, 3, 1, Direction.WEST);
   new Wall(kw, 3, 4, Direction.EAST);
   new Wall(kw, 3, 2, Direction.SOUTH);
   new Wall(kw, 3, 1, Direction.SOUTH);
   new Wall(kw, 3, 3, Direction.SOUTH);
   new Wall(kw, 3, 4, Direction.SOUTH);
   while(karel.frontIsClear()){
       karel.turnLeft();
       if(karel.frontIsClear()){
           karel.move();
           break;
       }
       if(!karel.frontIsClear()){
           karel.turnLeft();
           karel.turnLeft();
           karel.turnLeft();
           karel.move();
       }
       if(!karel.frontIsClear()){
           karel.turnLeft();
           karel.turnLeft();
           karel.turnLeft(); 
           karel.move();
       }
   }
}
}
