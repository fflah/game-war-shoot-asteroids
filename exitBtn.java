import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class exitBtn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class exitBtn extends tombol
{
    /**
     * Act - do whatever the exitBtn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        if(Greenfoot.mouseClicked(this)){ 
            System.exit(10);
            Greenfoot.playSound("option.wav");
        }
        
    }    
}
