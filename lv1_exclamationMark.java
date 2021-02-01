import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv1_exclamationMark here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_exclamationMark extends unsolid_lv1
{
    /**
     * Act - do whatever the lv1_exclamationMark wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public lv1_exclamationMark(){
        setImage("exclamationmark.jpg");
        setRotation(0);
        GreenfootImage image = getImage();  
        image.scale(30, 30);
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
