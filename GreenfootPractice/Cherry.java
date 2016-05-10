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
        
        if(isTouching(Paddle.class))
        {
            ball.setSpeed(2);
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