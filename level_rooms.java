import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level_rooms here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level_rooms extends World
{

    /**
     * Constructor for objects of class level_rooms.
     * 
     */
    public level_rooms()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1);
        
        //Außenwände
        addObject(new wall_V(), 1250, 720/2);
        addObject(new wall_V(), 29, 720/2);
        addObject(new wall_H(), 1280 / 2 , 690);
        addObject(new wall_H(), 1280 / 2 , 30);
    }

}
