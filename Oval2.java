
/**
 * Learn Polymorphism
 * 4/13/2021
 * Ryan Wagner
 */

public class Oval2 extends Circle2
{
    // instance variables
    private int radius2;

    // Constructor for objects of class Oval
    public Oval2(int x, int y, int rad1, String name, int rad2)
    {
        // call superclass
        super(x, y, rad1,name);

        // initialize instance variables
        radius2 = rad2;
    }

    public int getRadius2()
    {
        return radius2;
    }
}
