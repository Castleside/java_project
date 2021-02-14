import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class lv3_king here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv3_king extends lv3_solid
{
    /**
     * Act - do whatever the lv3_king wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public lv3_king(){
        setImage("/Level_3/king.png");
        GreenfootImage image = getImage();  
        image.scale(58, 81);
        setImage(image);
    }
    
    public lv3_king(int breite, int laenge){
        setImage("/Level_3/king.png");
        GreenfootImage image = getImage();  
        image.scale(breite, laenge);
        setImage(image);
    }
    
    public void act() 
    {
        if (Greenfoot.isKeyDown("d")) {
            move(-4);
       }
       if (Greenfoot.isKeyDown("a")) {
            move(4);
       }
       
       List<mainChar>objects = getObjectsInRange(100, mainChar.class); 
       if( objects.isEmpty()){
          
       } 
       else{
            if(Greenfoot.isKeyDown("e")){
                World wrld = new level3_king();
                Greenfoot.setWorld(wrld);
                status = 1;
                
            }
       }
    }    
    }    

