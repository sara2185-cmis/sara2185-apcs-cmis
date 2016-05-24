import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Drop extends Actor 
{
    private Paddle paddle;
    public void act() 
    {
        setRotation(90);
        
         move();
    } 

    public abstract void move();

}
