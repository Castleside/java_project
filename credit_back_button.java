import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class credit_back_button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class credit_back_button extends credits_buttons
{
    /**
     * Act - do whatever the credit_back_button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public credit_back_button() {
        GreenfootImage image = new GreenfootImage("/buttons/back_but.png");
        image.scale(160, 50);
        setImage(image);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            World wrld = new lobby();
            Greenfoot.setWorld(wrld);
            sound.stop();
            button.setVolume(volume);
            button.play();
        }
    }     
}
