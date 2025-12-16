import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(600, 400, 1); 
        getBackground().scale( 600, 400 );
        addObject( new takara(), 20, 200);
        addObject( new ROBO(), 580, 200 );
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
    }
}
