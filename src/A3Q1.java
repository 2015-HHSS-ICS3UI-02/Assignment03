
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
 * @author pintm1551
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   becker.robots.City kw = new becker.robots.City(); 
   Robot karel = new Robot(kw, 1, 1, Direction.EAST);
   new Wall(kw, 1, 6, Direction.EAST);
   new Thing(kw, 1, 6);
   new Thing(kw, 1, 5);
   new Thing(kw, 1, 7);
 
}
}
