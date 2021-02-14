import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv2_1_hinttext here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv2_1_hinttext extends hints
{
    /**
     * Act - do whatever the lv2_1_hinttext wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public lv2_1_hinttext(int leange, int breite){
        GreenfootImage image = new GreenfootImage("/knight/knight_4.png");
        image.scale(leange, breite);
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
