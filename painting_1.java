import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class painting_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class painting_1 extends lv1_3_paintings
{
    /**
     * Act - do whatever the painting_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public painting_1() {
        setImage("/level_1/blue.jpg");
        setRotation(0);
        GreenfootImage image = getImage();  
        image.scale(111, 10);
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
                current_wrld = getWorld();
                World wrld = new paint1();
                Greenfoot.setWorld(wrld);
            }
        }
    }    
}
