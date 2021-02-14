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
         setBackground(new GreenfootImage("/level_1/grey.jpg"));
         addObject(new volume_minus(), 300, 300);
         addObject(new volume_plus(), 600, 300);
          addObject(new lv1_backButton(1), 1071, 620);
    }
}
