import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
// Build a simple counter application using Java Swing.
// The application should have A JLabel that displays the current count (initially set to 0).
// Two JButtons labeled "Increment" and "Decrement". Clicking the "Increment" button should increase the count by 1,
// and clicking the "Decrement" button should decrease the count by 1.
public class Assignment6  {
    int count=0;
    JFrame f1;
    JLabel l1;
    JButton b1,b2,b3;
    Assignment6(){
        f1=new JFrame("Counter Program");
        l1= new JLabel("Count: ");
        b1= new JButton("Increment");
        b2= new JButton("Decrement");
        f1.setSize(400,400);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1.setBounds(100,100,150,30);
        b1.setBounds(50,150,150,30);
        b2.setBounds(220,150,150,30);
        f1.add(l1);
        f1.add(b1);
        f1.add(b2);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                l1.setText("Count: "+count);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                l1.setText("Count: "+count);
            }
        });
        f1.setVisible(true);
    }
    public static void main(String[] args) {
        new Assignment6();
    }
}
