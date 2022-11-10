//Home work question 4
import java.awt.Rectangle;
public class lab
{
    public static void main(String[] args) {

        Rectangle box = new Rectangle(5, 10, 20, 30);
        System.out.println(box);
        //output: java.awt.Rectangle[x=5,y=10,width=20,height=30]
        box.add(0, 0);
        System.out.println(box);
        //output: java.awt.Rectangle[x=0,y=0,width=25,height=40]
        System.out.print("width: ");
        System.out.println(box.getWidth());
        System.out.println("Expected: 25 ") ;
        System.out.print("height: ");
        System.out.println(box.getHeight());
        System.out.println("Expected: 40");
        System.out.print("Area of rectangle: ");
        System.out.println(box.getWidth()*box.getHeight());
        System.out.println("Expected: 1000");
    }
}















