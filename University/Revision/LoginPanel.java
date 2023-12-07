import javax.swing.*;
import java.awt.*;
public class LoginPanel extends JPanel {
    JTextField tf = new JTextField(20);
    JPasswordField pf = new JPasswordField(20);
    LoginPanel() {
        setLayout(new GridLayout(0, 1, 10, 10));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20)); //optional
        add(new JLabel("welcome to Log in page"));
        add(new JLabel("Email address"));
        add(tf);
        add(new JLabel("Password"));
        add(pf);
        add(new JButton("Log in"));
    }
    public static void main(String[] args) {
        JFrame f = new JFrame("Login Form");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(new LoginPanel());
        f.setSize(450, 450);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}
