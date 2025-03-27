import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class _55_JPasswordField {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setLayout(new FlowLayout());

        JPasswordField passwordField = new JPasswordField(15);
        JButton button = new JButton("Submit");
        JLabel result = new JLabel("Enter Password :");

        button.addActionListener(e->{
            char[] password =passwordField.getPassword();
            String text= new String(password);
            result.setText("Password :" + text);
        });

        frame.add(passwordField);
        frame.add(button);
        frame.add(result);
        frame.setVisible(true);
    }
}
