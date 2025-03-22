
    import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class _46_GridBagLayout {
        public static void main(String[] args) {
            // Create the main frame (window)
            JFrame frame = new JFrame("GroupLayout Example");

            // Create a panel and a GroupLayout
            JPanel panel = new JPanel();
            GroupLayout layout = new GroupLayout(panel);
            panel.setLayout(layout);

            // Create buttons
            JButton button1 = new JButton("Button 1");
            JButton button2 = new JButton("Button 2");

            // Configure the horizontal group
            layout.setHorizontalGroup(
                    layout.createSequentialGroup()
                            .addComponent(button1)
                            .addComponent(button2)
            );

            // Configure the vertical group
            layout.setVerticalGroup(
                    layout.createParallelGroup()
                            .addComponent(button1)
                            .addComponent(button2)
            );

            // Add the panel to the frame
            frame.add(panel);
            frame.pack();
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
}
