import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public abstract class Drop extends Actor implements Disappear
{
    private Paddle2 paddle;
    public void act() 
    {
        setRotation(90);
        move();

    } 

    public void move()
    {
    }

    public void disappear()
    {
        MyWorld world = (MyWorld)getWorld();
        paddle = world.getPaddle();
        if(getY() >= world.getHeight() -5||intersects(paddle))//if hits the bottom, cherry disappears
        {
            world.removeObject(this);
        }
    }

}
