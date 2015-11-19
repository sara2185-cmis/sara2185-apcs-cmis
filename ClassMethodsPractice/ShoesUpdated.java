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
        String result = "";
        if(style.equals("Wedges"))
        {
           result= "Cool";
        }
        else if(style.equals("Stilletos"))
        {
            result = "Ow";
        }
         else if(brand.equals("Nike"))
        {
            result = "So expensive";
        }
        else if(brand.equals("Billabong"))

        {
            result = "Nice~";
        }
        else if(size > 12)
        {
            result = "Huge Feet!";
        }
        else if(size < 5)
        {
            result = "Are you a chid?";
        }
        else
        {
            result = "Hmmmm";
        }
        return result;
        
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