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
    
    public level1_3(int ppX, int ppY)
    {
        //mainChar Erstellung
        addObject(new mainChar(), ppX, ppY);
        
        //Türen
        addObject(new door_to_lv1_1(0, 540, 360), 1150, 12);
        
        //nicht interaktive Elemente
        addObject(new lv1_3_fakeknight(58, 81), 673, 616);
        addObject(new lv1_3_fakeknight(58, 81), 673, 102);
        addObject(new lv1_3_fakeknight(58, 81), 451, 616);
        addObject(new lv1_3_fakeknight(58, 81), 451, 102);
        addObject(new lv1_3_fakeknight(58, 81), 895, 616);
        addObject(new lv1_3_fakeknight(58, 81), 895, 102);
        addObject(new painting_1(), 562, 655);
        addObject(new painting_2(), 562, 65);
        addObject(new painting_3(), 784, 655);
        addObject(new painting_4(), 784, 65);
        addObject(new painting_5(), 340, 655);
        addObject(new painting_6(), 340, 65);
        addObject(new lv1_3_throne(), 200, 720/2);
        
        //interaktive Elemente
        addObject(new candle_1(), 1049, 82);
        addObject(new candle_2(), 1009, 638);
        addObject(new candle_3(), 969, 82);
        
        //Erstellung der detect Methode
        addObject(new lv1_3_detect(), 0, 0);
        addObject(new lv1_3_detect_1(), 562, 610);
        addObject(new lv1_3_detect_2(), 784, 110);
        addObject(new lv1_3_detect_3(), 340, 610);
        
        //setPaintOrder
        setPaintOrder(doors.class, mainChar.class, lv1_3_solid.class, walls.class);
    }
}
