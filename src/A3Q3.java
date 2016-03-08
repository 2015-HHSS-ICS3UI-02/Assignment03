
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
 * @author yuk4142
 */
public class A3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        City kw = new City();
        Robot karel = new Robot(kw, 3, 0, Direction.EAST);
        new Wall(kw, 0,0, Direction. NORTH);
        new Wall(kw, 0,0, Direction. WEST);
        new Wall(kw, 0,1, Direction. NORTH);
        new Wall(kw, 0,2, Direction. NORTH);
        new Wall(kw, 0,3, Direction. NORTH);
        
        new Wall(kw, 2,0, Direction. WEST);
        new Wall(kw, 3,0, Direction. WEST);
        new Wall(kw, 3,0, Direction. SOUTH);
        new Wall(kw, 3,1, Direction. SOUTH);
        new Wall(kw, 3,2, Direction. SOUTH);
        new Wall(kw, 3,3, Direction. SOUTH);
        new Wall(kw, 3,3, Direction. EAST);
        new Wall(kw, 2,3, Direction. EAST);
        new Wall(kw, 1,3, Direction. EAST);
        new Wall(kw, 0,3, Direction. EAST);
        
        while (true){ //1. GET TO WALL 2. FOLLOW WALL 3. FIND EXIT
            
            if (karel.frontIsClear()){
                karel.move();
            karel.turnLeft();
            karel.turnLeft();
            karel.turnLeft();
            
            if(karel.frontIsClear() && karel.getDirection()==Direction.SOUTH){
            karel.move();
            break;
            }
            if(karel.frontIsClear() && karel.getDirection()==Direction.EAST){
            karel.move();
            break;
            }
            if(karel.frontIsClear() && karel.getDirection()==Direction.NORTH){
            karel.move();
            break;
            }
            if(karel.frontIsClear() && karel.getDirection()==Direction.WEST){
            karel.move();
            break;
            }
            }
                    
            
            if (!karel.frontIsClear()){
                karel.turnLeft();
               
            
            }
            
            
            
            
            if (!karel.frontIsClear() && karel.getDirection()==Direction.EAST){
            karel.turnLeft();
            }
             
            
    }
        
       
        
    }
}
