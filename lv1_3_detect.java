import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv1_3_detect here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_3_detect extends lv1_3_unsolid
{
    /**
     * Act - do whatever the lv1_3_detect wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public lv1_3_detect(){
        setImage("/backgrounds/redBG.jpg"); 
        setRotation(0);
        GreenfootImage image = getImage();
        image.scale(10, 10);
        setImage(image);
        p = true;
    }
    
    public static boolean det_1 = false;
    public static boolean det_2 = false;
    public static boolean det_3 = false;
    public static boolean p = true;
    
    public void act() 
    {
        if(det_1 && det_2 && det_3 && p){
            this.getWorld().addObject(new door_to_lv1_goal(0), 200, 12);
            resetStatic();
            p = false;
        }
    }   
    
    public void resetStatic() {
        det_1 = false;
        det_2 = false;
        det_3 = false;
    }
}
