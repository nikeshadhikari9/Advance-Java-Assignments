package LayoutTypes;
import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample {
    public static void main(String[] args) {
        JFrame frame= new JFrame("FlowLayout Example");
        frame.setLayout(new FlowLayout());
        JButton b1= new JButton("button1");
        JButton b2= new JButton("button2");
        JButton b3= new JButton("button3");
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.setSize(300,200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
