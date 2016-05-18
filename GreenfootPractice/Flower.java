import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Flower extends Drop implements Timed
{
    private Paddle paddle;
    public void act() 
    {
        super.act();
        decreasePaddleLength();
    }  

    public void move()
    {
        move(3);
    }

    public void decreasePaddleLength()
    {
        MyWorld world = (MyWorld)getWorld();
        if(world != null)
        {
            if(isTouching(Paddle.class))
            {
                paddle = world.getPaddle();
                getWorld().removeObject(paddle);
                getWorld().addObject(new PaddleSmall(), this.getX(), this.getY()+28);
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
