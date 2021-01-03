
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1_2 extends level1
{

    /**
     * Constructor for objects of class level1_2.
     * 
     */
    public level1_2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        addObject(new mainChar(), 1122, 617);
        addObject(new lv1_knight(60, 60), 1180, 523);
        addObject(new lv1_room2_1_door(60, 100), 1119, 690); 
        //addObject(new wallH(10, 100), 1005, 610);
        //addObject(new wallV(10, 100), 1005, 610);
        addObject(new wallV(10, 100), 1005, 610);
        addObject(new wallV(10, 310), 1005, 305);
        addObject(new wallH(10, 600), 699, 565);
        addObject(new wallH(10, 285), 857, 455);
        addObject(new wallH(10, 215), 507, 455);
        addObject(new wallV(10, 100), 405, 510);
        addObject(new wallV(10, 200), 720, 350);
        addObject(new wallV(10, 200), 610, 350);
        addObject(new wallH(10, 175), 812, 255);
        addObject(new wallV(10, 100), 895, 310);
        addObject(new wallH(10, 295), 862, 145);
        addObject(new wallH(10, 85), 847, 355);
        addObject(new wallH(40, 110), 1165, 224);
        addObject(new wallH(40, 110), 1165, 400);
        addObject(new wallH(10, 295), 457, 255);
        addObject(new wallH(40, 55), 318, 355);
        addObject(new wallV(10, 100), 315, 200);
        addObject(new wallV(10, 100), 425, 200);
        addObject(new wallH(10, 120), 369, 145);
        addObject(new wallV(10, 502), 184, 311);
        addObject(new wallH(40, 55), 477, 355);
        addObject(new wallTroll(120, 120), 372, 195);
        addObject(new lv1_darkness(), 1122, 417);
        addObject(new lv1_2_lever(50, 60), 109, 101);
        addObject(new lv1_2_keyDoor(10, 90), 810, 305);
        
    
    }
    
}
