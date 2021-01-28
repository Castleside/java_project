import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class optionsMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class optionsMenu extends menus
{

    /**
     * Constructor for objects of class optionsMenu.
     * 
     */
    public optionsMenu()
    {
        setBackground(new GreenfootImage("/backgrounds/greyBG.jpg"));
        addObject(new backButton(), 200, 650);
    }
}
