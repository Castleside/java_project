import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class confetti here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class confetti extends pictures
{
    /**
     * Act - do whatever the confetti wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GifImage gif;
    
    public confetti(){
      gif = new GifImage("/shrek/confetti.gif");
      int scalePercent = 100;
      for (GreenfootImage image : gif.getImages()){
          int wide = image.getWidth()*scalePercent/35;
          int high = image.getWidth()*scalePercent/50;
          image.scale(wide,high);
        }
    }
    
    public void act() 
    {
        setImage(gif.getCurrentImage());
    }    
}
