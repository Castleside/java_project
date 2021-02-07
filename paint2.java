import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class paint2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class paint2 extends level1_paintings
{

    /**
     * Constructor for objects of class paint2.
     * 
     */
    public paint2()
    {
        //Hintergrund
        setBackground("/level_1/lv1_3_background.png");
        
        //Erstellung des Portraits
        addObject(new p2(), 1280/2, 720/2);
        
        //Erstellung backButton
        addObject(new lv1_backButton(2), 1070, 620);
        
        //Erstellung mainChair
        addObject(new mainChar(), 1280/2, 720/2);
        
        //setPaintOrder
        setPaintOrder(p2.class);
    }
}
