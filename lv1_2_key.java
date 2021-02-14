import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class lv1_2_key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_2_key extends lv1_2_solid
{
    /**
     * Act - do whatever the lv1_2_key wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public lv1_2_key (int laenge, int breite) {
        setImage("/level_1/key.jpg");
        setRotation(0);
        GreenfootImage image = getImage();  
        image.scale(laenge, breite);
        setImage(image);
    }
    
    public void act() 
    {
        List<mainChar>objects = getObjectsInRange(60, mainChar.class);
        if(Greenfoot.isKeyDown("e")){
            if(objects.isEmpty()){
                //
            }
            else{
                getWorld().removeObjects(getWorld().getObjects(lv1_2_key.class));
                keyPickup = true;
                key.setVolume(volume);
                key.play();
            }
        }
    }

        
}
