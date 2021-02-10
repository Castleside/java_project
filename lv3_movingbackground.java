import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class movingbackground here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv3_movingbackground extends unsolid_lv3
{
    /**
     * Act - do whatever the movingbackground wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public lv3_movingbackground(){
        setImage("/backgrounds/hints.png"); 
        GreenfootImage image = getImage();  
        image.scale(1280, 720);
        setImage(image);
    }
    
    public void act() 
    {
        if (Greenfoot.isKeyDown("d")){
            move(-1);
        }
        if (Greenfoot.isKeyDown("a")){
            move(1);
        }
        if(getX() == 0){
            setLocation(1280-1, 720/2);
        }
    }
    
}
