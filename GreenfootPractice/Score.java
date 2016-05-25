import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Score extends Actor
{
    Ball ball;
    public void act() 
    {
        MyWorld world = (MyWorld)getWorld();
        ball = world.getBall();
        if(ball.getBricksBroken() >= 0)
        {
            setImage(new GreenfootImage("Score: " + ball.getBricksBroken(), 24, Color.GREEN, Color.BLACK));
        }
    }
}
