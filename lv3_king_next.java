import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv3_fin_but here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv3_king_next extends lv3_buttons
{
    /**
     * Act - do whatever the lv3_fin_but wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public lv3_king_next(){
        GreenfootImage image = new GreenfootImage("/buttons/continue_but.png");
        image.scale(160, 50);
        setImage(image);
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            World wrld = new lv3_end();
            Greenfoot.setWorld(wrld);
            status = 0; //movements ind Level 3
            button.setVolume(volume);
            button.play();
            walktype = 0;
            goal_end.setVolume(volume);
            goal_end.play();
        }
    }    
}
