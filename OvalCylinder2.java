
/**
 * Learn Polymorphism
 * 4/13/2021
 * Ryan Wagner
 */

public class OvalCylinder2 extends Oval2
{
    // instance variables
    private int height;

    // Constructor for objects of class OvalCylinder
    public OvalCylinder2(int x, int y, int rad1, String name, int rad2, int h)
    {
        // call superclass
        super(x, y, rad1, name, rad2);

        // initialize instance variables
        height = h;
    }

    public int getHeight()
    {
        return height;
    }
}