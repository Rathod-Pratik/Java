import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;

public class _59_JToggleButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setLayout(new FlowLayout());

        JToggleButton button = new JToggleButton("Click me");

        JLabel result = new JLabel("State: OFF");

        button.addActionListener(e->{
            if (button.isSelected()) {
                result.setText("State: ON");
            }
            else {
                result.setText("State: OFF");
            }
        });
        frame.add(button);
        frame.add(result);

        frame.setVisible(true);
    }
}
