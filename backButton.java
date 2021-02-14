import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class backButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class backButton extends buttons
{
    /**
     * Act - do whatever the backButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public backButton() {
        GreenfootImage image = new GreenfootImage("/buttons/back_but.png");
        image.scale(160, 50);
        setImage(image);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            World Menu = new mainMenu();
            Greenfoot.setWorld(Menu);
            button.setVolume(volume);
            button.play();
        }
    }    
}
