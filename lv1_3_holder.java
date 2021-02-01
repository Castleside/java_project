import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class lv1_3_holder here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_3_holder extends lv1_3_solid
{
    /**
     * Act - do whatever the lv1_3_holder wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public lv1_3_holder() {
        GreenfootImage image = new GreenfootImage("/level_1/holder.png");
        image.scale(20, 50);
        setImage(image);
    }
    
    public void act() 
    {
        Actor candles;
        candles = getOneObjectAtOffset(0, -30, lv1_3_candles.class);
        List<lv1_3_candles>objects = getObjectsInRange(300, lv1_3_candles.class); 
        if(objects.isEmpty()){
            //
        } 
        else{
            if (candles != null)
            {
                int x = getX();
                int y = getY();
                candles.setLocation(x, y - 45);
            }
        }
    }    
}
