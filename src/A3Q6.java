
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
 * @author singk4158
 */
public class A3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
    
      City kw= new City();
 
 
   	Robot kharak= new Robot(kw,3,3,Direction.SOUTH);
 
  	
 
  	
 
   	//Make NorthWest Square
 
   	new Wall(kw, 2, 2, Direction.EAST);
 
   	new Wall(kw, 1, 2, Direction.EAST);
 
   	new Wall(kw, 1, 2, Direction.NORTH);
 
   	new Wall(kw, 1, 1, Direction.NORTH);
 
   	new Wall(kw, 1, 1, Direction.WEST);
 
   	new Wall(kw, 2, 1, Direction.WEST);
 
   	new Wall(kw, 2, 1, Direction.SOUTH);
 
   	new Wall(kw, 2, 2, Direction.SOUTH);
 



 
   	//Make NorthEast Square
 
   	new Wall(kw, 2, 5, Direction.EAST);
 
   	new Wall(kw, 1, 5, Direction.EAST);
 
   	new Wall(kw, 1, 5, Direction.NORTH);
 
   	new Wall(kw, 1, 4, Direction.NORTH);
 
   	new Wall(kw, 1, 4, Direction.WEST);
 
   	new Wall(kw, 2, 4, Direction.WEST);
 
   	new Wall(kw, 2, 4, Direction.SOUTH);
 
   	new Wall(kw, 2, 5, Direction.SOUTH);
 



 
   	//Make SouthEast Square
 
   	new Wall(kw, 5, 5, Direction.EAST);
 
   	new Wall(kw, 4, 5, Direction.EAST);
 
   	new Wall(kw, 4, 5, Direction.NORTH);
 
   	new Wall(kw, 4, 4, Direction.NORTH);
 
   	new Wall(kw, 4, 4, Direction.WEST);
 
   	new Wall(kw, 5, 4, Direction.WEST);
 
   	new Wall(kw, 5, 4, Direction.SOUTH);
 
   	new Wall(kw, 5, 5, Direction.SOUTH);
 



 
   	//Make SouthWest Square
 
   	new Wall(kw, 5, 2, Direction.EAST);
 
   	new Wall(kw, 4, 2, Direction.EAST);
 
   	new Wall(kw, 4, 2, Direction.NORTH);
 
   	new Wall(kw, 4, 1, Direction.NORTH);
 
   	new Wall(kw, 4, 1, Direction.WEST);
 
   	new Wall(kw, 5, 1, Direction.WEST);
 
   	new Wall(kw, 5, 1, Direction.SOUTH);
 
   	new Wall(kw, 5, 2, Direction.SOUTH);
 

        //repeat the variable moveamount 4 times
 
   	for(int loop = 4;loop > 0;loop--){ 
 
        //make robot repeat all 4 sides of wall
 
    	for(int moveamount=4;moveamount>0;moveamount--){
 
       	
 
     	kharak.move();
 
     	kharak.move();
 
     	kharak.move();
 
     	if(moveamount!=1){
 
       	
 
     	kharak.turnLeft();
 
    	}
 
   	
 
  	
 
   	}
 
   	}
 
   }
 
}
 
 


 



 



 



 



 



 



 
  
 
 

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

