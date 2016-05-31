import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hearts extends Drop
{
    private Ball ball;
    private Paddle paddle;

    
    public void act() 
    {
        super.act();
        increaseScore();
        disappear();
        
    }  

    public void move()
    {
        move(3);
    }

    public void increaseScore()
    {
        MyWorld world = (MyWorld)getWorld();

        if(world != null)
        {

            ball = world.getBall();
            paddle = world.getPaddle();
            if(intersects(paddle))
            {
                world.setCounter(3);
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

}
