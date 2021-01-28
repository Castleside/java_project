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
        addObject(new wall_H(60, 720), 382 , 690);
        addObject(new wall_H(60, 720), 418 , 30);
        
        //Türen
        addObject(new door_to_lobby(-90, 903, 546), 11, 348);
        
        //Erstellung solider Objekte
        //addObject(new shelf(150, 50), 134, 85);
        //addObject(new table(250, 250), 334, 355);
        //addObject(new shelf(50, 600), 636, 360);
    }
}
