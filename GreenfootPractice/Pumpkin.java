import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Pumpkin extends Drop
{
    Ball ball;
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
        ball = world.getBall();
        if(isTouching(Ball.class)||(getY() >= world.getHeight() -5))
        {
            world.removeObject(this);
        }
      
    }

}
