//Write a GUI application to find factorial of n number.
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assignment10 {
    JFrame f1;
    JTextField t1;
    JButton b1;
    JLabel l1,l2;
    Assignment10(){
        f1= new JFrame("Factorial Calculator");
        b1= new JButton("Calculate");
        l1= new JLabel("Enter a Number:");
        l2= new JLabel("");
        t1= new JTextField();
        f1.setLayout(null);
        f1.setSize(400,400);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1.setBounds(10,50,100,30);
        t1.setBounds(130,50,100,30);
        b1.setBounds(10,100,100,30);
        l2.setBounds(10,150,250,30);
        f1.add(l1);
        f1.add(t1);
        f1.add(b1);
        f1.add(l2);
        f1.setVisible(true);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int num=Integer.parseInt(t1.getText());
                int result=factorial(num);
                l2.setText("Factorial of "+num+" is: "+String.valueOf(result));
            }
        });
    }
    public int factorial(int num){
        if(num==0||num==1){
            return 1;
        }
        return num*factorial(num-1);
    }

    public static void main(String[] args) {
        new Assignment10();
    }
}
