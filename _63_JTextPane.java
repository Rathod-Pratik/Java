import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextPane;

public class _63_JTextPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLayout(new BorderLayout());

        JTextPane textPane = new JTextPane();
        textPane.setText("This is a JTextPane");
        
        textPane.setForeground(Color.BLUE);
        textPane.setBackground(Color.LIGHT_GRAY);

        JScrollPane scrollPane = new JScrollPane(textPane);

        frame.add(scrollPane,BorderLayout.CENTER);
        frame.setVisible(true);
    }
}
