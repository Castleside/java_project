import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv1_room2_1_door here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_room2_1_door extends Doors
{
    /**
     * Act - do whatever the lv1_room2_1_door wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
    } 
    public lv1_room2_1_door(int laenge, int breite) {
       setImage("/backgrounds/redBG.jpg");
       setRotation(90);
       GreenfootImage image = getImage();  
       image.scale(laenge, breite);
       setImage(image);
    }
}
