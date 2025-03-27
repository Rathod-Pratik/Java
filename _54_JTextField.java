import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class _54_JTextField  {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setLayout(new FlowLayout());

        JTextField textField = new JTextField(20);

        JButton button = new JButton("Submit");
        JLabel result = new JLabel("Entered Text");

        button.addActionListener(e->{
            String text= textField.getText();
            result.setText("Entered text :"+text);
        });

        frame.add(textField);
        frame.add(button);
        frame.add(result);

        frame.setVisible(true);
    }
}
