import greenfoot.*; 
public abstract class Enemy extends Actor
{
    private int direction = 3;
    private Ball ball;
    public void act() 
    {
        move();
        ballMove();
    }   

    public void move()
    {

        move(direction);
        if(isAtEdge())
        {
            direction = -direction;
        }

    }

    public void ballMove()
    {
        MyWorld world = (MyWorld)getWorld();
        ball = world.getBall();

        if(intersects(ball))
        {
            int degrees = 120 + ((int)(Math.random()));
            ball.turn(degrees); // turn when meet 3 sides and paddle
        }

    }
}
