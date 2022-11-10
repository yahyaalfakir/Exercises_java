import javax.swing.JOptionPane;
public class Lab1Q9 {
    public static void main(String[] args) {
      
       int fnumb = JOptionPane.showInputDialog("What is the first number?");
       int snumb = JOptionPane.showInputDialog("What is the second number?");

        System.out.println("the sum : " +  fnumb + snumb + ".");
        System.out.println("the difference : " +  fnumb - snumb + ".");
        System.out.println("the product : " +  fnumb / snumb + ".");
        System.out.println("the average : " +  (fnumb + snumb)/2 + ".");
        System.out.println("the distance : " +  fnumb * snumb + ".");

    } }