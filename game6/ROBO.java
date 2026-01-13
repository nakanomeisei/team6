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
        double A = -5;
        double B = -1;
        int C = -1;
        int i = 0;
        int N = 10;
        int score = 0;
        int now = 0;
    public void act() 
    {
        // Add your action code here.
        getImage().scale( 100, 100 );
        setRotation(0);
        getWorld().showText("SCORE:"+score, 390, 50 );
        getWorld().showText(11-N+"お掃除目", 100, 20 );
 
        if (Greenfoot.isKeyDown("space")) {
            A=0;
            B=0;
            int x= getX();
            now = 0;
            now += 116-0.2*x;
            score += now;
            getWorld().showText("SCORE:"+score, 390, 50 );
            N--;
            if( N <= 0){
                getWorld().showText( "CLEAR", 395, 170 );
                Greenfoot.stop();
            }
            
            if( now <= 20){
                getWorld().showText( "BAD", 60, 140 );
            }
            else if( now <= 40){
                getWorld().showText( "NICE", 60, 140 );
            }
            else if( now <= 60){
                getWorld().showText( "GOOD", 60, 140 );
            }
            else if( now <= 80){
                getWorld().showText( "FUNKY", 60, 140 );
            }
            else if(now < 100){
                getWorld().showText( "PERFECT", 60, 140 );
            }
            else{
                getWorld().showText( "GOD!!!!!!!!!!!", 60, 140 );
            }
            
            
            Greenfoot.delay(100);
            getWorld().showText( "", 60, 140 );
            setLocation( 580,200 );
            A = -5-(10-N)*1.5;
            B = -1;
        }
        i++;
        if(i%5==1){
            C = (int)A + (int)(Math.random()*((B-A)+1));
        }   
        move(C);

        int x= getX();
        if( x < 80){
            getWorld().showText( "GAME OVER", 395, 170 );
            Greenfoot.stop();
        }
    }    
}