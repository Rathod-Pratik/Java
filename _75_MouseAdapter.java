import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class _75_MouseAdapter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Click");

        frame.addMouseListener((new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                System.out.println("Mouse click at X:"+e.getX()+" Y:"+e.getY());
            }
        }));
        frame.setSize(400,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setVisible(true);
    }
}