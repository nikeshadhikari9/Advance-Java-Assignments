import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

//Write a GUI application to find sum and difference of two integer numbers.
// Use two text fields for input and third text field for output.
// Your program should display sum if the users press the mouse and difference if the users release the mouse.
public class Assignment4 implements MouseListener {

    JFrame f1;
    JTextField t1,t2,t3;
    JLabel l1,l2,l3;

    Assignment4(){
        f1= new JFrame("Calculator");
        l1= new JLabel("First Number");
        l2= new JLabel("Second Number");
        l3= new JLabel("Result");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        l1.setBounds(50,50,80,30);
        t1.setBounds(150, 50, 80, 30);
        l2.setBounds(50,100,100,30);
        t2.setBounds(170, 100, 80, 30);
        l3.setBounds(50, 150, 80, 30);
        t3.setBounds(100, 150, 80, 30);
        f1.setSize(300,300);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(null);
        f1.add(t1);
        f1.add(l1);
        f1.add(l2);
        f1.add(l3);
        f1.add(t2);
        f1.add(t3);
        f1.addMouseListener(this);
        f1.setVisible(true);
    }

    public static void main(String[] args) {
        new Assignment4();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());
        int result=num1+num2;
        t3.setText(String.valueOf(result));

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        int num1=Integer.parseInt(t1.getText());
        int num2=Integer.parseInt(t2.getText());
        int result=num1-num2;
        t3.setText(String.valueOf(result));
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
