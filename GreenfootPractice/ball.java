import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ball here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ball extends Actor
{
    private int bricksBroken = 0;
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
        if(getY() <= 5 )
        {
            turn(120);
        }
        if(intersects((Actor)getWorld().getObjects(paddle.class).get(0)))
        {
            turn( 120);
        }
        if(getY() >= getWorld().getHeight() -5)
        {
            World world; 
            world = getWorld();
            world.removeObject(this);
        }
    }

    public void breakBricks()
    {

        Actor brick;
        brick = getOneObjectAtOffset(0, 0, bricks.class);
        
       
        if(brick!= null)
        {
            World world; 
            world = getWorld();
            world.removeObject(brick);
            turn(120);
            bricksBroken++;
            cherry cherry = new cherry();
     
            if(bricksBroken == 5) 
            {
                world.addObject(cherry,(int)(Math.random()*world.getWidth()), 0);
                bricksBroken = 0;
            }
        }

    }
}

