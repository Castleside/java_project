import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv2_carpet_detect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv2_carpet_detect extends unsolid_lv2
{
    /**
     * Act - do whatever the lv2_carpet_detect wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public lv2_carpet_detect() {
        setImage("/level_1/carpet.png"); 
        GreenfootImage image = getImage(); 
        image.scale(225, 300);
        setImage(image);
    }
    
    public void act() 
    {
        if (isTouching(mainChar.class)) {
            Greenfoot.setSpeed(50);
        }
    }    
}
