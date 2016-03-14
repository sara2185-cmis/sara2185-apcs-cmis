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
    private int speed = 4;
    
    /**
     * Act - do whatever the ball wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveAndDeflect() ;
        breakBricks();
    }   
    public int getSpeed()
    {
        return speed;
    }
    public void moveAndDeflect()
    {
        move(speed);
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
            bomb bomb = new bomb();
            bomb bomb1 = new bomb();
            bomb bomb2 = new bomb();
            bomb bomb3 = new bomb();
            bomb bomb4 = new bomb();
            bomb bomb5 = new bomb();
            bomb bomb6 = new bomb();
            flower flower = new flower();

            if(bricksBroken == 5 || bricksBroken == 40) 
            {
                world.addObject(cherry,(int)(Math.random()*world.getWidth()), 0);
               
            }
            if(bricksBroken == 30)
            {
                world.addObject(bomb,(int)(Math.random()*world.getWidth()), 0);
                world.addObject(bomb1,(int)(Math.random()*world.getWidth()), 0);
                world.addObject(bomb2,(int)(Math.random()*world.getWidth()), 0);
                world.addObject(bomb3,(int)(Math.random()*world.getWidth()), 0);
                world.addObject(bomb4,(int)(Math.random()*world.getWidth()), 0);
                world.addObject(bomb5,(int)(Math.random()*world.getWidth()), 0);
                world.addObject(bomb6,(int)(Math.random()*world.getWidth()), 0);
              
            }
            if(bricksBroken == 15)
            {
                world.addObject(flower,(int)(Math.random()*world.getWidth()), 0);
               
            }
        }

    }
}

