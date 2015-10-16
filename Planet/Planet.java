public class Planet
{
    //1. Create instance variables
    private  int maxPopulation;
    private  double percentSpaceMarines;
    private  int maxSpaceMarinesPerStarDestroyer;
    private  int nPlanets = 10;
    private  Planet p;
    private  String[] names = {"Alpha", "Beta", "Gamma", "Delta"};
    private String[] relationships = {"friendly", "ally", "hostile", "at war", "neutral"};
    private double radius;
    private String name;
    private String relationship;
    private int SpaceMarines;
    private int StarDestroyers;
    private double SpaceMarinesPerStarDestroyer;
    private int Population;

    //2. Write constructor to initialize instance variables
    public Planet()
    {
        name = names[(int) ( 4* Math.random())] + " " + (int)(Math.random());// I still don't know why it's not a random number
        relationship = relationships[(int) ( 5* Math.random())];
        radius = 1.0;
        Population = 1;
        percentSpaceMarines = 1.0;
        SpaceMarines = 1;
        StarDestroyers = 1;
        SpaceMarinesPerStarDestroyer = 1;

    } // end constructor Student
     public Planet(int maxPopulation, double percentSpaceMarines, int maxSpaceMarinesPerStarDestroyer)
    {
        name = names[(int) ( 4* Math.random())] + " " + (int)(Math.random());
        relationship = relationships[(int) ( 5* Math.random())];
        radius = (int)(Math.random());// I don't know why it's not producing a random number
        this.maxPopulation = maxPopulation;
        this.percentSpaceMarines = percentSpaceMarines;
        Population = (int)(10000000 * Math.random());
        SpaceMarines = (int)(100000000 * Math.random());
        StarDestroyers = (int)(100000 * Math.random());
        this.maxSpaceMarinesPerStarDestroyer = maxSpaceMarinesPerStarDestroyer;
        SpaceMarinesPerStarDestroyer = SpaceMarines/StarDestroyers;
        

    } // end constructor Student
    //3. toString()
    public String toString()
    {
        String output = String.format("Name: %s\n" +
                "Relationship: %s\n"+        
                "Radius: %f\n"+
                "Population: %d\n"+
                "Space Marines as percent of Pop.: %.2f\n"+
                "Space Marines: %d\n"+
                "Star Destroyers: %d\n"+
                "Space Marines per star destroyer: %f\n", name, relationship, radius, Population, percentSpaceMarines, SpaceMarines, StarDestroyers, SpaceMarinesPerStarDestroyer);
        return output;
         
       
    }

} // end Student