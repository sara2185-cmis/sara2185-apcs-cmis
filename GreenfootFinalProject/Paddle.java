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

    public void changeBig()
    {
        MyWorld world = (MyWorld)getWorld();
        if(world!=null)
        {
            if(isTouching(Cactus.class))
            {
                int   x= this.getX();
                int  y=this.getY();
                world.removeObject(this);
                world.addObject(new PaddleBig(), x, y);
            }

        }
    }

    public void changeSmall()
    {
        MyWorld world = (MyWorld)getWorld();
        if(world!=null)
        {
            if(isTouching(Flower.class))
            {
                int   x= this.getX();
                int  y=this.getY();
                world.removeObject(this);
                world.addObject(new PaddleSmall(), x, y);
            }

        }
    }

}
