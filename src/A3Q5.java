
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
 * @author tatad6701
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kw = new City();
        Robot valentino = new Robot(Kw, 2, 1, Direction.EAST);
        
        new Thing(Kw, 2, 1);
        new Thing(Kw, 2, 1);
        new Thing(Kw, 2, 1);
        new Thing(Kw, 2, 1);
        new Thing(Kw, 2, 1);
        new Thing(Kw, 2, 1);
        new Thing(Kw, 2, 1);
        new Thing(Kw, 2, 1);
        new Thing(Kw, 2, 1);
        new Thing(Kw, 2, 1);
        
        valentino.setLabel("V");
        
        int count = 0;
        while (count < 10) {
            valentino.pickThing();
            valentino.move();
            valentino.putThing();
            valentino.turnLeft();
            valentino.turnLeft();
            valentino.move();
            valentino.turnLeft();
            valentino.turnLeft();
            count = count + 1;
        }
        valentino.move();
    }
}