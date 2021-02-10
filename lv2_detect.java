import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv2_detect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv2_detect extends unsolid_lv2
{
    /**
     * Act - do whatever the lv2_detect wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public lv2_detect() {
        GreenfootImage image = new GreenfootImage("/level_1/blue.jpg");
        image.scale(200, 10);
        setImage(image);
    }
    
    public void act() 
    {
        if (isTouching(mainChar.class)) {
            Greenfoot.setSpeed(10000);
        }
    }    
}
