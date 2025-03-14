//Create a menu bar
import javax.swing.*;
import java.awt.*;

public class Assignment13 {
   JFrame f1;
   JMenuBar menuBar;
   JMenu m1,mItem4;
   JMenuItem mItem1, mItem2, mItem3,jpeg,png,pdf;
    Assignment13(){
        f1= new JFrame("Menu Bar");
        f1.setSize(300,300);
        f1.setLayout(new GridLayout());
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m1= new JMenu("File");

        menuBar= new JMenuBar();
        mItem1= new JMenuItem("New");
        mItem2= new JMenuItem("Open");
        mItem3= new JMenuItem("Save");
        mItem4= new JMenu("Save-as");

        jpeg= new JMenuItem(".jpeg");
        png= new JMenuItem(".png");
        pdf= new JMenuItem(".pdf");

        m1.add(mItem1);
        m1.add(mItem2);
        m1.add(mItem3);
        m1.add(mItem4);

        mItem4.add(jpeg);
        mItem4.add(png);
        mItem4.add(pdf);

        f1.setJMenuBar(menuBar);
        menuBar.add(m1);

        f1.setVisible(true);

    }

    public static void main(String[] args) {
        new Assignment13();
    }
}
