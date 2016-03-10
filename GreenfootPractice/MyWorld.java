import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
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
        addObject(bricks16,441,19);
        addObject(bricks17,475,19);
        addObject(bricks18,500,19);
        addObject(bricks19,530,19);
        addObject(bricks20,560,19);
        addObject(bricks21,590,19);
        addObject(bricks22,620,19);
        ball ball = new ball();
        addObject(ball,299,253);
        paddle paddle = new paddle();
        addObject(paddle,313,380);
    }
}
