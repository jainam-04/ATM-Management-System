package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class MiniStatement extends JFrame implements ActionListener {
    String pin;
    JButton buttonExit;
    MiniStatement(String pin){
        this.pin = pin;

        JLabel label1 = new JLabel();
        label1.setBounds(20, 140, 400, 200);
        add(label1);

        JLabel label2 = new JLabel("Jainam Rupani");
        label2.setBounds(150, 20, 200, 20);
        label2.setFont(new Font("System", Font.BOLD, 15));
        add(label2);

        JLabel label3 = new JLabel();
        label3.setBounds(20, 80, 300, 20);
        add(label3);

        JLabel label4 = new JLabel();
        label4.setBounds(20, 400, 300, 20);
        add(label4);

        try{
            JDBCConnection connection = new JDBCConnection();
            String query = "select * from login where pin = '"+pin+"'";
            ResultSet resultSet = connection.statement.executeQuery(query);
            while(resultSet.next()){
                label3.setText("Card Number :- " + resultSet.getString("cardNo").substring(0, 4) + "XXXXXXXX" + resultSet.getString("cardNo").substring(12));
            }
        }
        catch(Exception e){
            e.printStackTrace();
        }

        try{
            int balance = 0;
            JDBCConnection connection = new JDBCConnection();
            String query = "select * from bank where pin = '"+pin+"'";
            ResultSet resultSet = connection.statement.executeQuery(query);
            while(resultSet.next()){
                label1.setText(label1.getText() + "<html>" + resultSet.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + resultSet.getString("amount") + "<br><br><html>");
                if(resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }
                else{
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
            label4.setText("Your Total Balance is Rs. " + balance);
        }
        catch(Exception e){
            e.printStackTrace();
        }

        buttonExit = new JButton("EXIT");
        buttonExit.setBounds(20, 500, 100, 25);
        buttonExit.addActionListener(this);
        buttonExit.setBackground(Color.BLACK);
        buttonExit.setForeground(Color.WHITE);
        add(buttonExit);

        getContentPane().setBackground(new Color(255, 204, 204));
        setSize(400, 600);
        setLayout(null);
        setLocation(20, 20);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttonExit){
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new MiniStatement("");
    }
}
