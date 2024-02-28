package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquiry extends JFrame implements ActionListener {
    String pin;
    JLabel label3;
    JButton buttonBack;
    BalanceEnquiry(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label1 = new JLabel(i3);
        label1.setBounds(0, 0, 1550, 830);
        add(label1);

        JLabel label2 = new JLabel("YOUR CURRENT BALANCE IS RS. ");
        label2.setBounds(430, 180, 700, 35);
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setForeground(Color.WHITE);
        label1.add(label2);

        label3 = new JLabel();
        label3.setBounds(430, 220, 400, 35);
        label3.setFont(new Font("System", Font.BOLD, 16));
        label3.setForeground(Color.WHITE);
        label1.add(label3);

        buttonBack = new JButton("BACK");
        buttonBack.setBackground(new Color(65, 125, 128));
        buttonBack.setForeground(Color.WHITE);
        buttonBack.setBounds(700, 410, 150, 35);
        buttonBack.addActionListener(this);
        label1.add(buttonBack);

        int balance = 0;
        try{
            JDBCConnection connection = new JDBCConnection();
            String query = "select * from bank where pin = '"+pin+"'";
            ResultSet resultSet = connection.statement.executeQuery(query);
            while(resultSet.next()){
                if(resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }
                else{
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        }
        catch(Exception E){
            E.printStackTrace();
        }

        label3.setText("" + balance);

        setLayout(null);
        setUndecorated(true);
        setSize(1550, 1080);
        setLocation(0, 0);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttonBack){
            new MainScreen(pin);
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
}
