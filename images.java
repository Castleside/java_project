import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class images here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class images extends actor
{
    /**
     * Act - do whatever the images wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public images(String color, int l, int b) {
        GreenfootImage im = new GreenfootImage("/level_1/blue.jpg");
        if (color == "blue") {
            im = new GreenfootImage("/level_1/blue.jpg");
        }
        if (color == "brown") {
            im = new GreenfootImage("/level_1/brown.jpg");
        }
        if (color == "green") {
            im = new GreenfootImage("/level_1/green.jpg");
        }
        if (color == "red") {
            im = new GreenfootImage("/level_1/red.png");
        }
        if (color == "yellow") {
            im = new GreenfootImage("/level_1/yellow.png");
        }
        if (color == "rose") {
            im = new GreenfootImage("/level_1/rose.jpg");
        }
        if (color == "grey") {
            im = new GreenfootImage("/level_1/grey.jpg");
        }
        if (color == "lightgrey") {
            im = new GreenfootImage("/level_1/lightGrey.jpg");
        }
        im.scale(l, b);
        setImage(im);
    } 
    
    public void act() 
    {
        // Add your action code here.
    }    
}
