import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class World2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World2 extends World
{
    private Ball ball;
    private Paddle paddle;
    /**
     * Constructor for objects of class World2.
     * 
     */
    public World2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    private void prepare()
    {
        paddle = new PaddleNormal();
        addObject(paddle,313,380);

        ball = new Ball();
        addObject(ball, 298, 253);

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
        Bricks bricks37 = new Bricks();
        Bricks bricks38 = new Bricks();
        Bricks bricks39 = new Bricks();
        Bricks bricks40 = new Bricks();
        Bricks bricks41 = new Bricks();
        Bricks bricks42 = new Bricks();
        Bricks bricks43 = new Bricks();
        Bricks bricks44 = new Bricks();
        Bricks bricks45 = new Bricks();
        Bricks bricks46 = new Bricks();
        Bricks bricks47 = new Bricks();
        Bricks bricks48 = new Bricks();
        Bricks bricks49 = new Bricks();
        Bricks bricks50 = new Bricks();
        Bricks bricks51 = new Bricks();
        Bricks bricks52 = new Bricks();
        Bricks bricks53 = new Bricks();
        Bricks bricks54 = new Bricks();
        Bricks bricks55 = new Bricks();
        Bricks bricks56 = new Bricks();
        Bricks bricks57 = new Bricks();
        Bricks bricks58 = new Bricks();
        Bricks bricks59 = new Bricks();
        Bricks bricks60 = new Bricks();
        Bricks bricks61 = new Bricks();
        Bricks bricks62 = new Bricks();
        Bricks bricks63 = new Bricks();
        Bricks bricks64= new Bricks();
        Bricks bricks65= new Bricks();
        Bricks bricks66 = new Bricks();
        Bricks bricks67 = new Bricks();

        addObject(bricks,24,172);
        addObject(bricks2,56,172);
        addObject(bricks3,88,172);
        addObject(bricks4,88,172);
        addObject(bricks5,120,172);
        addObject(bricks6,153,172);
        addObject(bricks7,184,172);
        addObject(bricks8,215,172);
        addObject(bricks9,248,172);
        addObject(bricks11,280,172);
        addObject(bricks12,313,172);
        addObject(bricks13,345,172);
        addObject(bricks14,377,172);
        addObject(bricks15,409,172);
        addObject(bricks16,442,172);
        addObject(bricks17,474,172);
        addObject(bricks18,506,172);
        addObject(bricks19,539,172);
        addObject(bricks20,570,172);
        addObject(bricks21,24,119);
        addObject(bricks22,24,119);
        addObject(bricks23,24,100);
        addObject(bricks24,24,81);
        addObject(bricks25,24,81);
        addObject(bricks26,24,62);
        addObject(bricks27,24,43);
        addObject(bricks28,24,43);
        addObject(bricks29,570,119);
        addObject(bricks30,570,119);
        addObject(bricks31,570,100);
        addObject(bricks32,570,81);
        addObject(bricks33,570,81);
        addObject(bricks34,570,62);
        addObject(bricks35,570,43);
        addObject(bricks36,570,43);
        addObject(bricks37,56,190);
        addObject(bricks38,88,190);
        addObject(bricks39,88,190);
        addObject(bricks40,120,190);
        addObject(bricks41,153,190);
        addObject(bricks42,184,190);
        addObject(bricks43,215,190);
        addObject(bricks44,248,190);
        addObject(bricks45,280,190);
        addObject(bricks46,313,190);
        addObject(bricks47,345,190);
        addObject(bricks48,377,190);
        addObject(bricks49,409,190);
        addObject(bricks50,442,190);
        addObject(bricks51,474,190);
        addObject(bricks52,506,190);
        addObject(bricks53,539,190);
        addObject(bricks54,570,190);
        addObject(bricks55,24,190);
        addObject(bricks56,280,155);
        addObject(bricks57,313,155);
        addObject(bricks58,345,155);
        addObject(bricks59,280,155);
        addObject(bricks60,313,136);
        addObject(bricks61,345,155);
        addObject(bricks62,280,136);
        addObject(bricks63,313,155);
        addObject(bricks64,345,136);
        addObject(bricks62,280,117);
        addObject(bricks63,345,117);
        addObject(bricks64,280,117);
        addObject(bricks65,313,117);
        addObject(bricks66,345,117);
        addObject(bricks67,280,117);

    }
}
