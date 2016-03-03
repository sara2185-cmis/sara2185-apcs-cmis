import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 2); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Seal seal = new Seal();
        addObject(seal,246,136);
        Fish fish = new Fish();
        addObject(fish,75,83);
        Fish fish2 = new Fish();
        addObject(fish2,292,258);
        Fish fish3 = new Fish();
        addObject(fish3,425,93);
        Fish fish4 = new Fish();
        addObject(fish4,145,227);
        Rock rock = new Rock();
        addObject(rock,432,297);
        Rock rock2 = new Rock();
        addObject(rock2,204,52);
    }
}
