import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv1_1_knight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_knight extends lv1_1_object
{
    /**
     * Act - do whatever the lv1_1_knight wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    } 
    public lv1_knight ( int laenge, int breite){
      setImage("knight.jpg");
       setRotation(0);
       GreenfootImage image = getImage();  
       image.scale(laenge, breite);
       setImage(image);    
    }
}
