import java.util.Scanner;

public class Lab2Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter first Number :");
        int num1 = in.nextInt();

        System.out.println("Enter Second Number :");
        int num2 = in.nextInt();

        System.out.println("Enter Thirty Number :");
        int num3 = in.nextInt();

        System.out.println("Average of Three Number:"  + (num1 + num2 + num3) / 3);
    }
}
