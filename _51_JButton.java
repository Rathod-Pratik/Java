import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;

public class _51_JButton {
 public static void main(String[] args) {
    JFrame frame = new JFrame("JButton");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(300,200);

    JButton button = new JButton("Click Me");
    button.setFont( new Font("Arial",Font.BOLD,16));
    button.setForeground(Color.white);
    button.setBackground(Color.BLUE);
    button.setToolTipText("Click this button");

    frame.add(button);
    frame.setVisible(true);
 }
}
