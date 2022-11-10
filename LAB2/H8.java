import javax.swing.JOptionPane;
public class Lab1Q9 {
    public static void main(String[] args) {
        int heig = JOptionPane.showInputDialog("What is height?");
        int widt = JOptionPane.showInputDialog("What is width?");
        System.out.println("square calculation : " + heig * widt + ".");     
       System.out.println("square cube : " + heig * heig * heig + ".");
      
       int numb = JOptionPane.showInputDialog("What is number?");
        System.out.println("fourth power : " + numb * numb * numb * numb + ".");


    } }