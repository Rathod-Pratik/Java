import javax.swing.*;
import java.awt.*;

public class _62_JProgressBar {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setLayout(new FlowLayout());

        JProgressBar progressBar= new JProgressBar(0,100);
        progressBar.setStringPainted(true);

        JButton button = new JButton("Start Progress");

        button.addActionListener(e ->{
            for(int i=1;  i<=100; i++){
                progressBar.setValue(i);
            }
        });
        frame.add(progressBar);
        frame.add(button);
        frame.setVisible(true);
    }
}
