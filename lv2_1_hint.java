import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv2_1_hint here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv2_1_hint extends level2
{

    /**
     * Constructor for objects of class lv2_1_hint.
     * 
     */
    public lv2_1_hint()
    {
        setBackground("/backgrounds/hints.png");
        addObject(new lv1_backButton(1), 1071, 620);
        addObject(new lv1_3_fakeknight(232,324), 371, 472);
        addObject(new lv2_1_hinttext(587, 286), 803, 250);
    }
}
