import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class painting_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class painting_1 extends lv1_3_paintings
{
    /**
     * Act - do whatever the painting_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
    public painting_1() {
        setImage("/level_1/blue.jpg");
        setRotation(0);
        GreenfootImage image = getImage();  
        image.scale(111, 10);
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
