
/**
 * Learn Polymorphism
 * 4/13/2021
 * Ryan Wagner
 */

public class Circle2
{
    // instance variables
    private int x;
    private int y;
    private int radius;
    private String name;

    // Constructor for objects of class Circle
    public Circle2(int p_x, int p_y, int r, String name)
    {
        // initialize instance variables
        x = p_x;
        y = p_y;
        radius = r;
        this.name = name;
    }

    public int getRadius()
    {
        return radius;
    }

    // Concatenates a String to show the center x, y point of the circle
    public String getCenter()
    {
         return "For this "  + getName() + " the center is at (" + x + ", " + y + ")";
    }
    
    public String getName(){
        return name;
    }
}