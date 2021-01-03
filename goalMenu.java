import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class goalMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class goalMenu extends World
{

    /**
     * Constructor for objects of class goalMenu.
     * 
     */
    public goalMenu()
        {  
        super(1280, 720, 1);
        setBackground(new GreenfootImage("backgrounds/greyBG.jpg"));
        addObject(new congrats_1(), 1280/2, 120);
        addObject(new startButton(), 1280/2, 260);
      
    } 
    }

