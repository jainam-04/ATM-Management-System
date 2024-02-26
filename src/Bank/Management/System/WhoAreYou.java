package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WhoAreYou extends JFrame implements ActionListener {
    JButton buttonAdmin, buttonEmployee, buttonCustomer;
    WhoAreYou(){
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

        buttonAdmin = new JButton("FOR ADMIN");
        buttonAdmin.setBackground(Color.BLACK);
        buttonAdmin.setForeground(Color.WHITE);
        buttonAdmin.setBounds(200, 200, 150, 30);
        buttonAdmin.setFont(new Font("Arial", Font.BOLD, 14));
        buttonAdmin.addActionListener(this);
        iiimage.add(buttonAdmin);

        buttonEmployee = new JButton("FOR EMPLOYEES");
        buttonEmployee.setFont(new Font("Arial", Font.BOLD, 14));
        buttonEmployee.setBounds(400, 200, 170, 30);
        buttonEmployee.setBackground(Color.BLACK);
        buttonEmployee.setForeground(Color.WHITE);
        buttonEmployee.addActionListener(this);
        iiimage.add(buttonEmployee);

        buttonCustomer = new JButton("FOR CUSTOMERS");
        buttonCustomer.setForeground(Color.WHITE);
        buttonCustomer.setFont(new Font("Arial", Font.BOLD, 14));
        buttonCustomer.setBackground(Color.BLACK);
        buttonCustomer.setBounds(280, 250, 200, 30);
        buttonCustomer.addActionListener(this);
        iiimage.add(buttonCustomer);

        setLayout(null);
        setSize(850, 480);
        setLocation(450, 200);
//        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == buttonAdmin){
            setVisible(false);
        }
        else if(e.getSource() == buttonEmployee){
            setVisible(false);
        }
        else if(e.getSource() == buttonCustomer){
            new Login();
            setVisible(false);
        }
    }

    public static void main(String[] args) {
        new WhoAreYou();
    }
}
