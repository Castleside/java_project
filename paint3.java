import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class paint3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class paint3 extends level1_paintings
{

    /**
     * Constructor for objects of class paint3.
     * 
     */
    public paint3()
    {
        //Hintergrund
        setBackground("/level_1/lv1_3_background.png");
        
        //Erstellung des Portraits
        addObject(new p3(), 1280/2, 720/2);
        
        //Erstellung backButton
        addObject(new lv1_backButton(2), 1070, 620);
        
        //Erstellung mainChair
        addObject(new mainChar(), 1280/2, 720/2);
        
        //setPaintOrder
        setPaintOrder(p3.class);
    }
}
