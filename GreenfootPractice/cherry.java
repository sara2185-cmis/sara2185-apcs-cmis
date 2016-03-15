import greenfoot.*; 

public class cherry extends Drop implements Disappear, Timed
{
    private ball ball;
    private MyWorld world = (MyWorld)getWorld();
    private int speed = world.getBall().getSpeed();

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

    public void increaseSpeed(int speed)//increases speed a certain amount
    {
        this.speed += speed;
    }

    public void disappear()
    {
        if(getY() >= getWorld().getHeight() -5)//if hits the bottom, cherry disappears
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
