import javax.swing.*;
import java.awt.*;

public class _64_Menus {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JMenuBar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // ✅ Create JMenuBar
        JMenuBar menuBar = new JMenuBar();

        // ✅ Create JMenu (Menu Titles)
        JMenu fileMenu = new JMenu("File");
        JMenu editMenu = new JMenu("Edit");
        JMenu helpMenu = new JMenu("Help");

        // ✅ Create JMenuItems (Menu Options)
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem exitItem = new JMenuItem("Exit");

        // ✅ Add ActionListener to "Exit" to close the program
        exitItem.addActionListener(e -> System.exit(0));

        // ✅ Add Items to File Menu
        fileMenu.add(newItem);
        fileMenu.add(openItem);
        fileMenu.addSeparator(); // Adds a separator line
        fileMenu.add(exitItem);

        // ✅ Add Menus to MenuBar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        // ✅ Set MenuBar in JFrame
        frame.setJMenuBar(menuBar);

        frame.setVisible(true);
    }
}
