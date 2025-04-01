import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class _73_MouseMotionListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mouse Motion Listener");
        JLabel label = new JLabel("Move the Mouse");

        frame.add(label);

        frame.addMouseMotionListener(new MouseMotionAdapter() {
            public void mouseMoved(MouseEvent e){
                label.setText("Mouse Moved to: " + e.getX() + ", " + e.getY());
            }
        });
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
