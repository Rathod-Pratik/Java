import java.awt.event.*;
import javax.swing.*;

public class _72_WindowListener {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Window Listener");

        frame.addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent  e){
                System.out.println("window is closing");
                frame.dispose();
            }
        });
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setVisible(true);
    }
}
