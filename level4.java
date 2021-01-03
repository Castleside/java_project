import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class levelFour here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level4 extends World
{

    /**
     * Constructor for objects of class levelFour.
     * 
     */
    public level4()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1);
        addObject(new mainChar(), 1280/2, 720/2);
        addObject(new wallH(), 1280 / 2 , 30);
    }
}
