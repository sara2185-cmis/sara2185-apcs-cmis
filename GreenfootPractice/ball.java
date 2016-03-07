import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball extends Actor
{
    /**
     * Act - do whatever the ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveAndDeflect() ;
        breakBricks();
    }   

    public void moveAndDeflect()
    {
        move(4);
        if(getX() <= 5 || getX() >= getWorld().getWidth() -5)
        {
            turn(120);
        }
        if(getY() <= 5 || getY() >= getWorld().getHeight() -5)
        {
            turn(120);
        }
        if(intersects((Actor)getWorld().getObjects(paddle.class).get(0)))
        {
            turn( 120);
        }
    }

    public void breakBricks()
    {

        Actor brick;
        brick = getOneObjectAtOffset(0, 0, bricks.class);
        Actor cherry;
        int bricksBroken = 0;
        if(brick!= null)
        {
            World world; 
            world = getWorld();
            world.removeObject(brick);
            turn(120);
            bricksBroken++;
            if(bricksBroken == 5) 
            {
                world.addObject(cherry, 0, 0);
                bricksBroken = 0;
            }
        }

    }
}

