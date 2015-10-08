public class Shoes
{
    //1. Create instance variables
    private String style;
    private String brand;
    private int size;
    
    //2. Write constructor to initialize instance variables
    public Shoes()
    {
      style = "Sneakers";
      brand = "Converse";
      size = 8;
    } // end constructor Student
    public Shoes(String style, String brand, int size)
    {
       this.style = style;
       this.brand = brand;
       this.size = size;
   
    } // end constructor Student
    //3. toString()
    public String toString()
    {
        String output = new String();
        output = "The style of shoe is " + style + ", the brand is " + brand + ", and the shoe size is " + size + ".";
        return output;
    }

} // end Student