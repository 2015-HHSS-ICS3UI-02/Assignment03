
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
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    City town = new City();
    Robot sam = new Robot(town, 3, 3, Direction.SOUTH);
    
    new Wall(town, 1, 1, Direction.NORTH);
    new Wall(town, 1, 1, Direction.WEST);
    new Wall(town, 2, 1, Direction.SOUTH);
    new Wall(town, 2, 1, Direction.WEST);
    new Wall(town, 1, 2, Direction.NORTH);
    new Wall(town, 1, 2, Direction.EAST);
    new Wall(town, 2, 2, Direction.SOUTH);
    new Wall(town, 2, 2, Direction.EAST);
    
    new Wall(town, 4, 1, Direction.NORTH);
    new Wall(town, 4, 1, Direction.WEST);
    new Wall(town, 5, 1, Direction.SOUTH);
    new Wall(town, 5, 1, Direction.WEST);
    new Wall(town, 4, 2, Direction.NORTH);
    new Wall(town, 4, 2, Direction.EAST);
    new Wall(town, 5, 2, Direction.SOUTH);
    new Wall(town, 5, 2, Direction.EAST);
    
    new Wall(town, 1, 4, Direction.NORTH);
    new Wall(town, 1, 4, Direction.WEST);
    new Wall(town, 2, 4, Direction.SOUTH);
    new Wall(town, 2, 4, Direction.WEST);
    new Wall(town, 1, 5, Direction.NORTH);
    new Wall(town, 1, 5, Direction.EAST);
    new Wall(town, 2, 5, Direction.SOUTH);
    new Wall(town, 2, 5, Direction.EAST);
    
    new Wall(town, 4, 4, Direction.NORTH);
    new Wall(town, 4, 4, Direction.WEST);
    new Wall(town, 5, 4, Direction.SOUTH);
    new Wall(town, 5, 4, Direction.WEST);
    new Wall(town, 4, 5, Direction.NORTH);
    new Wall(town, 4, 5, Direction.EAST);
    new Wall(town, 5, 5, Direction.SOUTH);
    new Wall(town, 5, 5, Direction.EAST);
    
    for(int num = 0; num < 4; num = num + 1)
        //robot doing things
        {   sam.move();
            sam.move();
            sam.move();
            sam.turnLeft();
        
        if(sam.getDirection() == Direction.WEST)
                {   while(sam.getAvenue() != 3&&sam.getStreet() == 3)
                    {   sam.move(); 
                        if(sam.getAvenue() == 3&&sam.getStreet() == 3)
                        {   break;  }
                    }
                }
        }
    
    for(int num = 0; num < 2; num = num + 1)
        //robot doing things
        {   sam.move();
            sam.move();
            sam.move();
            sam.turnLeft();
        
            while(sam.getAvenue() == 3 && sam.getStreet() != 0)
            {   sam.move(); 
                if(sam.getAvenue() ==  3&& sam.getStreet() == 0)
                {   break;  }
            }
        }
    
    for(int num = 0; num < 3; num = num + 1)
        //robot doing things
        {   sam.turnLeft();
            sam.move();
            sam.move();
            sam.move();
        
            while(sam.getAvenue() == 3 && sam.getStreet() != 6) // problem
            {   sam.move(); 
                if(sam.getAvenue() ==  3&& sam.getStreet() == 6)
                {   break;  }
            }
        }
    
    for(int num = 0; num < 3; num = num + 1)
        //robot doing things
        {   sam.move();
            sam.move();
            sam.turnLeft();
            sam.move();
        
            while(sam.getAvenue() == 3 && sam.getStreet() != 3) // problem
            {   sam.move(); 
                if(sam.getAvenue() ==  3&& sam.getStreet() == 3)
                {   break;  }
            }
        }
    
    }
}
