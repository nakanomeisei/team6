import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class takara here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class takara extends Actor
{
    /**
     * Act - do whatever the takara wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        GreenfootImage img = getImage(); // 現在の画像を取得
        img.scale(100, 100);               // 幅50, 高さ50に変更
        setImage(img); 
        // Add your action code here.
    }    
}
