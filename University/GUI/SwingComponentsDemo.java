import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingComponentsDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Components Demo");
        JLabel label = new JLabel();
        label.setText("salam roki bhai");
        label.setText("salam talto bhai");
        frame.getContentPane().add(label);
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);//widnow location in windows center 
    }
}
