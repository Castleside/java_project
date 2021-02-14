import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level2_4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level2_4 extends level2
{

    /**
     * Constructor for objects of class level2_4.
     * 
     */
    public level2_4(int ppX, int ppY, int used)
    {
        if (used == 0) {
            //background
            setBackground("/backgrounds/wood.png");
        
            //mainChar
            addObject(new mainChar(), ppX, ppY);
            
            //Blöcke
            addObject(new cube_wall(), 93, 397);
            addObject(new cube_wall(), 716, 555);
            addObject(new cube_wall(), 384, 626);
            addObject(new cube_wall(), 455, 330);
            addObject(new cube_wall(), 93, 330);
            addObject(new cube_wall(), 174, 626);
            addObject(new cube_wall(), 957, 94);
            addObject(new cube_wall(), 957, 163);
            addObject(new cube_wall(), 957, 232);
            addObject(new cube_wall(), 957, 301);
            addObject(new cube_wall(), 957, 370);
            addObject(new cube_wall(), 957, 439);
            addObject(new cube_wall(), 957, 508);
            addObject(new cube_wall(), 957, 577);
            addObject(new cube_wall(), 957, 646);
            
            //Wände für den Ritter
            addObject(new wall_H(225, 15), 637, 303);
            //addObject(new wall_H(225, 15), 637, 513);
            addObject(new wall_V(15, 225), 532, 408);
            addObject(new wall_V(15, 225), 742, 408);
            
            //fakedoor + real door
            addObject(new double_door_to_lv2_4(-90, 550, 610), 21, 188);
            addObject(new double_door_to_lv2_goal(90), 1257, 393);
            
            //GIGA Ritter
            addObject(new lv2_gigaknight(), 578, 365);
            addObject(new lv2_exclamationMark(), 578, 292);
            
            //Carpet Detect
            addObject(new lv2_carpet_detect(), 1104, 408);
            
            //setPaintOrder
            setPaintOrder(doors.class, mainChar.class, lv2_exclamationMark.class, wall_H.class, walls.class);
        }
        
        if (used == 1) {
            //background
            setBackground("/backgrounds/wood.png");
        
            //mainChar
            addObject(new mainChar(), ppX, ppY);
            
            //Blöcke
            addObject(new cube_wall(), 93, 397);
            addObject(new cube_wall(), 716, 555);
            addObject(new cube_wall(), 384, 626);
            addObject(new cube_wall(), 455, 330);
            addObject(new cube_wall(), 93, 330);
            addObject(new cube_wall(), 174, 626);
            addObject(new cube_wall(), 957, 94);
            addObject(new cube_wall(), 957, 163);
            addObject(new cube_wall(), 957, 232);
            //addObject(new cube_wall(), 957, 301);
            //addObject(new cube_wall(), 957, 370);
            //addObject(new cube_wall(), 957, 439);
            //addObject(new cube_wall(), 957, 508);
            addObject(new cube_wall(), 957, 577);
            addObject(new cube_wall(), 957, 646);
            
            //Wände für den Ritter
            addObject(new wall_H(225, 15), 637, 303);
            addObject(new wall_H(225, 15), 637, 513);
            addObject(new wall_V(15, 225), 532, 408);
            //addObject(new wall_V(15, 225), 742, 408);
            
            //fakedoor + real door
            addObject(new double_door_to_lv2_4(-90, 550, 610), 21, 188);
            addObject(new double_door_to_lv2_goal(90), 1257, 393);
            
            //GIGA Ritter
            addObject(new lv2_gigaknight(), 578, 365);
        
            //Carpet Detect
            addObject(new lv2_carpet_detect(), 1104, 408);
            
            //setPaintOrder
            setPaintOrder(doors.class, mainChar.class, wall_H.class, walls.class);
        }
    }
    
    public level2_4()
    {
        //background
        setBackground("/backgrounds/wood.png");
        
        //mainChar
        addObject(new mainChar(), 107, 187);
        
        //Blöcke
        addObject(new cube_wall(), 93, 397);
        addObject(new cube_wall(), 716, 555);
        addObject(new cube_wall(), 384, 626);
        addObject(new cube_wall(), 455, 330);
        addObject(new cube_wall(), 93, 330);
        addObject(new cube_wall(), 174, 626);
        addObject(new cube_wall(), 957, 94);
        addObject(new cube_wall(), 957, 163);
        addObject(new cube_wall(), 957, 232);
        addObject(new cube_wall(), 957, 301);
        addObject(new cube_wall(), 957, 370);
        addObject(new cube_wall(), 957, 439);
        addObject(new cube_wall(), 957, 508);
        addObject(new cube_wall(), 957, 577);
        addObject(new cube_wall(), 957, 646);
        
        //Wände für den Ritter
        addObject(new wall_H(225, 15), 637, 303);
        //addObject(new wall_H(225, 15), 637, 513);
        addObject(new wall_V(15, 225), 532, 408);
        addObject(new wall_V(15, 225), 742, 408);
        
        //fakedoor + real door
        addObject(new double_door_to_lv2_4(-90, 550, 610), 21, 188);
        addObject(new double_door_to_lv2_goal(90), 1257, 393);
        
        //GIGA Ritter
        addObject(new lv2_gigaknight(), 578, 365);
        
        //Carpet Detect
        addObject(new lv2_carpet_detect(), 1104, 408);
        
        //setPaintOrder
        setPaintOrder(doors.class, mainChar.class, wall_H.class, walls.class);
    }
}
