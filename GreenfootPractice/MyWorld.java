import greenfoot.*;  
public class MyWorld extends World
{
    private ball ball;

    public MyWorld()
    {    
        super(600, 400, 1); 
        prepare();

    }

    private void prepare()
    {
        bricks bricks = new bricks();
        bricks bricks2 = new bricks();
        bricks bricks3 = new bricks();
        bricks bricks4 = new bricks();
        bricks bricks5 = new bricks();
        bricks bricks6 = new bricks();
        bricks bricks7 = new bricks();
        bricks bricks8 = new bricks();
        bricks bricks9 = new bricks();
        bricks bricks10 = new bricks();
        bricks bricks11 = new bricks();
        bricks bricks12 = new bricks();
        bricks bricks13 = new bricks();
        bricks bricks14 = new bricks();
        bricks bricks15 = new bricks();
        bricks bricks16 = new bricks();
        bricks bricks17 = new bricks();
        bricks bricks18 = new bricks();
        bricks bricks19 = new bricks();
        bricks bricks20 = new bricks();
        bricks bricks21 = new bricks();
        bricks bricks22 = new bricks();
        bricks bricks23 = new bricks();
        bricks bricks24 = new bricks();
        bricks bricks25 = new bricks();
        bricks bricks26 = new bricks();
        bricks bricks27 = new bricks();
        bricks bricks28 = new bricks();
        bricks bricks29 = new bricks();
        bricks bricks30 = new bricks();
        bricks bricks31 = new bricks();
        bricks bricks32 = new bricks();
        bricks bricks33 = new bricks();
        bricks bricks34 = new bricks();
        bricks bricks35 = new bricks();
        bricks bricks36 = new bricks();
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

        ball ball = new ball();
        addObject(ball, 298, 253);

        paddle paddle = new paddle();
        addObject(paddle,313,380);

        cherry cherry = new cherry();
        if(getBall().getBricksBroken()== 5 || getBall().getBricksBroken() == 40) 
        {
             addObject(cherry,(int)(Math.random()*getWidth()), 0);

        }
        
        bomb bomb = new bomb();
        bomb bomb1 = new bomb();
        bomb bomb2 = new bomb();
        bomb bomb3 = new bomb();
        bomb bomb4 = new bomb();
        bomb bomb5 = new bomb();
        bomb bomb6 = new bomb();
        if(getBall().getBricksBroken() == 30)
        {
            addObject(bomb,(int)(Math.random()*getWidth()), 0);
            addObject(bomb1,(int)(Math.random()*getWidth()), 0);
            addObject(bomb2,(int)(Math.random()*getWidth()), 0);
            addObject(bomb3,(int)(Math.random()*getWidth()), 0);
            addObject(bomb4,(int)(Math.random()*getWidth()), 0);
            addObject(bomb5,(int)(Math.random()*getWidth()), 0);
            addObject(bomb6,(int)(Math.random()*getWidth()), 0);

        }
        
        flower flower = new flower();
        if(getBall().getBricksBroken() == 15)
        {
            addObject(flower,(int)(Math.random()*getWidth()), 0);

        }
    }

    public ball getBall()
    {
        return ball;
    }

}
