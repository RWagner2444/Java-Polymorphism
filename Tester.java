import java.util.ArrayList;
/**
 * Learn Polymorphism
 * 4/13/2021
 * Ryan Wagner
 */
public class Tester
{
    
    public static void main(String args[]){
        ArrayList<Circle2> circles = new ArrayList<Circle2>();
        
        circles.add(new Circle2(2, 4, 2, "Circle"));
        circles.add(new Cylinder2(10, 15, 5, "Cylinder", 10));
        circles.add(new Oval2(25, 10, 3, "Oval", 1));
        circles.add(new OvalCylinder2(40, 10, 5, "OvalCylinder", 2, 7));
        
        showCenter(circles);
    }
    
    public static void showCenter(ArrayList<Circle2> circles){
        for(Circle2 c: circles){
            System.out.println(c.getCenter());
        }
    }
}
