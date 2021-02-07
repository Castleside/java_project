import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv1_2_shrekegg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_2_shrekegg extends level1
{

    /**
     * Constructor for objects of class lv1_2_shrekegg.
     * 
     */
   
    
    public lv1_2_shrekegg(){
        addObject(new lv1_backButton(), 1130, 680);
        addObject(new shrekgif(), 1280/2, 720/2);
        addObject(new confetti(), 1280/2, 720/2);
        setPaintOrder(lv1_backButton.class, confetti.class, shrekgif.class);
    }
    
    
}
