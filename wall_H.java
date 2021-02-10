import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wall_H here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wall_H extends walls
{
    /**
     * Act - do whatever the wall_H wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public wall_H() {
        setImage("/wall/wall_H.png");
        GreenfootImage image = getImage();
        setImage(image);
    }
    
    public wall_H(int laenge, int breite) {
        setImage("/wall/wall_H.png");
        setRotation(0);
        GreenfootImage image = getImage();  
        image.scale(laenge, breite);
        setImage(image);
    }
    
    public void act() 
    {
         
    }    
}
