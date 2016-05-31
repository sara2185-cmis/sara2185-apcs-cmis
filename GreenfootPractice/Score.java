import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;

public class Score extends Actor
{

    public void act() 
    {
        MyWorld world = (MyWorld)getWorld();
      
        if(world.getCounter() >= 0)
        {
            setImage(new GreenfootImage("Score: " + world.getCounter(), 24, Color.GREEN, Color.BLACK));
        }
    }
}
