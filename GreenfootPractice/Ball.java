import greenfoot.*;  
import java.awt.Color;
public class Ball extends Actor implements Change
{

    private int bricksBroken = 0;
    private int speed = 4;
    private Actor brick;
    private int time = 30;

    public void act() 
    {
        moveAndDeflect() ;
        breakBricks();
        MyWorld world; 
        world = (MyWorld)getWorld();
        if(world.getObjects(Bricks.class).size()!=0)
        {
            brick = getOneObjectAtOffset(0, 0, Bricks.class);
        }
        timed();
        changeSmall();
        changeBig();

    }  

    public int getSpeed()
    {
        return speed;
    }

    public void setSpeed(int newSpeed)
    {
        this.speed+= newSpeed;
    }

    public int getBricksBroken()
    {
        return bricksBroken;
    }

    public void setBricksBroken(int bricks)
    {
        this.bricksBroken = bricks;
    }

    public void moveAndDeflect()
    {
        move(speed);
        if(getX() <= 5 || getX() >= getWorld().getWidth() -5||getY() <= 5||intersects((Actor)getWorld().getObjects(Paddle.class).get(0)))
        {
            int degrees = 120 + ((int)(Math.random()));
            turn(degrees); // turn when meet 3 sides and paddle
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
        if(brick!= null)//if ball intersects brick, bricksBroken++ and brick is removed
        {
            MyWorld world; 
            world = (MyWorld)getWorld(); 
            world.removeObject(brick);
            turn(120);
            bricksBroken++;
        }
    }

    public void timed()
    {
        if(isTouching(Cherry.class))
        {
            if(time!=0)
            {
                time--;
            }
            if(time == 0)
            {
                setSpeed(-2);
            }
        }

    }

    public void changeBig()
    {
        MyWorld world = (MyWorld)getWorld();
        if(world!=null)
        {
            if(isTouching(Pumpkin.class))
            {

                int   x= this.getX();
                int  y=this.getY();
                world.removeObject(this);

                world.addObject(new ballBig(), x, y);
            }

        }
    }

    public void changeSmall()
    {
        MyWorld world = (MyWorld)getWorld();
        if(world!=null)
        {
            if(isTouching(Grapes.class))
            {

                int   x= this.getX();
                int  y=this.getY();
                world.removeObject(this);

                world.addObject(new ballSmall(), x, y);
            }

        }
    }

   

}

