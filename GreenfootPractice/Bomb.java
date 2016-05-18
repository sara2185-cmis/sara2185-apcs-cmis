import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bomb extends Drop implements Timed
{
    private Paddle paddle;
    public void act() 
    {
        super.act();
        die();
    }    

    public void move()
    {
        move(2);
    }

    public void die()
    {
        MyWorld world = (MyWorld)getWorld();
        if(world != null)
        {
            paddle = world.getPaddle();
            if(intersects(paddle))
            {
                Greenfoot.stop();
            }
        }
    }

    public void disappear()
    {
        super.disappear();
    }

    public void timed()
    {
    }
}
