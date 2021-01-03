import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class door_fake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class door_fake extends Doors
{
    /**
     * Act - do whatever the door_fake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
    } 
    public door_fake(int laenge , int breite ){
       setImage("/backgrounds/redBG.jpg");
       setRotation(0);
       GreenfootImage image = getImage();  
       image.scale(laenge, breite);
       setImage(image);   
    }
}
