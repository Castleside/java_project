import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class door_lv4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class door_lv4 extends Doors
{
    /**
     * Act - do whatever the door_lv4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    public door_lv4(int laenge, int breite) {
       setImage("/backgrounds/redBG.jpg");
       setRotation(0);
       GreenfootImage image = getImage();  
       image.scale(laenge, breite);
       setImage(image);
    }
}
