import greenfoot.*;  
public class Ball extends Actor
{
    private int bricksBroken = 0;
    private int speed = 4;
    
    public void act() 
    {
        moveAndDeflect() ;
        breakBricks();
    }  
 
    public int getSpeed()
    {
        return speed;
    }
    public int getBricksBroken()
    {
        return bricksBroken;
    }
    public void moveAndDeflect()
    {
        move(speed);
        if(getX() <= 5 || getX() >= getWorld().getWidth() -5||getY() <= 5||intersects((Actor)getWorld().getObjects(Paddle.class).get(0)))
        {
            turn(120); // turn when meet 3 sides and paddle
        }
        if(getY() >= getWorld().getHeight() -5) //removes ball when ball hits bottom
        {
            World world; 
            world = getWorld();
            world.removeObject(this);
        }
    }

    public void breakBricks()
    {
        Actor brick;
        brick = getOneObjectAtOffset(0, 0, Bricks.class);
        if(brick!= null)//if ball intersects brick, bricksBroken++ and brick is removed
        {
            World world; 
            world = getWorld(); 
            world.removeObject(brick);
            turn(120);
            bricksBroken++;
            
        }

        

    }
}

