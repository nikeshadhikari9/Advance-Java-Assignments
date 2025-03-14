//Develop a temperature converter application using Java Swing.
// The application should include a JTextField for entering temperature in Celsius.
// A JButton labeled "Convert to Fahrenheit". A JLabel for displaying the converted temperature.
// When the "Convert to Fahrenheit" button is clicked, convert the input temperature to Fahrenheit and display the result in the JLabel.
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assignment7 {

    JFrame f1;
    JButton b1;
    JTextField t1;
    JLabel l1,l2;

    Assignment7(){
        f1= new JFrame("Temperature Converter");
        b1= new JButton("Convert to Fahrenheit");
        t1= new JTextField();
        l1= new JLabel("Temperature in Celsius:");
        l2= new JLabel("");
        f1.setSize(400,400);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1.setBounds(50,50,150,30);
        t1.setBounds(210,50,100,30);
        b1.setBounds(100,100,180,30);
        l2.setBounds(50,150,200,30);
        f1.add(l1);
        f1.add(t1);
        f1.add(b1);
        f1.add(l2);
        f1.setVisible(true);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double tempInCelsius=Double.parseDouble(t1.getText());
                double tempInFahrenheit=(tempInCelsius*9/5)+32;
                l2.setText("Temperature in Fahrenheit: "+String.valueOf(tempInFahrenheit));
            }
        });
    }

    public static void main(String[] args) {
        new Assignment7();
    }
}
