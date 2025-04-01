import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class _76_MouseMotionAdapter {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel label = new JLabel("Move Mouse");

        frame.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e) {
                label.setText("Mouse at X: " + e.getX() + ", Y: " + e.getY());

            }
        });

        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 300);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}
