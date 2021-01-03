import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * mainChar can change his clothes here
 * 
 *  
 * 
 */
public class wardrobe extends World
{

    /**
     * Constructor for objects of class wardrobe.
     * 
     */
    public wardrobe()
    {    
        super(720, 720, 1); 
        setBackground(new GreenfootImage("/backgrounds/grassBGlevelRoom.jpg"));
        addObject(new mainChar(), 90, 340);
        //Aussenwände
        addObject(new wallV(60, 720), 690, 363);
        addObject(new wallV(60, 720), 29, 720/2);
        addObject(new wallH(60, 720), 382 , 690);
        addObject(new wallH(60, 720), 418 , 30);
        //Tür zur lobby
        addObject(new lobby_door(60, 720/3), 30, 350);
        //---Initialisierung der Objekte in wardobe---
        addObject(new shelf(150, 50), 134, 85);
        addObject(new table(250, 250), 334, 355);
        addObject(new shelf(50, 600), 636, 360);
    }
    
    public wardrobe(int ppX,int ppY)
    {    
        super(720, 720, 1); 
        setBackground(new GreenfootImage("/backgrounds/grassBGlevelRoom.jpg"));
        addObject(new mainChar(), ppX, ppY);
        //Aussenwände
        addObject(new wallV(60, 720), 690, 363);
        addObject(new wallV(60, 720), 29, 720/2);
        addObject(new wallH(60, 720), 382 , 690);
        addObject(new wallH(60, 720), 418 , 30);
        //Tür zur lobby
        addObject(new lobby_door(60, 720/3), 30, 350);
        //---Initialisierung der Objekte in wardobe---
        addObject(new shelf(150, 50), 134, 85);
        addObject(new table(250, 250), 334, 355);
        addObject(new shelf(50, 600), 636, 360);
    }
    
    
}
