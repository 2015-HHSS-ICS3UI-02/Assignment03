
import becker.robots.City;
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
 * @author tatad6701
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City Kw = new City();
        Robot armani = new Robot(Kw, 1, 1, Direction.EAST);

        new Wall(Kw, 1, 1, Direction.WEST);
        new Wall(Kw, 1, 1, Direction.NORTH);
        new Wall(Kw, 1, 2, Direction.NORTH);
        new Wall(Kw, 1, 3, Direction.NORTH);
        new Wall(Kw, 1, 4, Direction.NORTH);
        new Wall(Kw, 1, 4, Direction.EAST);
        new Wall(Kw, 2, 1, Direction.WEST);
        new Wall(Kw, 3, 1, Direction.WEST);
        new Wall(Kw, 3, 1, Direction.SOUTH);
        new Wall(Kw, 3, 2, Direction.SOUTH);
        new Wall(Kw, 3, 3, Direction.SOUTH);
        new Wall(Kw, 3, 4, Direction.SOUTH);
        new Wall(Kw, 3, 4, Direction.EAST);
        new Wall(Kw, 2, 4, Direction.EAST);

        new Thing(Kw, 1, 2);
        new Thing(Kw, 3, 1);
        new Thing(Kw, 2, 2);
        new Thing(Kw, 2, 3);
        new Thing(Kw, 2, 4);
        new Thing(Kw, 3, 4);

        armani.setLabel("A");
        armani.setColor(Color.red);

        while (armani.frontIsClear()) {
            armani.move();
            if (armani.canPickThing()) {
                armani.pickThing();
            }

            if (!armani.frontIsClear()) {
                if (armani.getDirection() == Direction.EAST) {
                    armani.turnLeft();
                    armani.turnLeft();
                    armani.turnLeft();
                    if (armani.frontIsClear()) {
                        armani.move();
                        armani.turnLeft();
                        armani.turnLeft();
                        armani.turnLeft();
                    }

                } else if (armani.getDirection() == Direction.WEST) {
                    armani.turnLeft();
                    armani.move();
                    armani.turnLeft();
                }

                if (armani.canPickThing()) {
                    armani.pickThing();
                }
            }
        }

        while (armani.getDirection() != Direction.WEST) {
            armani.turnLeft();
        }
        while (armani.getAvenue() != 1) {
            armani.move();
        }
        while (armani.getDirection() != Direction.NORTH) {
            armani.turnLeft();
        }
        while (armani.getStreet() != 1) {
            armani.move();
        }
        armani.turnLeft();
        armani.turnLeft();
        armani.turnLeft();
    }
}