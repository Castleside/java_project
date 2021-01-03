import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class clothMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class clothMenu extends World
{

    /**
     * Constructor for objects of class clothMenu.
     * 
     */
    public clothMenu()
    {    
        // Create a new world with 720x720 cells with a cell size of 1x1 pixels.
        super(720, 720, 1);
        //creating Images
        setBackground(new GreenfootImage("/backgrounds/greyBG.jpg"));
        //creating Objects
        addObject(new backgroundImage("lightgrey", 180, 180), 720/2, 720/2);
        addObject(new mainChar("big"), 720/2, 720/2);
        addObject(new WDarrowRight(70, 70), 489, 720/2);
        addObject(new wdCommitBut(), 360, 555);
    }
}
