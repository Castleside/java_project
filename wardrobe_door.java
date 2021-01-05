import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class wardrobe_door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wardrobe_door extends Doors
{
    /**
     * Act - do whatever the wardrobe_door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        
    }   
    public wardrobe_door(int laenge, int breite) {
       //setImage("/backgrounds/redBG.jpg");
       setRotation(90);
       GreenfootImage image = getImage();  
       image.scale(75, 17);
       setImage(image);
    }
    }    

