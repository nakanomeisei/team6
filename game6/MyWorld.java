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
        showText("PRESS 'S' TO START", 200, 140 );
        showText("'SPACE' でROBOを停止", 200, 170 );
        showText("お宝に近いと高得点!", 200, 190 );
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.

    }
    public void act()
    {
        if (!started && Greenfoot.isKeyDown("S")) {
            started = true;
            startGame();
            showText("", 200, 140 );
            showText("", 200, 170 );
            showText("", 200, 190 );
        }
    }
    private void startGame()
    {
        addObject( new takara(), 20, 200);
        addObject( new ROBO(), 580, 200 );
        // 他のActorもここで追加
    }
}