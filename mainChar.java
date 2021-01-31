import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.awt.*; 
import java.awt.event.KeyEvent; 
import java.awt.image.BufferedImage; 
import javax.swing.JFrame;
import java.util.ArrayList;

/**
 * Write a description of class mainChar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class mainChar extends actor
{
    /**
     * Act - do whatever the mainChar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    int c = outfit;
    
    public mainChar() {
        if (c != 0 || c != 1 || c != 2 || c != 3) {
            c = 0;
        } else c = c;
        if (c == 0) {
            setImage(new GreenfootImage("/mainChar/manNormal/zero.png"));
        }
        if (c == 1) {
            setImage(new GreenfootImage("/mainChar/manNormal/one.png"));
        }
        if (c == 2) {
            setImage(new GreenfootImage("/mainChar/manNormal/two.png"));
        }
        if (c == 3) {
            setImage(new GreenfootImage("/mainChar/manNormal/three.png"));
        }
    }
    
    public void act() 
    {
        movements();
    } 
    
    public void movements() {   //Methode zum Laufen
        if(Greenfoot.isKeyDown("a")){
            int rot = getRotation();
            int x = getX();
            int y = getY();
            if (getOneObjectAtOffset(-35, 0, actor.class) == null) {
                if(rot == 0 ){
                    setRotation(180);
                    getImage().mirrorVertically();
                }
                else{
                    setLocation(x - 2, y);
                }
            }
        }
        if( Greenfoot.isKeyDown("w")){
            int y = getY();
            int x = getX();
            if (getOneObjectAtOffset(0, -35, actor.class) == null ) {
                setLocation(x, y - 2);
            }
        }
        if( Greenfoot.isKeyDown("s")){
            int y = getY();
            int x = getX();
            if (getOneObjectAtOffset(0, 30, actor.class) == null ) {
               setLocation(x, y + 2);
            }
        }
        if(Greenfoot.isKeyDown("d")){
            int rot = getRotation();
            int x = getX();
            int y = getY();
            if (getOneObjectAtOffset(30, 0, actor.class) == null  ) {  
                if( rot == 180 ){
                    setRotation(0);
                    getImage().mirrorVertically();
                }
                else{
                    setLocation(x + 2, y);
                }
            }
        }
        
        //Methode für den Aufruf des Menüs
        if(Greenfoot.isKeyDown("escape")){
            World Menu = new mainMenu();
            Greenfoot.setWorld(Menu);
        }
    }
}
