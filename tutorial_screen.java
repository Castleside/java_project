import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tutorial_screen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tutorial_screen extends World
{

    /**
     * Constructor for objects of class tutorial_screen.
     * 
     */
    public tutorial_screen()
    {    
        // Create a new world with 1280x720 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1);
        
        //Hintergrund
        setBackground(new GreenfootImage("/backgrounds/tutorial_text.png"));
        
        //Button
        addObject(new tutorial_start_button(), 1071, 620);
    }
}
