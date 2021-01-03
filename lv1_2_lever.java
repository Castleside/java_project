import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class lv1_2_lever here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_2_lever extends lv1_2_object
{
    /**
     * Act - do whatever the lv1_2_lever wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
     List<mainChar>objects = getObjectsInRange(100, mainChar.class);
        if(Greenfoot.isKeyDown("e")){
            if(objects.isEmpty()){
        
        }
        else{
        setImage("/level_1/lever_1.png");
        setRotation(0);
        GreenfootImage image = getImage();  
        image.scale(50, 60);
        setImage(image);
        getWorld().removeObjects(getWorld().getObjects(lv1_2_keyDoor.class)); //Tür zu schlüssel entfernen
              
        }
    }
}
        
public lv1_2_lever (int laenge, int breite) {
    setImage("/level_1/lever_0.png");
    setRotation(0);
    GreenfootImage image = getImage();  
    image.scale(laenge, breite);
    setImage(image);
    }
}
