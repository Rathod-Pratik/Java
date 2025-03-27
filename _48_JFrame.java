import javax.swing.*;
import java.awt.*;

public class _48_Frame {
    public static void main(String[] args) {
        // Create the main frame (window)
        JFrame frame = new JFrame();
        
        frame.setTitle("JFrame title"); // Set the title of the frame

        ImageIcon image = new ImageIcon("C:\\Users\\Lenovo\\Downloads\\SunShine.jpg"); // Create an imageIcon

        frame.setIconImage(image.getImage()); // Set icon

        // frame.getContentPane().setBackground(Color.cyan); //Change color of Cyan

        frame.getContentPane().setBackground(new Color(115, 125, 140)); // Set rdb color

        frame.setSize(420, 420); // Set height and width of frame

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Set event for close button

        frame.setResizable(false); // prevent frame resize

        frame.setVisible(true); // Visible frame
    }
}
