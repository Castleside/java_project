import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv2_backButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv2_backButton extends lv2_buttons
{
    /**
     * Act - do whatever the lv2_backButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public lv2_backButton(){
        GreenfootImage image = new GreenfootImage("/buttons/back_but.png");
        image.scale(160, 50);
        setImage(image);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            World wrld = new level2_4(671, 366, 1);
            Greenfoot.setWorld(wrld);
            status = 0;
            button.setVolume(volume);
            button.play();
        }
    } 
}
