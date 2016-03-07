
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
public class A3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   becker.robots.City kw = new becker.robots.City();
   new Wall(kw, 2, 3, Direction.NORTH);
   new Wall(kw, 2, 2, Direction.NORTH);
   new Wall(kw, 3, 2, Direction.WEST);
   new Wall(kw, 2, 2, Direction.WEST);
   new Wall(kw, 3, 3, Direction.EAST);
   new Wall(kw, 2, 3, Direction.EAST);
   new Wall(kw, 3, 2, Direction.SOUTH);
   new Wall(kw, 3, 3, Direction.SOUTH);
   Robot karel = new Robot(kw, 1, 4, Direction.WEST);
   for(int a = 0;a < 8;a = a + 1){
       karel.move();
       karel.move();
       karel.move();
       karel.turnLeft();
   }
}
}
