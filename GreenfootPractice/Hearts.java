import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hearts extends Drop
{
    private Ball ball;
    private Paddle paddle;
   

    private int score = 0;

    public void act() 
    {
        super.act();
        disappear();
        increaseScore();
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
            score = ball.getBricksBroken();
            if(intersects(paddle))
            {
                score++;

            }
        }
    }
    
    public int getScore()
    {
        return score;
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
