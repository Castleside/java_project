import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class optionsButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class optionsButton extends buttons
{
    /**
     * Act - do whatever the optionsButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            World oMenu = new optionsMenu();
            Greenfoot.setWorld(oMenu);
        }
    }    
}
