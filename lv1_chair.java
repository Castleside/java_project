import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class lv1_chair here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_chair extends lv1_detect
{
    /**
     * Act - do whatever the lv1_chair wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //List<lv1_1_solid>objects = getObjectsInRange(30, lv1_1_solid.class);
        java.util.List actors = getWorld().getObjects(mainChar.class);
        mainChar actor = (mainChar)actors.get(0);   
        int x = actor.getX();
        int y = actor.getY()- 90;
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
    public lv1_chair (int laenge, int breite){
        setImage("/level_1/yellow.png"); 
        setRotation(0);
        GreenfootImage image = getImage();  
        image.scale(laenge, breite);
        setImage(image); 
    }
}
