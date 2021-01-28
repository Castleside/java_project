import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wall_V here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wall_V extends walls
{
    /**
     * Act - do whatever the wall_V wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public wall_V() {
        setImage("/wall/wall_V.png");
        setRotation(0);
        GreenfootImage image = getImage();
        setImage(image);
    }
    
    public wall_V(int laenge, int breite) {
        setImage("/wall/wall_V.png");
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
