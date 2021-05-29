
/**
 * Learn Polymorphism
 * 4/13/2021
 * Ryan Wagner
 */

public class Cylinder2 extends Circle2
{
    // instance variables
    private int height;

    // Constructor for objects of class Cylinder
    public Cylinder2(int x, int y, int rad, String name, int h)
    {
        // call superclass
        super(x, y, rad, name);

        // initialize instance variables
        height = h;
    }

    public int getHeight()
    {
        return height;
    }
}

