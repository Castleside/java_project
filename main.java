import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main extends Actor
{
    /**
     * Act - do whatever the main wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public static boolean keyPickup;  //für Key_pickup wichtig
    public static boolean keyPickup_lv2_1;
    public static boolean keyPickup_lv2_2;
    public static boolean keyPickup_lv2_3;
    public static boolean keyPickup_lv2_4;
    public static World current_wrld;
    public static World current_wrld_2;
    public static int status = 0; // Status des Bewegungsmodus (Levelabhängig)
    public static int ppX;
    public static int ppY;
    
    //Sounds    
    public static GreenfootSound sound = new GreenfootSound("shrekophone.mp3");
    public static GreenfootSound door_locked = new GreenfootSound("door_locked.mp3");
    public static GreenfootSound door = new GreenfootSound("door.mp3");
    public static GreenfootSound emeralds = new GreenfootSound("emeralds.mp3");
    public static GreenfootSound death = new GreenfootSound("death.mp3");
    public static GreenfootSound key = new GreenfootSound("key.mp3");
    public static GreenfootSound jump = new GreenfootSound("jump.mp3");
    public static GreenfootSound lever = new GreenfootSound("lever.mp3");
    public static GreenfootSound button = new GreenfootSound("button_click.mp3");
    public static GreenfootSound goal_end = new GreenfootSound("goal_end.mp3");
    public static GreenfootSound goal = new GreenfootSound("goal_1.mp3");
    
    //lautstärke für sounds
    public static int volume = 100;
    
    public void act() 
    {
        // Add your action code here.
    }
    
    public static int crown_chair = 0;
    public static int triangle_chair = 0;
    public static int rectangle_chair = 0;
    public static int pentagon_chair = 0;
    public static int hexagon_chair = 0;
    public static int heptagon_chair = 0;
    public static int candle_1;
    public static int candle_2;
    public static int candle_3;
}
