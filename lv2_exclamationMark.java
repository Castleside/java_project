import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv2_exclamationMark here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv2_exclamationMark extends unsolid_lv2
{
    /**
     * Act - do whatever the lv2_exclamationMark wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public lv2_exclamationMark(){
        setImage("exclamationmark.png");
        setRotation(0);
        GreenfootImage image = getImage();  
        image.scale(20, 40);
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
