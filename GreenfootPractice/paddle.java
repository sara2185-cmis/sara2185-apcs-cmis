import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Paddle extends Actor
{
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
