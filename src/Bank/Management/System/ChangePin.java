package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ChangePin extends JFrame implements ActionListener {
    JButton buttonChange, buttonBack;
    JPasswordField passwordField1, passwordField2;
    String pin;
    ChangePin(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel label1 = new JLabel(i3);
        label1.setBounds(0, 0, 1550, 830);
        add(label1);

        JLabel label2 = new JLabel("CHANGE YOUR PIN");
        label2.setBounds(430, 180, 400, 35);
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setForeground(Color.WHITE);
        label1.add(label2);

        JLabel label3 = new JLabel("New Pin :- ");
        label3.setBounds(430, 220, 150, 25);
        label3.setFont(new Font("System", Font.BOLD, 16));
        label3.setForeground(Color.WHITE);
        label1.add(label3);

        passwordField1 = new JPasswordField();
        passwordField1.setFont(new Font("Railway", Font.BOLD, 22));
        passwordField1.setForeground(Color.WHITE);
        passwordField1.setBackground(new Color(65, 125, 128));
        passwordField1.setBounds(600, 220, 180, 25);
        label1.add(passwordField1);

        JLabel label4 = new JLabel("Re-enter New Pin :- ");
        label4.setBounds(430, 270, 200, 25);
        label4.setFont(new Font("System", Font.BOLD, 16));
        label4.setForeground(Color.WHITE);
        label1.add(label4);

        passwordField2 = new JPasswordField();
        passwordField2.setFont(new Font("Railway", Font.BOLD, 22));
        passwordField2.setForeground(Color.WHITE);
        passwordField2.setBackground(new Color(65, 125, 128));
        passwordField2.setBounds(600, 270, 180, 25);
        label1.add(passwordField2);

        buttonChange = new JButton("CHANGE");
        buttonChange.setBackground(new Color(65, 125, 128));
        buttonChange.setForeground(Color.WHITE);
        buttonChange.setBounds(700, 363, 150, 35);
        buttonChange.addActionListener(this);
        label1.add(buttonChange);

        buttonBack = new JButton("BACK");
        buttonBack.setBackground(new Color(65, 125, 128));
        buttonBack.setForeground(Color.WHITE);
        buttonBack.setBounds(700, 410, 150, 35);
        buttonBack.addActionListener(this);
        label1.add(buttonBack);

        setLayout(null);
        setSize(1550, 1080);
        setLocation(0, 0);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            String pin1 = String.valueOf(passwordField1.getPassword());
            String pin2 = String.valueOf(passwordField2.getPassword());
            if(!pin1.equals(pin2)){
                JOptionPane.showMessageDialog(null, "Entered PIN does not match!");
                return;
            }
            if(e.getSource() == buttonChange){
                if(pin1.equals("")){
                    JOptionPane.showMessageDialog(null, "Enter new PIN!");
                    return;
                }
                if(pin2.equals("")){
                    JOptionPane.showMessageDialog(null, "Re-enter new PIN!");
                    return;
                }
                JDBCConnection connection = new JDBCConnection();
                String query1 = "update bank set pin = '"+pin1+"' where pin = '"+pin+"'";
                connection.statement.executeUpdate(query1);
                String query2 = "update login set pin = '"+pin1+"' where pin = '"+pin+"'";
                connection.statement.executeUpdate(query2);
                String query3 = "update signup3 set pin = '"+pin1+"' where pin = '"+pin+"'";
                connection.statement.executeUpdate(query3);
                JOptionPane.showMessageDialog(null, "PIN is Changed Successfully!");
                new MainScreen(pin);
                setVisible(false);
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
        new ChangePin("");
    }
}
