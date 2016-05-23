import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Paddle extends Actor implements Change
{

    public void act() 
    {

        if (Greenfoot.isKeyDown("left"))
        {
            move(-7);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            move(7);
        }// Add your action code here.
        changeSmall();
        changeBig();
    }    

    public void changeSmall()
    {
        MyWorld world = (MyWorld)getWorld();
        if(world != null)
        {
            if(isTouching(Cactus.class))
            {

                Paddle paddle = world.getPaddle();
                getWorld().removeObject(paddle);
                getWorld().addObject(new PaddleBig(), this.getX(), this.getY());
            }
        }	
    }

    public void changeBig()
    {
    }

}
