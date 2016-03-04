
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
 * @author halll7908
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City town = new City();
    Robot sam = new Robot(town, 1, 1, Direction.EAST);
        
    new Wall(town, 0, 3, Direction.NORTH);
        new Wall(town, 0, 2, Direction.NORTH);
        new Wall(town, 0, 1, Direction.NORTH);
        new Wall(town, 0, 0, Direction.NORTH);
        new Wall(town, 0, 3, Direction.EAST);
        new Wall(town, 1, 3, Direction.EAST);
        new Wall(town, 2, 3, Direction.EAST);
        new Wall(town, 2, 0, Direction.SOUTH);
        new Wall(town, 2, 1, Direction.SOUTH);
        new Wall(town, 2, 3, Direction.SOUTH);
        new Wall(town, 0, 0, Direction.WEST);
        new Wall(town, 1, 0, Direction.WEST);
        new Wall(town, 2, 0, Direction.WEST);
        
        // get him to the outskirts
        while(sam.frontIsClear())
            {   sam.move();  
                if(!sam.frontIsClear())
                {   sam.turnLeft();
                    break;  }
            }
        
        // checking walls
        while(true)
            {   if(!sam.frontIsClear())
                    {   sam.turnLeft();
                        sam.move();
                    }
                if(sam.frontIsClear())
                    {   sam.turnLeft();
                        sam.turnLeft();
                        sam.turnLeft();
                    }
                if(sam.getDirection() == Direction.SOUTH&&sam.frontIsClear())
                {   sam.move();
                    break;
                }
                if(sam.getDirection() == Direction.NORTH&&sam.frontIsClear())
                {   sam.move();
                    break;
                }
                if(sam.getDirection() == Direction.EAST&&sam.frontIsClear())
                {   sam.move();
                    break;
                }
                if(sam.getDirection() == Direction.WEST&&sam.frontIsClear())
                {   sam.move();
                    break;
                }
            }
 }
}
