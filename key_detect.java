import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class key_detect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class key_detect extends mainChar
{
    /**
     * Act - do whatever the key_detect wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public key_detect() {
        setImage("/level_1/key_detect.png");
        GreenfootImage image = getImage();
        image.scale(50, 50);
    }
    
    public void act() 
    {
        List<mainChar>objects = getObjectsInRange(50, mainChar.class);
        if(Greenfoot.isKeyDown("e")){
            if(objects.isEmpty()){
        
            }
            else{
                getWorld().removeObjects(getWorld().getObjects(lv1_2_key.class));
                getWorld().removeObjects(getWorld().getObjects(key_detect.class));
                key_det = true;  
            }
        }
    }    
}
