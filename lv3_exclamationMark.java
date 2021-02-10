import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class lv3_exclamationMark here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv3_exclamationMark extends unsolid_lv3
{
    /**
     * Act - do whatever the lv3_exclamationMark wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public lv3_exclamationMark(){
        setImage("exclamationmark.png");
        setRotation(0);
        GreenfootImage image = getImage();  
        image.scale(20, 40);
        setImage(image);
    }
    
    public void act() 
    {
        if (Greenfoot.isKeyDown("d")){
            move(-4);
      }
      if (Greenfoot.isKeyDown("a")){
            move(4);
      }
      if(getX() == 0){
            getWorld().removeObject(this);
        }
    }    
}
