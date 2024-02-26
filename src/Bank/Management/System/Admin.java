package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Admin extends JFrame implements ActionListener {
    JButton buttonLogin, buttonLogout, buttonRegister;
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

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("Icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850, 480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0, 0, 850, 480);
        add(iiimage);

        JLabel label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 38));
        label1.setBounds(230, 125, 450, 40);
        iiimage.add(label1);

        buttonLogin = new JButton("LOGIN");
        buttonLogin.setBackground(Color.BLACK);
        buttonLogin.setForeground(Color.WHITE);
        buttonLogin.setBounds(200, 200, 150, 30);
        buttonLogin.setFont(new Font("Arial", Font.BOLD, 14));
        buttonLogin.addActionListener(this);
        iiimage.add(buttonLogin);

        buttonLogout = new JButton("LOGOUT");
        buttonLogout.setFont(new Font("Arial", Font.BOLD, 14));
        buttonLogout.setBounds(400, 200, 170, 30);
        buttonLogout.setBackground(Color.BLACK);
        buttonLogout.setForeground(Color.WHITE);
        buttonLogout.addActionListener(this);
        iiimage.add(buttonLogout);

        buttonRegister = new JButton("REGISTER");
        buttonRegister.setForeground(Color.WHITE);
        buttonRegister.setFont(new Font("Arial", Font.BOLD, 14));
        buttonRegister.setBackground(Color.BLACK);
        buttonRegister.setBounds(280, 250, 200, 30);
        buttonRegister.addActionListener(this);
        iiimage.add(buttonRegister);

        setLayout(null);
        setSize(850, 480);
        setLocation(450, 200);
//        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttonLogin){
            JOptionPane.showMessageDialog(null, "You are logged in!");
            setVisible(false);
        }
        else if(e.getSource() == buttonLogout){
            JOptionPane.showMessageDialog(null, "You are logged out!");
            setVisible(false);
        }
        else if(e.getSource() == buttonRegister){
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new Admin();
    }
}
