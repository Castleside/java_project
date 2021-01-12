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
    
    public boolean[] detList = new boolean[6];
    
    public void act() 
    {
        if (detList[0] == true &&
            detList[1] == true &&
            detList[2] == true &&
            detList[3] == true &&
            detList[4] == true &&
            detList[5] == true) {
            getWorld().addObject(new lv1_room1_2_door(60, 100), 124, 12);
            resetStaticList();
        }
    }
    
    public void resetStaticList() {
        detList[0] = false; 
        detList[1] = false; 
        detList[2] = false; 
        detList[3] = false; 
        detList[4] = false; 
        detList[5] = false;
    }
}