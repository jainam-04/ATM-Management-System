package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame implements ActionListener {
    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1, button2;
    Admin(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350, 10, 100, 100);
        add(image);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("Icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630, 350, 100, 100);
        add(iimage);

        label1 = new JLabel("Admin Panel");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        label1.setBounds(270, 125, 450, 40);
        add(label1);

        label2 = new JLabel("Admin Id: ");
        label2.setFont(new Font("Railway", Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150, 190, 375, 30);
        add(label2);

        textField2 = new JTextField();
        textField2.setBounds(325, 190, 230, 30);
        textField2.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField2);

        label3 = new JLabel("Password: ");
        label3.setFont(new Font("Railway", Font.BOLD, 28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150, 250, 375, 30);
        add(label3);

        passwordField3 = new JPasswordField();
        passwordField3.setBounds(325, 250, 230, 30);
        passwordField3.setFont(new Font("Arial", Font.BOLD, 14));
        add(passwordField3);

        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.setBounds(320, 300, 100, 30);
        button1.setForeground(Color.WHITE);
        button1.setBackground(Color.BLACK);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.setBounds(450, 300, 100, 30);
        button2.setForeground(Color.WHITE);
        button2.setBackground(Color.BLACK);
        button2.addActionListener(this);
        add(button2);

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("Icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0, 0, 850, 480);
        add(iiimage);

        setLayout(null);
        setSize(850, 480);
        setUndecorated(true);
        setLocation(450, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if(e.getSource() == button1){
                String adminId = textField2.getText();
                String password = String.valueOf(passwordField3.getPassword());
                if(adminId.equals("") || password.equals("")){
                    JOptionPane.showMessageDialog(null, "Fill all the fields!");
                }
                else{
                    if(adminId.equals("Jainam04") && password.equals("Rupani@0410")){
                        new Login();
                        setVisible(false);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Incorrect Id and Password!");
                    }
                }
            }
            else if(e.getSource() == button2){
                textField2.setText("");
                passwordField3.setText("");
            }
        }
        catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Admin();
    }
}
