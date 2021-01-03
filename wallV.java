import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wallV here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wallV extends wall
{
    /**
     * Act - do whatever the wallV wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
     public wallV() {
       setImage("/backgrounds/blackBG.jpg");
       setRotation(90);
       GreenfootImage image = getImage();  
       image.scale(600, 60);
       setImage(image);
    }
    
    public wallV(int laenge, int breite) {
       setImage("/backgrounds/blackBG.jpg");
       setRotation(0);
       GreenfootImage image = getImage();  
       image.scale(laenge, breite);
       setImage(image);
    }
}
