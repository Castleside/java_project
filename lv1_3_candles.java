import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class lv1_3_candles here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_3_candles extends lv1_3_object
{
    /**
     * Act - do whatever the lv1_3_candles wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public boolean crry = false;
    
    public void act() 
    {
        List<mainChar>objects = getObjectsInRange(47, mainChar.class);
        java.util.List actors = getWorld().getObjects(mainChar.class);
        mainChar actor = (mainChar)actors.get(0);
        int x = actor.getX() -45;
        int y = actor.getY();
      
     if(Greenfoot.isKeyDown("space")){
        if(objects.isEmpty() ){
            
        }
        else{
           if (crry == false){
            if(Greenfoot.isKeyDown("w")){
            setLocation(x, y - 2 );
           }
           if(Greenfoot.isKeyDown("s")){
            setLocation(x, y + 2 );
           }
           if(Greenfoot.isKeyDown("a")){
            setLocation(x - 2, y  );
           }
           if(Greenfoot.isKeyDown("d")){
            setLocation(x + 2, y  );
           }
        }
    }
    }else crry = false;
    }  
    
    public lv1_3_candles () {
        setImage("/level_1/candle.jpg");
        setRotation(0);
        GreenfootImage image = getImage();  
        image.scale(20, 40);
        setImage(image);
    }
}
