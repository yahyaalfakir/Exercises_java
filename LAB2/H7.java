
public class Lab2Q7 {
    public static void main(String[] args)
    {
     String X = "Hello";
        System.out.println(X);

        int n = X.length();

        // Fing The first char
        char first = X.charAt(0);
        System.out.println(first);

        // Find The last char
        char last = X.charAt(n - 1);
        System.out.println(last);

        // Remove The First Char
        String remove_first = X.substring(1);
        System.out.println(remove_first);

        // Remove The Last Char
        String remove_last = X.substring(0,4);
        System.out.println(remove_last);


    }
}