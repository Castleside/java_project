import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class level1_3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class level1_3 extends level1
{

    /**
     * Constructor for objects of class level1_3.
     * 
     */
    public level1_3()
    {
        addObject(new mainChar(), 1190, 720/2);
        addObject(new lv1_room3_1_door(60, 100), 1150, 12);
        addObject(new lv1_3_knight(58, 81), 673, 616);
        addObject(new lv1_3_knight(58, 81), 673, 102);
        addObject(new lv1_3_knight(58, 81), 451, 616);
        addObject(new lv1_3_knight(58, 81), 451, 102);
        addObject(new lv1_3_knight(58, 81), 895, 616);
        addObject(new lv1_3_knight(58, 81), 895, 102);
        addObject(new painting_1(), 562, 655);
        addObject(new painting_2(), 562, 65);
        addObject(new painting_3(), 784, 655);
        addObject(new painting_4(), 784, 65);
        addObject(new painting_5(), 340, 655);
        addObject(new painting_6(), 340, 65);
        addObject(new lv3_throne(), 200, 720/2);
        addObject(new lv1_3_candles(), 1049, 82);
        addObject(new lv1_3_candles(), 1009, 82);
        addObject(new lv1_3_candles(), 969, 82);
        addObject(new lv1_3_painting_1(), 562, 610);
        addObject(new lv1_3_painting_2(), 784, 110);
        addObject(new lv1_3_painting_3(), 340, 610);
        setPaintOrder(Doors.class, mainChar.class, solidObj.class);
    }
}
