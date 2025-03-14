import javax.swing.*;
import java.awt.*;

public class Assignment14 {
    JFrame f1;
    JLabel title, name, mobile, gender, dob, address;
    JTextField nameField, mobileField;
    JRadioButton male, female;
    JComboBox<String> day, month, year;
    JTextArea addressArea;
    JCheckBox cTerms;
    JButton submit, reset;
    JPanel  p1;

    public Assignment14() {
        f1 = new JFrame("Registration Form");
        f1.setSize(800, 515);
        f1.setLayout(null);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        title = new JLabel("Registration Form");
        title.setFont(new Font("Arial", Font.BOLD, 24));
        title.setBounds(250, 20, 250, 30);
        f1.add(title);

        name = new JLabel("Name");
        name.setFont(new Font("Arial", Font.BOLD, 16));
        name.setBounds(50, 70, 100, 30);
        f1.add(name);

        nameField = new JTextField();
        nameField.setBounds(150, 70, 200, 30);
        f1.add(nameField);

        mobile = new JLabel("Mobile");
        mobile.setFont(new Font("Arial", Font.BOLD, 16));
        mobile.setBounds(50, 110, 100, 30);
        f1.add(mobile);

        mobileField = new JTextField();
        mobileField.setBounds(150, 110, 200, 30);
        f1.add(mobileField);

        gender = new JLabel("Gender");
        gender.setFont(new Font("Arial", Font.BOLD, 16));
        gender.setBounds(50, 150, 100, 30);
        f1.add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font("Arial", Font.PLAIN, 12));
        female = new JRadioButton("Female");
        female.setFont(new Font("Arial", Font.PLAIN, 12));
        male.setBounds(150, 150, 80, 30);
        female.setBounds(230, 150, 80, 30);
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        f1.add(male);
        f1.add(female);

        dob = new JLabel("DOB");
        dob.setFont(new Font("Arial", Font.BOLD, 16));
        dob.setBounds(50, 190, 100, 30);
        f1.add(dob);

        String[] days = new String[31];
        for (int i = 1; i <= 31; i++) {
            days[i - 1] = String.valueOf(i);
        }
        day = new JComboBox<>(days);
        day.setBounds(150, 190, 50, 30);
        f1.add(day);

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        month = new JComboBox<>(months);
        month.setBounds(210, 190, 60, 30);
        f1.add(month);

        String[] years = new String[50];
        for (int i = 1970; i <= 2010; i++) {
            years[i - 1970] = String.valueOf(i);
        }
        year = new JComboBox<>(years);
        year.setBounds(280, 190, 70, 30);
        f1.add(year);

        address = new JLabel("Address");
        address.setFont(new Font("Arial", Font.BOLD, 16));
        address.setBounds(50, 230, 100, 30);
        f1.add(address);

        addressArea = new JTextArea();
        addressArea.setBounds(150, 230, 200, 50);
        f1.add(addressArea);

        cTerms = new JCheckBox("Accept Terms And Conditions");
        cTerms.setBounds(100, 300, 250, 30);
        f1.add(cTerms);

        submit = new JButton("Submit");
        submit.setBounds(100, 350, 100, 30);
        f1.add(submit);

        reset = new JButton("Reset");
        reset.setBounds(230, 350, 100, 30);
        f1.add(reset);

        p1= new JPanel();
        p1.setBounds(400,70,300,340);
        p1.setBackground(Color.white);
        f1.add(p1);
        f1.setVisible(true);
    }

    public static void main(String[] args) {
        new Assignment14();
    }
}
