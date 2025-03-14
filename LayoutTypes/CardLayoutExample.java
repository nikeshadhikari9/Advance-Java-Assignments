package LayoutTypes;
import javax.swing.*;
import java.awt.*;

public class CardLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("CardLayout Example");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        CardLayout cardLayout = new CardLayout();
        JPanel cardPanel = new JPanel(cardLayout);

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.RED);
        panel1.add(new JLabel("This is Panel 1"));

        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.BLUE);
        panel2.add(new JLabel("This is Panel 2"));

        JPanel panel3 = new JPanel();
        panel3.setBackground(Color.GREEN);
        panel3.add(new JLabel("This is Panel 3"));

        cardPanel.add(panel1, "Card1");
        cardPanel.add(panel2, "Card2");
        cardPanel.add(panel3, "Card3");

        JButton nextButton = new JButton("Next");
        nextButton.addActionListener(e -> cardLayout.next(cardPanel));

        JButton prevButton = new JButton("Previous");
        prevButton.addActionListener(e -> cardLayout.previous(cardPanel));

        frame.setLayout(new BorderLayout());
        frame.add(cardPanel, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(prevButton);
        buttonPanel.add(nextButton);
        frame.add(buttonPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}

