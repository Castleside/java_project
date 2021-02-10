import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wardrobe_shelf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wardrobe_shelf extends wardrobe_content
{
    /**
     * Act - do whatever the wardrobe_shelf wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public wardrobe_shelf(int r) {
        GreenfootImage image = new GreenfootImage("/level_1/brown.jpg");
        setRotation(r);
        image.scale(200, 25);
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
