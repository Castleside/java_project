import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class buttons here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class buttons extends actor
{
    /**
     * Act - do whatever the buttons wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public buttons() {
        setImage("/backgrounds/blackBG.jpg");
        setRotation(0);
        GreenfootImage image = getImage();  
        image.scale(300, 80);
        setImage(image);
    }
    
    public void act() 
    {
        
    }    
}
