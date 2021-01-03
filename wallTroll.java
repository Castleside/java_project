import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wallTroll here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wallTroll extends wall
{
    /**
     * Act - do whatever the wallTroll wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }  
    public wallTroll() {
       setImage("/backgrounds/frog.png");
       setRotation(0);
       GreenfootImage image = getImage();  
       image.scale(1280, 60);
       setImage(image);
    }
    
    public wallTroll(int laenge, int breite) {
       setImage("/backgrounds/frog.png");
       setRotation(0);
       GreenfootImage image = getImage();  
       image.scale(laenge, breite);
       setImage(image);
    }
}
