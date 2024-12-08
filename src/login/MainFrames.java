/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

/**
 *
 * @author Ammar
 */
import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class MainFrames extends JFrame implements ActionListener {

    
    
    JLabel lblPname;
    JLabel lblFname;
    JLabel lblAge;
    JLabel lblDisease;
    JLabel lblGender;
    JLabel Date;
    JLabel Msg;
    JLabel lblDisp;

    JTextField t1, t2, t3, t4;

    JRadioButton male, female;
    JComboBox<String> day, month, year;
    JButton print;
    JCheckBox terms;
    JTextArea var;
    JTextArea screen;

    public MainFrames() {
        setTitle("Medical Store Application");
        setSize(1000, 500);
         ImageIcon icon = new ImageIcon("C:\\Users\\ammar\\OneDrive\\Desktop\\OOP\\Login\\src\\PHRM.jpeg");
    setIconImage(icon.getImage());
     setLocationRelativeTo(null); 
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.LIGHT_GRAY);
    
        addComponents();

        setVisible(true);
    }

    public void addComponents() {
        
          
        // Patient Name
        lblPname = new JLabel("Patient Name");
        lblPname.setBounds(20, 30, 100, 20);
        this.add(lblPname);

        t1 = new JTextField();
        t1.setBounds(130, 30, 200, 20);
        add(t1);

        // Father's Name
        lblFname = new JLabel("Father's Name");
        lblFname.setBounds(20, 60, 100, 20);
        this.add(lblFname);

        t2 = new JTextField();
        t2.setBounds(130, 60, 200, 20);
        add(t2);

        // Age
        lblAge = new JLabel("Age");
        lblAge.setBounds(20, 90, 100, 20);
        this.add(lblAge);

        t3 = new JTextField();
        t3.setBounds(130, 90, 200, 20);
        add(t3);

        // Disease
        lblDisease = new JLabel("Disease");
        lblDisease.setBounds(20, 120, 100, 20);
        add(lblDisease);

        t4 = new JTextField();
        t4.setBounds(130, 120, 200, 20);
        add(t4);

        // Description
        JLabel lblDescription = new JLabel("Description");
        lblDescription.setBounds(20, 150, 100, 20);
        add(lblDescription);

        var = new JTextArea();
        var.setBounds(130, 150, 200, 50);
        add(var);

        // Gender
        lblGender = new JLabel("Gender");
        lblGender.setBounds(20, 210, 100, 20);
        this.add(lblGender);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");
        male.setBounds(130, 210, 80, 20);
        female.setBounds(220, 210, 80, 20);
        this.add(male);
        this.add(female);

        ButtonGroup gen = new ButtonGroup();
        gen.add(male);
        gen.add(female);

        // Set colors
        lblPname.setForeground(Color.blue);
        lblFname.setForeground(Color.blue);
        lblAge.setForeground(Color.blue);
        lblDisease.setForeground(Color.blue);
        lblGender.setForeground(Color.blue);

        // Set text color for text fields
        t1.setForeground(Color.black);
        t2.setForeground(Color.black);
        t3.setForeground(Color.black);
        t4.setForeground(Color.black);

        Date = new JLabel("Date");
        Date.setBounds(20, 260, 100, 20);
        this.add(Date);

        String[] days = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        String[] years = {"2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030"};

        day = new JComboBox<>(days);
        month = new JComboBox<>(months);
        year = new JComboBox<>(years);

        day.setBounds(130, 260, 50, 20);
        month.setBounds(190, 260, 90, 20);
        year.setBounds(290, 260, 60, 20);

        this.add(day);
        this.add(month);
        this.add(year);

        lblDisp = new JLabel();
        lblDisp.setBounds(20, 310, 100, 20);
       lblDisp.setForeground(Color.BLUE); // Set the foreground color to blue
      lblDisp.setBackground(Color.BLACK);;
        this.add(lblDisp);

        // Initialize Msg JLabel
        Msg = new JLabel();
        Msg.setBounds(20, 420, 250, 20);
        this.add(Msg);

        terms = new JCheckBox("Please Accept All the terms and Conditions");
        terms.setBounds(50, 360, 250, 20);
        this.add(terms);

        print = new JButton("PRINT");
        print.setBounds(150, 410, 100, 40);
        this.add(print);
        print.addActionListener(this);

        screen = new JTextArea();
        screen.setBounds(350, 30, 300, 300);
        add(screen);
        
        Date.setForeground(Color.BLUE);
       
       // var.setForeground(Color.BLUE);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (terms.isSelected()) {
            
            Msg.setText("You can now take print");
            String name = t1.getText();
            String fname = t2.getText();
            String Age = t3.getText();
            String Disease = t4.getText();
            String gen = "male";
            if (female.isSelected()) {
                gen = "female";
            }
            String DATE = day.getSelectedItem() + "/" + month.getSelectedItem() + "/" + year.getSelectedItem();

            String dsp = var.getText();
            screen.setText("Patient Name: " + name + "\n" + "Father Name: " + fname + "\n" + "Age: " + Age + "\n"
                    + "Disease: " + Disease + "\n" + "Description: " + dsp + "\n" + "Gender: " + gen + "\n" + "Date: " + DATE);
        }
       
    }
}
