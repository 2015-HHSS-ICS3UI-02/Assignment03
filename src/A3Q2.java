
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
 * @author halll7908
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        City town = new City();
        Robot sam = new Robot(town, 0, 0, Direction.EAST);

        new Wall(town, 0, 3, Direction.NORTH);
        new Wall(town, 0, 2, Direction.NORTH);
        new Wall(town, 0, 1, Direction.NORTH);
        new Wall(town, 0, 0, Direction.NORTH);
        new Wall(town, 0, 3, Direction.EAST);
        new Wall(town, 1, 3, Direction.EAST);
        new Wall(town, 2, 3, Direction.EAST);
        new Wall(town, 2, 0, Direction.SOUTH);
        new Wall(town, 2, 1, Direction.SOUTH);
        new Wall(town, 2, 2, Direction.SOUTH);
        new Wall(town, 2, 3, Direction.SOUTH);
        new Wall(town, 0, 0, Direction.WEST);
        new Wall(town, 1, 0, Direction.WEST);
        new Wall(town, 2, 0, Direction.WEST);

        new Thing(town, 0, 1);
        new Thing(town, 1, 1);
        new Thing(town, 1, 2);
        new Thing(town, 1, 3);
        new Thing(town, 2, 3);
        new Thing(town, 2, 0);


        while (true) 
            {
                while(sam.canPickThing())
                    {   sam.pickThing();    }
            
            // is the front clear
                if (sam.frontIsClear()) 
                    {   sam.move(); }
            
                if(sam.getAvenue()==0)
                    {   sam.turnLeft(); 
                        if(sam.frontIsClear())
                            {   sam.move();
                                sam.turnLeft(); 
                            }
                        else
                            {   break;  }
                    }
                if(sam.canPickThing())
                    {
                        sam.pickThing();
                    }
                
                if(!sam.frontIsClear())
                    {   sam.turnLeft();
                        sam.turnLeft();
                    }
            }
        
        while(sam.getDirection()!= Direction.WEST)
     {     sam.turnLeft();}
         while(sam.getAvenue()>0)
         {  
              sam.move();
         if(sam.getAvenue()==0)
            {            break;}
         }
         
     while(sam.getDirection()!= Direction.NORTH)
     {     sam.turnLeft();}
        while(sam.getStreet()>0)
         {  
              sam.move();
         if(sam.getStreet()==0)
            {            break;}
         }
        
        while(sam.getDirection()!= Direction.EAST)
            {   sam.turnLeft();
            }
  }
}


