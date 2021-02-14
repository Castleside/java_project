import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wd_commit_button here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wd_commit_button extends wardrobe_button
{
    /**
     * Act - do whatever the wd_commit_button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public wd_commit_button() {
        GreenfootImage image = new GreenfootImage("/buttons/back_but.png");
        image.scale(160, 50);
        setImage(image);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            outfit = outfit;
            World world = new wardrobe_room(190, 350);
            Greenfoot.setWorld(world); 
            button.setVolume(volume);
            button.play();
        }
    }    
}
