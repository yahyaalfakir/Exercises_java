import java.util.Scanner;

public class Lab3Q7
{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = in.nextInt();
        System.out.print("Enter second number: ");
        int b = in.nextInt();
        System.out.print("Enter third number: ");
        int c = in.nextInt();

        int max = -1, mid = -1, min = -1;
        if (a > b) {
            if (a > c) {
                max = a;
                if (b > c) {
                    mid = b;
                    min = c;
                }
                else {
                    mid = c;
                    min = b;
                }
            }
            else {
                max = c;
                mid = a;
                min = b;
            }
        }
        else {
            if (b > c) {
                max = b;
                if (a > c) {
                    mid = a;
                    min = c;
                }
                else {
                    {
                        mid = c;
                        min = a;
                    }
                }
            }
            else {
                max = c;
                mid = b;
                min = a;
            }
        }

        System.out.println("Numbers in Descending order:");
        System.out.println(max + " " + mid + " " + min);
    }
}