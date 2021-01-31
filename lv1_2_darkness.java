import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv1_2_darkness here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_2_darkness extends lv1_2_unsolid
{
    /**
     * Act - do whatever the lv1_2_darkness wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public lv1_2_darkness() {
        setImage("/level_1/lv1_darkness.png");
        GreenfootImage image = getImage();  
        image.scale(2500, 1800);
    }
    
    public void act() 
    {
        java.util.List actors = getWorld().getObjects(mainChar.class);
        mainChar actor = (mainChar)actors.get(0);   
        if(Greenfoot.isKeyDown("a")){
            int x = actor.getX() - 5;
            int y = actor.getY() + 2;
            setLocation(x - 2, y );
        }
        if(Greenfoot.isKeyDown("d")){ 
            int x = actor.getX() - 5;
            int y = actor.getY() + 2;
            setLocation(x + 2, y );
        }
        if(Greenfoot.isKeyDown("w")){ 
            int x = actor.getX() - 5;
            int y = actor.getY() + 2;
            setLocation(x, y - 2 );
        }
        if(Greenfoot.isKeyDown("s")){ 
            int x = actor.getX() - 5;
            int y = actor.getY() + 2;
            setLocation(x, y + 2 );
        }
    }  
}
