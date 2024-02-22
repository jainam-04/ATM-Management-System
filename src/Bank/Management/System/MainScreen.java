package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainScreen extends JFrame implements ActionListener {
    JButton buttonDeposit, buttonWithdrawal, buttonFastCash, buttonMiniStatement, buttonPinChange, buttonBalance, buttonExit;
    String pin;
    MainScreen(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label1 = new JLabel(i3);
        label1.setBounds(0, 0, 1550, 830);
        add(label1);

        JLabel label2 = new JLabel("Please Select Your Transaction");
        label2.setFont(new Font("System", Font.BOLD, 28));
        label2.setBounds(430, 180, 700, 35);
        label2.setForeground(Color.WHITE);
        label1.add(label2);

        buttonDeposit = new JButton("DEPOSIT");
        buttonDeposit.setBackground(new Color(65, 125, 128));
        buttonDeposit.setForeground(Color.WHITE);
        buttonDeposit.setBounds(410, 270, 150, 35);
        buttonDeposit.addActionListener(this);
        label1.add(buttonDeposit);

        buttonWithdrawal = new JButton("CASH WITHDRAWAL");
        buttonWithdrawal.setBackground(new Color(65, 125, 128));
        buttonWithdrawal.setForeground(Color.WHITE);
        buttonWithdrawal.setBounds(700, 270, 150, 35);
        buttonWithdrawal.addActionListener(this);
        label1.add(buttonWithdrawal);

        buttonFastCash = new JButton("FAST CASH");
        buttonFastCash.setBackground(new Color(65, 125, 128));
        buttonFastCash.setForeground(Color.WHITE);
        buttonFastCash.setBounds(410, 316, 150, 35);
        buttonFastCash.addActionListener(this);
        label1.add(buttonFastCash);

        buttonMiniStatement = new JButton("MINI STATEMENT");
        buttonMiniStatement.setBackground(new Color(65, 125, 128));
        buttonMiniStatement.setForeground(Color.WHITE);
        buttonMiniStatement.setBounds(700, 316, 150, 35);
        buttonMiniStatement.addActionListener(this);
        label1.add(buttonMiniStatement);

        buttonPinChange = new JButton("PIN CHANGE");
        buttonPinChange.setBackground(new Color(65, 125, 128));
        buttonPinChange.setForeground(Color.WHITE);
        buttonPinChange.setBounds(410, 363, 150, 35);
        buttonPinChange.addActionListener(this);
        label1.add(buttonPinChange);

        buttonBalance = new JButton("BALANCE ENQUIRY");
        buttonBalance.setBackground(new Color(65, 125, 128));
        buttonBalance.setForeground(Color.WHITE);
        buttonBalance.setBounds(700, 363, 150, 35);
        buttonBalance.addActionListener(this);
        label1.add(buttonBalance);

        buttonExit = new JButton("EXIT");
        buttonExit.setBackground(new Color(65, 125, 128));
        buttonExit.setForeground(Color.WHITE);
        buttonExit.setBounds(700, 410, 150, 35);
        buttonExit.addActionListener(this);
        label1.add(buttonExit);

        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttonDeposit){
            new Deposit(pin);
            setVisible(false);
        }
        else if(e.getSource() == buttonExit){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new MainScreen("");
    }
}
