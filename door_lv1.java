import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.awt.*; 
import java.awt.event.KeyEvent; 
import java.awt.image.BufferedImage; 
import javax.swing.JFrame;
import java.util.ArrayList;

/**
 * Write a description of class door_lv1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class door_lv1 extends Doors
{
    /**
     * Act - do whatever the door_lv1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        List<mainChar>objects = getObjectsInRange(100, mainChar.class); 
        if( objects.isEmpty()){ 
          
        } 
        else{
            if(Greenfoot.isKeyDown("e")){
                World lv1 = new level1_1();
                Greenfoot.setWorld(lv1);
            }
        }
    } 
    public door_lv1(int laenge, int breite) {
       //setImage("/backgrounds/redBG.jpg");
       setRotation(-90);
       GreenfootImage image = getImage();  
       //image.scale(laenge, breite);
       setImage(image);
    }
}
