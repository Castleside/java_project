import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class candle_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class candle_2 extends lv1_3_candles
{
    /**
     * Act - do whatever the candle_2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public candle_2 () {
       setImage("/level_1/candle.jpg");
       setRotation(0);
       GreenfootImage image = getImage();  
       image.scale(20, 40);
       setImage(image);
    }
    
    public void act() 
    {
        List<mainChar>objects = getObjectsInRange(47, mainChar.class);
        java.util.List actors = getWorld().getObjects(mainChar.class);
        mainChar actor = (mainChar)actors.get(0);
        int x = actor.getX() -45;
        int y = actor.getY();
        
        if(Greenfoot.isKeyDown("space")){
            if(objects.isEmpty() ){
                //
            }
            else{
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
    }    
}
