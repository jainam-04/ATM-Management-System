package Bank.Management.System;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp extends JFrame implements ActionListener {
    JButton buttonNext;
    JRadioButton radioButton1, radioButton2, radioButtonMarried, radioButtonUnmarried, radioButtonOther;
    JDateChooser dateChooser;
    JTextField textFieldName, textFieldFatherName, textFieldEmail, textFieldAddress, textFieldCity, textFieldPIN, textFieldState;
    Random random = new Random();
    long firstFour = (random.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(firstFour);
    SignUp(){
        super("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel label1 = new JLabel("APPLICATION FORM NO." + first);
        label1.setBounds(160, 20, 600, 40);
        label1.setFont(new Font("Railway", Font.BOLD, 38));
        add(label1);

        JLabel label2 = new JLabel("Page 1");
        label2.setFont(new Font("Railway", Font.BOLD, 22));
        label2.setBounds(330, 70, 600, 30);
        add(label2);

        JLabel label3 = new JLabel("Personal Details");
        label3.setBounds(290, 90, 600, 30);
        label3.setFont(new Font("Railway", Font.BOLD, 22));
        add(label3);

        JLabel labelName = new JLabel("Name :");
        labelName.setFont(new Font("Railway", Font.BOLD, 20));
        labelName.setBounds(100, 190, 100, 30);
        add(labelName);

        textFieldName = new JTextField();
        textFieldName.setFont(new Font("Railway", Font.BOLD, 14));
        textFieldName.setBounds(300, 190, 400, 30);
        add(textFieldName);

        JLabel labelFatherName = new JLabel("Father's Name :");
        labelFatherName.setFont(new Font("Railway", Font.BOLD, 20));
        labelFatherName.setBounds(100, 240, 200, 30);
        add(labelFatherName);

        textFieldFatherName = new JTextField();
        textFieldFatherName.setFont(new Font("Railway", Font.BOLD, 14));
        textFieldFatherName.setBounds(300, 240, 400, 30);
        add(textFieldFatherName);

        JLabel labelDOB = new JLabel("Date Of Birth :");
        labelDOB.setFont(new Font("Railway", Font.BOLD, 20));
        labelDOB.setBounds(100, 290, 200, 30);
        add(labelDOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 290, 400, 30);
        add(dateChooser);

        JLabel labelGender = new JLabel("Gender :");
        labelGender.setFont(new Font("Railway", Font.BOLD, 20));
        labelGender.setBounds(100, 340, 200, 30);
        add(labelGender);

        radioButton1 = new JRadioButton("Male");
        radioButton1.setBackground(new Color(222, 255, 228));
        radioButton1.setFont(new Font("Railway", Font.BOLD, 14));
        radioButton1.setBounds(300, 340, 60, 30);
        add(radioButton1);

        radioButton2 = new JRadioButton("Female");
        radioButton2.setBackground(new Color(222, 255, 228));
        radioButton2.setFont(new Font("Railway", Font.BOLD, 14));
        radioButton2.setBounds(450, 340, 90, 30);
        add(radioButton2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);

        JLabel labelEmail = new JLabel("Email Address :");
        labelEmail.setBounds(100, 390, 200, 30);
        labelEmail.setFont(new Font("Railway", Font.BOLD, 20));
        add(labelEmail);

        textFieldEmail = new JTextField();
        textFieldEmail.setFont(new Font("Railway", Font.BOLD, 14));
        textFieldEmail.setBounds(300, 390, 400, 30);
        add(textFieldEmail);

        JLabel labelMarried = new JLabel("Married Status :");
        labelMarried.setBounds(100, 440, 200, 30);
        labelMarried.setFont(new Font("Railway", Font.BOLD, 20));
        add(labelMarried);

        radioButtonMarried = new JRadioButton("Married");
        radioButtonMarried.setBackground(new Color(222, 255, 228));
        radioButtonMarried.setFont(new Font("Railway", Font.BOLD, 14));
        radioButtonMarried.setBounds(300, 440, 100, 30);
        add(radioButtonMarried);

        radioButtonUnmarried = new JRadioButton("Unmarried");
        radioButtonUnmarried.setBackground(new Color(222, 255, 228));
        radioButtonUnmarried.setFont(new Font("Railway", Font.BOLD, 14));
        radioButtonUnmarried.setBounds(450, 440, 100, 30);
        add(radioButtonUnmarried);

        radioButtonOther = new JRadioButton("Other");
        radioButtonOther.setBackground(new Color(222, 255, 228));
        radioButtonOther.setFont(new Font("Railway", Font.BOLD, 14));
        radioButtonOther.setBounds(600, 440, 100, 30);
        add(radioButtonOther);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(radioButtonMarried);
        buttonGroup1.add(radioButtonUnmarried);
        buttonGroup1.add(radioButtonOther);

        JLabel labelAddress = new JLabel("Address :");
        labelAddress.setBounds(100, 490, 200, 30);
        labelAddress.setFont(new Font("Railway", Font.BOLD, 20));
        add(labelAddress);

        textFieldAddress = new JTextField();
        textFieldAddress.setFont(new Font("Railway", Font.BOLD, 14));
        textFieldAddress.setBounds(300, 490, 400, 30);
        add(textFieldAddress);

        JLabel labelCity = new JLabel("City :");
        labelCity.setBounds(100, 540, 200, 30);
        labelCity.setFont(new Font("Railway", Font.BOLD, 20));
        add(labelCity);

        textFieldCity = new JTextField();
        textFieldCity.setFont(new Font("Railway", Font.BOLD, 14));
        textFieldCity.setBounds(300, 540, 400, 30);
        add(textFieldCity);

        JLabel labelPIN = new JLabel("PIN Code :");
        labelPIN.setBounds(100, 590, 200, 30);
        labelPIN.setFont(new Font("Railway", Font.BOLD, 20));
        add(labelPIN);

        textFieldPIN = new JTextField();
        textFieldPIN.setFont(new Font("Railway", Font.BOLD, 14));
        textFieldPIN.setBounds(300, 590, 400, 30);
        add(textFieldPIN);

        JLabel labelState = new JLabel("State :");
        labelState.setBounds(100, 640, 200, 30);
        labelState.setFont(new Font("Railway", Font.BOLD, 20));
        add(labelState);

        textFieldState = new JTextField();
        textFieldState.setFont(new Font("Railway", Font.BOLD, 14));
        textFieldState.setBounds(300, 640, 400, 30);
        add(textFieldState);

        buttonNext = new JButton("Next");
        buttonNext.setFont(new Font("Railway", Font.BOLD, 14));
        buttonNext.setBackground(Color.BLACK);
        buttonNext.setForeground(Color.WHITE);
        buttonNext.setBounds(620, 710, 80, 30);
        buttonNext.addActionListener(this);
        add(buttonNext);

        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String formNo = first;
        String name = textFieldName.getText();
        String fatherName = textFieldFatherName.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(radioButton1.isSelected()){
            gender = "Male";
        }
        else{
            gender = "Female";
        }
        String email = textFieldEmail.getText();
        String marriedStatus = null;
        if(radioButtonMarried.isSelected()){
            marriedStatus = "Married";
        }
        else if(radioButtonUnmarried.isSelected()){
            marriedStatus = "Unmarried";
        }
        else{
            marriedStatus = "Other";
        }
        String address = textFieldAddress.getText();
        String city = textFieldCity.getText();
        String pin = textFieldPIN.getText();
        String state = textFieldState.getText();
        try{
            if(name.equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the fields!");
            }
            else{
                JDBCConnection connection = new JDBCConnection();
                String query = "insert into signup values('"+formNo+"', '"+name+"', '"+fatherName+"', '"+dob+"', '"+gender+"', '"+email+"', '"+marriedStatus+"', '"+address+"', '"+city+"', '"+pin+"', '"+state+"')";
                connection.statement.executeUpdate(query);
                new Signup2(first);
                setVisible(false);
            }
        }
        catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignUp();
    }
}
