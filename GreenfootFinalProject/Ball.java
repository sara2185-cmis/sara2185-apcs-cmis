import greenfoot.*;  
import java.awt.Color;
public class Ball extends Actor implements Change
{

    private int bricksBroken = 1;
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
        this.bricksBroken += bricks;
    }

    public void moveAndDeflect()
    {
        move(speed);
        MyWorld world = (MyWorld)getWorld();
        if(getX() <= 5 || getX() >= getWorld().getWidth() -5||getY() <= 5||intersects((Actor)getWorld().getObjects(Paddle.class).get(0)))//||intersects((Actor)getWorld().getObjects(Rocket.class).get(0))||intersects((Actor)getWorld().getObjects(Car.class).get(0)) )
        {
            int degrees = 120 + ((int)(Math.random()));
            turn(degrees); // turn when meet 3 sides and paddle
        }
       
        if(getY() >= getWorld().getHeight() -5) //removes ball when ball hits bottom
        {

            world.removeObject(this);
            GameOver gameover= new GameOver();
            world.addObject(gameover, world.getWidth()/2, world.getHeight()/2);
            Greenfoot.stop();
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
            world.setCounter(1);
        }
    }

    public void changeBig()
    {
        MyWorld world = (MyWorld)getWorld();
        if(world!=null)
        {
            if(isTouching(Pumpkin.class))
            {
                Pumpkin pumpkin = world.getObjects(Pumpkin.class).get(0);
                Ball ball = world.getBall();
                int   x= this.getX();
                int  y=this.getY();
                world.removeObject(pumpkin);
                world.setBigBall();
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
                Grapes grapes = world.getObjects(Grapes.class).get(0);
                Ball ball = world.getBall();
                int   x= this.getX();
                int  y=this.getY();
                world.removeObject(grapes);

                world.setSmallBall();
            }

        }
    }

}
