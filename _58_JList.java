import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;

public class _58_JList {
    public static void main(String[] args) {
        JFrame  frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,300);
        frame.setLayout(new FlowLayout());

        String[] language ={"Java","Python","C++","JavaScript","C#"};
        JList<String> list= new JList<>(language);

        list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        JScrollPane scrollPane = new JScrollPane(list);
        scrollPane.setPreferredSize(new Dimension(150,100));

        JButton button = new JButton("Submit");
        JLabel result = new JLabel("Selected: None");

        button.addActionListener(e->{
            java.util.List<String> selectedValues=list.getSelectedValuesList();

            result.setText("Selected :"+ selectedValues);
        });

        frame.add(scrollPane);
        frame.add(button);
        frame.add(result);

        frame.setVisible(true);
    }
}
