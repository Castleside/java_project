import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv1_detect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_detect extends lv1_unsolid
{
    /**
     * Act - do whatever the lv1_detect wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public static boolean[] detList = new boolean[6];
    public static boolean t = true;
    
    public void act() 
    {
        if (detList[0] == true &&
            detList[1] == true &&
            detList[2] == true &&
            detList[3] == true &&
            detList[4] == true &&
            detList[5] == true &&
            t) {
            getWorld().addObject(new door_to_lv1_2(0, 1119, 614), 124, 12);
            t = false;
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
