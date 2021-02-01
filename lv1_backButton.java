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
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(current_wrld);
        } 
    }    
}
