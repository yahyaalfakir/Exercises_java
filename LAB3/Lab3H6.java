import java.util.Scanner;

public class Lab3Q6
{
    public static void main(String[] args) {
        int x[] = new int[3] ;
        Scanner input = new Scanner(System.in);
        for(int i = 0 ; i < 3 ; i++ )
        {
            System.out.println("input number :");
            x[i] = input.nextInt();
        }
        if(x[0] < x[1] && x[1] < x[2])
            System.out.println("strictly increasing");
        else if(x[0] < x[1] && x[1] == x[2])
            System.out.println("increase") ;
        else if (x[0] > x[1] && x[1] > x[2])
            System.out.println("decreasing");
        else if (x[0] == x[1] && x[1] > x[2])
            System.out.println("descending");
        else
            System.out.println("no one");



    }
}