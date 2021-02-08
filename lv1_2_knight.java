import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class lv1_2_knight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_2_knight extends lv1_2
{
    /**
     * Act - do whatever the lv1_2_knight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public lv1_2_knight(){
        setImage("knight.png");
        setRotation(0);
        GreenfootImage image = getImage();  
        image.scale(58, 81);
        setImage(image);
    }
    
    public void act() 
    {
        List<mainChar>objects = getObjectsInRange(100, mainChar.class); 
        if( objects.isEmpty()){
          
        } 
        else{
            if(Greenfoot.isKeyDown("e")){
                current_wrld = getWorld();
                World wrld = new lv1_1_hint();
                Greenfoot.setWorld(wrld);
                getWorld().removeObjects(getWorld().getObjects(lv1_exclamationMark.class));
            }
        }
    }    
}
