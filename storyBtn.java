import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class storyBtn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class storyBtn extends tombol
{
    /**
     * Act - do whatever the storyBtn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
         super.act(this.getClass().getName());
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("option.wav");
        }
    }    
}
