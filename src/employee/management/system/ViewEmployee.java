
package employee.management.system;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import net.proteanit.sql.DbUtils;

public class ViewEmployee extends JFrame implements ActionListener {

    RoundedButton search, print, update, back;

    JTable table;

    Choice cemployeeID;

    public ViewEmployee() {

        setTitle("View Employees");

        setLayout(null);

        getContentPane().setBackground(new Color(240,244,249));

        //==========================
        // HEADER
        //==========================

        JPanel header = new JPanel(null);
        header.setBounds(0,0,1200,90);
        header.setBackground(new Color(37,99,235));
        add(header);

        JLabel heading = new JLabel("Employee Records");
        heading.setBounds(35,18,350,35);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("Segoe UI",Font.BOLD,30));
        header.add(heading);

        JLabel subtitle = new JLabel("Search, update and manage employees");
        subtitle.setBounds(38,55,350,20);
        subtitle.setForeground(new Color(220,230,255));
        subtitle.setFont(new Font("Segoe UI",Font.PLAIN,15));
        header.add(subtitle);

        //==========================
        // SEARCH CARD
        //==========================

        JPanel topPanel = new JPanel(null);
        topPanel.setBounds(30,110,1140,90);
        topPanel.setBackground(Color.WHITE);
        add(topPanel);

        JLabel searchLabel = new JLabel("Employee ID");
        searchLabel.setBounds(25,18,120,20);
        searchLabel.setFont(new Font("Segoe UI",Font.BOLD,15));
        topPanel.add(searchLabel);

        cemployeeID = new Choice();
        cemployeeID.setBounds(25,45,220,28);
        topPanel.add(cemployeeID);

        try{

            Con c = new Con();

            ResultSet rs = c.s.executeQuery("select * from employee");

            while(rs.next()){

                cemployeeID.add(rs.getString("empId"));

            }

        }catch(Exception e){

            e.printStackTrace();

        }

        //==========================
        // BUTTONS
        //==========================

        search = new RoundedButton("🔍 Search");
        search.setBounds(290,38,130,40);
        search.setBackground(new Color(37,99,235));
        search.setForeground(Color.WHITE);
        search.setFont(new Font("Segoe UI",Font.BOLD,14));
        search.addActionListener(this);
        topPanel.add(search);

        print = new RoundedButton("🖨 Print");
        print.setBounds(440,38,120,40);
        print.setBackground(new Color(22,163,74));
        print.setForeground(Color.WHITE);
        print.setFont(new Font("Segoe UI",Font.BOLD,14));
        print.addActionListener(this);
        topPanel.add(print);

        update = new RoundedButton("✏ Update");
        update.setBounds(580,38,130,40);
        update.setBackground(new Color(234,179,8));
        update.setForeground(Color.WHITE);
        update.setFont(new Font("Segoe UI",Font.BOLD,14));
        update.addActionListener(this);
        topPanel.add(update);

        back = new RoundedButton("← Back");
        back.setBounds(730,38,120,40);
        back.setBackground(new Color(107,114,128));
        back.setForeground(Color.WHITE);
        back.setFont(new Font("Segoe UI",Font.BOLD,14));
        back.addActionListener(this);
        topPanel.add(back);

        //==========================
        // TABLE
        //==========================

        table = new JTable();

        table.setRowHeight(28);

        table.setFont(new Font("Segoe UI",Font.PLAIN,14));

        table.getTableHeader().setFont(new Font("Segoe UI",Font.BOLD,15));

        table.getTableHeader().setBackground(new Color(37,99,235));

        table.getTableHeader().setForeground(Color.WHITE);

        table.setGridColor(new Color(230,230,230));

        table.setSelectionBackground(new Color(219,234,254));

        try{

            Con c = new Con();

            ResultSet rs = c.s.executeQuery("select * from employee");

            table.setModel(DbUtils.resultSetToTableModel(rs));

        }catch(Exception e){

            e.printStackTrace();

        }

        JScrollPane jsp = new JScrollPane(table);

        jsp.setBounds(30,220,1140,470);

        add(jsp);
                //==========================
        // TABLE STYLE
        //==========================

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);

        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        table.setShowVerticalLines(false);
        table.setShowHorizontalLines(true);
        table.setIntercellSpacing(new Dimension(0, 1));

        // Alternate row colors
        table.setDefaultRenderer(Object.class, new DefaultTableCellRenderer() {

            @Override
            public Component getTableCellRendererComponent(JTable table,
                    Object value,
                    boolean isSelected,
                    boolean hasFocus,
                    int row,
                    int column) {

                Component c = super.getTableCellRendererComponent(
                        table, value, isSelected, hasFocus, row, column);

                if (!isSelected) {

                    if (row % 2 == 0)
                        c.setBackground(Color.WHITE);
                    else
                        c.setBackground(new Color(248,250,252));

                }

                setHorizontalAlignment(CENTER);

                return c;
            }
        });

        //==========================
        // WINDOW SETTINGS
        //==========================

        setSize(1220,760);

        setLocationRelativeTo(null);

        setResizable(false);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setVisible(true);

    }

    public static void main(String args[]) {

        SwingUtilities.invokeLater(() -> new ViewEmployee());

    }
        @Override
    public void actionPerformed(ActionEvent ae) {

        if (ae.getSource() == search) {

            try {

                Con c = new Con();

                String query =
                        "select * from employee where empId='" +
                        cemployeeID.getSelectedItem() + "'";

                ResultSet rs = c.s.executeQuery(query);

                table.setModel(DbUtils.resultSetToTableModel(rs));

                table.setRowHeight(28);

                table.getTableHeader().setFont(
                        new Font("Segoe UI", Font.BOLD, 15));

                table.getTableHeader().setBackground(
                        new Color(37,99,235));

                table.getTableHeader().setForeground(Color.WHITE);

            } catch (Exception e) {

                e.printStackTrace();

            }

        }

        else if (ae.getSource() == print) {

            try {

                table.print();

            } catch (Exception e) {

                e.printStackTrace();

            }

        }

        else if (ae.getSource() == update) {

            setVisible(false);

            new UpdateEmployee(cemployeeID.getSelectedItem());

        }

        else if (ae.getSource() == back) {

            setVisible(false);

            new Home();

        }

    }

}