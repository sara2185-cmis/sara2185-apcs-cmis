import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class bomb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class bomb extends Drop implements Disappear, Timed
{
    /**
     * Act - do whatever the bomb wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
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
        if(intersects((Actor)getWorld().getObjects(paddle.class).get(0)))
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
