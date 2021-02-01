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
    
    
    public level1_1(int ppX, int ppY, int used)
    {
        if (used == 0) {
            //mainChar
            addObject(new mainChar(), ppX, ppY);
            
            //Erstellung fester Gegenstände
            addObject(new lv1_table(500, 180), 640, 360);
            addObject(new door_fake(90), 1266, 360);
            addObject(new lv1_1_knight(), 1179, 254);
            addObject(new lv1_exclamationMark(), 1176, 191);
            
            //Erstellung der beweglichen Objekte (Stühle)
            addObject(new lv1_triangle_chair(60, 98), 761, 123);
            addObject(new lv1_rectangle_chair(60, 98), 209, 499);
            addObject(new lv1_pentagon_chair(60, 98), 828, 580);
            addObject(new lv1_hexagon_chair(60, 98), 1016, 352);
            addObject(new lv1_heptagon_chair(60, 98), 493, 567);
            addObject(new lv1_crown_chair(60, 98), 187, 237);
            
            //Erstellung detect-Methode
            addObject(new lv1_detect(), 1240, 30);
            addObject(new lv1_triangle(150, 150), 790, 560);
            addObject(new lv1_rectangle(150, 150), 490, 560);
            addObject(new lv1_pentagon(150, 150), 290, 360);
            addObject(new lv1_hexagon(150, 150), 490, 160);
            addObject(new lv1_heptagon(150, 150), 790, 160);
            addObject(new lv1_crown(150, 150), 990, 360);
            addObject(new lv1_chair(100, 100), ppX, ppY - 90);
            
            //paintOrder
            setPaintOrder(doors.class, walls.class, mainChar.class, lv1_1_solid.class);
        }
        
        if (used == 1) {
            //mainChar
            addObject(new mainChar(), ppX, ppY);
            
            //Erstellung fester Gegenstände
            addObject(new lv1_table(500, 180), 640, 360);
            addObject(new door_fake(90), 1266, 360);
            addObject(new lv1_1_knight(), 1179, 254);
            addObject(new lv1_exclamationMark(), 1176, 191);
            
            //Erstellung der beweglichen Objekte (Stühle)
            addObject(new lv1_triangle_chair(60, 98), 790, 555);
            addObject(new lv1_rectangle_chair(60, 98), 490, 555);
            addObject(new lv1_pentagon_chair(60, 98), 288, 355);
            addObject(new lv1_hexagon_chair(60, 98), 490, 150);
            addObject(new lv1_heptagon_chair(60, 98), 790, 150);
            addObject(new lv1_crown_chair(60, 98), 988, 355);
            
            //Erstellung detect-Methode
            addObject(new lv1_detect(), 1240, 30);
            addObject(new lv1_triangle(150, 150), 790, 560);
            addObject(new lv1_rectangle(150, 150), 490, 560);
            addObject(new lv1_pentagon(150, 150), 290, 360);
            addObject(new lv1_hexagon(150, 150), 490, 160);
            addObject(new lv1_heptagon(150, 150), 790, 160);
            addObject(new lv1_crown(150, 150), 990, 360);
            addObject(new lv1_chair(100, 100), ppX, ppY - 90);
            
            //Tür wenn Rätsel schon gelöst
            addObject(new door_to_lv1_2(0, 1119, 614), 124, 12);
            
            //paintOrder
            setPaintOrder(doors.class, walls.class, mainChar.class, lv1_1_solid.class);
        }
        
        if (used == 2) {
            //mainChar
            addObject(new mainChar(), ppX, ppY);
            
            //Erstellung fester Gegenstände
            addObject(new lv1_table(500, 180), 640, 360);
            addObject(new door_fake(90), 1266, 360);
            addObject(new lv1_1_knight(), 1179, 254);
            addObject(new lv1_exclamationMark(), 1176, 191);
            
            //Erstellung der beweglichen Objekte (Stühle)
            addObject(new lv1_triangle_chair(60, 98), 790, 555);
            addObject(new lv1_rectangle_chair(60, 98), 490, 555);
            addObject(new lv1_pentagon_chair(60, 98), 288, 355);
            addObject(new lv1_hexagon_chair(60, 98), 490, 150);
            addObject(new lv1_heptagon_chair(60, 98), 790, 150);
            addObject(new lv1_crown_chair(60, 98), 988, 355);
            
            //Erstellung detect-Methode
            addObject(new lv1_detect(), 1240, 30);
            addObject(new lv1_chair(100, 100), ppX, ppY - 90);
            addObject(new lv1_triangle(150, 150), 790, 560);
            addObject(new lv1_rectangle(150, 150), 490, 560);
            addObject(new lv1_pentagon(150, 150), 290, 360);
            addObject(new lv1_hexagon(150, 150), 490, 160);
            addObject(new lv1_heptagon(150, 150), 790, 160);
            addObject(new lv1_crown(150, 150), 990, 360);
            
            //Tür wenn Rätsel schon gelöst
            addObject(new door_to_lv1_2(0, 1119, 614), 124, 12);
            
            //wenn Key in lv1_2 aufgaehoben
            addObject(new door_to_lv1_3(180, 1154, 106), 124, 707);
            
            //paintOrder
            setPaintOrder(doors.class, walls.class, mainChar.class, lv1_1_solid.class);
        }
    }
}
