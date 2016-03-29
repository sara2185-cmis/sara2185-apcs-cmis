import greenfoot.*; 

public class Cherry extends Drop implements Timed
{
    private Ball ball;
  
    private int speed;
    private Paddle paddle;

    public void act() 
    {
        super.act();
        increaseSpeed();
        disappear();

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
        ball = world.getBall();
        paddle = world.getPaddle();
        if(intersects(paddle))
        {
            ball.setSpeed(2);
        }
    }

    

    public void timed(int seconds)
    {
    }

}