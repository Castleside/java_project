import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class volume_plus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class volume_plus extends optionsMenu_buttons
{
    /**
     * Act - do whatever the volume_plus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public volume_plus(){
        GreenfootImage image = new GreenfootImage("/buttons/volume_plus.png");
        image.scale(90, 100);
        setImage(image);
    }
    
    public void act() 
    {   
        if(Greenfoot.mouseClicked(this)){            
            if(volume <= 90){
            volume = volume + 10;
            button.setVolume(volume);
            button.play();
        }
        }        
    }    
}
