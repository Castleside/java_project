import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class candle_1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class candle_1 extends lv1_3_candles
{
    /**
     * Act - do whatever the candle_1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
        List<mainChar>objects = getObjectsInRange(47, mainChar.class);
        List<lv1_candle_detect>kek = getObjectsInRange(30, lv1_candle_detect.class);
        
        boolean detect = false;
        
        if(kek.isEmpty()){
                //
        }
        else{
                candle_1 = 1;
                candle_2 = 1;
                candle_3 = 1;
        }
        
        if(candle_1 == 1){
            candle_2 = 2;
            candle_3 = 2;
            if(Greenfoot.isKeyDown("shift")){
                if(objects.isEmpty() ){
                    //
                }
                else{
                    getWorld().removeObjects(getWorld().getObjects(lv1_candle_detect.class)); 
                    detect = true;
                    mach();
                }
            }
        }
        
        if(detect == true){
                for(int i = 0; i < 1; i++){
                lv1_candle_detect lv1_candle_detect = new lv1_candle_detect(20, 20);
                getWorld().addObject(lv1_candle_detect, 200, 200);
            } 
            detect = false;
        }
 }
 public void mach(){
                java.util.List actors = getWorld().getObjects(mainChar.class);
                mainChar actor = (mainChar)actors.get(0);
                int x = actor.getX() - 45;
                int y = actor.getY();
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
