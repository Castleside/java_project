import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class wardrobe_table here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wardrobe_table extends wardrobe_content
{
    /**
     * Act - do whatever the wardrobe_table wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public wardrobe_table() {
        GreenfootImage image = new GreenfootImage("/wardrobe/wardrobe_table.png");
        image.scale(250, 250);
        setImage(image);
    }
    
    public void act() 
    {
        List<mainChar>objects = getObjectsInRange(200, mainChar.class); 
        if( objects.isEmpty()){
            //
        } 
        else{
            if(Greenfoot.isKeyDown("e")){
                World wrld = new wardrobe_menu();
                Greenfoot.setWorld(wrld);
            }
        }
    }    
}
