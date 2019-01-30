import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StoryScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StoryScreen extends Menu
{

    /**
     * Constructor for objects of class StoryScreen.
     * 
     */
    public StoryScreen()
    {
        super(); 
        prepare();

        
    }
    
    private void prepare(){
                
        backBtn Backbtn = new backBtn();
        addObject(Backbtn, 218,416);
    }
}
