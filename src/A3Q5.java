
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
 * @author yuk4142
 */
public class A3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        City kw = new City();
        Robot karel = new Robot(kw,1,1,Direction.EAST);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        new Thing(kw,1,1);
        for(int timesMoved =0 ;timesMoved <10; timesMoved = timesMoved +1){
            karel.pickThing();
            karel.move();
            karel.move();
            karel.putThing();
            if (timesMoved <9){
               
            karel.turnLeft();
            karel.turnLeft();
            karel.move();
            karel.move();
            karel.turnLeft();
            karel.turnLeft();
            }
            
        }
        
    }
}
