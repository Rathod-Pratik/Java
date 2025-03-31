import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class _69_MouseWheelEvent {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JLabel label = new JLabel();

        label.setBounds(80,100,200,30);
        frame.addMouseWheelListener(new MouseWheelListener() {
            public void mouseWheelMoved(MouseWheelEvent e){
                label.setText("Wheel moved: "+e.getWheelRotation());
            }
        });
        frame.add(label);
        frame.setSize(300,250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
