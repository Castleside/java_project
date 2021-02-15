import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class double_door_to_lv2_finish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class double_door_to_lv2_goal extends doors_lv2
{
    /**
     * Act - do whatever the double_door_to_lv2_finish wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public double_door_to_lv2_goal(int r) {
        setRotation(r);
        GreenfootImage image = new GreenfootImage("double_doors.png");
        setImage(image);
        image.scale(200, 80);
    }
    
    public void act() 
    {
        if(keyPickup_lv2_4 == true){
            //setRotation(r);
            GreenfootImage image = new GreenfootImage("double_doors_open.png");
            setImage(image);
            image.scale(200, 80); 
            //setLocation(18, 560);
            List<mainChar>objects = getObjectsInRange(130, mainChar.class);
            if(Greenfoot.isKeyDown("e")){
                if(objects.isEmpty()){
                    //
                }
                else{
                    World wrld = new level2_goal();
                    Greenfoot.setWorld(wrld); 
                    lv2_finished = true;
                    keyPickup_lv2_4 = false;
                    goal.play();
                }
            }
        }
    }  
}
