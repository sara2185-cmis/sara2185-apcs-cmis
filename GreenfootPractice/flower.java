import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class flower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class flower extends Drop
{
    /**
     * Act - do whatever the flower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   public void act() 
    {
       super.act();
    }    
    public void move()
    {
        move(4);
    }
    public void turn()
    {
        turn(90);
    }   
}
