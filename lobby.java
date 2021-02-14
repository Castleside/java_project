import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lobby here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lobby extends World
{

    /**
     * Constructor for objects of class lobby.
     * 
     */
    
    private int steps = 61;
    public static GreenfootSound footsteps_grass = new GreenfootSound("footsteps_grass.mp3");
    
    public lobby()
    {   
        //initiale Erstellung 185 307
        super(1280, 720, 1); 
        setBackground(new GreenfootImage("/backgrounds/grass.png"));
        addObject(new lv1_sign(), 200, 307);
        addObject(new lv2_sign(), 200, 128);
        addObject(new lv3_sign(), 1080, 128);
        
        //Aussenwände
        addObject(new wall_V(), 1250, 720/2);
        addObject(new wall_V(), 29, 720/2);
        addObject(new wall_H(), 1280 / 2 , 690);
        addObject(new wall_H(), 1280 / 2 , 30);
        
        //Türen
        addObject(new door_to_wardrobe(90, 92, 343), 1267, 305);
        addObject(new door_to_lv1_1(-90, 1177, 355), 12, 305);
        addObject(new door_to_lv2(-90, 1182, 231), 12, 127);
        addObject(new door_to_lv3(90, 1177, 355), 1267, 127);
        
        //mainChar
        addObject(new mainChar(), 1280/2, 720/2);
        
        //paintOrder
        setPaintOrder(mainChar.class, images.class, doors.class, walls.class);
    }
    
    public lobby(int ppX, int ppY)
    {   
        //initiale Erstellung 185 307
        super(1280, 720, 1); 
        setBackground(new GreenfootImage("/backgrounds/grass.png"));
        addObject(new lv1_sign(), 200, 307);
        addObject(new lv2_sign(), 200, 128);
        addObject(new lv3_sign(), 1080, 128);
        
        //Aussenwände
        addObject(new wall_V(), 1250, 720/2);
        addObject(new wall_V(), 29, 720/2);
        addObject(new wall_H(), 1280 / 2 , 690);
        addObject(new wall_H(), 1280 / 2 , 30);
        
        //Türen
        addObject(new door_to_wardrobe(90, 92, 343), 1267, 305);
        addObject(new door_to_lv1_1(-90, 1177, 355), 12, 305);
        addObject(new door_to_lv2(-90, 1182, 231), 12, 127);
        addObject(new door_to_lv3(90, 1177, 355), 1267, 127);
        
        //mainChar
        addObject(new mainChar(), ppX, ppY);
        
        //paintOrder
        setPaintOrder(mainChar.class, images.class, doors.class, walls.class);
    }
    
    public void act() {
        if(Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("d")){
            footsteps();
        }
    }
    
    private void footsteps(){
        if (steps >0) {
            steps--;
        }
        else {
            footsteps_grass.play();
            //footsteps_grass.setVolume(volume);
            steps = 50;
        }
    }
}
