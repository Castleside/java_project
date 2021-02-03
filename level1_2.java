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
    
    public level1_2(int ppX, int ppY)
    {
        //mainChar Erstellung
        addObject(new mainChar(), ppX, ppY);
        
        //Wände für das Labyrinth
        addObject(new wall_H(10, 100), 1005, 610);
        addObject(new wall_V(10, 100), 1005, 610);
        addObject(new wall_V(10, 100), 1005, 610);
        addObject(new wall_V(10, 310), 1005, 305);
        addObject(new wall_H(600, 10), 699, 565);
        addObject(new wall_H(285, 10), 857, 455);
        addObject(new wall_H(215, 10), 507, 455);
        addObject(new wall_V(10, 100), 405, 510);
        addObject(new wall_V(10, 200), 720, 350);
        addObject(new wall_V(10, 200), 610, 350);
        addObject(new wall_H(175, 10), 812, 255);
        addObject(new wall_V(10, 100), 895, 310);
        addObject(new wall_H(295, 10), 862, 145);
        addObject(new wall_H(85, 10), 847, 355);
        addObject(new wall_H(110, 40), 1165, 224);
        addObject(new wall_H(110, 40), 1165, 400);
        addObject(new wall_H(295, 10), 457, 255);
        addObject(new wall_H(55, 40), 318, 355);
        addObject(new wall_V(10, 100), 315, 200);
        addObject(new wall_V(10, 100), 425, 200);
        addObject(new wall_H(120, 10), 369, 145);
        addObject(new wall_V(10, 502), 184, 311);
        addObject(new wall_H(55, 40), 477, 355);
        
        //Türen
        addObject(new door_to_lv1_1(180, 162, 104, 1), 1119, 707);
        
        //Erstellung solider Objekte
        addObject(new lv1_2_lever(50, 60), 109, 101);
        addObject(new lv1_2_keyDoor(10, 90), 810, 305);
        addObject(new lv1_2_key(50, 20), 851, 304);
        //addObject(new lv1_knight(58, 81), 1180, 523);
        addObject(new lv1_2_shrek(), 372, 195);
        
        //Erstellung nicht solider Elemente
        addObject(new lv1_2_darkness(), 1113, 619);
        
        //setPaintOrder
        setPaintOrder(lv1_2_darkness.class, doors.class, walls.class, mainChar.class) ;
    }
}
