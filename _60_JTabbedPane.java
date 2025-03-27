import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class _60_JTabbedPane {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);

        JTabbedPane tabbedPane = new JTabbedPane();
        JPanel panel1= new JPanel();
        panel1.add(new JLabel("This is Tab 1"));
        JPanel panel2= new JPanel();
        panel2.add(new JLabel("This is Tab 2"));
        JPanel panel3= new JPanel();
        panel3.add(new JLabel("This is Tab 3"));

        tabbedPane.add(panel1);
        tabbedPane.add(panel2);
        tabbedPane.add(panel3);

        frame.add(tabbedPane);
        frame.setVisible(true);
    }
}
