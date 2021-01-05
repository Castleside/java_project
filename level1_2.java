
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
        setBackground(new GreenfootImage("/backgrounds/grassBGlevelRoom.jpg"));
        addObject(new lv1_knight(60, 60), 1180, 523);
        addObject(new lv1_room2_1_door(60, 100), 1119, 690); 
        //addObject(new wallH(10, 100), 1005, 610);
        //addObject(new wallV(10, 100), 1005, 610);
        addObject(new wallV(10, 100), 1005, 610);
        addObject(new wallV(10, 310), 1005, 305);
        addObject(new wallH(600, 10), 699, 565);
        addObject(new wallH(285, 10), 857, 455);
        addObject(new wallH(215, 10), 507, 455);
        addObject(new wallV(10, 100), 405, 510);
        addObject(new wallV(10, 200), 720, 350);
        addObject(new wallV(10, 200), 610, 350);
        addObject(new wallH(175, 10), 812, 255);
        addObject(new wallV(10, 100), 895, 310);
        addObject(new wallH(295, 10), 862, 145);
        addObject(new wallH(85, 10), 847, 355);
        addObject(new wallH(110, 40), 1165, 224);
        addObject(new wallH(110, 40), 1165, 400);
        addObject(new wallH(295, 10), 457, 255);
        addObject(new wallH(55, 40), 318, 355);
        addObject(new wallV(10, 100), 315, 200);
        addObject(new wallV(10, 100), 425, 200);
        addObject(new wallH(120, 10), 369, 145);
        addObject(new wallV(10, 502), 184, 311);
        addObject(new wallH(55, 40), 477, 355);
        addObject(new wallTroll(120, 120), 372, 195);
        addObject(new lv1_2_lever(50, 60), 109, 101);
        addObject(new lv1_2_keyDoor(10, 90), 810, 305);
        addObject(new lv1_darkness(), 1118, 618);
        addObject(new mainChar("normal"), 1122, 617);
        setPaintOrder(lv1_darkness.class, mainChar.class) ;
    }
    
}
