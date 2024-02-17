package Bank.Management.System;

import javax.swing.*;

public class Login extends JFrame {
    Login(){
        super("Bank Management System");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        setSize(850, 480);
        setLocation(450, 200);
        setVisible(true);
    }
    public static void main(String[] args) {
        new Login();
    }
}
