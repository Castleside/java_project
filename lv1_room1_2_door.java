import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class door_lv1_r2_r1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_room1_2_door extends Doors
{
    /**
     * Act - do whatever the door_lv1_r2_r1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    public lv1_room1_2_door(int laenge, int breite) {
       //setImage("/backgrounds/redBG.jpg");
       setRotation(0);
       GreenfootImage image = getImage();  
       //image.scale(laenge, breite);
       setImage(image);
    }
}
