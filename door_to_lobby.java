import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class door_to_lobby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class door_to_lobby extends doors
{
    /**
     * Act - do whatever the door_to_lobby wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int x;
    int y;
    
    public door_to_lobby(int r, int ppX, int ppY) {
        setRotation(r);
        GreenfootImage image = getImage();
        setImage(image);
        x = ppX;
        y = ppY;
    }
    
    public void act() 
    {
        List<mainChar>objects = getObjectsInRange(100, mainChar.class);
        if( objects.isEmpty()){
          
        } 
        else{
            if(Greenfoot.isKeyDown("e")){
                World lob = new lobby(x, y);
                Greenfoot.setWorld(lob);
                door.setVolume(volume);
                door.play();
                walktype = 0;
            }
        }  
    }    
}
