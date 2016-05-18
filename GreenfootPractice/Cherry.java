import greenfoot.*; 

public class Cherry extends Drop implements Timed
{
    private Ball ball;
    private Paddle paddle;
    private int time = 100;
    public void act() 
    {
        increaseSpeed();
        super.act();

    }  

    public void addedToWorld(MyWorld world)
    {

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
                ball.setSpeed(2);
            }
        }

    }

    public void disappear()
    {
        super.disappear();
    }

    public void timed()
    {
        if(time!=0)
        {
            time--;
        }
        else
        {
            MyWorld world = (MyWorld)getWorld();
            ball = world.getBall();
            ball.setSpeed(-2);
        }

    }

}