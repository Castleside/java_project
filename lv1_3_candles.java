import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv1_3_candles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_3_candles extends lv1_3_solid
{
    /**
     * Act - do whatever the lv1_3_candles wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public lv1_3_candles () {
        setImage("/level_1/candle.jpg");
        setRotation(0);
        GreenfootImage image = getImage();  
        image.scale(15, 40);
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
