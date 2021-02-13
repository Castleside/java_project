import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv1_3_hint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_3_hint extends level1
{

    /**
     * Constructor for objects of class lv1_3_hint.
     * 
     */
    public lv1_3_hint()
    {
        setBackground("/backgrounds/hints.png");
        addObject(new lv1_backButton(1), 1071, 620); //Erstellung des Knopfs
        addObject(new lv1_3_fakeknight(232,324), 371, 472);
        addObject(new lv1_3_hinttext(587, 286), 803, 250);
    }
}
