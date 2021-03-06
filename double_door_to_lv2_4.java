import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class double_door_to_lv2_4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class double_door_to_lv2_4 extends doors_lv2
{
    /**
     * Act - do whatever the double_door_to_lv2_4 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int xx;
    int yy;
    
    public double_door_to_lv2_4(int r, int x, int y) {
        setRotation(r);
        GreenfootImage image = new GreenfootImage("double_doors.png");
        setImage(image);
        image.scale(200, 80);
        xx = x;
        yy = y;
    }
    
    public void act() 
    {
        if(keyPickup_lv2_3 == true){
            //setRotation(r);
            GreenfootImage image = new GreenfootImage("double_doors_open.png");
            setImage(image);
            image.scale(200, 80); 
            //setLocation(18, 560);
            List<mainChar>objects = getObjectsInRange(130, mainChar.class);
            if(Greenfoot.isKeyDown("e")){
                if(objects.isEmpty()){
                    //
                }
                else{
                    World wrld = new level2_4(xx, yy, 0);
                    Greenfoot.setWorld(wrld); 
                    keyPickup_lv2_3 = false;
                    door.setVolume(volume);
                    door.play();
                }
            }
        }
    }       
}
