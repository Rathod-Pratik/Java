import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class _57_JComboBox {
    public static void main(String[] args) {
       JFrame frame = new JFrame();
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(400,200);
       frame.setLayout(new FlowLayout());
       
       String[] languages ={"Java","Python","C++","JavaScript","C#"};
       JComboBox<String> comboBox = new JComboBox<>(languages);

       JButton button =new JButton("Submit");
       JLabel result = new JLabel("Selected: None");

       button.addActionListener(e->{
        String selectedItem =(String) comboBox.getSelectedItem();
        result.setText("Selected: "+ selectedItem);
       });

       frame.add(comboBox);
       frame.add(button);
       frame.add(result);

       frame.setVisible(true);
    }
}
