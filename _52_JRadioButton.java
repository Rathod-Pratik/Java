import java.awt.FlowLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;

public class _52_JRadioButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout());

        JRadioButton maleButton = new JRadioButton("Male");
        JRadioButton femaleButton = new JRadioButton("Female");

        ButtonGroup GenderGroup = new ButtonGroup();
        GenderGroup.add(femaleButton);
        GenderGroup.add(maleButton);

        JButton submiButton = new JButton("Submit");
        JLabel resultLabel = new JLabel("Selected : None");

        submiButton.addActionListener(e -> {
            if (maleButton.isSelected()) {
                resultLabel.setText("Selected : Male");
            } else if (femaleButton.isSelected()) {
                resultLabel.setText("Selected: Female");
            } else {
                resultLabel.setText("No selection");
            }

        });

        frame.add(maleButton);
        frame.add(femaleButton);
        frame.add(submiButton);
        frame.add(resultLabel);

        frame.setVisible(true);
    }
}
