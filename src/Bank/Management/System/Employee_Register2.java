package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Employee_Register2 extends JFrame implements ActionListener {
    String formNo;
    JComboBox comboBoxReligion, comboBoxCategory, comboBoxEducation;
    JTextField textFieldSalary, textFieldPan, textFieldAadhar, textFieldPost, textFieldExperience;
    JButton buttonSubmit, buttonCancel;
    Employee_Register2(String first){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150, 5, 100, 100);
        add(image);

        this.formNo = first;

        JLabel label1 = new JLabel("Page 2 :- ");
        label1.setFont(new Font("Railway", Font.BOLD, 22));
        label1.setBounds(300, 30, 600, 40);
        add(label1);

        JLabel label2 = new JLabel("Additional Details");
        label2.setBounds(300, 60, 600, 40);
        label2.setFont(new Font("Railway", Font.BOLD, 22));
        add(label2);

        JLabel labelReligion = new JLabel("Religion :");
        labelReligion.setFont(new Font("Railway", Font.BOLD, 18));
        labelReligion.setBounds(100, 120, 100, 30);
        add(labelReligion);

        String[] religion = {"Hindu", "Muslim", "Jain", "Sikh", "Christian", "Other"};
        comboBoxReligion = new JComboBox(religion);
        comboBoxReligion.setFont(new Font("Railway", Font.BOLD, 14));
        comboBoxReligion.setBackground(new Color(93, 192, 154));
        comboBoxReligion.setBounds(350, 120, 320, 30);
        add(comboBoxReligion);

        JLabel labelCategory = new JLabel("Category :");
        labelCategory.setFont(new Font("Railway", Font.BOLD, 18));
        labelCategory.setBounds(100, 170, 100, 30);
        add(labelCategory);

        String[] category = {"General", "OBC", "SC", "ST", "Other"};
        comboBoxCategory = new JComboBox(category);
        comboBoxCategory.setFont(new Font("Railway", Font.BOLD, 14));
        comboBoxCategory.setBackground(new Color(93, 192, 154));
        comboBoxCategory.setBounds(350, 170, 320, 30);
        add(comboBoxCategory);

        JLabel labelSalary = new JLabel("Salary :");
        labelSalary.setFont(new Font("Railway", Font.BOLD, 18));
        labelSalary.setBounds(100, 220, 100, 30);
        add(labelSalary);

        textFieldSalary = new JTextField();
        textFieldSalary.setFont(new Font("Railway", Font.BOLD, 14));
        textFieldSalary.setBounds(350, 220, 320, 30);
        add(textFieldSalary);

        JLabel labelEducation = new JLabel("Education :");
        labelEducation.setFont(new Font("Railway", Font.BOLD, 18));
        labelEducation.setBounds(100, 270, 150, 30);
        add(labelEducation);

        String[] education = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Others"};
        comboBoxEducation = new JComboBox(education);
        comboBoxEducation.setFont(new Font("Railway", Font.BOLD, 14));
        comboBoxEducation.setBackground(new Color(93, 192, 154));
        comboBoxEducation.setBounds(350, 270, 320, 30);
        add(comboBoxEducation);

        JLabel labelExperience = new JLabel("Experience :");
        labelExperience.setFont(new Font("Railway", Font.BOLD, 18));
        labelExperience.setBounds(100, 320, 200, 30);
        add(labelExperience);

        textFieldExperience = new JTextField();
        textFieldExperience.setBounds(350, 320, 320, 30);
        textFieldExperience.setFont(new Font("Railway", Font.BOLD, 14));
        add(textFieldExperience);

        JLabel labelPan = new JLabel("PAN Number :");
        labelPan.setFont(new Font("Railway", Font.BOLD, 18));
        labelPan.setBounds(100, 370, 150, 30);
        add(labelPan);

        textFieldPan = new JTextField();
        textFieldPan.setBounds(350, 370, 320, 30);
        textFieldPan.setFont(new Font("Railway", Font.BOLD, 14));
        add(textFieldPan);

        JLabel labelAadhar = new JLabel("Aadhar Number :");
        labelAadhar.setFont(new Font("Railway", Font.BOLD, 18));
        labelAadhar.setBounds(100, 420, 150, 30);
        add(labelAadhar);

        textFieldAadhar = new JTextField();
        textFieldAadhar.setBounds(350, 420, 320, 30);
        textFieldAadhar.setFont(new Font("Railway", Font.BOLD, 14));
        add(textFieldAadhar);

        JLabel labelPosition = new JLabel("Post :");
        labelPosition.setFont(new Font("Railway", Font.BOLD, 18));
        labelPosition.setBounds(100, 470, 150, 30);
        add(labelPosition);

        textFieldPost = new JTextField();
        textFieldPost.setBounds(350, 470, 320, 30);
        textFieldPost.setFont(new Font("Railway", Font.BOLD, 14));
        add(textFieldPost);

        JLabel labelForm = new JLabel("Form No :");
        labelForm.setFont(new Font("Railway", Font.BOLD, 18));
        labelForm.setBounds(650, 10, 100, 30);
        add(labelForm);

        JLabel labelNumber = new JLabel(first);
        labelNumber.setFont(new Font("Railway", Font.BOLD, 18));
        labelNumber.setBounds(750, 10, 100, 30);
        add(labelNumber);

        buttonSubmit = new JButton("SUBMIT");
        buttonSubmit.setForeground(Color.WHITE);
        buttonSubmit.setBounds(450, 600, 100, 30);
        buttonSubmit.setBackground(Color.BLACK);
        buttonSubmit.setFont(new Font("Railway", Font.BOLD, 14));
        buttonSubmit.addActionListener(this);
        add(buttonSubmit);

        buttonCancel = new JButton("CANCEL");
        buttonCancel.setForeground(Color.WHITE);
        buttonCancel.setBounds(570, 600, 100, 30);
        buttonCancel.setBackground(Color.BLACK);
        buttonCancel.setFont(new Font("Railway", Font.BOLD, 14));
        buttonCancel.addActionListener(this);
        add(buttonCancel);

        setLayout(null);
        setSize(850, 750);
        setLocation(450, 80);
        getContentPane().setBackground(new Color(93, 192, 154));
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String religion = (String) comboBoxReligion.getSelectedItem();
        String category = (String) comboBoxCategory.getSelectedItem();
        String salary = textFieldSalary.getText();
        String education = (String) comboBoxEducation.getSelectedItem();
        String experience = textFieldExperience.getText();
        String pan = textFieldPan.getText();
        String aadhar = textFieldAadhar.getText();
        String post = textFieldPost.getText();
        Random random = new Random();
        long firstFive = (random.nextLong() % 90000L) + 10000L;
        String employeeID = "Emp" + Math.abs(firstFive);
        long firstSix = (random.nextLong() % 900000L) + 100000L;
        String password = "" + Math.abs(firstSix);
        if(e.getSource() == buttonSubmit){
            try{
                if(aadhar.equals("") || pan.equals("")){
                    JOptionPane.showMessageDialog(null, "Fill all the fields!");
                }
                else{
                    JDBCConnection connection = new JDBCConnection();
                    String query1 = "insert into employee_register2 values('"+formNo+"', '"+religion+"', '"+category+"', '"+salary+"', '"+education+"', '"+experience+"', '"+pan+"', '"+aadhar+"', '"+post+"')";
                    connection.statement.executeUpdate(query1);
                    String query2 = "insert into employee_login values('"+formNo+"', '"+employeeID+"', '"+password+"')";
                    connection.statement.executeUpdate(query2);
                    JOptionPane.showMessageDialog(null, "Your employee ID is :- " + employeeID + "\nYour password is :- " + password);
                    new Employee_Login();
                    setVisible(false);
                }
            }
            catch(Exception E){
                E.printStackTrace();
            }
        }
        else if(e.getSource() == buttonCancel){
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Employee_Register2("");
    }
}
