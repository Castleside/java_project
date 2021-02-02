import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class speechbubble here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class speechbubble extends pictures
{
    /**
     * Act - do whatever the speechbubble wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public speechbubble(int leange, int breite){
        GreenfootImage image = new GreenfootImage("speechbubble.png");
        image.scale(leange, breite);
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
