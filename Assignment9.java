//Create a Java Swing application that performs arithmetic operations based on user key presses.
//Specifically, if the user presses the 'A' key, the application should add two numbers and display the result.
//If the user presses the 'S' key, it should subtract the second number from the first and display the result.
//The two numbers should be entered via JTextFields.
import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Assignment9 extends KeyAdapter {
    JFrame f1;
    JTextField t1,t2,t3;
    JLabel l1,l2,l3,l4;
    Assignment9(){
        f1= new JFrame("Calculator");
        l1= new JLabel("First Number:");
        l2= new JLabel("Second Number:");
        l3= new JLabel("Enter Key, A for addition, S for subtraction:");
        l4= new JLabel("");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        l1.setBounds(10,50,80,30);
        t1.setBounds(150, 50, 80, 30);
        l2.setBounds(10,100,100,30);
        t2.setBounds(170, 100, 80, 30);
        l3.setBounds(10, 150, 250, 30);
        t3.setBounds(10, 190, 80, 30);
        l4.setBounds(10, 230, 100, 30);
        f1.setSize(300,350);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);
        f1.add(t1);
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(t2);
        f1.add(t3);
        f1.add(l4);
        t3.addKeyListener(this);
        f1.setVisible(true);
    }

    public static void main(String[] args) {
        new Assignment9();
    }

    @Override
    public void keyTyped(KeyEvent e) {
            int num1 = Integer.parseInt(t1.getText());
            int num2 = Integer.parseInt(t2.getText());

            if (e.getKeyChar() == 'A') {
                l4.setText("Addition: "+String.valueOf(num1 + num2));
            } else if (e.getKeyChar() == 'S') {
                l4.setText("Subtraction: "+String.valueOf(num1 - num2));
            }
    }
}
