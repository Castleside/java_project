import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lobby_door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lobby_door extends Doors
{
    /**
     * Act - do whatever the lobby_door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    
    public lobby_door(int laenge, int breite) {
       //setImage("/backgrounds/redBG.jpg");
       setRotation(0);
       GreenfootImage image = getImage();  
       //image.scale(laenge, breite);
       setImage(image);
       
    }
    
    public void act() 
    {
       
    }    
}
