import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class cherry here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cherry extends Drop implements Disappear, Timed
{
    private ball ball;
    private MyWorld world = (MyWorld)getWorld();
    private int speed = world.getBall().getSpeed();
    /**
     * Act - do whatever the cherry wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        if(intersects((Actor)getWorld().getObjects(paddle.class).get(0)))
        {
            increaseSpeed(2);
        }
        disappear();
    }   

    public void move()
    {
        move(3);
    }

    public void increaseSpeed(int speed)
    {

        this.speed += speed;

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

    public void timed()
    {
    }

}
