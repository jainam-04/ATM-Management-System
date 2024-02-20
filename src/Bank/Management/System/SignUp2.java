package Bank.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUp2 extends JFrame implements ActionListener {
    String formNo;
    JComboBox comboBoxReligion, comboBoxCategory, comboBoxIncome, comboBoxEducation, comboBoxOccupation;
    JTextField textFieldPan, textFieldAadhar;
    JRadioButton radioButton1, radioButton2, radioButton3, radioButton4;
    JButton buttonNext;
    SignUp2(String first){
        super("APPLICATION FORM");

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
        comboBoxReligion.setBackground(new Color(252, 208, 76));
        comboBoxReligion.setBounds(350, 120, 320, 30);
        add(comboBoxReligion);

        JLabel labelCategory = new JLabel("Category :");
        labelCategory.setFont(new Font("Railway", Font.BOLD, 18));
        labelCategory.setBounds(100, 170, 100, 30);
        add(labelCategory);

        String[] category = {"General", "OBC", "SC", "ST", "Other"};
        comboBoxCategory = new JComboBox(category);
        comboBoxCategory.setFont(new Font("Railway", Font.BOLD, 14));
        comboBoxCategory.setBackground(new Color(252, 208, 76));
        comboBoxCategory.setBounds(350, 170, 320, 30);
        add(comboBoxCategory);

        JLabel labelIncome = new JLabel("Income :");
        labelIncome.setFont(new Font("Railway", Font.BOLD, 18));
        labelIncome.setBounds(100, 220, 100, 30);
        add(labelIncome);

        String[] income = {"Null", "<1,50,000", "<2,50,000", "<5,00,000", "Upto 10,00,000", "Above 10,00,000"};
        comboBoxIncome = new JComboBox(income);
        comboBoxIncome.setFont(new Font("Railway", Font.BOLD, 14));
        comboBoxIncome.setBackground(new Color(252, 208, 76));
        comboBoxIncome.setBounds(350, 220, 320, 30);
        add(comboBoxIncome);

        JLabel labelEducation = new JLabel("Education :");
        labelEducation.setFont(new Font("Railway", Font.BOLD, 18));
        labelEducation.setBounds(100, 270, 150, 30);
        add(labelEducation);

        String[] education = {"Non-Graduate", "Graduate", "Post-Graduate", "Doctrate", "Others"};
        comboBoxEducation = new JComboBox(education);
        comboBoxEducation.setFont(new Font("Railway", Font.BOLD, 14));
        comboBoxEducation.setBackground(new Color(252, 208, 76));
        comboBoxEducation.setBounds(350, 270, 320, 30);
        add(comboBoxEducation);

        JLabel labelOccupation = new JLabel("Occupation :");
        labelOccupation.setFont(new Font("Railway", Font.BOLD, 18));
        labelOccupation.setBounds(100, 320, 150, 30);
        add(labelOccupation);

        String[] occupation = {"Salaried", "Self-Employed", "Business", "Student", "Retired", "Other"};
        comboBoxOccupation = new JComboBox(occupation);
        comboBoxOccupation.setFont(new Font("Railway", Font.BOLD, 14));
        comboBoxOccupation.setBackground(new Color(252, 208, 76));
        comboBoxOccupation.setBounds(350, 320, 320, 30);
        add(comboBoxOccupation);

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

        JLabel labelSenior = new JLabel("Senior Citizen :");
        labelSenior.setFont(new Font("Railway", Font.BOLD, 18));
        labelSenior.setBounds(100, 470, 150, 30);
        add(labelSenior);

        radioButton1 = new JRadioButton("Yes");
        radioButton1.setFont(new Font("Railway", Font.BOLD, 14));
        radioButton1.setBounds(350, 470, 100, 30);
        radioButton1.setBackground(new Color(252, 208, 76));
        add(radioButton1);

        radioButton2 = new JRadioButton("No");
        radioButton2.setFont(new Font("Railway", Font.BOLD, 14));
        radioButton2.setBounds(450, 470, 100, 30);
        radioButton2.setBackground(new Color(252, 208, 76));
        add(radioButton2);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(radioButton1);
        buttonGroup1.add(radioButton2);

        JLabel labelExisting = new JLabel("Existing Account :");
        labelExisting.setFont(new Font("Railway", Font.BOLD, 18));
        labelExisting.setBounds(100, 520, 200, 30);
        add(labelExisting);

        radioButton3 = new JRadioButton("Yes");
        radioButton3.setFont(new Font("Railway", Font.BOLD, 14));
        radioButton3.setBounds(350, 520, 100, 30);
        radioButton3.setBackground(new Color(252, 208, 76));
        add(radioButton3);

        radioButton4 = new JRadioButton("No");
        radioButton4.setFont(new Font("Railway", Font.BOLD, 14));
        radioButton4.setBounds(450, 520, 100, 30);
        radioButton4.setBackground(new Color(252, 208, 76));
        add(radioButton4);

        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(radioButton3);
        buttonGroup2.add(radioButton4);

        JLabel labelForm = new JLabel("Form No :");
        labelForm.setFont(new Font("Railway", Font.BOLD, 18));
        labelForm.setBounds(650, 10, 100, 30);
        add(labelForm);

        JLabel labelNumber = new JLabel(first);
        labelNumber.setFont(new Font("Railway", Font.BOLD, 18));
        labelNumber.setBounds(750, 10, 100, 30);
        add(labelNumber);

        buttonNext = new JButton("Next");
        buttonNext.setForeground(Color.BLACK);
        buttonNext.setBounds(570, 640, 100, 30);
        buttonNext.setBackground(Color.WHITE);
        buttonNext.setFont(new Font("Railway", Font.BOLD, 14));
        buttonNext.addActionListener(this);
        add(buttonNext);

        setLayout(null);
        setSize(850, 750);
        setLocation(450, 80);
        getContentPane().setBackground(new Color(252, 208, 76));
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String religion = (String) comboBoxReligion.getSelectedItem();
        String category = (String) comboBoxCategory.getSelectedItem();
        String income = (String) comboBoxIncome.getSelectedItem();
        String education = (String) comboBoxEducation.getSelectedItem();
        String occupation = (String) comboBoxOccupation.getSelectedItem();
        String pan = textFieldPan.getText();
        String aadhar = textFieldAadhar.getText();
        String seniorCitizen = null;
        if(radioButton1.isSelected()){
            seniorCitizen = "Yes";
        }
        else{
            seniorCitizen = "No";
        }
        String existingAccount = null;
        if(radioButton3.isSelected()){
            existingAccount = "Yes";
        }
        else{
            existingAccount = "No";
        }
        try{
            if(pan.equals("") || aadhar.equals("")){
                JOptionPane.showMessageDialog(null, "Fill all the fields!");
            }
            else{
                JDBCConnection connection = new JDBCConnection();
                String query = "insert into signup2 values('"+formNo+"', '"+religion+"', '"+category+"', '"+income+"', '"+education+"', '"+occupation+"', '"+pan+"', '"+aadhar+"', '"+seniorCitizen+"', '"+existingAccount+"')";
                connection.statement.executeUpdate(query);
                new SignUp3(formNo);
                setVisible(false);
            }
        }
        catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new SignUp2("");
    }
}
