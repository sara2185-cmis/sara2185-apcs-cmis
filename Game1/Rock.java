import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rock extends Actor
{
    /**
     * Act - do whatever the Rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int random = Greenfoot.getRandomNumber(90);
    public void act() 
    {
        move();
        eat();
    }   

    public void move()
    {
        if (random < 50)
        {
            move(7);
        }
        if(Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(90));
        }
    }
    public void eat()
    {
        Actor seal;
        seal = getOneObjectAtOffset(0, 0, Seal.class);
        if(seal != null)
        {
            World world; 
            world = getWorld();
            world.removeObject(seal);
        }
    }
}
