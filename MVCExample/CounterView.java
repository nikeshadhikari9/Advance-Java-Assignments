package MVCExample;

import javax.swing.*;
import java.awt.*;

public class CounterView {
    private JLabel label;
    private JButton button;
    private JFrame frame;

    public CounterView() {
        frame = new JFrame("Simple MVC Example");
        button = new JButton("Click Me!");
        label = new JLabel("0");

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);
        button.setBounds(50, 50, 100, 30);
        label.setBounds(100, 90, 100, 40);

        frame.add(button);
        frame.add(label);

        frame.setVisible(true);
    }

    public JLabel getLabel() {
        return label;
    }

    public JButton getButton() {
        return button;
    }

    public void setLabelText(String text) {
        label.setText(text);
    }
}
