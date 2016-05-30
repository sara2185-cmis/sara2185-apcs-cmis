import greenfoot.*;  
import java.util.ArrayList;
public class MyWorld extends World
{
    private Paddle paddle;
    private ArrayList<Ball> ball= new ArrayList<Ball>();
    public MyWorld()
    {    
        super(600, 400, 1); 
        prepare();
    }

    public void act() 
    { 
        addCherry();
        addBomb();
        addFlower();
        addPumpkin();
        addGrapes();

    }

    private void addFlower()
    {
        Flower flower = new Flower();
        if(getBall().getBricksBroken() == 12)
        {
            addObject(flower,(int)(Math.random()*getWidth()), 0);
            getBall().setBricksBroken(getBall().getBricksBroken()+1);
        } 
    }

    private void addPumpkin()
    {
        Pumpkin pumpkin = new Pumpkin();
        if(getBall().getBricksBroken() == 7)
        {
            addObject(pumpkin,(int)(Math.random()*getWidth()), 0);
            getBall().setBricksBroken(getBall().getBricksBroken()+1);
        } 
    }

    private void addGrapes()
    {
        Grapes grapes = new Grapes();
        if(getBall().getBricksBroken() == 17)
        {
            addObject(grapes,(int)(Math.random()*getWidth()), 0);
            getBall().setBricksBroken(getBall().getBricksBroken()+1);
        } 
    }

    private void addCactus()
    {
        Cactus cactus = new Cactus();
        if(getBall().getBricksBroken() == 21)
        {
            addObject(cactus,(int)(Math.random()*getWidth()), 0);
            getBall().setBricksBroken(getBall().getBricksBroken()+1);
        } 
    }

    private void addBomb()
    {

        Bomb bomb = new Bomb();
        Bomb bomb1 = new Bomb();
        Bomb bomb2 = new Bomb();
        Bomb bomb3 = new Bomb();
        Bomb bomb4 = new Bomb();
        ArrayList<Bomb> bombs = new ArrayList<Bomb>();
        bombs.add(bomb1);
        bombs.add(bomb2);
        bombs.add(bomb3);
        bombs.add(bomb4);

        if(getBall().getBricksBroken() == 15)
        {
            for(int i = 0; i < 4; i ++)
            {
                addObject(bombs.get(i),(int)(Math.random()*getWidth()), 0);
            }
            getBall().setBricksBroken(getBall().getBricksBroken()+1);
        }
    }

    private void addCherry()
    {
        if(getBall().getBricksBroken()== 5) 
        {
            Cherry cherry = new Cherry();
            addObject(cherry,(int)(Math.random()*getWidth()), 0);
            getBall().setBricksBroken(getBall().getBricksBroken()+1);

        }
    }

    private void prepare()
    {
        paddle = new PaddleNormal();
        addObject(paddle,313,380);

        Bricks bricks = new Bricks();
        Bricks bricks2 = new Bricks();
        Bricks bricks3 = new Bricks();
        Bricks bricks4 = new Bricks();
        Bricks bricks5 = new Bricks();
        Bricks bricks6 = new Bricks();
        Bricks bricks7 = new Bricks();
        Bricks bricks8 = new Bricks();
        Bricks bricks9 = new Bricks();
        Bricks bricks10 = new Bricks();
        Bricks bricks11 = new Bricks();
        Bricks bricks12 = new Bricks();
        Bricks bricks13 = new Bricks();
        Bricks bricks14 = new Bricks();
        Bricks bricks15 = new Bricks();
        Bricks bricks16 = new Bricks();
        Bricks bricks17 = new Bricks();
        Bricks bricks18 = new Bricks();
        Bricks bricks19 = new Bricks();
        Bricks bricks20 = new Bricks();
        Bricks bricks21 = new Bricks();
        Bricks bricks22 = new Bricks();
        Bricks bricks23 = new Bricks();
        Bricks bricks24 = new Bricks();
        Bricks bricks25 = new Bricks();
        Bricks bricks26 = new Bricks();
        Bricks bricks27 = new Bricks();
        Bricks bricks28 = new Bricks();
        Bricks bricks29 = new Bricks();
        Bricks bricks30 = new Bricks();
        Bricks bricks31 = new Bricks();
        Bricks bricks32 = new Bricks();
        Bricks bricks33 = new Bricks();
        Bricks bricks34 = new Bricks();
        Bricks bricks35 = new Bricks();
        Bricks bricks36 = new Bricks();
        addObject(bricks,24,19);
        addObject(bricks2,56,19);
        addObject(bricks3,88,19);
        addObject(bricks4,88,19);
        addObject(bricks5,120,19);
        addObject(bricks6,153,19);
        addObject(bricks7,184,19);
        addObject(bricks8,215,19);
        addObject(bricks9,248,19);
        addObject(bricks11,280,19);
        addObject(bricks12,313,19);
        addObject(bricks13,345,19);
        addObject(bricks14,377,19);
        addObject(bricks15,409,19);
        addObject(bricks16,442,19);
        addObject(bricks17,474,19);
        addObject(bricks18,506,19);
        addObject(bricks19,539,19);
        addObject(bricks20,570,19);
        addObject(bricks21,56,36);
        addObject(bricks22,88,36);
        addObject(bricks23,120,36);
        addObject(bricks24,153,36);
        addObject(bricks25,184,36);
        addObject(bricks26,215,36);
        addObject(bricks27,248,36);
        addObject(bricks28,280,36);
        addObject(bricks29,313,36);
        addObject(bricks30,345,36);
        addObject(bricks31,377,36);
        addObject(bricks32,409,36);
        addObject(bricks33,442,36);
        addObject(bricks34,474,36);
        addObject(bricks35,506,36);
        addObject(bricks36,539,36);

        ball.add(new ballNormal());
        addObject(ball.get(0), 298, 253);

        Score score = new Score();
        addObject(score, 51, 10);

    }

    public Ball getBall()
    {
        return ball.get(0);
    }

    public void setSmallBall()
    {
        int  x= ball.get(0).getX();
        int  y=ball.get(0).getY();
        removeObject(ball.get(0));
        ball.remove(0);
        ball.add(new ballSmall());
        addObject(ball.get(0), x,y);
    }

    public void setBigBall()
    {
        int  x= ball.get(0).getX();
        int  y=ball.get(0).getY();
        removeObject(ball.get(0));
        ball.remove(0);
        ball.add(new ballBig());
        addObject(ball.get(0), x,y);
    }

    public Paddle getPaddle()
    {
        return paddle;
    }

}
