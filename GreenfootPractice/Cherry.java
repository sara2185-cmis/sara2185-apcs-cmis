import greenfoot.*; 

public class Cherry extends Drop implements Timed
{
    //private Ball ball;
    private Paddle paddle;

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
            
            Ball ball = world.getBall();
            paddle = world.getPaddle();
            if(intersects(paddle))
            {
                ball.setSpeed(100);
            }
        }

    }

    public void disappear()
    {
        super.disappear();
    }

    public void timed(int seconds)
    {
    }

}