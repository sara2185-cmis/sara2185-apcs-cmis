import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Seal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Seal extends Actor
{
    /**
     * Act - do whatever the Seal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        turn();
        eat();
    }  
    public void eat()
    {
        Actor fish;
        fish = getOneObjectAtOffset(0, 0, Fish.class);
        if(fish != null)
        {
            World world; 
            world = getWorld();
            world.removeObject(fish);
        }
    }
    public void turn()
    {
        move(8);
        if (Greenfoot.isKeyDown("left"))
        {
            turn(-3);
        }
        if (Greenfoot.isKeyDown("right"))
        {
            turn(3);
        }
    }
}
