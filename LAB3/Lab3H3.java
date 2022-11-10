import java.util.Scanner ;
public class Lab3Q3 {
    public static void main(String[] args) {
        int K;
        Scanner input = new Scanner(System.in) ;
        System.out.println("Input The number : ");
        K = input.nextInt();

        if(K > 0 )
            System.out.println("Poisitve ");
        else if (K < 0)
            System.out.println("Negitive ") ;
        else
            System.out.println("Zero ");


    }
}