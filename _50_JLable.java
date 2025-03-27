import javax.swing.JFrame;
import javax.swing.JLabel;

public class _50_JLable {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);

        JLabel lable = new JLabel("Hello this is a JLabel");

        lable.setHorizontalAlignment(JLabel.CENTER);

        frame.add(lable);

        frame.setVisible(true);
    }
    
}
