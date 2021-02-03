import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1_goal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1_goal extends level1
{

    /**
     * Constructor for objects of class level1_goal.
     * 
     */
    public level1_goal()
    {
        setBackground(new GreenfootImage("level_1/grey.jpg"));
        addObject(new lv1_congrats(), 1280/2, 120);
        addObject(new lv1_finish_but(), 1280/2, 260);
    }
}
