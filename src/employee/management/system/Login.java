package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener {

    JTextField tfusername;
    JPasswordField tpass;
    RoundedButton clicked;

    Login() {

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        // Heading
        JLabel title = new JLabel("LOGIN");
        title.setBounds(165, 10, 150, 35);
        title.setFont(new Font("Segoe UI", Font.BOLD, 28));
        title.setForeground(new Color(41, 128, 185));
        add(title);

        // Welcome
        JLabel welcome = new JLabel("Welcome Back!");
        welcome.setBounds(145, 45, 150, 20);
        welcome.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        welcome.setForeground(Color.GRAY);
        add(welcome);

        // Username Label
        JLabel lusername = new JLabel("Username");
        lusername.setBounds(40, 85, 100, 30);
        lusername.setFont(new Font("Segoe UI", Font.BOLD, 15));
        add(lusername);

        // Password Label
        JLabel lpassword = new JLabel("Password");
        lpassword.setBounds(40, 135, 100, 30);
        lpassword.setFont(new Font("Segoe UI", Font.BOLD, 15));
        add(lpassword);

        // Username TextField
        tfusername = new JTextField();
        tfusername.setBounds(140, 85, 170, 35);
        tfusername.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        tfusername.setBorder(BorderFactory.createLineBorder(new Color(41,128,185),2,true));
        add(tfusername);

        // Password Field
        tpass = new JPasswordField();
        tpass.setBounds(140, 135, 170, 35);
        tpass.setFont(new Font("Segoe UI", Font.PLAIN, 15));
        tpass.setBorder(BorderFactory.createLineBorder(new Color(41,128,185),2,true));
        add(tpass);

        // Login Button
        clicked = new RoundedButton("LOGIN");
        clicked.setBounds(135, 200, 180, 42);
        clicked.setBackground(new Color(41,128,185));
        clicked.setForeground(Color.WHITE);
        clicked.setFont(new Font("Segoe UI", Font.BOLD, 15));
        clicked.setFocusPainted(false);
        clicked.setCursor(new Cursor(Cursor.HAND_CURSOR));
        clicked.addActionListener(this);

        // Hover Effect
        clicked.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseEntered(MouseEvent e) {
                clicked.setBackground(new Color(52,152,219));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                clicked.setBackground(new Color(41,128,185));
            }
        });

        add(clicked);
        
        //Image
        ImageIcon icon = new ImageIcon(ClassLoader.getSystemResource("icons/llogin.jpg"));
        Image img = icon.getImage().getScaledInstance(180, 180, Image.SCALE_SMOOTH);
        JLabel image = new JLabel(new ImageIcon(img));
        image.setBounds(365, 55, 180, 180);
        add(image);

        // Frame
        setSize(600, 330);
        setLocation(450, 200);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String args[]) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {

            String username = tfusername.getText().trim();
            String password = String.valueOf(tpass.getPassword()).trim();

            Con c = new Con();

            String query = "select * from login where username='" + username + "' and password='" + password + "'";

            ResultSet rs = c.s.executeQuery(query);

            if (rs.next()) {

                setVisible(false);
                new Home();

            } else {

                JOptionPane.showMessageDialog(null, "Invalid Username or Password");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }

    }
}