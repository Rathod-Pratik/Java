import javax.swing.*;
import java.awt.*;

public class _42_BorderLayout {
    public static void main(String[] args) {
        JFrame frame=new JFrame("BorderLayout");
        frame.setLayout(new BorderLayout());
        frame.add(new JButton("Button 1"),BorderLayout.NORTH);
        frame.add(new JButton("Button 2"),BorderLayout.SOUTH);
        frame.add(new JButton("Button 3"), BorderLayout.EAST);
        frame.add(new JButton("Button 3"), BorderLayout.WEST);
        frame.add(new JButton("Button 3"), BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

