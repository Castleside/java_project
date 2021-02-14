import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class lv2_giga_ritter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv2_gigaknight extends lv2
{
    /**
     * Act - do whatever the lv2_giga_ritter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public lv2_gigaknight() {
        GreenfootImage image = new GreenfootImage("knight.png");
        image.scale(65, 91);
        setImage(image);
    }
    
    public lv2_gigaknight(int l, int b) {
        GreenfootImage image = new GreenfootImage("knight.png");
        image.scale(l, b);
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
                keyPickup_lv2_4 = true;
                World wrld = new lv2_knight_dialogue();
                Greenfoot.setWorld(wrld);
                getWorld().removeObjects(getWorld().getObjects(lv2_exclamationMark.class));
            }
        }
    }    
}
