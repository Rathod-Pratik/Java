import java.awt.FlowLayout;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class _77_FocusAdapter {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JTextField textField = new JTextField(20);
        textField.addFocusListener(new FocusAdapter() {
            public void focusGained(FocusEvent e){
                System.out.println("Text field gained focus");
            }
        });

        frame.add(textField);
        frame.setSize(400,200);
        frame.setLayout(new FlowLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
