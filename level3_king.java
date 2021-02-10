import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level_3_king here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level3_king extends level_rooms
{

    /**
     * Constructor for objects of class level_3_king.
     * 
     */
    public level3_king()
    {
        setBackground("/backgrounds/hints.png");
        addObject(new lv3_finish_but(), 1071, 620); //Erstellung des Knopfs
        addObject(new lv3_king(232,324), 371, 472);
        addObject(new speechbubble(587, 286), 803, 250);
    }
}
