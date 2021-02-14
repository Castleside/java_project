import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startButton extends buttons
{
    /**
     * Act - do whatever the startButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public startButton() {
        GreenfootImage image = new GreenfootImage("/buttons/continue_but.png");
        image.scale(160, 50);
        setImage(image);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(current_wrld);
            GreenfootSound button = new GreenfootSound("button_click.mp3");
            button.setVolume(volume);
            button.play();
        }
    }    
}
