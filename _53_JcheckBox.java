import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class _53_JcheckBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setLayout(new FlowLayout());

        JCheckBox javaCheckBox= new JCheckBox("Java");
        JCheckBox PythonCheckBox = new JCheckBox("python");
        JCheckBox cppCheckBox = new JCheckBox("C++");

        ButtonGroup group= new ButtonGroup();
        group.add(cppCheckBox);
        group.add(PythonCheckBox);
        group.add(javaCheckBox);

        JButton button = new JButton("Submit");
        JLabel result = new JLabel("Select");

        button.addActionListener(e ->{
            if(javaCheckBox.isSelected()){
                result.setText("Java");
            }
            else if(PythonCheckBox.isSelected()){
                result.setText("Python");
            }
            else if(cppCheckBox.isSelected()){
                result.setText("C++");
            }
            else{
                result.setText("Please select");
            }
        });

        frame.add(javaCheckBox);
        frame.add(PythonCheckBox);
        frame.add(cppCheckBox);
        frame.add(button);
        frame.add(result);

        frame.setVisible(true);
    }
}
