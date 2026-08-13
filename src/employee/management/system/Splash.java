package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener {

    RoundedButton click;

    Splash() {

        setTitle("Employee Management System");
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        // ================= TITLE =================

        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(120, 20, 900, 50);
        heading.setFont(new Font("Segoe UI", Font.BOLD, 40));
        heading.setForeground(new Color(0, 102, 204));
        add(heading);

        JLabel tagline = new JLabel("Smart • Secure • Efficient");
        tagline.setBounds(125, 65, 250, 20);
        tagline.setFont(new Font("Segoe UI", Font.PLAIN, 16));
        tagline.setForeground(Color.GRAY);
        add(tagline);

        // ================= BACKGROUND IMAGE =================

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/frontpage.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1070, 500, Image.SCALE_SMOOTH);
        ImageIcon i3 = new ImageIcon(i2);

        JLabel image = new JLabel(i3);
        image.setBounds(40, 100, 1070, 500);
        image.setLayout(null);
        add(image);

        // ================= LEFT CARD =================

        JPanel card = new JPanel();
        card.setLayout(null);
        card.setBackground(new Color(255,255,255));
        card.setBounds(40,55,360,340);

        image.add(card);

        // ================= WELCOME =================

        JLabel welcome = new JLabel("Welcome");
        welcome.setBounds(35,25,250,40);
        welcome.setFont(new Font("Segoe UI",Font.BOLD,34));
        welcome.setForeground(new Color(0,102,204));
        card.add(welcome);

        JLabel sub = new JLabel("to Employee Management System");
        sub.setBounds(38,68,280,25);
        sub.setFont(new Font("Segoe UI",Font.PLAIN,17));
        sub.setForeground(Color.DARK_GRAY);
        card.add(sub);

        // ================= DESCRIPTION =================

        JLabel desc = new JLabel(
                "<html>"
                + "Manage your workforce through a modern desktop application."
                + "<br><br>"
                + "Simple, secure and designed for efficient employee administration."
                + "</html>");

        desc.setBounds(35,115,290,110);
        desc.setFont(new Font("Segoe UI",Font.PLAIN,16));
        desc.setForeground(new Color(70,70,70));

        card.add(desc);

        // ================= BUTTON =================

        click = new RoundedButton("Get Started  ➜");

        click.setBounds(65,250,220,48);
        click.setBackground(new Color(0,102,204));
        click.setForeground(Color.WHITE);
        click.setFont(new Font("Segoe UI",Font.BOLD,17));
        click.setFocusPainted(false);
        click.setCursor(new Cursor(Cursor.HAND_CURSOR));

        click.addMouseListener(new MouseAdapter(){

            @Override
            public void mouseEntered(MouseEvent e){
                click.setBackground(new Color(33,150,243));
            }

            @Override
            public void mouseExited(MouseEvent e){
                click.setBackground(new Color(0,102,204));
            }

        });

        click.addActionListener(this);

        card.add(click);

        // ================= FRAME =================

        setSize(1170,650);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        setVisible(false);
        new Login();

    }

    public static void main(String[] args) {
        new Splash();
    }
}