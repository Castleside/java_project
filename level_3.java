import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level_3 extends level_rooms
{
    /**
     * Constructor for objects of class Level_3.
     * 
     */
    public level_3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        //super(1280, 720, 1);
        
        addObject(new mainChar(), 270, 552);
       
        addObject(new lv3_knight(), 644, 544);
        addObject(new lv3_exclamationMark(), 644, 475);

        addObject(new lv3_platform_middle(), 755, 433);
        addObject(new lv3_platform_middle(), 963, 320);
        addObject(new lv3_platform_middle(), 1176, 395);
        addObject(new lv3_platform_bottom(), 321, 601);
        addObject(new lv3_platform_bottom(), 600, 600);
        addObject(new lv3_platform_bottom(), 112, 504);

        
        //hintergrund
        addObject(new lv3_movingbackground(), 320, 720/2);
        addObject(new lv3_movingbackground(), 960, 720/2);
        
        setPaintOrder(mainChar.class, lv3_exclamationMark.class, lv3_knight.class, lv3_emeralds.class, lv3_solid.class, lv3_movingbackground.class);
    }
    
    public void act() {
        removeObjects(getObjects(walls.class));
        if (Greenfoot.getRandomNumber(500)<=10){
            addObject(new lv3_emeralds(), getWidth()-1, Greenfoot.getRandomNumber(400)+300);
        }
    }
}