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
<<<<<<< HEAD
         addObject(new volume_minus(), 300, 300);
         addObject(new volume_plus(), 600, 300);
         addObject(new lv1_backButton(1), 1071, 620);
=======
         addObject(new volume_minus(), 512, 720/2);
         addObject(new volume_plus(), 768, 720/2);
         addObject(new lv1_backButton(1), 1071, 620);
         addObject(new volume_status(), 1280/2, 720/2);
>>>>>>> 03ea817a8e8ffde92de4d43be24cc83fb1ee2e85
    }
}
