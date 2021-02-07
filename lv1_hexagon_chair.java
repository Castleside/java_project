import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class lv1_hexagon_chair here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class lv1_hexagon_chair extends lv1_1_solid
{
    /**
     * Act - do whatever the lv1_hexagon_chair wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public lv1_hexagon_chair (int laenge, int breite){
        setImage("/level_1/hexagon.png"); 
        setRotation(0);
        GreenfootImage image = getImage();  
        image.scale(laenge, breite);
        setImage(image); 
    }
    
    public void act() {
        List<mainChar>objects = getObjectsInRange(100, mainChar.class);
        List<lv1_chair>kek = getObjectsInRange(50, lv1_chair.class);
        
        if(kek.isEmpty()){
                //
        }
        else{
             crown_chair = 1;
             triangle_chair = 1;
             rectangle_chair = 1;
             pentagon_chair = 1;
             hexagon_chair = 1;
             heptagon_chair = 1; 
        }
        boolean tiddies = false;
        if(hexagon_chair == 1){
             triangle_chair = 2;
             rectangle_chair = 2;
             pentagon_chair = 2;
             crown_chair = 2;
             heptagon_chair = 2;
         if(Greenfoot.isKeyDown("shift")){
            if(objects.isEmpty()){
                //
            }
            else{
                getWorld().removeObjects(getWorld().getObjects(lv1_chair.class));  
                mach();
                tiddies = true;
                }
            
         }
         
        }
        if(tiddies == true){
            for(int i = 0; i < 1; i++){
                lv1_chair lv1_chair = new lv1_chair(100, 100);
                getWorld().addObject(lv1_chair, 200, 200);
            }   
        }  
    } 
    public void mach(){
        java.util.List actors = getWorld().getObjects(mainChar.class);
        mainChar actor = (mainChar)actors.get(0);   
        int x = actor.getX();
        int y = actor.getY()- 90;
        if(Greenfoot.isKeyDown("w")){
                    setLocation(x, y - 2 );
                    
                }
       
        if(Greenfoot.isKeyDown("s")){
                    setLocation(x, y + 2 );
                   
                }
        
        if(Greenfoot.isKeyDown("a")){
                    setLocation(x - 2, y  );
                   
                }
        
        if(Greenfoot.isKeyDown("d")){
                    setLocation(x + 2, y  );
                    
                }
        
    }
}
