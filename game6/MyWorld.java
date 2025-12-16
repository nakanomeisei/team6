import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    
    private boolean started = false;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        super(600, 400, 1); 
        getBackground().scale( 600, 400 );
        showText("PRESS S TO START", 200, 150 );
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        
        
        
    }
    public void act()
    {
        
        if (Greenfoot.isKeyDown("S")) {
            started = true;
            startGame();
            showText("", 200, 150 );
        }
        
    }
 
    private void startGame()
    {
        addObject( new takara(), 20, 200);
        addObject( new ROBO(), 580, 200 );
        // 他のActorもここで追加
    }
}
