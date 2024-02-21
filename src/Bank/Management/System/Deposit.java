package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Deposit extends JFrame implements ActionListener {
    String pin;
    JTextField textField1;
    JButton buttonDeposit, buttonBack;
    Deposit(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label1 = new JLabel(i3);
        label1.setBounds(0, 0, 1550, 830);
        add(label1);

        JLabel label2 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label2.setBounds(460, 180, 400, 35);
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setForeground(Color.WHITE);
        label1.add(label2);

        textField1 = new JTextField();
        textField1.setFont(new Font("Railway", Font.BOLD, 22));
        textField1.setBounds(460, 230, 320, 25);
        textField1.setBackground(new Color(65, 125, 128));
        textField1.setForeground(Color.WHITE);
        label1.add(textField1);

        buttonDeposit = new JButton("Deposit");
        buttonDeposit.setBackground(new Color(65, 125, 128));
        buttonDeposit.setForeground(Color.WHITE);
        buttonDeposit.setBounds(700, 363, 150, 35);
        buttonDeposit.addActionListener(this);
        label1.add(buttonDeposit);

        buttonBack = new JButton("Back");
        buttonBack.setBackground(new Color(65, 125, 128));
        buttonBack.setForeground(Color.WHITE);
        buttonBack.setBounds(700, 410, 150, 35);
        buttonBack.addActionListener(this);
        label1.add(buttonBack);

        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new Deposit("");
    }
}
