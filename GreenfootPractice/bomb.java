import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Bomb extends Drop implements Disappear, Timed
{
    
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
        if(intersects((Actor)getWorld().getObjects(Paddle.class).get(0)))
        {
            
        }
    }
    public void disappear()
    {
        if(getY() >= getWorld().getHeight() -5)
        {
            World world; 
            world = getWorld();
            world.removeObject(this);
        }
        else
        {
        }
    }

    public void timed(int seconds)
    {
    }
}
