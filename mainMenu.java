import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class mainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mainMenu extends menus
{

    /**
     * Constructor for objects of class mainMenu.
     * 
     */
    public mainMenu()
    {
        setBackground(new GreenfootImage("/backgrounds/greyBG.jpg"));
        //addObject(new logo(), 1280/2, 120);
        addObject(new startButton(), 1280/2, 260);
        addObject(new optionsButton(), 1280/2, 400);
    }
}
