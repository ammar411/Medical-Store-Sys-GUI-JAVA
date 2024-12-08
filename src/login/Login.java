package login;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Login extends JFrame implements ActionListener {

    JLabel Name;
    JLabel Pass;
    JLabel Intro;
    JTextField txtName;
    JPasswordField txtPass;
    
    JButton btnLogin;
    JButton btnClear;

    public Login() {
        setTitle("LOGIN FOR APP");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocation(100, 100);
        setLocationRelativeTo(null); 
        ImageIcon icon = new ImageIcon("C:\\Users\\ammar\\OneDrive\\Desktop\\OOP\\Login\\src\\PHRM.jpeg");
        setIconImage(icon.getImage());
        setLayout(null);
        setVisible(true);
        addComponents();
        getContentPane().setBackground(Color.cyan);
    
    }

    public void addComponents() {
        Intro=new JLabel("WELCOME TO PRINTING SYSTEM");
         Intro.setBounds(0, 10, 400, 30);
        Intro.setFont(new Font("Arial", Font.BOLD, 20)); 
        Intro.setHorizontalAlignment(SwingConstants.CENTER); 
        add(Intro);
        
        Name = new JLabel("Name");
        Name.setBounds(10, 50, 100, 20);
        add(Name);
        Name.setForeground(Color.blue);
        Pass = new JLabel("Password");
        Pass.setBounds(10, 100, 100, 20);
        add(Pass);
        Pass.setForeground(Color.blue);
        txtName = new JTextField();
        txtName.setBounds(120, 50, 200, 20);
        add(txtName);

        txtPass = new JPasswordField();
        txtPass.setBounds(120, 100, 200, 20);
        add(txtPass);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(120, 150, 80, 25);
        add(btnLogin);
        btnLogin.addActionListener(this);

        btnClear = new JButton("Clear");
        btnClear.setBounds(220, 150, 80, 25);
        add(btnClear);
        btnClear.addActionListener(this);
    }

    // Implement actionPerformed method from ActionListener interface
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnLogin) {
            String enteredName = txtName.getText();
            String enteredPassword = new String(txtPass.getPassword());

            if (enteredName.equals("Owner") && enteredPassword.equals("12345")) {
                txtName.setText(null);
                txtPass.setText(null);
                new MainFrames();
                JOptionPane.showMessageDialog(null, "Login Successful", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error", JOptionPane.ERROR_MESSAGE);
                txtName.setText(null);
                txtPass.setText(null);
            }
        } else if (e.getSource() == btnClear) {
            txtName.setText(null);
            txtPass.setText(null);
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
