
///**
// *
// * @author pallavi
// */
package employee.management.system;

import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.*;
import javax.swing.border.*;
import java.util.Calendar;

public class Home extends JFrame implements ActionListener{

    RoundedButton addemp,view,update,remove;

    JLabel clockLabel;
    JLabel dateLabel;

    Timer timer;

    public Home(){

        setTitle("Employee Management System");

        setSize(1300,720);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(null);

        getContentPane().setBackground(new Color(241,245,249));



        //=========================
        // HEADER
        //=========================

        JPanel header=new JPanel(null);

        header.setBackground(new Color(37,99,235));

        header.setBounds(0,0,1300,90);

        add(header);



        JLabel title=new JLabel("Employee Management System");

        title.setBounds(40,12,500,35);

        title.setForeground(Color.WHITE);

        title.setFont(new Font("Segoe UI",Font.BOLD,30));

        header.add(title);



        JLabel subtitle=new JLabel("HR Dashboard");

        subtitle.setBounds(42,48,300,20);

        subtitle.setForeground(new Color(220,230,255));

        subtitle.setFont(new Font("Segoe UI",Font.PLAIN,16));

        header.add(subtitle);



        clockLabel=new JLabel();

        clockLabel.setBounds(1040,18,220,25);

        clockLabel.setForeground(Color.WHITE);

        clockLabel.setHorizontalAlignment(SwingConstants.RIGHT);

        clockLabel.setFont(new Font("Segoe UI",Font.BOLD,16));

        header.add(clockLabel);



        dateLabel=new JLabel();

        dateLabel.setBounds(1000,45,260,20);

        dateLabel.setHorizontalAlignment(SwingConstants.RIGHT);

        dateLabel.setForeground(Color.WHITE);

        dateLabel.setFont(new Font("Segoe UI",Font.PLAIN,15));

        header.add(dateLabel);



        timer=new Timer(1000,new ActionListener(){

            @Override

            public void actionPerformed(ActionEvent e){

                Date now=new Date();

                clockLabel.setText(new SimpleDateFormat("hh:mm:ss a").format(now));

                dateLabel.setText(new SimpleDateFormat("EEEE, dd MMMM yyyy").format(now));

            }

        });

        timer.start();



        //======================
        // LEFT PANEL
        //======================

        JPanel left=new JPanel(null);

        left.setBounds(35,115,520,530);

        left.setBackground(Color.WHITE);

        left.setBorder(new CompoundBorder(

                new LineBorder(new Color(220,225,235),1,true),

                new EmptyBorder(20,20,20,20)

        ));

        add(left);



        JLabel welcome=new JLabel("Welcome Admin 👋");

        welcome.setBounds(30,20,350,35);

        welcome.setFont(new Font("Segoe UI",Font.BOLD,28));

        left.add(welcome);



        JLabel msg=new JLabel("<html>Manage employees efficiently using your desktop HR system.<br>"
                +"Create, update, search and remove employees with ease.</html>");

        msg.setBounds(30,60,420,60);

        msg.setForeground(Color.GRAY);

        msg.setFont(new Font("Segoe UI",Font.PLAIN,16));

        left.add(msg);



        JPanel calendarPanel=new JPanel();

        calendarPanel.setLayout(new BorderLayout());

        calendarPanel.setBounds(30,135,450,110);

        calendarPanel.setBackground(new Color(239,246,255));

        calendarPanel.setBorder(new LineBorder(new Color(180,210,255),1,true));



        JLabel calTitle=new JLabel("Today's Calendar",SwingConstants.CENTER);

        calTitle.setFont(new Font("Segoe UI",Font.BOLD,18));

        calendarPanel.add(calTitle,BorderLayout.NORTH);



        Calendar c=Calendar.getInstance();

        JLabel calData=new JLabel(

                "<html><center><h1>"+c.get(Calendar.DAY_OF_MONTH)+"</h1>"+

                new SimpleDateFormat("MMMM yyyy").format(new Date())+

                "</center></html>",

                SwingConstants.CENTER

        );



        calendarPanel.add(calData);

        left.add(calendarPanel);



        JLabel dash=new JLabel("Dashboard");

        dash.setBounds(30,270,250,30);

        dash.setFont(new Font("Segoe UI",Font.BOLD,24));

        left.add(dash);





        addemp=new RoundedButton("➕  Add Employee");

        addemp.setBounds(30,320,200,55);

        addemp.setBackground(new Color(37,99,235));

        addemp.setForeground(Color.WHITE);

        addemp.setFont(new Font("Segoe UI",Font.BOLD,16));

        addemp.addActionListener(this);

        left.add(addemp);



        view=new RoundedButton("👥  View Employees");

        view.setBounds(250,320,200,55);

        view.setBackground(new Color(16,185,129));

        view.setForeground(Color.WHITE);

        view.setFont(new Font("Segoe UI",Font.BOLD,16));

        view.addActionListener(this);

        left.add(view);



        update=new RoundedButton("✏  Update");

        update.setBounds(30,400,200,55);

        update.setBackground(new Color(245,158,11));

        update.setForeground(Color.WHITE);

        update.setFont(new Font("Segoe UI",Font.BOLD,16));

        update.addActionListener(this);

        left.add(update);



        remove=new RoundedButton("🗑  Remove");

        remove.setBounds(250,400,200,55);

        remove.setBackground(new Color(239,68,68));

        remove.setForeground(Color.WHITE);

        remove.setFont(new Font("Segoe UI",Font.BOLD,16));

        remove.addActionListener(this);

        left.add(remove);



        JLabel version=new JLabel("Version 2.0");

        version.setBounds(30,490,150,20);

        version.setForeground(Color.GRAY);

        left.add(version);



        //=========================
        // RIGHT PANEL
        //=========================

        JPanel right=new JPanel(null);

        right.setBounds(585,115,670,530);

        right.setBackground(Color.WHITE);

        right.setBorder(new LineBorder(new Color(220,225,235),1,true));

        add(right);



        ImageIcon icon=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.jpg"));

        Image img=icon.getImage().getScaledInstance(620,460,Image.SCALE_SMOOTH);

        JLabel pic=new JLabel(new ImageIcon(img));

        pic.setBounds(20,30,620,460);

        right.add(pic);



        setVisible(true);

    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == addemp) {

            setVisible(false);
            new AddEmployee();

        } 
        else if (ae.getSource() == view) {

            setVisible(false);
            new ViewEmployee();

        } 
       else if (ae.getSource() == update) {

    setVisible(false);

    new ViewEmployee();

}
        else if (ae.getSource() == remove) {
 setVisible(false);

    new RemoveEmployee();

        }

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Home());
    }

}