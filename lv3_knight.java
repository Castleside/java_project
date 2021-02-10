import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class lv3_knight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv3_knight extends lv3
{
    /**
     * Act - do whatever the lv3_knight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public lv3_knight(){
        setImage("knight.png");
        setRotation(180);
        GreenfootImage image = getImage();  
        image.scale(58, 81);
        setImage(image);
        getImage().mirrorVertically();
    }
    
    public void act() 
    {
        List<mainChar>objects = getObjectsInRange(100, mainChar.class); 
        if( objects.isEmpty()){
          
        } 
        else{
            if(Greenfoot.isKeyDown("e")){
                current_wrld = getWorld();
                World wrld = new lv1_1_hint();
                Greenfoot.setWorld(wrld);
                getWorld().removeObjects(getWorld().getObjects(lv3_exclamationMark.class));
            }
        }
        
      if (Greenfoot.isKeyDown("a")){
            move(-4);
      }
      if (Greenfoot.isKeyDown("d")){
            move(4);
      }
      if(getX() == 0){
            getWorld().removeObject(this);
        }
    }
}    

