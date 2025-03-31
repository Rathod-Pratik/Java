import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

public class _70_TextEvent {
    public static void main(String[] args) {
    Frame frame = new Frame("TextEvent");
    TextField textField = new TextField();
    textField.setBounds(100,100,150,30);

    textField.addTextListener(new TextListener() {
        public void textValueChanged(TextEvent e){
            System.out.println("Text Changed: "+textField.getText());
        }
    });
    frame.addWindowListener(new WindowAdapter() {
        public void windowClosing(WindowEvent e) {
            frame.dispose(); // Closes the frame
        }
    });

    frame.add(textField);
    frame.setSize(300,250);
    frame.setLayout(null);
    
    frame.setVisible(true);
    }
}
