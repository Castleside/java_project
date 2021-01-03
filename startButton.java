import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class startButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class startButton extends Buttons
{
    /**
     * Act - do whatever the startButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            World start = new levelRoom();
            Greenfoot.setWorld(start);
        }
        if(Greenfoot.isKeyDown("backspace")){
            World start = new levelRoom();
            Greenfoot.setWorld(start);
        }
    }    
}

