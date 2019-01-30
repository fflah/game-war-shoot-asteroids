import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class tombol here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class tombol extends Actor
{
    /**
     * Act - do whatever the tombol wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act(String buttonName) 
    {
        // Add your action code here.
        if (Greenfoot.mouseClicked(this)) {
            
            Greenfoot.delay(8); 
            if (buttonName.equalsIgnoreCase("StartBtn")) {
             Menu menu = new Menu();
             menu.lagu.stop();
            Greenfoot.setWorld(new Space());
        }
            
            else if (buttonName.equalsIgnoreCase("storyBtn")) Greenfoot.setWorld(new StoryScreen());
            else if (buttonName.equalsIgnoreCase("abouteBtn"))  Greenfoot.setWorld(new AbouteScreen()); 
            else if (buttonName.equalsIgnoreCase("backBtn"))  Greenfoot.setWorld(new MenuScreen());
           // else if (buttonName.equalsIgnoreCase("exitBtn"))  Greenfoot.System.exit(1);
        }
    }    
}
