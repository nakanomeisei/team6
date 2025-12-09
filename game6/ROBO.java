import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ROBO here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ROBO extends Actor
{
    /**
     * Act - do whatever the ROBO wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        getImage().scale( 100, 100 );
        setRotation(0);
        int A = -5;
        int B = -1;
        int C = A + (int)(Math.random()*((B-A)+1));
        move(C);
    }    
}
