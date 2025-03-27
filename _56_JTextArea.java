import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class _56_JTextArea {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setLayout(new FlowLayout());

        JTextArea textArea= new JTextArea(5,20);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);

        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setPreferredSize((new Dimension(300,100)));

        JButton button= new JButton("Submit");
        JLabel result = new JLabel("Text :");

        button.addActionListener(e->{
            String text= textArea.getText();
            result.setText("You entered :"+text);
        });

        frame.add(scrollPane);
        frame.add(button);
        frame.add(result);

        frame.setVisible(true);
    }
    
}
