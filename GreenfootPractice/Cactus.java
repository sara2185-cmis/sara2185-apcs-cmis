import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Cactus extends Drop implements Disappear
{
    private Paddle paddle;
    public void act() 
    {
        super.act();
       disappear();
    }  

    public void move()
    {
        move(3);
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

     public void decreasePaddleLength()
    {
        MyWorld world = (MyWorld)getWorld();
        if(world != null)
        {
            if(isTouching(Paddle.class))
            {

                paddle = world.getPaddle();
                getWorld().removeObject(paddle);
                getWorld().addObject(new PaddleBig(), this.getX(), this.getY());

            } 
        }
    }
    

}
