import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class lv2_knight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv2_knight extends lv2
{
    /**
     * Act - do whatever the lv2_knight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public lv2_knight() {
        GreenfootImage image = new GreenfootImage("knight.png");
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
                World wrld = new lv2_1_hint();
                Greenfoot.setWorld(wrld);
                getWorld().removeObjects(getWorld().getObjects(lv2_exclamationMark.class));
            }
        }
    }    
}
