import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wdCommitBut here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wdCommitBut extends Buttons
{
    /**
     * Act - do whatever the wdCommitBut wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    int cloth = 0;
    public wdCommitBut() {
        //setImage...
    }
    
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            cloth = getWorld().getObjects(WDarrowRight.class).get(0).setOutfit();
            World wd = new wardrobe(/*ppX beim klicken, ppY beim klicken*/);
            Greenfoot.setWorld(wd);
        }
    }    
    
    public int getOutfit() {
        int c = cloth;
        if (c != 0 || c != 1 || c != 2 || c != 3) {
            c = 0;
        } else c = c;
        return c;
    }
}
