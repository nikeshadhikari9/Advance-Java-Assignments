//Create a Java Swing application where the background color of a JPanel changes when the mouse hovers over it.
//Use a MouseListener to detect when the mouse enters and exits the JPanel, and change the color accordingly.
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Assignment8 extends MouseAdapter {
   JFrame f1;
   JPanel p1;
    Assignment8(){
        f1= new JFrame("Background Changer");
        p1= new JPanel();
        f1.setSize(400,400);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        p1.setBounds(100,100,200,200);
        p1.setBackground(Color.RED);
        f1.add(p1);
        p1.addMouseListener(this);
        f1.setVisible(true);
    }

    public static void main(String[] args) {
        new Assignment8();
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        p1.setBackground(Color.GREEN);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        p1.setBackground(Color.BLUE);
    }
}
