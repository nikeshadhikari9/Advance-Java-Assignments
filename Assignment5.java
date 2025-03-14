//Write a GUI application to find greatest and smallest of two integer numbers.
//Use two text fields for input and label (Arial, BOLD, 18) for output.
//Your program should display greater number if the users press the key and smallest if the users release the key.
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Assignment5 implements KeyListener {
    JFrame f1;
    JTextField t1,t2;
    JLabel l1,l2,l3;
    Assignment5(){
        f1= new JFrame("Comparison Program");
        l1= new JLabel("First Number");
        l2= new JLabel("Second Number");
        l3= new JLabel("");
        t1 = new JTextField();
        t2 = new JTextField();
        l1.setBounds(50,50,80,30);
        t1.setBounds(150, 50, 80, 30);
        l2.setBounds(50,100,100,30);
        t2.setBounds(170, 100, 80, 30);
        l3.setBounds(50, 150, 100, 30);
        l3.setFont(new Font("Arial",Font.BOLD,18));
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);
        f1.add(t1);
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(t2);
        t1.addKeyListener(this);
        t2.addKeyListener(this);
        f1.setVisible(true);
    }
    private int getValidNumber(String text) {
        if (text.isEmpty()) return 0;
        try {
            return Integer.parseInt(text);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
    public int greaterNum(){
        int num1=getValidNumber(t1.getText());
        int num2=getValidNumber(t2.getText());
        return Math.max(num1,num2);
    }
    public int smallerNum(){
        int num1=getValidNumber(t1.getText());
        int num2=getValidNumber(t2.getText());
        return Math.min(num1,num2);
    }

    public static void main(String[] args) {
        new Assignment5();
    }
    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        int greater=greaterNum();
        l3.setText("Result:"+greater);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int smaller=smallerNum();
        l3.setText("Result:"+smaller);
    }
}
