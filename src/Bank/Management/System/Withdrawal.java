package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawal extends JFrame implements ActionListener {
    String pin;
    JTextField textField1;
    JButton buttonWithdrawal, buttonBack;
    Withdrawal(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label1 = new JLabel(i3);
        label1.setBounds(0, 0, 1550, 830);
        add(label1);

        JLabel label2 = new JLabel("MAXIMUM WITHDRAWAL IS RS. 10,000");
        label2.setBounds(460, 180, 700, 35);
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setForeground(Color.WHITE);
        label1.add(label2);

        JLabel label3 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        label3.setBounds(460, 220, 400, 35);
        label3.setFont(new Font("System", Font.BOLD, 16));
        label3.setForeground(Color.WHITE);
        label1.add(label3);

        textField1 = new JTextField();
        textField1.setFont(new Font("Railway", Font.BOLD, 22));
        textField1.setBounds(460, 260, 320, 25);
        textField1.setBackground(new Color(65, 125, 128));
        textField1.setForeground(Color.WHITE);
        label1.add(textField1);

        buttonWithdrawal = new JButton("WITHDRAWAL");
        buttonWithdrawal.setBackground(new Color(65, 125, 128));
        buttonWithdrawal.setForeground(Color.WHITE);
        buttonWithdrawal.setBounds(700, 363, 150, 35);
        buttonWithdrawal.addActionListener(this);
        label1.add(buttonWithdrawal);

        buttonBack = new JButton("BACK");
        buttonBack.setBackground(new Color(65, 125, 128));
        buttonBack.setForeground(Color.WHITE);
        buttonBack.setBounds(700, 410, 150, 35);
        buttonBack.addActionListener(this);
        label1.add(buttonBack);

        setLayout(null);
        setSize(1550, 1080);
        setUndecorated(true);
        setLocation(0, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String amount = textField1.getText();
            Date date = new Date();
            if(e.getSource() == buttonWithdrawal){
                if(amount.equals("")){
                    JOptionPane.showMessageDialog(null, "Please enter the amount you want to withdraw!");
                }
                else{
                    JDBCConnection connection = new JDBCConnection();
                    String query1 = "select * from bank where pin = '"+pin+"'";
                    ResultSet resultSet = connection.statement.executeQuery(query1);
                    int balance = 0;
                    while(resultSet.next()){
                        if(resultSet.getString("type").equals("Deposit")){
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        }
                        else{
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if(balance < Integer.parseInt(amount)){
                        JOptionPane.showMessageDialog(null, "Insufficient Balance!");
                        return;
                    }
                    if(Integer.parseInt(amount) >= 10000){
                        JOptionPane.showMessageDialog(null, "Please Enter Amount Less Than Rs. 10000");
                        return;
                    }
                    String query2 = "insert into bank values('"+pin+"', '"+date+"', 'Withdrawal', '"+amount+"')";
                    connection.statement.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " is Debited Successfully!");
                    new MainScreen(pin);
                    setVisible(false);
                }
            }
            else if(e.getSource() == buttonBack){
                new MainScreen(pin);
                setVisible(false);
            }
        }
        catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Withdrawal("");
    }
}
