import java.util.Scanner ;
public class Lab3Q1 {
    public static void main(String[] args) {
        float salary = 9.25;
        float hour;
        float total;
        System.out.print("Enter the hours are employed: ");
        hour = in.nextInt();
       
        if (hour>40) {
        	total = salary * hour;
        	total = total * 0.150;
        	System.out.print(total);
        } else {
        
        	total = salary * hour;
        	System.out.print(total);
        }

    }
}