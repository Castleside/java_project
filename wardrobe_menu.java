import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class wardrobe_menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class wardrobe_menu extends wardrobe
{

    /**
     * Constructor for objects of class wardrobe_menu.
     * 
     */
    
    public wardrobe_menu()
    {
        //mainChar Erstellung
        addObject(new mainChar(), 360, 360); //hier muss noch eine abfrage für die outfits hin
        
        //Hintergrund Erstellung
        setBackground("/level_1/grey.jpg");
        addObject(new images("lightgrey", 300, 300), 360, 360);
        
        //Objekte
        addObject(new wardrobe_arrow(), 540, 360);
        addObject(new wd_commit_button(), 360, 560);
        
        //setPaintOrder
        setPaintOrder(mainChar.class);
    }
}
