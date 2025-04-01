import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class _71_KeyListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame("KeyListener");
        JTextField textField = new JTextField(20);
        textField.addKeyListener(new KeyListener() {
            public void keyTyped(KeyEvent e) {
                System.out.println("Key Typed: " + e.getKeyChar());
            }

            public void keyPressed(KeyEvent e) {
                System.out.println("Key Pressed: " + e.getKeyCode());
            }

            public void keyReleased(KeyEvent e) {
                System.out.println("Key Released: " + e.getKeyCode());
            }
        });
        frame.add(textField);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 250);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
