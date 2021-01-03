import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * this is the Room where you can choose the Level
 * and go to the wardrobe
 * 
 * 
 */
public class levelRoom extends World
{

    /**
     * Constructor for objects of class levelRoom.
     * 
     */
    public levelRoom()
    {   
        super(1280, 720, 1); 
        setBackground(new GreenfootImage("/backgrounds/grassBGlevelRoom.jpg"));
        //Aussenwände
        addObject(new mainChar(), 1280/2, 720/2);
        addObject(new wallV(), 1250, 720/2);
        addObject(new wallV(), 29, 720/2);
        addObject(new wallH(), 1280 / 2 , 690);
        addObject(new wallH(), 1280 / 2 , 30);
        //Innenwände
        addObject(new wallH(30, 280), 1083 , 430);
        addObject(new wallV(30, 300), 950, 565);
        addObject(new wardrobe_door(30, 100), 950, 547);
        addObject(new door_lv1(60, 100), 30, 305);
        addObject(new door_lv2(60, 100), 30, 127);
        addObject(new door_lv3(60, 100), 1251, 305);
        addObject(new door_lv4(60, 100), 1251, 127);
    }
    
    public levelRoom(int ppX, int ppY)
    {   
        super(1280, 720, 1); 
        setBackground(new GreenfootImage("/backgrounds/grassBGlevelRoom.jpg"));
        //Aussenwände
        addObject(new mainChar(), ppX, ppY);
        addObject(new wallV(), 1250, 720/2);
        addObject(new wallV(), 29, 720/2);
        addObject(new wallH(), 1280 / 2 , 690);
        addObject(new wallH(), 1280 / 2 , 30);
        //Innenwände
        addObject(new wallH(30, 280), 1083 , 430);
        addObject(new wallV(30, 300), 950, 565);
        addObject(new wardrobe_door(30, 100), 950, 547);
        addObject(new door_lv1(60, 100), 30, 305);
        addObject(new door_lv2(60, 100), 30, 127);
        addObject(new door_lv3(60, 100), 1251, 305);
        addObject(new door_lv4(60, 100), 1251, 127);
    }
}
