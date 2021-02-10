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
    
    public mainChar(int d) {
        if (d == 0) {
            setImage(new GreenfootImage("/mainChar/manNormal/zero.png"));
        }
        if (d == 1) {
            setImage(new GreenfootImage("/mainChar/manNormal/one.png"));
        }
        if (d == 2) {
            setImage(new GreenfootImage("/mainChar/manNormal/two.png"));
        }
        if (d == 3) {
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
            if (getOneObjectAtOffset(-40, 0, actor.class) == null) {
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
            if (getOneObjectAtOffset(0, -40, actor.class) == null ) {
                setLocation(x, y - 2);
            }
        }
        if( Greenfoot.isKeyDown("s")){
            int y = getY();
            int x = getX();
            if (getOneObjectAtOffset(0, 40, actor.class) == null ) {
               setLocation(x, y + 2);
            }
        }
        if(Greenfoot.isKeyDown("d")){
            int rot = getRotation();
            int x = getX();
            int y = getY();
            if (getOneObjectAtOffset(40, 0, actor.class) == null  ) {  
                if( rot == 180 ){
                    setRotation(0);
                    getImage().mirrorVertically();
                }
                else{
                    setLocation(x + 2, y);
                }
            }
        }
        
        /*
        if(Greenfoot.isKeyDown("a")){
            int rot = getRotation();
            int x = getX();
            int y = getY();
            if (getOneIntersectingObject(actor.class) == null) {
                if(rot == 0 ){
                    setRotation(180);
                    getImage().mirrorVertically();
                }
                else{
                    setLocation(x - 1, y);
                }
            }
            else {
                setLocation(x + 1, y);
            }
        }
        if( Greenfoot.isKeyDown("w")){
            int y = getY();
            int x = getX();
            if (getOneIntersectingObject(actor.class) == null ) {
                setLocation(x, y - 1);
            }
            else {
                setLocation(x, y + 1);
            }
        }
        if( Greenfoot.isKeyDown("s")){
            int y = getY();
            int x = getX();
            if (getOneIntersectingObject(actor.class) == null ) {
               setLocation(x, y + 1);
            }
            else {
                setLocation(x, y - 1);
            }
        }
        if(Greenfoot.isKeyDown("d")){
            int rot = getRotation();
            int x = getX();
            int y = getY();
            if (getOneIntersectingObject(actor.class) == null  ) {  
                if( rot == 180 ){
                    setRotation(0);
                    getImage().mirrorVertically();
                }
                else{
                    setLocation(x + 1, y);
                }
            }
            else {
                setLocation(x - 1, y);
            }
        }
        */
        //Methode für den Aufruf des Menüs
        if(Greenfoot.isKeyDown("escape")){
            current_wrld = getWorld();
            
            World wrld = new mainMenu();
            Greenfoot.setWorld(wrld);
    }
    }
}
