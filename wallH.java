import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wallH here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wallH extends wall
{
    /**
     * Act - do whatever the wallH wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    public wallH() {
       setImage("/wall/wall_H.png");
       GreenfootImage image = getImage();
       setImage(image);
    }
    
    public wallH(int laenge, int breite) {
       setImage("/wall/wall_H.png");
       setRotation(0);
       GreenfootImage image = getImage();  
       image.scale(laenge, breite);
       setImage(image);
    }
}
