import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class _49_JPanel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        JPanel panel = new JPanel();
        panel.setBackground(Color.pink);
        panel.setLayout(new FlowLayout());

        //Make component
        JLabel lable =new JLabel("Enter your name:");
        JTextField textField=new JTextField(15);
        JButton button= new JButton("Submit");

        //add component to panel
        panel.add(lable);
        panel.add(textField);
        panel.add(button);

        //add panel to frame
        frame.add(panel);
        frame.setVisible(true);
    }
}