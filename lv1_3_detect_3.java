import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class lv1_3_detect_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_3_detect_3 extends lv1_3_detect
{
    /**
     * Act - do whatever the lv1_3_detect_3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        List<lv1_3_candles>objects = getObjectsInRange(15, lv1_3_candles.class); 
        if(objects.isEmpty()){
            det_3=false;
            //setLocation(340, 610);
        } 
        else{
            det_3=true;
            //setLocation(340, 609);
        }
    }    
}
