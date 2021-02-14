import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class volume_minus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class volume_minus extends optionsMenu_buttons
{
    /**
     * Act - do whatever the volume_minus wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public volume_minus(){
        GreenfootImage image = new GreenfootImage("/buttons/volume_minus.png");
        image.scale(100, 100);
        setImage(image);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){            
            if(volume >= 10) {
            volume = volume - 10;
            button.setVolume(volume);
            button.play();
        }
        }
    }    
}
