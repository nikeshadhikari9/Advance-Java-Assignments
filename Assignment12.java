import javax.swing.*;
public class Assignment12 {
    public static void main(String[] args) {
        JFrame f1= new JFrame("Displaying Image");
        ImageIcon image1= new ImageIcon("C:\\@Desktop\\6th semester\\Advance JAVA\\Assignment\\src\\drinks.png");
        JLabel l1=new JLabel(image1);
        f1.setSize(700,750);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1.setBounds(10, 10, image1.getIconWidth(), image1.getIconHeight());
        f1.add(l1);
        f1.setVisible(true);
    }
}
