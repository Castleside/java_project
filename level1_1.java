import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1_1 extends level1
{

    /**
     * Constructor for objects of class level1_1.
     * 
     */
    
    public static boolean key_det=false;
    
    public level1_1()
    {
       addObject(new mainChar(), 1190, 356);
       addObject(new door_fake(60, 100), 1266, 720 / 2);
       addObject(new lv1_table(500, 180), 1280 / 2,720 / 2);
       addObject(new lv1_knight(58, 81), 264, 102); 
       addObject(new lv1_crown_chair(60, 98), 187, 237);
       addObject(new lv1_triangle_chair(60, 98), 761, 123);
       addObject(new lv1_rectangle_chair(60, 98), 209, 499);
       addObject(new lv1_pentagon_chair(60, 98), 828, 580);
       addObject(new lv1_hexagon_chair(60, 98), 1016, 352);
       addObject(new lv1_heptagon_chair(60, 98), 493, 567);
       //addObject(new lv1_room1_2_door(60, 100), 124, 12);
       addObject(new lv1_1_crown(200, 200), 990, 720/2);
       addObject(new lv1_1_triangle(200, 200), 790, 560);
       addObject(new lv1_1_rectangle(200, 200), 490, 560);
       addObject(new lv1_1_pentagon(200, 200), 290, 720/2);
       addObject(new lv1_1_hexagon(200, 200), 490, 160);
       addObject(new lv1_1_heptagon(200, 200), 790, 160);
       //if(key_det=true){
        //addObject(new lv1_room1_3_door(60, 100), 126, 707);} 
       setPaintOrder(Doors.class, mainChar.class, solidObj.class);
    }
    
}
