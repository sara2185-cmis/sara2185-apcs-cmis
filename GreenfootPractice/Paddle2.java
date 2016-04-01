import greenfoot.*;  
import java.awt.Color;

public class Paddle2 extends Actor
{
   
    GreenfootImage img = new GreenfootImage(2, 8);
    
    public void act()
    {
        // Add your action code here.
    } 
    public void setImage(GreenfootImage img)
    {
        this.img = img;
        img.setColor(Color.BLACK);
    }

}
