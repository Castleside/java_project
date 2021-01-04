import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class painting_6 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class painting_6 extends lv1_3_painting
{
    /**
     * Act - do whatever the painting_6 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    
    public painting_6() {
       setImage("/level_1/rosa.jpg");
       setRotation(0);
       GreenfootImage image = getImage();  
       image.scale(111, 10);
       setImage(image);
    }
}
