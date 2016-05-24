import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bomb extends Drop implements Timed, Disappear
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
        MyWorld world = (MyWorld)getWorld();
        paddle = world.getPaddle();
        if(isTouching(Paddle.class)||(getY() >= world.getHeight() -5))
        {
            world.removeObject(this);
        }
     
    }
    public void timed()
    {
    }
}
