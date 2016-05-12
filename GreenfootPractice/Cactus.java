import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cactus here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cactus extends Drop
{
    private Paddle paddle;
    public void act() 
    {
        super.act();
        decreasePaddleLength();
    }  

    public void move()
    {
        move(3);
    }

    public void decreasePaddleLength()
    {
        MyWorld world = (MyWorld)getWorld();
        if(world != null)
        {
            if(isTouching(Paddle.class))
            {

                paddle = world.getPaddle();
                getWorld().removeObject(paddle);
                getWorld().addObject(new PaddleBig(), this.getX(), this.getY()+28);

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
