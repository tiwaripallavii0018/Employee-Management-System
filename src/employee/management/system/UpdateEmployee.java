
package employee.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;

public class UpdateEmployee extends JFrame implements ActionListener {

    RoundedButton update, back;

    JTextField tfsalary, tfaddress, tfphone, tfemail,
            tfeducation, tfdesignation;

    JLabel lblname, lblfather, lbldob,
            lblaadhar, lblempid;

    String empId;

    public UpdateEmployee(String empId) {

        this.empId = empId;

        setTitle("Update Employee");

        setSize(1100,780);

        setLocationRelativeTo(null);

        setLayout(null);

        getContentPane().setBackground(new Color(241,245,249));



        //========================
        // HEADER
        //========================

        JPanel header = new JPanel(null);

        header.setBounds(0,0,1100,90);

        header.setBackground(new Color(37,99,235));

        add(header);



        JLabel title = new JLabel("Update Employee");

        title.setBounds(40,18,350,35);

        title.setForeground(Color.WHITE);

        title.setFont(new Font("Segoe UI",Font.BOLD,30));

        header.add(title);



        JLabel sub = new JLabel("Modify employee information");

        sub.setBounds(42,55,320,18);

        sub.setForeground(new Color(220,230,255));

        sub.setFont(new Font("Segoe UI",Font.PLAIN,15));

        header.add(sub);



        //========================
        // FORM CARD
        //========================

        JPanel card = new JPanel(null);

        card.setBounds(40,120,1020,580);

        card.setBackground(Color.WHITE);

        card.setBorder(new CompoundBorder(

                new LineBorder(new Color(220,225,235),1,true),

                new EmptyBorder(20,20,20,20)

        ));

        add(card);



        JLabel formTitle = new JLabel("Employee Details");

        formTitle.setBounds(35,20,300,30);

        formTitle.setFont(new Font("Segoe UI",Font.BOLD,24));

        card.add(formTitle);



        //========================
        // NAME
        //========================

        JLabel lname = new JLabel("Full Name");

        lname.setBounds(40,80,150,20);

        lname.setFont(new Font("Segoe UI",Font.BOLD,15));

        card.add(lname);



        lblname = new JLabel();

        lblname.setBounds(40,105,380,35);

        lblname.setFont(new Font("Segoe UI",Font.PLAIN,16));

        card.add(lblname);



        //========================
        // FATHER NAME
        //========================

        JLabel lfather = new JLabel("Father's Name");

        lfather.setBounds(540,80,150,20);

        lfather.setFont(new Font("Segoe UI",Font.BOLD,15));

        card.add(lfather);



        lblfather = new JLabel();

        lblfather.setBounds(540,105,380,35);

        lblfather.setFont(new Font("Segoe UI",Font.PLAIN,16));

        card.add(lblfather);



        //========================
        // DOB
        //========================

        JLabel ldob = new JLabel("Date of Birth");

        ldob.setBounds(40,165,150,20);

        ldob.setFont(new Font("Segoe UI",Font.BOLD,15));

        card.add(ldob);



        lbldob = new JLabel();

        lbldob.setBounds(40,190,380,35);

        lbldob.setFont(new Font("Segoe UI",Font.PLAIN,16));

        card.add(lbldob);



        //========================
        // SALARY
        //========================

        JLabel lsalary = new JLabel("Salary");

        lsalary.setBounds(540,165,150,20);

        lsalary.setFont(new Font("Segoe UI",Font.BOLD,15));

        card.add(lsalary);



        tfsalary = new JTextField();

        tfsalary.setBounds(540,190,350,42);

        tfsalary.setFont(new Font("Segoe UI",Font.PLAIN,15));

        card.add(tfsalary);



        //========================
        // ADDRESS
        //========================

        JLabel laddress = new JLabel("Address");

        laddress.setBounds(40,255,150,20);

        laddress.setFont(new Font("Segoe UI",Font.BOLD,15));

        card.add(laddress);



        tfaddress = new JTextField();

        tfaddress.setBounds(40,280,380,42);

        tfaddress.setFont(new Font("Segoe UI",Font.PLAIN,15));

        card.add(tfaddress);



        //========================
        // PHONE
        //========================

        JLabel lphone = new JLabel("Phone Number");

        lphone.setBounds(540,255,150,20);

        lphone.setFont(new Font("Segoe UI",Font.BOLD,15));

        card.add(lphone);



        tfphone = new JTextField();

        tfphone.setBounds(540,280,350,42);

        tfphone.setFont(new Font("Segoe UI",Font.PLAIN,15));

        card.add(tfphone);
                //========================
        // EMAIL
        //========================

        JLabel lemail = new JLabel("Email");

        lemail.setBounds(40,345,150,20);

        lemail.setFont(new Font("Segoe UI",Font.BOLD,15));

        card.add(lemail);

        tfemail = new JTextField();

        tfemail.setBounds(40,370,380,42);

        tfemail.setFont(new Font("Segoe UI",Font.PLAIN,15));

        card.add(tfemail);



        //========================
        // EDUCATION
        //========================

        JLabel leducation = new JLabel("Education");

        leducation.setBounds(540,345,150,20);

        leducation.setFont(new Font("Segoe UI",Font.BOLD,15));

        card.add(leducation);

        tfeducation = new JTextField();

        tfeducation.setBounds(540,370,350,42);

        tfeducation.setFont(new Font("Segoe UI",Font.PLAIN,15));

        card.add(tfeducation);



        //========================
        // DESIGNATION
        //========================

        JLabel ldesignation = new JLabel("Designation");

        ldesignation.setBounds(40,435,150,20);

        ldesignation.setFont(new Font("Segoe UI",Font.BOLD,15));

        card.add(ldesignation);

        tfdesignation = new JTextField();

        tfdesignation.setBounds(40,460,380,42);

        tfdesignation.setFont(new Font("Segoe UI",Font.PLAIN,15));

        card.add(tfdesignation);



        //========================
        // AADHAR
        //========================

        JLabel laadhar = new JLabel("Aadhar Number");

        laadhar.setBounds(540,435,150,20);

        laadhar.setFont(new Font("Segoe UI",Font.BOLD,15));

        card.add(laadhar);

        lblaadhar = new JLabel();

        lblaadhar.setBounds(540,462,350,30);

        lblaadhar.setFont(new Font("Segoe UI",Font.PLAIN,16));

        card.add(lblaadhar);



        //========================
        // EMPLOYEE ID
        //========================

        JLabel leid = new JLabel("Employee ID");

        leid.setBounds(40,520,150,20);

        leid.setFont(new Font("Segoe UI",Font.BOLD,15));

        card.add(leid);

        lblempid = new JLabel();

        lblempid.setBounds(170,520,180,25);

        lblempid.setFont(new Font("Segoe UI",Font.BOLD,16));

        lblempid.setForeground(new Color(37,99,235));

        card.add(lblempid);



        //========================
        // LOAD EMPLOYEE DATA
        //========================

        try{

            Con c = new Con();

            String query = "select * from employee where empId='"+empId+"'";

            ResultSet rs = c.s.executeQuery(query);

            if(rs.next()){

                lblname.setText(rs.getString("name"));

                lblfather.setText(rs.getString("father"));

                lbldob.setText(rs.getString("dob"));

                tfsalary.setText(rs.getString("salary"));

                tfaddress.setText(rs.getString("address"));

                tfphone.setText(rs.getString("phone"));

                tfeducation.setText(rs.getString("education"));

                tfdesignation.setText(rs.getString("designation"));

                tfemail.setText(rs.getString("email"));

                lblaadhar.setText(rs.getString("aadhar"));

                lblempid.setText(rs.getString("empId"));

            }

        }catch(Exception e){

            e.printStackTrace();

        }



        //========================
        // BUTTONS
        //========================

        update = new RoundedButton("✔ Update");

        update.setBounds(620,515,130,45);

        update.setBackground(new Color(37,99,235));

        update.setForeground(Color.WHITE);

        update.setFont(new Font("Segoe UI",Font.BOLD,15));

        update.addActionListener(this);

        card.add(update);



        back = new RoundedButton("← Back");

        back.setBounds(780,515,110,45);

        back.setBackground(new Color(107,114,128));

        back.setForeground(Color.WHITE);

        back.setFont(new Font("Segoe UI",Font.BOLD,15));

        back.addActionListener(this);

        card.add(back);



        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setResizable(false);

        setVisible(true);

    }
        @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == update) {

            String salary = tfsalary.getText();
            String address = tfaddress.getText();
            String phone = tfphone.getText();
            String email = tfemail.getText();
            String education = tfeducation.getText();
            String designation = tfdesignation.getText();

            if (salary.isEmpty() || address.isEmpty() || phone.isEmpty()
                    || email.isEmpty() || education.isEmpty()
                    || designation.isEmpty()) {

                JOptionPane.showMessageDialog(null,
                        "Please fill all fields!");

                return;
            }

            try {

                Con con = new Con();

                String query =
                        "update employee set "
                        + "salary='" + salary + "',"
                        + "address='" + address + "',"
                        + "phone='" + phone + "',"
                        + "email='" + email + "',"
                        + "education='" + education + "',"
                        + "designation='" + designation + "' "
                        + "where empId='" + empId + "'";

                con.s.executeUpdate(query);

                JOptionPane.showMessageDialog(null,
                        "Employee Updated Successfully");

                setVisible(false);

                new ViewEmployee();

            } catch (Exception ex) {

                ex.printStackTrace();

            }

        }

        else if (e.getSource() == back) {

            setVisible(false);

            new ViewEmployee();

        }

    }

    public static void main(String args[]) {

        SwingUtilities.invokeLater(() -> new UpdateEmployee(""));

    }

}