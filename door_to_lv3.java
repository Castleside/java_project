import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class door_to_lv3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class door_to_lv3 extends doors_lv3
{
    /**
     * Act - do whatever the door_to_lv3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */    
    
    int x;
    int y;
    
    public door_to_lv3(int r, int ppX, int ppY) {
        setRotation(r);
        GreenfootImage image = getImage();
        setImage(image);
        x = ppX;
        y = ppY;
    }
    
    public void act() 
    {
        if (lv2_finished) {
            List<mainChar>objects = getObjectsInRange(100, mainChar.class); 
            if( objects.isEmpty()){
              
            } 
            else{
                if(Greenfoot.isKeyDown("e")){
                    World wrld = new level_3();
                    Greenfoot.setWorld(wrld);
                    status = 1;
                    Greenfoot.playSound("door.mp3");
                }
            } 
        } else {
            List<mainChar>objects = getObjectsInRange(100, mainChar.class); 
            if( objects.isEmpty()){
              
            } 
            else{
                if(Greenfoot.isKeyDown("e")){
                    door_locked.setVolume(volume);
                    door_locked.play();
                }
            }
        }
    }    
}
