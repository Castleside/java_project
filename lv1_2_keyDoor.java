import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv1_2_keyDoor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_2_keyDoor extends lv1_2_solid
{
    /**
     * Act - do whatever the lv1_2_keyDoor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public lv1_2_keyDoor(int laenge, int breite) {
       setImage("/level_1/blue.jpg");
       setRotation(0);
       GreenfootImage image = getImage();  
       image.scale(laenge, breite);
       setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
