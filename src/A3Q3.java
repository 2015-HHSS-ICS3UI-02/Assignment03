
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;
import becker.robots.Wall;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author farrb0382
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City kw = new City();

        Robot bot = new Robot(kw, 2, 2, Direction.SOUTH);

        new Wall(kw, 1, 1, Direction.NORTH);
        new Wall(kw, 1, 1, Direction.WEST);
        new Wall(kw, 2, 1, Direction.WEST);
        new Wall(kw, 1, 2, Direction.NORTH);
        new Wall(kw, 1, 3, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.WEST);
        new Wall(kw, 1, 4, Direction.NORTH);
        new Wall(kw, 4, 1, Direction.SOUTH);
        new Wall(kw, 4, 2, Direction.SOUTH);
        new Wall(kw, 4, 3, Direction.SOUTH);
        new Wall(kw, 4, 4, Direction.SOUTH);
        new Wall(kw, 1, 4, Direction.EAST);
        new Wall(kw, 2, 4, Direction.EAST);
        new Wall(kw, 3, 4, Direction.EAST);
        new Wall(kw, 4, 4, Direction.EAST);

        while (bot.frontIsClear()) {
            bot.move();
            if (!bot.frontIsClear()) {
                bot.turnLeft();
                break;
            }
        }

        while (true) {

            if (!bot.frontIsClear()) {
                bot.turnLeft();
                bot.move();
            }

            if (bot.frontIsClear()) {
                bot.turnLeft();
                bot.turnLeft();
                bot.turnLeft();
            }

            if (bot.getDirection() == Direction.NORTH && bot.frontIsClear()) {
                bot.move();
                break;
            }

            if (bot.getDirection() == Direction.SOUTH && bot.frontIsClear()) {
                bot.move();
                break;
            }

            if (bot.getDirection() == Direction.EAST && bot.frontIsClear()) {
                bot.move();
                break;
            }

            if (bot.getDirection() == Direction.WEST && bot.frontIsClear()) {
                bot.move();
                break;
            }

        }
    }
}
