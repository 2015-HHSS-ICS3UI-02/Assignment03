
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
 * @author singk4158
 */
public class A3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City kw = new City();

        Robot tina =
                new Robot(kw, 1, 1, Direction.EAST);

        
        new Thing(kw, 1, 5);

        new Wall(kw, 1, 5, Direction.WEST);

        while (tina.frontIsClear()) {
              tina.move();

         
            }
        }
    }

