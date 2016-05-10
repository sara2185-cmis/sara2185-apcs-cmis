import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Drop extends Actor implements Disappear
{
    private Paddle paddle;
    public void act() 
    {
        setRotation(90);
        move();
        disappear();
    } 

    public void move()
    {
    }

    public void disappear()
    {
        MyWorld world = (MyWorld)getWorld();
        paddle = world.getPaddle();
        if(isTouching(Paddle.class))
        {
            world.removeObject(this);
        }
        // if(getY() >= world.getHeight() -15||intersects(paddle))//if hits the bottom, cherry disappears
        // {
        //     world.removeObject(this);
        // }
    }

}
