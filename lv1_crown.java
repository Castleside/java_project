import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class lv1_crown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_crown extends lv1_detect
{
    /**
     * Act - do whatever the lv1_crown wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public lv1_crown(int laenge, int breite){
        setImage("/backgrounds/redBG.jpg"); 
        setRotation(0);
        GreenfootImage image = getImage();  
        image.scale(laenge, breite);
        setImage(image); 
    }
    
    public void act() 
    {
        List<lv1_crown_chair>objects = getObjectsInRange(150, lv1_crown_chair.class); 
        if( objects.isEmpty()){
          
        } 
        else{
            //setLocation(0,0);
            detList[5] = true;
        }
    } 
}