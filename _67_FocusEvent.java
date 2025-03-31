import javax.swing.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

public class _67_FocusEvent {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Focus Event");
        JTextField textField = new JTextField("Click Me");

        textField.setBounds(100,100,150,30);
        textField.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                System.out.println("Focus Gained!");
            }
        
            @Override
            public void focusLost(FocusEvent e) {
                System.out.println("Focus Lost!");
            }
        });

        frame.add(textField);
        frame.setSize(300,250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
