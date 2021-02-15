import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class easteregg here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class shrekgif extends pictures
{
    /**
     * Act - do whatever the easteregg wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */    
    private GifImage gif;
    
    public shrekgif(){
        gif = new GifImage("/shrek/shreksophone.gif");
        int scalePercent = 100;
        for (GreenfootImage image : gif.getImages()){
            int wide = image.getWidth()*scalePercent/15;
            int high = image.getWidth()*scalePercent/35;
            image.scale(wide,high);
        }
    }
    
    public void act() 
    {
        setImage(gif.getCurrentImage());    
    }    
}
