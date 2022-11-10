import java.util.Scanner ;
public class Lab2Q3 {
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in) ;
        System.out.println("Input height : \n ");
        int x = input.nextInt() ;
        System.out.println("Input width : \n ");
        int y = input.nextInt() ;
        System.out.println("perimeter of rectangle =  \n "  + 2 * (x+y));
        System.out.println("\n Area of rectangle =  \n " + x*y );





    }
}