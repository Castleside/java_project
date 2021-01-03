 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class backgroundImage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class backgroundImage extends backgrounds
{
    /**
     * Act - do whatever the backgroundImage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public backgroundImage(String color, int laenge, int breite) {
        if (color == "grey") {
            setImage("/backgrounds/greyBG.jpg");
            setRotation(0);
            GreenfootImage image = getImage();  
            image.scale(laenge, breite);
            setImage(image);
        }
        if (color == "lightgrey") {
            setImage("/backgrounds/lightGreyBG.jpg");
            setRotation(0);
            GreenfootImage image = getImage();  
            image.scale(laenge, breite);
            setImage(image);
        }
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
