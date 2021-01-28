import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class door_to_lv1_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class door_to_lv1_2 extends doors_lv1
{
    /**
     * Act - do whatever the door_to_lv1_2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int x;
    int y;
    
    public door_to_lv1_2(int r, int ppX, int ppY) {
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
                World wrld = new level1_2(x, y);
                Greenfoot.setWorld(wrld);
            }
        }
    } 
}
