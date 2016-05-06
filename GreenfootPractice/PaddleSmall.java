import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PaddleSmall here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PaddleSmall extends Paddle
{
    /**
     * Act - do whatever the PaddleSmall wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       
        if (Greenfoot.isKeyDown("left"))
        {
            move(-4);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            move(4);
        }// Add your action code here.
    }    
}
