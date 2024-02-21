package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SignUp3 extends JFrame implements ActionListener {
    String formNo;
    JRadioButton radioButton1, radioButton2, radioButton3, radioButton4;
    JCheckBox checkBox1, checkBox2, checkBox3, checkBox4, checkBox5, checkBox6, checkBox7;
    JButton buttonSubmit, buttonCancel;
    SignUp3(String first){
        super("APPLICATION FORM");

        this.formNo = first;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        JLabel label1 = new JLabel("Page 3 :- ");
        label1.setBounds(280, 40, 400, 40);
        label1.setFont(new Font("Railway", Font.BOLD, 22));
        add(label1);

        JLabel label2 = new JLabel("Account Details");
        label2.setBounds(280, 70, 400, 40);
        label2.setFont(new Font("Railway", Font.BOLD, 22));
        add(label2);

        JLabel labelAccountType = new JLabel("Account Type :");
        labelAccountType.setBounds(100, 140, 200, 30);
        labelAccountType.setFont(new Font("Railway", Font.BOLD, 18));
        add(labelAccountType);

        radioButton1 = new JRadioButton("Savings Account");
        radioButton1.setBackground(new Color(215, 252, 252));
        radioButton1.setFont(new Font("Railway", Font.BOLD, 16));
        radioButton1.setBounds(100, 180, 200, 30);
        add(radioButton1);

        radioButton2 = new JRadioButton("Fixed Deposit Account");
        radioButton2.setBackground(new Color(215, 252, 252));
        radioButton2.setFont(new Font("Railway", Font.BOLD, 16));
        radioButton2.setBounds(350, 180, 200, 30);
        add(radioButton2);

        radioButton3 = new JRadioButton("Current Account");
        radioButton3.setBackground(new Color(215, 252, 252));
        radioButton3.setFont(new Font("Railway", Font.BOLD, 16));
        radioButton3.setBounds(100, 220, 200, 30);
        add(radioButton3);

        radioButton4 = new JRadioButton("Recurring Deposit Account");
        radioButton4.setBackground(new Color(215, 252, 252));
        radioButton4.setFont(new Font("Railway", Font.BOLD, 16));
        radioButton4.setBounds(350, 220, 250, 30);
        add(radioButton4);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(radioButton1);
        buttonGroup1.add(radioButton2);
        buttonGroup1.add(radioButton3);
        buttonGroup1.add(radioButton4);

        JLabel labelCard = new JLabel("Card Number :");
        labelCard.setFont(new Font("Railway", Font.BOLD, 18));
        labelCard.setBounds(100, 300, 200, 30);
        add(labelCard);

        JLabel label3 = new JLabel("(Your 16-digit Card Number)");
        label3.setBounds(100, 330, 550, 20);
        label3.setFont(new Font("Railway", Font.BOLD, 12));
        add(label3);

        JLabel label4 = new JLabel("XXXX-XXXX-XXXX-4841");
        label4.setFont(new Font("Railway", Font.BOLD, 18));
        label4.setBounds(330, 300, 300, 30);
        add(label4);

        JLabel label5 = new JLabel("(It would appear on ATM Card/Cheque Book and Statements)");
        label5.setFont(new Font("Railway", Font.BOLD, 12));
        label5.setBounds(330, 330, 600, 20);
        add(label5);

        JLabel labelPin = new JLabel("PIN :");
        labelPin.setFont(new Font("Railway", Font.BOLD, 18));
        labelPin.setBounds(100, 380, 200, 30);
        add(labelPin);

        JLabel label6 = new JLabel("(4-digit Password)");
        label6.setBounds(100, 410, 450, 20);
        label6.setFont(new Font("Railway", Font.BOLD, 12));
        add(label6);

        JLabel label7 = new JLabel("XXXX");
        label7.setFont(new Font("Railway", Font.BOLD, 18));
        label7.setBounds(330, 380, 200, 30);
        add(label7);

        JLabel labelServices = new JLabel("Services Required :");
        labelServices.setFont(new Font("Railway", Font.BOLD, 18));
        labelServices.setBounds(100, 460, 200, 30);
        add(labelServices);

        checkBox1 = new JCheckBox("ATM Card");
        checkBox1.setBackground(new Color(215, 252, 252));
        checkBox1.setFont(new Font("Railway", Font.BOLD, 16));
        checkBox1.setBounds(100, 500, 200, 30);
        add(checkBox1);

        checkBox2 = new JCheckBox("Internet Banking");
        checkBox2.setBackground(new Color(215, 252, 252));
        checkBox2.setFont(new Font("Railway", Font.BOLD, 16));
        checkBox2.setBounds(350, 500, 200, 30);
        add(checkBox2);

        checkBox3 = new JCheckBox("Mobile Banking");
        checkBox3.setBackground(new Color(215, 252, 252));
        checkBox3.setFont(new Font("Railway", Font.BOLD, 16));
        checkBox3.setBounds(100, 550, 200, 30);
        add(checkBox3);

        checkBox4 = new JCheckBox("EMAIL Alerts");
        checkBox4.setBackground(new Color(215, 252, 252));
        checkBox4.setFont(new Font("Railway", Font.BOLD, 16));
        checkBox4.setBounds(350, 550, 200, 30);
        add(checkBox4);

        checkBox5 = new JCheckBox("Cheque Book");
        checkBox5.setBackground(new Color(215, 252, 252));
        checkBox5.setFont(new Font("Railway", Font.BOLD, 16));
        checkBox5.setBounds(100, 600, 200, 30);
        add(checkBox5);

        checkBox6 = new JCheckBox("E-Statement");
        checkBox6.setBackground(new Color(215, 252, 252));
        checkBox6.setFont(new Font("Railway", Font.BOLD, 16));
        checkBox6.setBounds(350, 600, 200, 30);
        add(checkBox6);

        checkBox7 = new JCheckBox("I hereby declares that the above entered details correct to the best of my knowledge.", true);
        checkBox7.setBackground(new Color(215, 252, 252));
        checkBox7.setFont(new Font("Railway", Font.BOLD, 12));
        checkBox7.setBounds(100, 650, 600, 20);
        add(checkBox7);

        JLabel labelForm = new JLabel("Form No :");
        labelForm.setFont(new Font("Railway", Font.BOLD, 18));
        labelForm.setBounds(650, 10, 100, 30);
        add(labelForm);

        JLabel labelNumber = new JLabel(first);
        labelNumber.setFont(new Font("Railway", Font.BOLD, 18));
        labelNumber.setBounds(750, 10, 100, 30);
        add(labelNumber);

        buttonSubmit = new JButton("Submit");
        buttonSubmit.setFont(new Font("Railway", Font.BOLD, 18));
        buttonSubmit.setBounds(220, 700, 100, 30);
        buttonSubmit.setBackground(Color.BLACK);
        buttonSubmit.setForeground(Color.WHITE);
        buttonSubmit.addActionListener(this);
        add(buttonSubmit);

        buttonCancel = new JButton("Cancel");
        buttonCancel.setFont(new Font("Railway", Font.BOLD, 18));
        buttonCancel.setBounds(420, 700, 100, 30);
        buttonCancel.setBackground(Color.BLACK);
        buttonCancel.setForeground(Color.WHITE);
        buttonCancel.addActionListener(this);
        add(buttonCancel);

        setSize(850, 800);
        setLayout(null);
        setLocation(400, 20);
        getContentPane().setBackground(new Color(215, 252, 252));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String accountType = null;
        if(radioButton1.isSelected()){
            accountType = "Savings Account";
        }
        else if(radioButton2.isSelected()){
            accountType = "Fixed Deposit Account";
        }
        else if(radioButton3.isSelected()){
            accountType = "Current Account";
        }
        else if(radioButton4.isSelected()){
            accountType = "Recurring Deposit Account";
        }
        Random random = new Random();
        long first7 = (random.nextLong() % 90000000L) + 1409963000000000L;
        String cardNo = "" + Math.abs(first7);
        long first3 = (random.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);
        String facility = null;
        if(checkBox1.isSelected()){
            facility = "ATM Card";
        }
        if(checkBox2.isSelected()){
            facility += "Internet Banking";
        }
        if(checkBox3.isSelected()){
            facility += "Mobile Banking";
        }
        if(checkBox4.isSelected()){
            facility += "Email Alerts";
        }
        if(checkBox5.isSelected()){
            facility += "Cheque Book";
        }
        if(checkBox6.isSelected()){
            facility += "E-Statement";
        }
        try{
            if(e.getSource() == buttonSubmit){
                if(accountType.equals("")){
                    JOptionPane.showMessageDialog(null, "Fill all the fields!");
                }
                else{
                    JDBCConnection connection = new JDBCConnection();
                    String query1 = "insert into signup3 values('"+formNo+"', '"+accountType+"', '"+cardNo+"', '"+pin+"', '"+facility+"')";
                    connection.statement.executeUpdate(query1);
                    String query2 = "insert into login values('"+formNo+"', '"+cardNo+"', '"+pin+"')";
                    connection.statement.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null, "Card Number :- " + cardNo + "\nPin :- " + pin);
                    new Deposit(pin);
                    setVisible(false);
                }
            }
            else if(e.getSource() == buttonCancel){
                System.exit(0);
            }
        }
        catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignUp3("");
    }
}
