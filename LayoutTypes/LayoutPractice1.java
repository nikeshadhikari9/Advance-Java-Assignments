package LayoutTypes;
import javax.swing.*;
import java.awt.*;
public class LayoutPractice1 {
    public static void main(String[] args) {
        JFrame frame= new JFrame("LayoutPractice");
        frame.setSize(400,400);
        frame.setLayout(null);

        JPanel p1=new JPanel();
        p1.setBounds(0,0,200,200);

        JPanel p2=new JPanel();
        p2.setBounds(200,0,200,200);

        JPanel p3=new JPanel();
        p3.setBounds(0,200,200,200);

        JPanel p4=new JPanel();
        p4.setBounds(200,200,200,200);

        p2.setLayout(new FlowLayout());
        JButton b1= new JButton("Login");
        JButton b2= new JButton("Reset");
        b1.setBounds(200,0,100,200);
        b2.setBounds(200,100,100,200);
        b1.setSize(100,200);
        b2.setSize(100,200);
        p2.add(b1);
        p2.add(b2);

        JButton b0= new JButton("Button1");
        b0.setBounds(0,0,200,200);
        b0.setSize(200,200);
        p1.add(b0);

        p3.setLayout(new FlowLayout());
        JButton b3= new JButton("Register");
        JButton b4= new JButton("Reset");
        b3.setSize(100,200);
        b4.setSize(100,200);
        p3.add(b3);
        p3.add(b4);

        JButton b5= new JButton("button2");
        b5.setBounds(200,200,200,200);
        b5.setSize(200,200);
        p4.add(b5);

        frame.add(p1);
        frame.add(p2);
        frame.add(p3);
        frame.add(p4);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
