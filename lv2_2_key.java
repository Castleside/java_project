import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class lv2_2_key here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv2_2_key extends lv2
{
    /**
     * Act - do whatever the lv2_2_key wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public lv2_2_key (int laenge, int breite) {
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

                getWorld().removeObjects(getWorld().getObjects(lv2_2_key.class));
                keyPickup_lv2_2 = true;  

            }
        }
    }  
}
