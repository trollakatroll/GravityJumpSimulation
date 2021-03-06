import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static double scale = 50;
    public static int pos = 100;
    
    double x = 0.0;
    double y = 360.0;
    double w = 30.0;
    double l = 360.0; 
    
    double dx = 2.456046 * scale;
    double dy = 1.707674 * scale;
    double angle = 29.953608;
    double vi = 7.462868607 * scale;
    
    
    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1280, 720, 1, false);
        Platform b1 = new Platform((int) (w), (int) (l));
        Platform b2 = new Platform((int) (getWidth()-w-dx), (int) (getHeight()-l-dy));
        addObject(b1, (int) (x+(w/2.0)), (int) (y+(l/2.0)));
        addObject(b2, (int) (x+dx+w+((getWidth()-w-dx)/2.0)), (int) (getHeight()-dy-l+((getHeight()-l-dy)/2.0)));
    }

    public void act(){
        if(Greenfoot.isKeyDown("space")){
            if(getObjects(Projectile.class).size() == 0){
                addObject(new Projectile(dy, vi, angle, w, l), (int) w, (int) l);
            } 
        }
    }
}
