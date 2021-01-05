import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class door_lv1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class door_lv1 extends Doors
{
    /**
     * Act - do whatever the door_lv1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
      
        
    } 
    public door_lv1(int laenge, int breite) {
       //setImage("/backgrounds/redBG.jpg");
       setRotation(-90);
       GreenfootImage image = getImage();  
       //image.scale(laenge, breite);
       setImage(image);
    }
}
