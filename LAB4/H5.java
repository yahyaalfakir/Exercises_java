//Home work question 10
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class lab
{

        public static void main(String[] args) {

                JFrame frame = new JFrame();
                frame.setSize(400, 400);
                JLabel label = new JLabel("Hello, your name!");
                label.setOpaque(true);
                label.setBackground(Color.green);
                 frame.add(label);
                 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                  frame.setVisible(true);
    }
}















