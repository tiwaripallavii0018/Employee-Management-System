package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.border.*;

public class RemoveEmployee extends JFrame implements ActionListener {

    RoundedButton delete, back;

    Choice cEmpId;

    JLabel lblName,
            lblFather,
            lblDob,
            lblSalary,
            lblPhone,
            lblAddress,
            lblEducation,
            lblDesignation,
            lblAadhar;

    public RemoveEmployee() {

        setTitle("Remove Employee");

        setSize(1050,720);

        setLocationRelativeTo(null);

        setResizable(false);

        setLayout(null);

        getContentPane().setBackground(new Color(240,244,249));



        //=========================
        // HEADER
        //=========================

        JPanel header = new JPanel(null);

        header.setBounds(0,0,1050,90);

        header.setBackground(new Color(220,38,38));

        add(header);

        JLabel title = new JLabel("Remove Employee");

        title.setBounds(35,18,350,35);

        title.setForeground(Color.WHITE);

        title.setFont(new Font("Segoe UI",Font.BOLD,30));

        header.add(title);

        JLabel sub = new JLabel("Delete employee records permanently");

        sub.setBounds(38,55,320,18);

        sub.setForeground(new Color(255,230,230));

        sub.setFont(new Font("Segoe UI",Font.PLAIN,15));

        header.add(sub);



        //=========================
        // CARD
        //=========================

        JPanel card = new JPanel(null);

        card.setBounds(40,120,960,520);

        card.setBackground(Color.WHITE);

        card.setBorder(new CompoundBorder(

                new LineBorder(new Color(220,220,220),1,true),

                new EmptyBorder(20,20,20,20)

        ));

        add(card);



        JLabel choose = new JLabel("Employee ID");

        choose.setBounds(40,30,120,20);

        choose.setFont(new Font("Segoe UI",Font.BOLD,15));

        card.add(choose);

        cEmpId = new Choice();

        cEmpId.setBounds(170,30,180,25);

        card.add(cEmpId);



        try{

            Con c = new Con();

            ResultSet rs = c.s.executeQuery("select * from employee");

            while(rs.next()){

                cEmpId.add(rs.getString("empId"));

            }

        }catch(Exception e){

            e.printStackTrace();

        }
                JLabel l1 = new JLabel("Name");
        l1.setBounds(60,90,150,25);
        l1.setFont(new Font("Segoe UI",Font.BOLD,15));
        card.add(l1);

        lblName = new JLabel();
        lblName.setBounds(230,90,300,25);
        lblName.setFont(new Font("Segoe UI",Font.PLAIN,15));
        card.add(lblName);



        JLabel l2 = new JLabel("Father's Name");
        l2.setBounds(60,135,150,25);
        card.add(l2);

        lblFather = new JLabel();
        lblFather.setBounds(230,135,300,25);
        card.add(lblFather);



        JLabel l3 = new JLabel("Date of Birth");
        l3.setBounds(60,180,150,25);
        card.add(l3);

        lblDob = new JLabel();
        lblDob.setBounds(230,180,300,25);
        card.add(lblDob);



        JLabel l4 = new JLabel("Salary");
        l4.setBounds(60,225,150,25);
        card.add(l4);

        lblSalary = new JLabel();
        lblSalary.setBounds(230,225,300,25);
        card.add(lblSalary);



        JLabel l5 = new JLabel("Phone");
        l5.setBounds(60,270,150,25);
        card.add(l5);

        lblPhone = new JLabel();
        lblPhone.setBounds(230,270,300,25);
        card.add(lblPhone);



        JLabel l6 = new JLabel("Address");
        l6.setBounds(60,315,150,25);
        card.add(l6);

        lblAddress = new JLabel();
        lblAddress.setBounds(230,315,450,25);
        card.add(lblAddress);



        JLabel l7 = new JLabel("Education");
        l7.setBounds(60,360,150,25);
        card.add(l7);

        lblEducation = new JLabel();
        lblEducation.setBounds(230,360,250,25);
        card.add(lblEducation);



        JLabel l8 = new JLabel("Designation");
        l8.setBounds(60,405,150,25);
        card.add(l8);

        lblDesignation = new JLabel();
        lblDesignation.setBounds(230,405,250,25);
        card.add(lblDesignation);



        JLabel l9 = new JLabel("Aadhar");
        l9.setBounds(60,450,150,25);
        card.add(l9);

        lblAadhar = new JLabel();
        lblAadhar.setBounds(230,450,250,25);
        card.add(lblAadhar);
                //=========================
        // LOAD EMPLOYEE DETAILS
        //=========================

        loadEmployee();

        cEmpId.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {

                loadEmployee();

            }
        });



        //=========================
        // BUTTONS
        //=========================

        delete = new RoundedButton("🗑 Delete");

        delete.setBounds(620,445,130,45);

        delete.setBackground(new Color(220,38,38));

        delete.setForeground(Color.WHITE);

        delete.setFont(new Font("Segoe UI",Font.BOLD,15));

        delete.addActionListener(this);

        card.add(delete);



        back = new RoundedButton("← Back");

        back.setBounds(780,445,120,45);

        back.setBackground(new Color(107,114,128));

        back.setForeground(Color.WHITE);

        back.setFont(new Font("Segoe UI",Font.BOLD,15));

        back.addActionListener(this);

        card.add(back);



        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);

    }



    //=========================
    // LOAD DATA
    //=========================

    private void loadEmployee() {

        try {

            Con c = new Con();

            ResultSet rs = c.s.executeQuery(

                    "select * from employee where empId='" +
                    cEmpId.getSelectedItem() + "'");

            if (rs.next()) {

                lblName.setText(rs.getString("name"));

                lblFather.setText(rs.getString("father"));

                lblDob.setText(rs.getString("dob"));

                lblSalary.setText(rs.getString("salary"));

                lblPhone.setText(rs.getString("phone"));

                lblAddress.setText(rs.getString("address"));

                lblEducation.setText(rs.getString("education"));

                lblDesignation.setText(rs.getString("designation"));

                lblAadhar.setText(rs.getString("aadhar"));

            }

        } catch (Exception e) {

            e.printStackTrace();

        }

    }



    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == delete) {

            int option = JOptionPane.showConfirmDialog(

                    this,

                    "Are you sure you want to delete this employee?",

                    "Confirm Delete",

                    JOptionPane.YES_NO_OPTION);

            if (option == JOptionPane.YES_OPTION) {

                try {

                    Con c = new Con();

                    c.s.executeUpdate(

                            "delete from employee where empId='"

                            + cEmpId.getSelectedItem() + "'");

                    JOptionPane.showMessageDialog(

                            this,

                            "Employee Deleted Successfully");

                    setVisible(false);

                    new ViewEmployee();

                } catch (Exception ex) {

                    ex.printStackTrace();

                }

            }

        }

        else if (e.getSource() == back) {

            setVisible(false);

            new Home();

        }

    }



    public static void main(String args[]) {

        SwingUtilities.invokeLater(() -> new RemoveEmployee());

    }

}