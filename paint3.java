import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class paint3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class paint3 extends level1_paintings
{

    /**
     * Constructor for objects of class paint3.
     * 
     */
    public paint3()
    {
        //Erstellung des Portraits
        //addObject(new p3(), 1280/2, 720/2);
        
        //Erstellung backButton
        addObject(new lv1_backButton(2), 1070, 620);
        
        //mainChar
        addObject(new mainChar(), 1280/2, 720/2);
        
        //ERSTELLUNG DES HINTERGRUNDES
        //Türen
        addObject(new door_to_lv1_1(0, 140, 610, 2), 1150, 12);
        
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
        addObject(new lv1_3_throne(), 168, 720/2);
        
        //Erstellung der Kerzenständer
        addObject(new lv1_3_holder(), 340, 145);
        addObject(new lv1_3_holder(), 565, 145);
        addObject(new lv1_3_holder(), 785, 145);
        addObject(new lv1_3_holder(), 340, 615);
        addObject(new lv1_3_holder(), 565, 615);
        addObject(new lv1_3_holder(), 785, 615);
        
        //interaktive Elemente
        addObject(new candle_1(), 1049, 82);
        addObject(new candle_2(), 1009, 638);
        addObject(new candle_3(), 969, 82);
        
        //Erstellung der detect Methode
        addObject(new lv1_3_detect(), 0, 0);
        addObject(new lv1_3_detect_1(), 564, 585);
        addObject(new lv1_3_detect_2(), 784, 114);
        addObject(new lv1_3_detect_3(), 339, 584);
        
        //setPaintOrder
        setPaintOrder(p3.class, buttons.class, doors.class, mainChar.class, lv1_3_solid.class, walls.class);
    }
}
