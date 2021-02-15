import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class door_to_lv1_goal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class door_to_lv1_goal extends doors_lv1
{
    /**
     * Act - do whatever the door_to_lv1_goal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public door_to_lv1_goal(int r) {
        setRotation(r);
        GreenfootImage image = getImage();
        setImage(image);
    }
    
    public void act() 
    {
        List<mainChar>objects = getObjectsInRange(100, mainChar.class); 
        if( objects.isEmpty()){
          
        } 
        else{
            if(Greenfoot.isKeyDown("e")){
                World wrld = new level1_goal();
                Greenfoot.setWorld(wrld);
                lv1_finished = true;
                goal.setVolume(volume);
                goal.play();
            }
        }
    }     
}
