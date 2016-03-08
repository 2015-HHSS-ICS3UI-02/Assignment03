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
 * @author yuk4142
 */
public class A3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        new Wall(kw, 1, 1, Direction. NORTH);
        new Wall(kw, 1, 1, Direction. WEST);
        new Wall(kw, 1, 2, Direction. NORTH);
        new Wall(kw, 1, 3, Direction. NORTH);
        new Wall(kw, 1, 4, Direction. NORTH);
        new Wall(kw, 1, 4, Direction. EAST);
        new Wall(kw, 2, 4, Direction. EAST);
        new Wall(kw, 3, 4, Direction. EAST);
        new Wall(kw, 3, 4, Direction. SOUTH);
        new Wall(kw, 3, 3, Direction. SOUTH);
        new Wall(kw, 3, 2, Direction. SOUTH);
        new Wall(kw, 3, 1, Direction. SOUTH);
        new Wall(kw, 3, 1, Direction. WEST);
        new Wall(kw, 2, 1, Direction. WEST);
        
        Robot karel = new Robot(kw, 1, 1, Direction. EAST);
        new Thing(kw,2,4);
        new Thing(kw,1,2);
        new Thing(kw,3,1);
        new Thing(kw,2,3);
        new Thing(kw,2,2); 
        new Thing(kw,3,4);
        
       while(true){
           if (karel.canPickThing()){
               karel.pickThing();
           }
           
           if (karel.frontIsClear()&& karel.getDirection() == Direction.EAST || karel.getDirection() ==Direction.WEST){
               
               karel.move();
           }
           if (!karel.frontIsClear() && karel.getDirection() == Direction.EAST){
           karel.turnLeft();
           karel.turnLeft();
           karel.turnLeft();
           
           if (karel.frontIsClear()){
           karel.move();
           }
           if (!karel.frontIsClear()){
               break;
           }
           if(karel.frontIsClear() && karel.getDirection() == Direction. SOUTH){
           karel.turnLeft();
           karel.turnLeft();
           karel.turnLeft();
           }
           }

           
                   
           if (!karel.frontIsClear() && karel.getDirection() == Direction.WEST){
           karel.turnLeft();
           
           if (karel.frontIsClear()){
           karel.move();
           }
           if (!karel.frontIsClear()){
               break;
           }
           if(karel.frontIsClear() && karel.getDirection() == Direction. SOUTH){
           karel.turnLeft();
           }
           }
           
       if(!karel.frontIsClear() && karel.getDirection() == Direction. SOUTH){
           karel.turnLeft();
           
           
       }
      
    

}
       
       if (!karel.frontIsClear() && karel.getDirection() == Direction. SOUTH){
           while(true){
               if (karel.canPickThing()){
               karel.pickThing();
           }
               
           if (karel.getDirection() == Direction.EAST == false ){
            karel.turnLeft();
           }
           if (karel.frontIsClear()&& karel.getDirection() == Direction.EAST ){
               karel.move();
           }
           if (!karel.frontIsClear() && karel.getDirection() == Direction.EAST){
               if (karel.canPickThing()){
               karel.pickThing();
           }
               break;
               
           }
       
       }//while 
          } 
          
               
                       while(true){
                if(karel.getDirection()==Direction.NORTH==false && karel.getStreet()==1==false){       
                    karel.turnLeft();       
                       }     
                           
                
                   if(karel.getDirection()==Direction.NORTH && karel.frontIsClear() && karel.getStreet()==1==false){
                   karel.move();
               }
                   if(karel.getDirection()==Direction.NORTH && !karel.frontIsClear()){
                       karel.turnLeft();
                   }
            if(karel.getDirection()==Direction.WEST && karel.frontIsClear() && karel.getAvenue()==1==false){
                karel.move();
            }
          if (karel.getStreet()==1 && karel.getAvenue()==1 && karel.getDirection()==Direction.EAST==false){
              karel.turnLeft();
          }
           if (karel.getStreet()==1 && karel.getAvenue()==1 && karel.getDirection()==Direction.EAST){
           break;
          }
                       }
       
       
    }
}
