import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv1_3_hinttext here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_3_hinttext extends pictures
{
    /**
     * Act - do whatever the lv1_3_hinttext wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public lv1_3_hinttext(int leange, int breite){
        GreenfootImage image = new GreenfootImage("/knight/knight_3.png");
        image.scale(leange, breite);
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}