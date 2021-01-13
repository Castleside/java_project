import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv1_3_detect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_3_detect extends Actor
{
    /**
     * Act - do whatever the lv1_3_detect wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static boolean det_1=false;
    public static boolean det_2=false;
    public static boolean det_3=false;
    
    public void act() 
    {
        if(det_1 && det_2 && det_3){
        this.getWorld().addObject(new lv1_room3_goal(100, 100), 200, 12);
   
    }
    }    
}
