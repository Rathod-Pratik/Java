import javax.swing.*;
import java.awt.*;

public class _44_CardLayout {
    public static void main(String[] args) {
        // Create the main frame (window)
        JFrame frame = new JFrame("CardLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Create a CardLayout instance and a container panel
        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);

        // Create cards (panels) to add to the CardLayout
        JPanel card1 = new JPanel();
        card1.add(new JLabel("This is Card 1"));

        JPanel card2 = new JPanel();
        card2.add(new JLabel("This is Card 2"));

        JPanel card3 = new JPanel();
        card3.add(new JLabel("This is Card 3"));

        // Add cards to the cardPanel with unique identifiers
        cardPanel.add(card1, "Card1");
        cardPanel.add(card2, "Card2");
        cardPanel.add(card3, "Card3");

        // Create a panel to hold navigation buttons
        JPanel buttonPanel = new JPanel();
        JButton button1 = new JButton("Show Card 1");
        JButton button2 = new JButton("Show Card 2");
        JButton button3 = new JButton("Show Card 3");

        // Add buttons to the button panel
        buttonPanel.add(button1);
        buttonPanel.add(button2);
        buttonPanel.add(button3);

        // Add ActionListeners to the buttons to navigate between cards
        button1.addActionListener(e -> cardLayout.show(cardPanel, "Card1"));
        button2.addActionListener(e -> cardLayout.show(cardPanel, "Card2"));
        button3.addActionListener(e -> cardLayout.show(cardPanel, "Card3"));

        // Add the card panel and button panel to the frame
        frame.setLayout(new BorderLayout());
        frame.add(cardPanel, BorderLayout.CENTER);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        // Make the frame visible
        frame.setVisible(true);
    }
}
