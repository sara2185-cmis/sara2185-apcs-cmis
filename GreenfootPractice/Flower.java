import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Flower extends Drop implements Disappear, Timed
{
    /**
     * Act - do whatever the flower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(isAtEdge())
        {
            getWorld().removeObject(this);
        }
        super.act();
        decreasePaddleLength();
    }  

    public void move()
    {
        move(3);
    }

    public void decreasePaddleLength()
    {
        if(isTouching(Paddle.class))
        {
            MyWorld world = (MyWorld)getWorld();
            Paddle paddle = world.getPaddle();
            getWorld().removeObject(paddle);
            getWorld().addObject(new PaddleSmall(), this.getX(), this.getY()+28);

        } 
    }

    public void timed(int seconds)
    {
    }

}
