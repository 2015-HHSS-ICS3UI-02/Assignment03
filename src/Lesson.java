
import becker.robots.City;
import becker.robots.Direction;
import becker.robots.Robot;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author singk4158
 */
public class Lesson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    City Kw = new City(); 
    Robot karel = new Robot(Kw,2,2, Direction.EAST);
    
    //Creating a new integer 
    int count= 0;
   //loop 4 times 
    
    while(count< 4){
    //robot doing something
    karel.move();
    karel.turnLeft();
    //add 1 to count
    count = count + 1; 
    }
    
    // crating a for loop
    for(int num = 0;num< 4;num = num + 1){
    karel.move();
    karel.move();
    karel.turnLeft();
    }
    
    int numThingsInPack = karel.countThingsInBackpack();
    numThingsInPack = numThingsInPack - 1;
    numThingsInPack --;
    numThingsInPack += 5;
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
}
