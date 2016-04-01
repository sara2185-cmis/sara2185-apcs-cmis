import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bomb extends Drop implements Disappear, Timed
{
    private Paddle2 paddle;
    public void act() 
    {
        super.act();
        die();
    }    

    public void move()
    {
        move(3);
    }

    public void die()
    {
        MyWorld world = (MyWorld)getWorld();
        paddle = world.getPaddle();
        if(intersects(paddle))
        {
            Greenfoot.stop();
        }
    }

    public void timed(int seconds)
    {
    }
}
