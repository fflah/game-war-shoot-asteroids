import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Objects {   

    public Laser() {

    }
    
    /**
     * The laser class that moves the laster blast and
     * that removes it when it hits the edge.
     */
    public void act() {
                
        for(int i=0;i<8;i++){
            move(i);
        }
        
            meteorPecah();
        if(atWorldEdge()) {
            World world = getWorld();
            world.removeObject(this);
        }else if(onContact(Astroid.class)) {
            Space space = getSpace();
            space.addScore(10);
            getWorld().removeObject(this);
            Greenfoot.playSound("ledak.mp3");
        }
        
    } 
    
    public void meteorPecah(){
        int x = getX();
        int y = getY();
        World w = getWorld();
        Space space = (Space)w;
        pecah1 satu = new pecah1();
        pecah2 dua = new pecah2();
        pecah3 tiga = new pecah3();
        pecah4 empat = new pecah4();
        
        
        
        if (isTouching(Astroid.class)){
            w.addObject(satu, x-30, y-30);
            w.addObject(dua, x-30, y+30);
            w.addObject(tiga, x-30, y+40);
            w.addObject(empat, x-30, y+50);
        }
                
    }
}
