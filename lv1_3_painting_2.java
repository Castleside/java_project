import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class lv1_3_painting_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_3_painting_2 extends lv1_3_detect
{
    /**
     * Act - do whatever the lv1_3_painting_2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        List<lv1_3_candles>objects = getObjectsInRange(33, lv1_3_candles.class); 
        if(objects.isEmpty()){
            det_1=false;
            setLocation(562, 610);
        } 
        else{
            det_1=true;
            setLocation(562, 609);
            
        }
    }
    
    public lv1_3_painting_2(){
     setImage("/backgrounds/redBG.jpg"); 
     setRotation(0);
     GreenfootImage image = getImage();
     image.scale(35,35);
     setImage(image); 
    }
}
