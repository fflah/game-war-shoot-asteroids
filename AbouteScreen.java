import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AbouteScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AbouteScreen extends Menu
{

    /**
     * Constructor for objects of class AbouteScreen.
     * 
     */
    public AbouteScreen()
    {
        super(); 
        prepare();
      
    }
    
    private void prepare(){
                
        backBtn Backbtn = new backBtn();
        addObject(Backbtn, 218,416);
    }
}
