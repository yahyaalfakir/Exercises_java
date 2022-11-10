import java.util.Scanner;

public class Lab3Q4
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please Enter Number: ");
        long x = input.nextInt();

        int result = 1;

        if (x < 0)
            x *= -1;

        if (x >= 10 && x < 100)
        {
            result = 2;
        }
        else if (x >= 100 && x < 1000)
        {
            result = 3;
        }
        else if (x >= 1000 && x < 10000)
        {
            result = 4;
        }
        else if (x >= 10000 && x< 100000)
        {
            result = 5;
        }
        else if (x >= 100000 && x < 1000000)
        {
            result = 6;
        }
        else if (x >= 1000000 && x < 10000000)
        {
            result = 7;
        }
        else if (x >= 10000000 && x < 100000000)
        {
            result = 8;
        }
        else if (x >= 100000000 && x < 1000000000)
        {
            result = 9;
        }
        else if (x >= 1000000000 && x < 1000000000)
        {
            result = 10;
        }
        else
        {
            System.out.println("Number is greater than 10 billion.");
        }
        System.out.println("Result: " + result);
    }
}