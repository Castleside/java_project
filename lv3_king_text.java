import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv3_king_text here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv3_king_text extends pictures
{
    /**
     * Act - do whatever the lv3_king_text wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public lv3_king_text(int leange, int breite) {
        GreenfootImage image = new GreenfootImage("/Level_3/king_text.png");
        image.scale(leange, breite);
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
