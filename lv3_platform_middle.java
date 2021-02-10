import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv3_platform_middle here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv3_platform_middle extends lv3_solid
{
    /**
     * Act - do whatever the lv3_platform_middle wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public lv3_platform_middle() {
        setImage("/backgrounds/wood.png");
        GreenfootImage image = getImage();  
        image.scale(150, 30);
        setImage(image);
    }
    
    public void act() 
    {
        if (Greenfoot.isKeyDown("d")) {
            move(-4);
        }
        if (Greenfoot.isKeyDown("a")) {
            move(4);
        }
        if(getX() == 0){
            setLocation(1280-1, Greenfoot.getRandomNumber(50)+500);
        }
        
    }    
}
