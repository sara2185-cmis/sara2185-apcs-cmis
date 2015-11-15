public class ShoesUpdated
{
    //1. Create instance variables
    private String style;
    private String brand;
    private int size;
    
    //2. Write constructor to initialize instance variables
    public ShoesUpdated()
    {
      style = "Sneakers";
      brand = "Converse";
      size = 8;
    } // end constructor Student
    public void setShoesUpdated(String style, String brand, int size)
    {
        this.style = style;
        this.brand = brand;
        this.size = size;
    }
    public String getShoesUpdated()
    {
        if(style.equals("Wedges"))
        {
            return "Cool";
        }
        else if(style.equals("Stilletos"))
        {
            return "Ow";
        }
         else if(brand.equals("Nike"))
        {
            return "So expensive";
        }
        else if(brand.equals("Billabong"))

        {
            return "Nice~";
        }
         else if(size > 12)
        {
            return "Huge Feet!";
        }
        else if(size < 5)
        {
            return "Are you a chid?";
        }
        
    }
    public ShoesUpdated(String style, String brand, int size)
    {
       this.style = style;
       this.brand = brand;
       this.size = size;
   
    } // end constructor Student
    //3. toString()
    public String toString()
    {
        String output = new String();
        output = "The style of shoe is " + style + ", the brand is " + brand + ", and the shoe size is " + size + ". Additional comments: " + getShoesUpdated();
        return output;
    }

} // end Student