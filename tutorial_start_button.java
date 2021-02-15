import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tutorial_start_button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tutorial_start_button extends tutorial_buttons
{
    /**
     * Act - do whatever the tutorial_start_button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public tutorial_start_button() {
        GreenfootImage image = new GreenfootImage("/buttons/continue_but.png");
        image.scale(160, 50);
        setImage(image);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            World wrld = new lobby();
            Greenfoot.setWorld(wrld);
            lv1_finished = false;
            lv2_finished = false;
            lv3_finished = false;
            status = 0;
            button.setVolume(volume);
            button.play();
        }
    }    
}
