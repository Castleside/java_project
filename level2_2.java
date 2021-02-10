import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level2_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2_2 extends level2
{

    /**
     * Constructor for objects of class level2_2.
     * 
     */
    public level2_2(int ppX, int ppY)
    {
    }
    public level2_2()
    {
        //background
        setBackground("/backgrounds/wood.png");
        
        //mainChar und Ritter
        addObject(new mainChar(), 1170, 579);
        
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
        addObject(new double_door_to_lv2_2(90), 1257, 559);
        
        //key
        addObject(new lv2_2_key(50, 40), 964, 426);
        
        //setPaintOrder
        setPaintOrder(doors.class, mainChar.class, walls.class);
    }
}
