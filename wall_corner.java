import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wall_corner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wall_corner extends walls
{
    /**
     * Act - do whatever the wall_corner wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public wall_corner() {
        setImage("/wall/wall_H.png");
        GreenfootImage image = getImage();
        image.scale(60, 15);
        setRotation(45);
        setImage(image);
    }
    
    public wall_corner(int r, int laenge, int breite) {
        setImage("/wall/wall_corner.png");
        setRotation(r);
        GreenfootImage image = getImage();  
        image.scale(laenge, breite);
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
