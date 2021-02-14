import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wardrobe_room here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wardrobe_room extends wardrobe
{

    /**
     * Constructor for objects of class wardrobe_room.
     * 
     */
    public wardrobe_room(int ppX, int ppY)
    {
        //mainChar und Background
        setBackground(new GreenfootImage("/backgrounds/wood.png"));
        addObject(new mainChar(), ppX, ppY);
        
        //Aussenwände
        addObject(new wall_V(60, 720), 690, 363);
        addObject(new wall_V(60, 720), 29, 720/2);
        addObject(new wall_H(720, 60), 382 , 690);
        addObject(new wall_H(720, 60), 418 , 30);
        
        //Türen
        addObject(new door_to_lobby(-90, 1171, 305), 11, 348);
        
        //Erstellung solider Objekte
        addObject(new wardrobe_shelf(0), 158, 71);
        addObject(new wardrobe_table(), 360, 360);
        addObject(new wardrobe_shelf(90), 647, 238);
    }
}
