
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
 * @author farrb0382
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();

        Robot bot = new Robot(kw, 2, 2, Direction.EAST);

        new Thing(kw, 2, 2, Direction.WEST);
        new Thing(kw, 2, 2, Direction.WEST);
        new Thing(kw, 2, 2, Direction.WEST);
        new Thing(kw, 2, 2, Direction.WEST);
        new Thing(kw, 2, 2, Direction.WEST);
        new Thing(kw, 2, 2, Direction.WEST);
        new Thing(kw, 2, 2, Direction.WEST);
        new Thing(kw, 2, 2, Direction.WEST);
        new Thing(kw, 2, 2, Direction.WEST);
        new Thing(kw, 2, 2, Direction.WEST);

        int a = 0;
        while (a < 10) {
            bot.pickThing();
            bot.move();
            bot.turnLeft();
            bot.turnLeft();
            bot.putThing();
            bot.move();
            bot.turnLeft();
            bot.turnLeft();
            a = a + 1;
        }





    }
}
