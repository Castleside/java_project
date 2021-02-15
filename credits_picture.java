import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class credits_picture here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class credits_picture extends pictures
{
    /**
     * Act - do whatever the credits_picture wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public credits_picture(){
        GreenfootImage image = new GreenfootImage("/backgrounds/credits.png");
        image.scale(1280, 720);
        setImage(image);
    }
    
    public void act() 
    {
         lv1_finished = false;
         lv2_finished = false;
         lv3_finished = false;
         status = 0;
    }    
}
