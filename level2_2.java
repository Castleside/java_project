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
        //background
        setBackground("/backgrounds/wood.png");
        
        //mainChar
        addObject(new mainChar(), ppX, ppY);
        
        //Blöcke
        addObject(new cube_wall(), 1009, 625);
        addObject(new cube_wall(), 1009, 556);
        addObject(new cube_wall(), 1078, 237);
        addObject(new cube_wall(), 1009, 237);
        addObject(new cube_wall(), 1009, 306);
        addObject(new cube_wall(), 1186, 375);
        addObject(new cube_wall(), 940, 443);
        addObject(new cube_wall(), 93, 374);
        addObject(new cube_wall(), 93, 306);
        addObject(new cube_wall(), 93, 238);
        addObject(new cube_wall(), 161, 238);
        addObject(new cube_wall(), 563, 306);
        addObject(new cube_wall(), 632, 167);
        addObject(new cube_wall(), 701, 167);
        addObject(new cube_wall(), 93, 442);
        
        //fakedoor + real door
        addObject(new double_door_to_lv2_2(90, 1170, 579), 1257, 559);
        addObject(new double_door_to_lv2_3(0, 550, 610), 544, 21);
        
        //key
        addObject(new lv2_2_key(50, 40), 160, 306);
        
        //setPaintOrder
        setPaintOrder(doors.class, mainChar.class, walls.class);
    }
    public level2_2()
    {
        //background
        setBackground("/backgrounds/wood.png");
        
        //mainChar und Ritter
        addObject(new mainChar(), 1170, 579);
        
        //Blöcke
        addObject(new cube_wall(), 1009, 625);
        addObject(new cube_wall(), 1009, 556);
        addObject(new cube_wall(), 1078, 237);
        addObject(new cube_wall(), 1009, 237);
        addObject(new cube_wall(), 1009, 306);
        addObject(new cube_wall(), 1186, 375);
        addObject(new cube_wall(), 940, 443);
        addObject(new cube_wall(), 93, 374);
        addObject(new cube_wall(), 93, 306);
        addObject(new cube_wall(), 93, 238);
        addObject(new cube_wall(), 161, 238);
        addObject(new cube_wall(), 563, 306);
        addObject(new cube_wall(), 632, 167);
        addObject(new cube_wall(), 701, 167);
        addObject(new cube_wall(), 93, 442);
        
        //fakedoor + real door
        addObject(new double_door_to_lv2_2(90, 1170, 579), 1257, 559);
        addObject(new double_door_to_lv2_3(0, 550, 610), 544, 21);
        
        //key
        addObject(new lv2_2_key(50, 40), 160, 306);
        
        //setPaintOrder
        setPaintOrder(doors.class, mainChar.class, walls.class);
    }
}
