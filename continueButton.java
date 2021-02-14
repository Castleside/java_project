import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class continue_button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class continueButton extends buttons
{
    /**
     * Act - do whatever the continue_button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public continueButton() {
        GreenfootImage image = new GreenfootImage("/buttons/back_but.png");
        image.scale(160, 50);
        setImage(image);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            World Lobby = new lobby();
            Greenfoot.setWorld(Lobby);
            button.setVolume(volume);
            button.play();
        }
    }   
}
