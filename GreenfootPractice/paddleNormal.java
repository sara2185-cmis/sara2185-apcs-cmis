import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class paddleNormal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class paddleNormal extends Paddle
{
    /**
     * Act - do whatever the paddleNormal wants to do. This method is called whenever
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
