    import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
    
    /**
     * Write a description of class lv1_2_shrek here.
     * 
     * @author (your name) 
     * @version (a version number or a date)
     */
    public class lv1_2_shrek extends lv1_2_unsolid
    {
    /**
     * Act - do whatever the lv1_2_shrek wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    
    public lv1_2_shrek(){
        setImage("/backgrounds/frog.png");
        setRotation(0);
        GreenfootImage image = getImage();  
        image.scale(90, 90);
        setImage(image);
    }
    
    public void act() 
    {
        if(isTouching(mainChar.class)){
            current_wrld = getWorld();
            World wrld = new lv1_2_shrekegg();
            Greenfoot.setWorld(wrld);
            sound.play();
            getWorld().removeObjects(getWorld().getObjects(lv1_2_shrek.class));
        }
    }    
}
