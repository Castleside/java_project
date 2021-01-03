import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * this class creates the Main Menu in the Startscreen
 * triggers when pressing ESC in level choose room
 *  
 * 
 */
public class mainMenu extends World
{

    /**
     * Constructor for objects of class mainMenu.
     * 
     */
    public mainMenu()
    {  
        super(1280, 720, 1);
        setBackground(new GreenfootImage("/backgrounds/greyBG.jpg"));
        addObject(new logo(), 1280/2, 120);
        addObject(new startButton(), 1280/2, 260);
        addObject(new optionsButton(), 1280/2, 400);
      
    }    
}
