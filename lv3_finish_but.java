import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv3_fin_but here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv3_finish_but extends lv3_buttons
{
    /**
     * Act - do whatever the lv3_fin_but wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public lv3_finish_but(){
        GreenfootImage image = new GreenfootImage("/buttons/back_but.png");
        image.scale(160, 50);
        setImage(image);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            World wrld = new lobby(1186, 128);
            Greenfoot.setWorld(wrld);
            status = 0;
            button.setVolume(volume);
            button.play();
            walktype = 0;
        }
    }    
}
