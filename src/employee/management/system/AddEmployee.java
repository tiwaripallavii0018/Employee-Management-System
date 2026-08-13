
package employee.management.system;

import com.toedter.calendar.JDateChooser;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import javax.swing.border.*;

public class AddEmployee extends JFrame implements ActionListener {

    RoundedButton add, back;

    JTextField tfname, tffather, tfsalary, tfaddress,
            tfphone, tfemail, tfdesignation, tfaadhar;

    JComboBox<String> cbeducation;

    JLabel lblempid;

    JDateChooser dob;

    Random random = new Random();
    int number = random.nextInt(900000) + 100000;

    AddEmployee() {

        setTitle("Add Employee");
//        setSize(1100, 700);
setSize(1120,780);

        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);

        getContentPane().setBackground(new Color(242,245,250));

        //==========================
        // HEADER
        //==========================

        JPanel header = new JPanel();
        header.setLayout(null);
        header.setBackground(new Color(37,99,235));
        header.setBounds(0,0,1100,90);
        add(header);

        JLabel title = new JLabel("Add New Employee");
        title.setBounds(40,18,350,35);
        title.setFont(new Font("Segoe UI",Font.BOLD,34));
        title.setForeground(Color.WHITE);
        header.add(title);

        JLabel subtitle = new JLabel("Fill employee information");
        subtitle.setBounds(43,55,250,20);
        subtitle.setForeground(new Color(225,235,255));
        subtitle.setFont(new Font("Segoe UI",Font.PLAIN,15));
        header.add(subtitle);

        //==========================
        // MAIN CARD
        //==========================

        JPanel card = new JPanel();
        card.setLayout(null);
        card.setBackground(Color.WHITE);
//        card.setBounds(40,120,1000,510);
card.setBounds(35,120,1030,610);
        card.setBorder(new CompoundBorder(
                new LineBorder(new Color(220,225,230),1,true),
                new EmptyBorder(20,20,20,20)));

        add(card);

        JLabel info = new JLabel("Employee Information");
        info.setBounds(35,20,350,30);
        info.setFont(new Font("Segoe UI",Font.BOLD,26));
        card.add(info);

        //---------------------------
        // NAME
        //---------------------------

        JLabel lname = new JLabel("Full Name");
        lname.setBounds(40,80,120,20);
        lname.setFont(new Font("Segoe UI",Font.BOLD,15));
        card.add(lname);

        tfname = new JTextField();
        tfname.setBounds(40,105,380,40);
        tfname.setFont(new Font("Segoe UI",Font.PLAIN,15));
        tfname.setBorder(BorderFactory.createLineBorder(new Color(210,215,225),1,true));
        card.add(tfname);

        //---------------------------
        // FATHER NAME
        //---------------------------

        JLabel lfather = new JLabel("Father's Name");
        lfather.setBounds(540,80,150,20);
        lfather.setFont(new Font("Segoe UI",Font.BOLD,15));
        card.add(lfather);

        tffather = new JTextField();
        tffather.setBounds(540,105,380,40);
        tffather.setFont(new Font("Segoe UI",Font.PLAIN,15));
        tffather.setBorder(BorderFactory.createLineBorder(new Color(210,215,225),1,true));
        card.add(tffather);

        //---------------------------
        // DOB
        //---------------------------

        JLabel ldob = new JLabel("Date of Birth");
        ldob.setBounds(40,165,150,20);
        ldob.setFont(new Font("Segoe UI",Font.BOLD,15));
        card.add(ldob);

        dob = new JDateChooser();
        dob.setBounds(40,190,380,40);
        dob.setFont(new Font("Segoe UI",Font.PLAIN,15));
        card.add(dob);

        //---------------------------
        // SALARY
        //---------------------------

        JLabel lsalary = new JLabel("Salary");
        lsalary.setBounds(540,165,120,20);
        lsalary.setFont(new Font("Segoe UI",Font.BOLD,15));
        card.add(lsalary);

        tfsalary = new JTextField();
        tfsalary.setBounds(540,190,380,40);
        tfsalary.setFont(new Font("Segoe UI",Font.PLAIN,15));
        tfsalary.setBorder(BorderFactory.createLineBorder(new Color(210,215,225),1,true));
        card.add(tfsalary);

        //---------------------------
        // ADDRESS
        //---------------------------

        JLabel laddress = new JLabel("Address");
        laddress.setBounds(40,250,120,20);
        laddress.setFont(new Font("Segoe UI",Font.BOLD,15));
        card.add(laddress);

        tfaddress = new JTextField();
        tfaddress.setBounds(40,275,380,40);
        tfaddress.setFont(new Font("Segoe UI",Font.PLAIN,15));
        tfaddress.setBorder(BorderFactory.createLineBorder(new Color(210,215,225),1,true));
        card.add(tfaddress);

        //---------------------------
        // PHONE
        //---------------------------

        JLabel lphone = new JLabel("Phone Number");
        lphone.setBounds(540,250,150,20);
        lphone.setFont(new Font("Segoe UI",Font.BOLD,15));
        card.add(lphone);

        tfphone = new JTextField();
        tfphone.setBounds(540,275,380,40);
        tfphone.setFont(new Font("Segoe UI",Font.PLAIN,15));
        tfphone.setBorder(BorderFactory.createLineBorder(new Color(210,215,225),1,true));
        card.add(tfphone);
               //---------------------------
        // EMAIL
        //---------------------------

        JLabel lemail = new JLabel("Email Address");
        lemail.setBounds(40,335,150,20);
        lemail.setFont(new Font("Segoe UI",Font.BOLD,15));
        card.add(lemail);

