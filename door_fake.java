import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class door_fake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class door_fake extends doors
{
    /**
     * Act - do whatever the door_fake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private GreenfootSound door_locked = new GreenfootSound("door_locked.mp3");
    
    public door_fake(int r) {
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
                door_locked.setVolume(volume);
                door_locked.play();
                
            }
        }
    }    
}
