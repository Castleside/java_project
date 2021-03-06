import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level2_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2_1 extends level2
{

    /**
     * Constructor for objects of class level2_1.
     * 
     */
    public level2_1(int ppX, int ppY)
    {
        //background
        setBackground("/backgrounds/wood.png");
        
        //mainChar und Ritter
        addObject(new mainChar(), ppX, ppY);
        addObject(new lv2_knight(), 1054, 255);
        addObject(new lv2_exclamationMark(), 1054, 182); 
        
        //detect zum beschleunigen
        addObject(new lv2_detect(), 1121, 154);
        
        //Wände 1. vorraum
        addObject(new wall_H(200, 25), 1121, 311);
        addObject(new wall_V(25, 175), 1008, 236);
        
        //Blöcke
        addObject(new cube_wall(), 439, 94);
        addObject(new cube_wall(), 439, 163);
        addObject(new cube_wall(), 439, 232);
        addObject(new cube_wall(), 275, 163);
        addObject(new cube_wall(), 206, 163);
        addObject(new cube_wall(), 213, 625);
        addObject(new cube_wall(), 213, 556);
        addObject(new cube_wall(), 213, 487);
        addObject(new cube_wall(), 213, 418);
        addObject(new cube_wall(), 282, 487);
        addObject(new cube_wall(), 351, 487);
        addObject(new cube_wall(), 420, 487);
        addObject(new cube_wall(), 1031, 427);
        addObject(new cube_wall(), 682, 625);
        
        //fakedoor
        addObject(new door_fake(90), 1267, 230);
        
        //double door zu Raum 2
        addObject(new double_door_to_lv2_2(-90, 1170, 579), 21, 560);
        
        //key
        addObject(new lv2_1_key(70, 35), 956, 426);
        
        //setPaintOrder
        setPaintOrder(doors.class, mainChar.class, walls.class);
    }
    
    public level2_1()
    {
        //background
        setBackground("/backgrounds/wood.png");
        
        //mainChar und Ritter
        addObject(new mainChar(), 1170, 230);
        addObject(new lv2_knight(), 1054, 255);
        
        //detect zum beschleunigen
        addObject(new lv2_detect(), 1121, 154);
        
        //Wände 1. vorraum
        addObject(new wall_H(200, 25), 1121, 311);
        addObject(new wall_V(25, 175), 1008, 236);
        
        //Blöcke
        addObject(new cube_wall(), 439, 94);
        addObject(new cube_wall(), 439, 163);
        addObject(new cube_wall(), 439, 232);
        addObject(new cube_wall(), 275, 163);
        addObject(new cube_wall(), 206, 163);
        addObject(new cube_wall(), 213, 625);
        addObject(new cube_wall(), 213, 556);
        addObject(new cube_wall(), 213, 487);
        addObject(new cube_wall(), 213, 418);
        addObject(new cube_wall(), 282, 487);
        addObject(new cube_wall(), 351, 487);
        addObject(new cube_wall(), 420, 487);
        addObject(new cube_wall(), 1031, 427);
        addObject(new cube_wall(), 682, 625);
        
        //fakedoor
        addObject(new door_fake(90), 1267, 230);
        
        //double door zu Raum 2
        addObject(new double_door_to_lv2_2(-90, 1170, 579), 21, 560);
        
        //key
        addObject(new lv2_1_key(70, 35), 956, 426);
        
        //setPaintOrder
        setPaintOrder(doors.class, mainChar.class, walls.class);
    }
}
