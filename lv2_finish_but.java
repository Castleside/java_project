import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv2_finish_but here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv2_finish_but extends lv2_buttons
{
    /**
     * Act - do whatever the lv2_finish_but wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public lv2_finish_but() {
        GreenfootImage image = new GreenfootImage("/buttons/lv2_finish_but.png");
        setImage(image);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            World wrld = new lobby(110, 127);
            Greenfoot.setWorld(wrld);
            button.setVolume(volume);
            button.play();
            walktype = 0;
        }
    }    
}
