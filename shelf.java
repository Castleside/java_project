import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class shelf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shelf extends wardrobe_object
{
    /**
     * Act - do whatever the shelf wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 
    public shelf(int laenge, int breite) {
       setImage("/wardrobe/schrankWD.jpg");
       setRotation(0);
       GreenfootImage image = getImage();  
       image.scale(laenge, breite);
       setImage(image);
    }
}
