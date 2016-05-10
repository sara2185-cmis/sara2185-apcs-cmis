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

    public abstract void move();

    public void disappear()
    {
        MyWorld world = (MyWorld)getWorld();
        paddle = world.getPaddle();
        if(isTouching(Paddle.class)||(getY() >= world.getHeight() -5))
        {
            world.removeObject(this);
        }
        
        // if(getY() >= world.getHeight() -5||intersects(paddle))//if hits the bottom, cherry disappears
        // {
        //     world.removeObject(this);
        // }
    }

}
