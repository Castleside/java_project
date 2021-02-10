import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cube_wall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cube_wall extends walls
{
    /**
     * Act - do whatever the cube_wall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public cube_wall() {
        GreenfootImage image = new GreenfootImage("/level_2/cube_wall.png");
        image.scale(70, 70);
        setImage(image);
    }
    
    public void act() 
    {
        // Add your action code here.
    }    
}
