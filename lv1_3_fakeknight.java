import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv1_3_knight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_3_fakeknight extends lv1_3_solid
{
    /**
     * Act - do whatever the lv1_3_knight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public lv1_3_fakeknight (int laenge, int breite){
        setImage("knight.png");
        setRotation(0);
        GreenfootImage image = getImage();  
        image.scale(laenge, breite);
        setImage(image);    
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
