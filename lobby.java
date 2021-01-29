import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lobby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lobby extends World
{

    /**
     * Constructor for objects of class lobby.
     * 
     */
    
    public lobby(int ppX, int ppY)
    {   
        //initiale Erstellung
        super(1280, 720, 1); 
        setBackground(new GreenfootImage("/backgrounds/grass.png"));
        
        //Innenwände
        addObject(new wall_H(280, 13), 1083 , 430);
        addObject(new wall_V(13, 280), 950, 565);
        addObject(new images("grey", 265, 225), 1088, 547);
        
        //Aussenwände
        addObject(new wall_V(), 1250, 720/2);
        addObject(new wall_V(), 29, 720/2);
        addObject(new wall_H(), 1280 / 2 , 690);
        addObject(new wall_H(), 1280 / 2 , 30);
        
        //Türen
        addObject(new door_to_wardrobe(90, 92, 343), 990, 547);
        addObject(new door_to_lv1_1(-90, 1177, 355), 12, 305);
        addObject(new door_to_lv2(-90, 1177, 355), 12, 127);
        
        //mainChar
        addObject(new mainChar(), ppX, ppY);
        
        //paintOrder
        setPaintOrder(mainChar.class, images.class, doors.class, walls.class);
    }
}
