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
<<<<<<< HEAD
        addObject( new takara(), 0, 255);
=======
        addObject( new ROBO(), 300, 200 );
>>>>>>> 35b8da274e96dbb1734091a87817ecd75c322877
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
    }
}
