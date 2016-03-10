
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Thing;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author guanv6321
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
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

        int count = 0;

        while (count < 10) {
            karel.pickThing();
            karel.move();
            karel.putThing();
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            count = count + 1;

        }
        karel.move();
    }
}
