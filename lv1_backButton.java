import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv1_backButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_backButton extends lv1_Buttons
{
    /**
     * Act - do whatever the lv1_backButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int var = 1;
    
    public lv1_backButton(int c_world) {
        var = c_world;
        GreenfootImage image = new GreenfootImage("/buttons/back_but.png");
        image.scale(160, 50);
        setImage(image);
    }
    
    public void act() 
    {
        if (var == 1) {
            if(Greenfoot.mouseClicked(this)){
                Greenfoot.setWorld(current_wrld);
                sound.stop();
            } 
        }
        if (var == 2) {
            if(Greenfoot.mouseClicked(this)){
                Greenfoot.setWorld(current_wrld_2);
                sound.stop();
            } 
        }
    }    
}
