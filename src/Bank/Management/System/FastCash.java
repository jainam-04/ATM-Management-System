package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    JButton button100, button500, button1000, button2000, button5000, button10000, buttonBack;
    String pin;
    FastCash(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label1 = new JLabel(i3);
        label1.setBounds(0, 0, 1550, 830);
        add(label1);

        JLabel label2 = new JLabel("SELECT YOUR WITHDRAWAL");
        label2.setFont(new Font("System", Font.BOLD, 28));
        label2.setBounds(460, 180, 700, 35);
        label2.setForeground(Color.WHITE);
        label1.add(label2);

        button100 = new JButton("Rs. 100");
        button100.setBackground(new Color(65, 125, 128));
        button100.setForeground(Color.WHITE);
        button100.setBounds(410, 270, 150, 35);
        button100.addActionListener(this);
        label1.add(button100);

        button500 = new JButton("Rs. 500");
        button500.setBackground(new Color(65, 125, 128));
        button500.setForeground(Color.WHITE);
        button500.setBounds(700, 270, 150, 35);
        button500.addActionListener(this);
        label1.add(button500);

        button1000 = new JButton("Rs. 1000");
        button1000.setBackground(new Color(65, 125, 128));
        button1000.setForeground(Color.WHITE);
        button1000.setBounds(410, 316, 150, 35);
        button1000.addActionListener(this);
        label1.add(button1000);

        button2000 = new JButton("Rs. 2000");
        button2000.setBackground(new Color(65, 125, 128));
        button2000.setForeground(Color.WHITE);
        button2000.setBounds(700, 316, 150, 35);
        button2000.addActionListener(this);
        label1.add(button2000);

        button5000 = new JButton("Rs. 5000");
        button5000.setBackground(new Color(65, 125, 128));
        button5000.setForeground(Color.WHITE);
        button5000.setBounds(410, 363, 150, 35);
        button5000.addActionListener(this);
        label1.add(button5000);

        button10000 = new JButton("Rs. 10000");
        button10000.setBackground(new Color(65, 125, 128));
        button10000.setForeground(Color.WHITE);
        button10000.setBounds(700, 363, 150, 35);
        button10000.addActionListener(this);
        label1.add(button10000);

        buttonBack = new JButton("BACK");
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
        if(e.getSource() == buttonBack){
            new MainScreen(pin);
            setVisible(false);
        }
        else{
            String amount = ((JButton) e.getSource()).getText().substring(4);
            JDBCConnection connection = new JDBCConnection();
            Date date = new Date();
            try{
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
                if((e.getSource() != buttonBack) && (balance < Integer.parseInt(amount))){
                    JOptionPane.showMessageDialog(null, "Insufficient Balance");
                    return;
                }
                String query2 = "insert into bank values('"+pin+"', '"+date+"', 'Withdrawal', '"+amount+"')";
                connection.statement.executeUpdate(query2);
                JOptionPane.showMessageDialog(null, "Rs. " + amount + " is Debited Successfully!");
                new MainScreen(pin);
                setVisible(false);
            }
            catch(Exception E){
                E.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new FastCash("");
    }
}
