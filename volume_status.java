import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class volume_status here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class volume_status extends pictures
{
    /**
     * Act - do whatever the volume_status wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    
 
    
    public void act() 
    {
        switch(volume){
            case 100:
            GreenfootImage image = new GreenfootImage("/optionsMenu/100.png");
            image.scale(70, 70);
            setImage(image);
            break;
            case 90:
            image = new GreenfootImage("/optionsMenu/90.png");
            image.scale(70, 70);
            setImage(image);
            break;
            case 80:
            image = new GreenfootImage("/optionsMenu/80.png");
            image.scale(70, 70);
            setImage(image);
            break;
            case 70:
            image = new GreenfootImage("/optionsMenu/70.png");
            image.scale(70, 70);
            setImage(image);
            break;
            case 60:
            image = new GreenfootImage("/optionsMenu/60.png");
            image.scale(70, 70);
            setImage(image);
            break;
            case 50:
            image = new GreenfootImage("/optionsMenu/50.png");
            image.scale(70, 70);
            setImage(image);
            break;
            case 40:
            image = new GreenfootImage("/optionsMenu/40.png");
            image.scale(70, 70);
            setImage(image);
            break;
            case 30:
            image = new GreenfootImage("/optionsMenu/30.png");
            image.scale(70, 70);
            setImage(image);
            break;
            case 20:
            image = new GreenfootImage("/optionsMenu/20.png");
            image.scale(70, 70);
            setImage(image);
            break;
            case 10:
            image = new GreenfootImage("/optionsMenu/10.png");
            image.scale(70, 70);
            setImage(image);
            break;
            case 0:
            image = new GreenfootImage("/optionsMenu/0.png");
            image.scale(70, 70);
            setImage(image);
            break;
        }
    }    
}
