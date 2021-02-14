import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv2_knight_dialogue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv2_knight_dialogue extends level2
{

    /**
     * Constructor for objects of class lv2_knight_dialogue.
     * 
     */
    public lv2_knight_dialogue()
    {
        setBackground("/backgrounds/hints.png");
        addObject(new lv2_backButton(), 1071, 620); //Erstellung des Knopfs
        addObject(new lv2_gigaknight(232,324), 371, 472);
        addObject(new lv2_gigaknighttext(587, 286), 803, 250);
    }
}
