import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv1_1_detect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_1_detect extends Actor
{
    /**
     * Act - do whatever the lv1_1_detect wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public static int det = 0;
    
    public void act() 
    {
        if (det > 5) {
            det = 0;
            World w = new level1_1();
            Greenfoot.setWorld(w);
        }
    }    
}
