import javax.swing.JButton;
import javax.swing.JFrame;

public class _65_ActionEvent {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ActionEvent");
        JButton button = new JButton("Click Me");

        button.setBounds(100,100,120,40);

        button.addActionListener(e->{
            System.out.println("Button clicked Action Command: "+e.getActionCommand() );
        });

        frame.add(button);
        frame.setSize(300,200);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
