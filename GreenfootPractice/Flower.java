import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Flower extends Drop implements Disappear, Timed
{
    /**
     * Act - do whatever the flower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        super.act();
        decreasePaddleLength();
    }  
    public void move()
    {
        move(3);
    }
    public void decreasePaddleLength()
    {
        if(isTouching(Flower.class))
        {
            Actor actor = getOneIntersectingObject(Flower.class);
            getWorld().removeObject(actor);
            getWorld().addObject(new PaddleSmall(), getX(), getY());
            getWorld().removeObject(this);
        }
    }
  
    public void timed(int seconds)
    {
    }

}
