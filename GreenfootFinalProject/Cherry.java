import greenfoot.*; 

public class Cherry extends Drop implements Disappear
{
    private Ball ball;
    private Paddle paddle;

    public void act() 
    {
        increaseSpeed();
        super.act();
        disappear();

    }  

    public void move()
    {
        move(3);
    }

    public void increaseSpeed()//increases speed a certain amount
    {
        MyWorld world = (MyWorld)getWorld();

        if(world != null)
        {
            ball = world.getBall();
            paddle = world.getPaddle();
            if(intersects(paddle))
            {
                ball.setSpeed(6);
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