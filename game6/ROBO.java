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
        int A = -5;
        int B = -1;
        int N = 10;
        int score = 0;
    public void act() 
    {
        // Add your action code here.
       
        getImage().scale( 100, 100 );
        setRotation(0);
        getWorld().showText("SCORE:"+score, 390, 50 );

        if (Greenfoot.isKeyDown("space")) {
            A=0;
            B=0;
            int x= getX();
            score+=116-0.2*x;
            getWorld().showText("SCORE:"+score, 390, 50 );
            N--;
            if( N <= 0){
            getWorld().showText( "CLEAR", 395, 170 );
            Greenfoot.stop();
            }
            Greenfoot.delay(100);
            setLocation( 580,200 );
            A = -5;
            B = -1;
            
        }
        int C = A + (int)(Math.random()*((B-A)+1));
        move(C);
       
        
        int x= getX();
        if( x < 80){
            getWorld().showText( "GAME OVER", 395, 170 );
            Greenfoot.stop();
        }
        
    }    
}