        tfemail = new JTextField();
        tfemail.setBounds(40,360,380,40);
        tfemail.setFont(new Font("Segoe UI",Font.PLAIN,15));
        tfemail.setBorder(BorderFactory.createLineBorder(new Color(210,215,225),1,true));
        card.add(tfemail);

        //---------------------------
        // EDUCATION
        //---------------------------

        JLabel ledu = new JLabel("Highest Education");
        ledu.setBounds(540,335,170,20);
        ledu.setFont(new Font("Segoe UI",Font.BOLD,15));
        card.add(ledu);

        String[] courses = {
            "10th",
            "12th",
            "Diploma",
            "BCA",
            "B.Tech",
            "B.Sc",
            "B.Com",
            "BA",
            "MCA",
            "M.Tech",
            "MBA",
            "M.Sc",
            "M.Com",
            "MA",
            "PhD",
            "Other"
        };

        cbeducation = new JComboBox<>(courses);
        cbeducation.setBounds(540,360,380,40);
        cbeducation.setFont(new Font("Segoe UI",Font.PLAIN,15));
        cbeducation.setBackground(Color.WHITE);
        card.add(cbeducation);

        //---------------------------
        // DESIGNATION
        //---------------------------

        JLabel ldes = new JLabel("Designation");
        ldes.setBounds(40,420,150,20);
        ldes.setFont(new Font("Segoe UI",Font.BOLD,15));
        card.add(ldes);

        tfdesignation = new JTextField();
        tfdesignation.setBounds(40,445,250,40);
        tfdesignation.setFont(new Font("Segoe UI",Font.PLAIN,15));
        tfdesignation.setBorder(BorderFactory.createLineBorder(new Color(210,215,225),1,true));
        card.add(tfdesignation);

        //---------------------------
        // AADHAR
        //---------------------------

        JLabel laadhar = new JLabel("Aadhar Number");
        laadhar.setBounds(320,420,160,20);
        laadhar.setFont(new Font("Segoe UI",Font.BOLD,15));
        card.add(laadhar);

        tfaadhar = new JTextField();
        tfaadhar.setBounds(320,445,250,40);
        tfaadhar.setFont(new Font("Segoe UI",Font.PLAIN,15));
        tfaadhar.setBorder(BorderFactory.createLineBorder(new Color(210,215,225),1,true));
        card.add(tfaadhar);

        //---------------------------
        // EMPLOYEE ID
        //---------------------------

        JLabel lid = new JLabel("Employee ID");
        lid.setBounds(610,420,150,20);
        lid.setFont(new Font("Segoe UI",Font.BOLD,15));
        card.add(lid);

        JPanel idPanel = new JPanel();
        idPanel.setLayout(new BorderLayout());
        idPanel.setBackground(new Color(219,234,254));
        idPanel.setBounds(610,445,120,40);

        lblempid = new JLabel(String.valueOf(number),SwingConstants.CENTER);
        lblempid.setFont(new Font("Segoe UI",Font.BOLD,18));
        lblempid.setForeground(new Color(37,99,235));

        idPanel.add(lblempid);

        card.add(idPanel);

        //---------------------------
        // BUTTONS
        //---------------------------

        add = new RoundedButton("➕ Add Employee");
//        add.setBounds(760,430,180,45);
add.setBounds(790,430,145,40);
        add.setBackground(new Color(37,99,235));
        add.setForeground(Color.WHITE);
        add.setFont(new Font("Segoe UI",Font.BOLD,15));
        add.setCursor(new Cursor(Cursor.HAND_CURSOR));
        add.addActionListener(this);
        card.add(add);

        back = new RoundedButton("← Back");
//        back.setBounds(760,485,180,45);
back.setBounds(790,480,145,40);
        back.setBackground(new Color(107,114,128));
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Segoe UI",Font.BOLD,15));
        back.setCursor(new Cursor(Cursor.HAND_CURSOR));
        back.addActionListener(this);
        card.add(back);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == add) {

            String name = tfname.getText().trim();
            String father = tffather.getText().trim();
            String dateOB = ((JTextField) dob.getDateEditor().getUiComponent()).getText();
            String salary = tfsalary.getText().trim();
            String address = tfaddress.getText().trim();
            String phone = tfphone.getText().trim();
            String email = tfemail.getText().trim();     // Collected for validation
            String education = (String) cbeducation.getSelectedItem();
            String designation = tfdesignation.getText().trim();
            String aadhar = tfaadhar.getText().trim();
            String empId = lblempid.getText();

            // Validation
            if (name.isEmpty() ||
                father.isEmpty() ||
                dateOB.isEmpty() ||
                salary.isEmpty() ||
                address.isEmpty() ||
                phone.isEmpty() ||
                email.isEmpty() ||
                designation.isEmpty() ||
                aadhar.isEmpty()) {

                JOptionPane.showMessageDialog(
                        this,
                        "Please fill all the fields.",
                        "Missing Information",
                        JOptionPane.WARNING_MESSAGE);

                return;
            }

            try {

                Con con = new Con();

                // Same database structure as your original project
                String query =
                        "insert into employee values('"
                        + name + "','"
                        + father + "','"
                        + dateOB + "','"
                        + salary + "','"
                        + address + "','"
                        + phone + "','"
                        + education + "','"
                        + designation + "','"
                        + aadhar + "','"
                        + empId + "')";

                con.s.executeUpdate(query);

                JOptionPane.showMessageDialog(
                        this,
                        "Employee Added Successfully!");

                dispose();
                new Home();

            } catch (Exception ex) {

                ex.printStackTrace();

                JOptionPane.showMessageDialog(
                        this,
                        "Unable to add employee.",
                        "Database Error",
                        JOptionPane.ERROR_MESSAGE);
            }

        } else if (e.getSource() == back) {

            dispose();
            new Home();
        }
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(() -> new AddEmployee());

    }
}