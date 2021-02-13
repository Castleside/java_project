import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class door_to_lv1_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class door_to_lv1_1 extends doors_lv1
{
    /**
     * Act - do whatever the door_to_lv1_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int x;
    int y;
    int u;
    
    public door_to_lv1_1(int r, int ppX, int ppY) {
        setRotation(r);
        GreenfootImage image = getImage();
        setImage(image);
        x = ppX;
        y = ppY;
    }
    public door_to_lv1_1(int r, int ppX, int ppY, int used) {
        setRotation(r);
        GreenfootImage image = getImage();
        setImage(image);
        x = ppX;
        y = ppY;
        u = used;
    }
    
    public void act() 
    {
        if (keyPickup) {
            u = 2;
        }
        
        List<mainChar>objects = getObjectsInRange(100, mainChar.class); 
        if( objects.isEmpty()){
          
        } 
        else{
            if(Greenfoot.isKeyDown("e")){
                World wrld = new level1_1(x, y, u);
                Greenfoot.setWorld(wrld);
                Greenfoot.playSound("door.mp3");
            }
        }
    }    
}
