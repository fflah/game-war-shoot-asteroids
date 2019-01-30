import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MenuScreen here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MenuScreen extends Menu
{

    /**
     * Constructor for objects of class MenuScreen.
     * 
     */
    public MenuScreen()
    {
        prepare();
       
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        storyBtn storybtn = new storyBtn();
        addObject(storybtn,412,286);
        storybtn.setLocation(406,277);
        StartBtn startbtn = new StartBtn();
        addObject(startbtn,414,259);
        startbtn.setLocation(407,250);
        startbtn.setLocation(405,250);
        abouteBtn aboutebtn = new abouteBtn();
        addObject(aboutebtn,673,323);
        aboutebtn.setLocation(406,305);
        exitBtn exitbtn = new exitBtn();
        addObject(exitbtn,413,340);
        exitbtn.setLocation(403,332);
    }
}
