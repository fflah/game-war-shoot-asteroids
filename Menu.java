import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends World
{
     public static GreenfootSound lagu;

    /**
     * Constructor for objects of class Menu.
     * 
     */
    public Menu()
    {    
        
        super(800, 450, 1); 
        if (this.getClass().getName().equalsIgnoreCase("MenuScreen"))
        {
            
        lagu = new GreenfootSound("musikmenufix.wav");
        lagu.stop();
        lagu.setVolume(70);
        lagu.playLoop();
         
        }
    }
}
