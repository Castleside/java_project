import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level2_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2_3 extends level2
{

    /**
     * Constructor for objects of class level2_3.
     * 
     */
    public level2_3(int ppX, int ppY)
    {
        //background
        setBackground("/backgrounds/wood.png");
        
        //mainChar
        addObject(new mainChar(), ppX, ppY);
        
        //Blöcke
        addObject(new cube_wall(), 480, 505);
        addObject(new cube_wall(), 548, 505);
        addObject(new cube_wall(), 616, 505);
        addObject(new cube_wall(), 749, 625);
        addObject(new cube_wall(), 349, 625);
        addObject(new cube_wall(), 1187, 429);
        addObject(new cube_wall(), 698, 174);
        addObject(new cube_wall(), 908, 94);
        addObject(new cube_wall(), 92, 94);
        addObject(new cube_wall(), 160, 94);
        addObject(new cube_wall(), 93, 161);
        addObject(new cube_wall(), 160, 161);
        addObject(new cube_wall(), 228, 320);
        addObject(new cube_wall(), 375, 144);
        addObject(new cube_wall(), 442, 144);
        addObject(new cube_wall(), 442, 212);
        addObject(new cube_wall(), 307, 144);
        addObject(new cube_wall(), 160, 226);
        
        //fakedoor + real door
        addObject(new double_door_to_lv2_3(180, 550, 610), 544, 697);
        addObject(new double_door_to_lv2_4(90, 107, 187), 1257, 227);
        
        //key
        addObject(new lv2_3_key(50, 40), 363, 215);
        
        //setPaintOrder
        setPaintOrder(doors.class, mainChar.class, walls.class);
    }
    public level2_3()
    {
        //background
        setBackground("/backgrounds/wood.png");
        
        //mainChar
        addObject(new mainChar(), 550, 610);
        
        //Blöcke
        addObject(new cube_wall(), 480, 505);
        addObject(new cube_wall(), 548, 505);
        addObject(new cube_wall(), 616, 505);
        addObject(new cube_wall(), 749, 625);
        addObject(new cube_wall(), 349, 625);
        addObject(new cube_wall(), 1187, 429);
        addObject(new cube_wall(), 698, 174);
        addObject(new cube_wall(), 908, 94);
        addObject(new cube_wall(), 92, 94);
        addObject(new cube_wall(), 160, 94);
        addObject(new cube_wall(), 93, 161);
        addObject(new cube_wall(), 160, 161);
        addObject(new cube_wall(), 228, 320);
        addObject(new cube_wall(), 375, 144);
        addObject(new cube_wall(), 442, 144);
        addObject(new cube_wall(), 442, 212);
        addObject(new cube_wall(), 307, 144);
        addObject(new cube_wall(), 160, 226);
        
        //fakedoor + real door
        addObject(new double_door_to_lv2_3(180, 550, 610), 544, 697);
        addObject(new double_door_to_lv2_4(90, 107, 187), 1257, 227);
        
        //key
        addObject(new lv2_3_key(50, 40), 363, 215);
        
        //setPaintOrder
        setPaintOrder(doors.class, mainChar.class, walls.class);
    }
}
