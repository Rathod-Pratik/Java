import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class _66_ItemEvent {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JCheckBox checkBox = new JCheckBox("Accept Terms");
        checkBox.setBounds(100,100,150,40);

        checkBox.addItemListener( new ItemListener() {
            public void itemStateChanged(ItemEvent e){
            if(e.getStateChange() == e.SELECTED){
                System.out.println("CheckBox Checked");
            }
            else{
                System.out.println("CheckBox unChecked");
            }
        }
        });

        frame.add(checkBox);
        frame.setSize(300,250);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
