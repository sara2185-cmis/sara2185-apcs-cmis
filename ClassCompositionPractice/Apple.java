
/**
 * @Sara
 * @January 24th, 2016
 */
public class Apple
{
    private String color;
    private int diameter;
    private String type;
    public int sweetness;//with 1 as sour to 10 as sweet

    public Apple()
    {
        color = "Green";
        diameter = 7; // in centimeters
        type = "Granny Smith";
        sweetness = 3;

    }
    public Apple(String color, int diamter, String type, int sweetness)
    {
        this.color = color;
        this.diameter = diameter;
        this.type = type;
        this.sweetness = sweetness;
    }

    public String toString()
    {
        String output = new String();
        output = "The color of the apple is " + color + ", the diamter is " + diameter + ", the type is " + type + ", and the sweetness level is " + sweetness;
        return output;
    }
}
