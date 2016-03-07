
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pintm1551
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    becker.robots.City kw = new becker.robots.City();
    Robot karel = new Robot(kw, 2, 2, Direction.EAST);
    new Thing(kw, 2, 2);
    new Thing(kw, 2, 2);
    new Thing(kw, 2, 2);
    new Thing(kw, 2, 2);
    new Thing(kw, 2, 2);
    new Thing(kw, 2, 2);
    new Thing(kw, 2, 2);
    new Thing(kw, 2, 2);
    new Thing(kw, 2, 2);
    new Thing(kw, 2, 2);
    for(int a = 0;a < 10;a = a + 1){
            karel.pickThing();
            karel.move();
            karel.putThing();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
        }
        karel.move();
    }
}
