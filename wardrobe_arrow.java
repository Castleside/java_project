import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wardrobe_arrow here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wardrobe_arrow extends wardrobe_content
{
    /**
     * Act - do whatever the wardrobe_arrow wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public wardrobe_arrow() {
        GreenfootImage image = new GreenfootImage("/wardrobe/arrow.png");
        image.scale(75, 60);
        setImage(image);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            outfit++;
        }
    }    
}
