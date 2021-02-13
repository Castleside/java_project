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
        addObject(new door_to_lv1_1(0, 140, 610, 2), 1150, 12);
        
        //nicht interaktive Elemente
        addObject(new lv1_3_fakeknight(58, 81), 673, 616);
        addObject(new lv1_3_fakeknight(58, 81), 673, 102);
        addObject(new lv1_3_fakeknight(58, 81), 451, 616);
        addObject(new lv1_3_fakeknight(58, 81), 451, 102);
        addObject(new lv1_3_fakeknight(58, 81), 895, 616);
        addObject(new lv1_3_knight(), 895, 102);
        addObject(new painting_1(), 562, 655);
        addObject(new painting_2(), 562, 65);
        addObject(new painting_3(), 784, 655);
        addObject(new painting_4(), 784, 65);
        addObject(new painting_5(), 340, 655);
        addObject(new painting_6(), 340, 65);
        addObject(new lv1_3_throne(), 168, 720/2);
        addObject(new lv1_3_throne_carpet(), 676, 360);
        
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
        addObject(new lv1_candle_detect(20,20), 100, 100);
        
        //Erstellung des Ausrufezeichens
        addObject(new lv1_exclamationMark(), 887, 27);
        
        //setPaintOrder
        setPaintOrder(lv1_exclamationMark.class, doors.class, mainChar.class, lv1_3_solid.class, walls.class);
    }
    
    public void act() {
        if(Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("d")){
            footsteps();
        }
    }
    
    private int steps = 61;
    
    private void footsteps(){
        if (steps >0) {
            steps--;
        }
        else {
            Greenfoot.playSound("footsteps_wood.mp3");
            steps = 75;
        }
    }
}
