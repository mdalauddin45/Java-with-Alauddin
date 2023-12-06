import javax.swing.*;
import java.awt.*;
/**
 * GUI_Example
 */
public class GUI_Example {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.setTitle("BGC Is roks");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ImageIcon image = new ImageIcon("logo.png");
        frame.setIconImage(image.getImage());
        frame.getContentPane().setBackground(new Color(123, 20, 250));
    }
}