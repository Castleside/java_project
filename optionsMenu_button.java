import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class optionsmenus_button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class optionsMenu_button extends optionsMenu_buttons
{
    /**
     * Act - do whatever the optionsmenus_button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public optionsMenu_button() {
        GreenfootImage image = new GreenfootImage("/buttons/back_but.png");
        image.scale(160, 50);
        setImage(image);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            World Menu = new optionsMenu();
            Greenfoot.setWorld(Menu);
            button.setVolume(volume);
            button.play();
        }
    }    
}
