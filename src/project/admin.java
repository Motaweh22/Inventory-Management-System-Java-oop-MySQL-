/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package project;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static project.employee_f.c;
import static project.employee_f.query;
import static project.employee_f.ss;
import static project.employee_f.t;

/**
 *
 * @author mazen
 */
public class admin extends javax.swing.JFrame {
   static Connection c;
    static String query;
    static ResultSet t;
    static PreparedStatement ss;
    ArrayList<domain.user> userlist = new ArrayList<>();
     ArrayList<domain.user> userlist1 = new ArrayList<>();
     ArrayList<domain.user> userlist2 = new ArrayList<>();
    ArrayList<domain.search_user> arrr;
ArrayList<domain.search_user> marketingar;
ArrayList<domain.search_user> sellerar;
    /**
     * Creates new form admin
     */
    public admin() {
        initComponents();
        Show_table1();
         Show_table2();
         Show_table3();
    }
        public void Show_table1() {

        Connectionn c1 = new Connectionn();
        try {
            c = c1.connect();
            query = "select*from user";
            ss = c.prepareStatement(query);
            t = ss.executeQuery();
            DefaultTableModel mm = (DefaultTableModel) invantorylist.getModel();
            Object[] row = new Object[4];
            while (t.next()) {
                domain.user u1 = new domain.user(t.getString("invan_id"),t.getString("user_name"), t.getString("password"), t.getString("department"));
                userlist.add(u1);
            }
            for (int i = 0; i < userlist.size(); i++) {
                row[0] = userlist.get(i).getUserid();
                row[1] = userlist.get(i).getUser();
                row[2] = userlist.get(i).getPassword();
                row[3] = userlist.get(i).getDepartment();
               

                mm.addRow(row);
            }
//                Object[]row=new Object[2];
//                while(t.next()){
//                row[0]=t.getString("name");
//                row[1]=t.getString("password");
//                mm.addRow(row);
//                }
            System.out.println("al7mdllah");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
public void Show_table2() {

        Connectionn c1 = new Connectionn();
        try {
            c = c1.connect();
            query = "select*from marketingrmployee_log";
            ss = c.prepareStatement(query);
            t = ss.executeQuery();
            DefaultTableModel mmmm = (DefaultTableModel) marketinglist1.getModel();
            Object[] rowww = new Object[4];
            while (t.next()) {
                domain.user u1ll = new domain.user(t.getString("id"),t.getString("user_name"), t.getString("password"), t.getString("department"));
                userlist2.add(u1ll);
            }
            for (int i = 0; i < userlist2.size(); i++) {
                rowww[0] = userlist2.get(i).getUserid();
                rowww[1] = userlist2.get(i).getUser();
                rowww[2] = userlist2.get(i).getPassword();
                rowww[3] = userlist2.get(i).getDepartment();
               

                mmmm.addRow(rowww);
            }
//                Object[]row=new Object[2];
//                while(t.next()){
//                row[0]=t.getString("name");
//                row[1]=t.getString("password");
//                mm.addRow(row);
//                }
            System.out.println("al7mdllah");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
public void Show_table3() {

        Connectionn c1 = new Connectionn();
        try {
            c = c1.connect();
            query = "select*from seller_log";
            ss = c.prepareStatement(query);
            t = ss.executeQuery();
            DefaultTableModel mmm = (DefaultTableModel) seelerlist.getModel();
            Object[] roww = new Object[4];
            while (t.next()) {
                domain.user u1l = new domain.user(t.getString("seler_id"),t.getString("user_name"), t.getString("password"), t.getString("department"));
                userlist1.add(u1l);
            }
            for (int i = 0; i < userlist1.size(); i++) {
                roww[0] = userlist1.get(i).getUserid();
                roww[1] = userlist1.get(i).getUser();
                roww[2] = userlist1.get(i).getPassword();
                roww[3] = userlist1.get(i).getDepartment();
               

                mmm.addRow(roww);
            }
//                Object[]row=new Object[2];
//                while(t.next()){
//                row[0]=t.getString("name");
//                row[1]=t.getString("password");
//                mm.addRow(row);
//                }
            System.out.println("al7mdllah");
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        is5 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        is6 = new javax.swing.JTextField();
        is7 = new javax.swing.JTextField();
        iss5 = new javax.swing.JTextField();
        searchis3 = new javax.swing.JButton();
        log_out = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        deltex1 = new javax.swing.JTextField();
        deletei1 = new javax.swing.JButton();
        log_out1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        updatei4 = new javax.swing.JTextField();
        jLabel34 = new javax.swing.JLabel();
        updatei5 = new javax.swing.JTextField();
        updatei6 = new javax.swing.JPasswordField();
        jLabel35 = new javax.swing.JLabel();
        updatei7 = new javax.swing.JButton();
        log_out2 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        marketinglist1 = new javax.swing.JTable();
        log_out3 = new javax.swing.JButton();
        jPanel17 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        ai5 = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        ai6 = new javax.swing.JTextField();
        ai7 = new javax.swing.JPasswordField();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        ai8 = new javax.swing.JTextField();
        Add1 = new javax.swing.JButton();
        log_out4 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel12 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        ai9 = new javax.swing.JTextField();
        ai10 = new javax.swing.JTextField();
        ai11 = new javax.swing.JPasswordField();
        ai12 = new javax.swing.JTextField();
        Add2 = new javax.swing.JButton();
        log_out5 = new javax.swing.JButton();
        jPanel13 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        deltex2 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        deletei2 = new javax.swing.JButton();
        log_out6 = new javax.swing.JButton();
        jPanel14 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        updatei8 = new javax.swing.JTextField();
        jLabel46 = new javax.swing.JLabel();
        updatei9 = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        updatei10 = new javax.swing.JPasswordField();
        updatei11 = new javax.swing.JButton();
        log_out7 = new javax.swing.JButton();
        jPanel15 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        seelerlist = new javax.swing.JTable();
        log_out8 = new javax.swing.JButton();
        jPanel18 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        is8 = new javax.swing.JTextField();
        jLabel49 = new javax.swing.JLabel();
        is9 = new javax.swing.JTextField();
        jLabel50 = new javax.swing.JLabel();
        is10 = new javax.swing.JTextField();
        iss6 = new javax.swing.JTextField();
        jLabel51 = new javax.swing.JLabel();
        searchis2 = new javax.swing.JButton();
        log_out9 = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        ai1 = new javax.swing.JTextField();
        ai2 = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        ai3 = new javax.swing.JPasswordField();
        ai4 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        log_out10 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        deletei = new javax.swing.JButton();
        deltex = new javax.swing.JTextField();
        log_out11 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        updatei1 = new javax.swing.JTextField();
        updatei2 = new javax.swing.JTextField();
        updatei = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        updatei3 = new javax.swing.JPasswordField();
        log_out14 = new javax.swing.JButton();
        jPanel11 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        invantorylist = new javax.swing.JTable();
        log_out12 = new javax.swing.JButton();
        is4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        is1 = new javax.swing.JTextField();
        is2 = new javax.swing.JTextField();
        is3 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        searchis1 = new javax.swing.JButton();
        jLabel27 = new javax.swing.JLabel();
        iss4 = new javax.swing.JTextField();
        log_out13 = new javax.swing.JButton();
        jPanel16 = new javax.swing.JPanel();
        update = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Search Marketing Employee");

        jLabel36.setText("Input id to search ");

        jLabel37.setText("user name");

        jLabel38.setText("depart ment");

        jLabel39.setText("password");

        searchis3.setText("Search");
        searchis3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchis3ActionPerformed(evt);
            }
        });

        log_out.setBackground(new java.awt.Color(255, 0, 51));
        log_out.setForeground(new java.awt.Color(255, 255, 255));
        log_out.setText("log out");
        log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_outActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(log_out)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(106, 106, 106)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(is5, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                            .addComponent(is6)
                            .addComponent(is7)
                            .addComponent(iss5)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(searchis3)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1))
                    .addComponent(log_out))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(is5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel36))
                .addGap(44, 44, 44)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel37)
                    .addComponent(is6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(is7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(iss5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addComponent(searchis3)
                .addContainerGap())
        );

        jTabbedPane2.addTab("search", jPanel2);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setText("Delete Marketing Employee");

        jLabel32.setText("input id to delete");

        deletei1.setText("Delete");
        deletei1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletei1ActionPerformed(evt);
            }
        });

        log_out1.setBackground(new java.awt.Color(255, 0, 51));
        log_out1.setForeground(new java.awt.Color(255, 255, 255));
        log_out1.setText("log out");
        log_out1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_out1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(log_out1)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel2))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(deltex1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(deletei1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addComponent(log_out1))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel32)
                    .addComponent(deltex1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(deletei1)
                .addGap(116, 116, 116))
        );

        jTabbedPane2.addTab("delete", jPanel3);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setText("Update Marketing Employee");

        jLabel33.setText("input id to update");

        jLabel34.setText("User Name");

        jLabel35.setText("Password");

        updatei7.setText("Update");
        updatei7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatei7ActionPerformed(evt);
            }
        });

        log_out2.setBackground(new java.awt.Color(255, 0, 51));
        log_out2.setForeground(new java.awt.Color(255, 255, 255));
        log_out2.setText("log out");
        log_out2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_out2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(log_out2)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel3)
                        .addGap(0, 23, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(145, 145, 145))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(206, 206, 206)))
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updatei4, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(updatei5)
                            .addComponent(updatei6))))
                .addGap(231, 231, 231))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addComponent(updatei7, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3))
                    .addComponent(log_out2))
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel33)
                    .addComponent(updatei4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel34)
                    .addComponent(updatei5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(updatei6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(updatei7)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("update", jPanel4);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setText("List Marketing Employee");

        marketinglist1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Id", "User Name", "Password", "DepartMent"
            }
        ));
        marketinglist1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                marketinglist1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(marketinglist1);

        log_out3.setBackground(new java.awt.Color(255, 0, 51));
        log_out3.setForeground(new java.awt.Color(255, 255, 255));
        log_out3.setText("log out");
        log_out3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_out3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(log_out3)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel4)
                        .addGap(0, 291, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addComponent(log_out3))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("list", jPanel5);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel5.setText("Add Marketing Employee");

        jLabel28.setText("id");

        jLabel29.setText("user name");

        jLabel30.setText("password");

        jLabel31.setText("department");

        Add1.setText("Add");
        Add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add1ActionPerformed(evt);
            }
        });

        log_out4.setBackground(new java.awt.Color(255, 0, 51));
        log_out4.setForeground(new java.awt.Color(255, 255, 255));
        log_out4.setText("log out");
        log_out4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_out4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(log_out4)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel5))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel31, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addComponent(Add1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 186, Short.MAX_VALUE))
                            .addComponent(ai6)
                            .addComponent(ai5, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                            .addComponent(ai7)
                            .addComponent(ai8, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE))))
                .addGap(195, 195, 195))
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5))
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(log_out4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel17Layout.createSequentialGroup()
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel28)
                            .addComponent(ai5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jLabel29))
                            .addGroup(jPanel17Layout.createSequentialGroup()
                                .addGap(50, 50, 50)
                                .addComponent(ai6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)
                        .addComponent(ai7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel30, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(ai8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(Add1)
                .addGap(25, 25, 25))
        );

        jTabbedPane2.addTab("add", jPanel17);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("marketing", jPanel1);

        jTabbedPane4.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel6.setText("search Seller Employee");

        jLabel40.setText("id");

        jLabel41.setText("user name");

        jLabel42.setText("password");

        jLabel43.setText("department");

        Add2.setText("Add");
        Add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Add2ActionPerformed(evt);
            }
        });

        log_out5.setBackground(new java.awt.Color(255, 0, 51));
        log_out5.setForeground(new java.awt.Color(255, 255, 255));
        log_out5.setText("log out");
        log_out5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_out5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel43, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel12Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ai10, javax.swing.GroupLayout.DEFAULT_SIZE, 409, Short.MAX_VALUE)
                    .addComponent(ai11)
                    .addComponent(ai9)
                    .addComponent(ai12))
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(log_out5)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel6))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addComponent(Add2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6))
                    .addComponent(log_out5))
                .addGap(36, 36, 36)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40)
                    .addComponent(ai9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel41)
                    .addComponent(ai10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42)
                    .addComponent(ai11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(ai12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(Add2)
                .addGap(34, 34, 34))
        );

        jTabbedPane4.addTab("add", jPanel12);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel7.setText("Delete Seller Employee");

        jLabel44.setText("input id to delete");

        deletei2.setText("Delete");
        deletei2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletei2ActionPerformed(evt);
            }
        });

        log_out6.setBackground(new java.awt.Color(255, 0, 51));
        log_out6.setForeground(new java.awt.Color(255, 255, 255));
        log_out6.setText("log out");
        log_out6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_out6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(jLabel44, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addComponent(deltex2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(log_out6)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel7))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(deletei2, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7))
                    .addComponent(log_out6))
                .addGap(43, 43, 43)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deltex2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel44))
                .addGap(73, 73, 73)
                .addComponent(deletei2)
                .addContainerGap(177, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("delete", jPanel13);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel8.setText("Update Seller Employee");

        jLabel45.setText("input id to update");

        jLabel46.setText("User Name");

        jLabel47.setText("Password");

        updatei11.setText("Update");
        updatei11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatei11ActionPerformed(evt);
            }
        });

        log_out7.setBackground(new java.awt.Color(255, 0, 51));
        log_out7.setForeground(new java.awt.Color(255, 255, 255));
        log_out7.setText("log out");
        log_out7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_out7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(log_out7)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel8))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel14Layout.createSequentialGroup()
                                    .addComponent(jLabel46, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(jPanel14Layout.createSequentialGroup()
                                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(99, 99, 99)))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(125, 125, 125)))
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updatei8, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE)
                            .addComponent(updatei9)
                            .addComponent(updatei10))))
                .addGap(207, 207, 207))
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(updatei11, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8))
                    .addComponent(log_out7))
                .addGap(43, 43, 43)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel45)
                    .addComponent(updatei8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel46)
                    .addComponent(updatei9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel47))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addComponent(updatei10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(34, 34, 34)
                .addComponent(updatei11)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("update", jPanel14);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setText("List Seller Employee");

        seelerlist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Id", "User Name", "Password", "DepartMent"
            }
        ));
        seelerlist.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                seelerlistAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(seelerlist);

        log_out8.setBackground(new java.awt.Color(255, 0, 51));
        log_out8.setForeground(new java.awt.Color(255, 255, 255));
        log_out8.setText("log out");
        log_out8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_out8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(log_out8)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel9)
                        .addGap(0, 354, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane3)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9))
                    .addComponent(log_out8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 320, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jTabbedPane4.addTab("list", jPanel15);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel10.setText("Search Seller Employee");

        jLabel48.setText("Input id to search ");

        jLabel49.setText("user name");

        jLabel50.setText("depart ment");

        jLabel51.setText("password");

        searchis2.setText("Search");
        searchis2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchis2ActionPerformed(evt);
            }
        });

        log_out9.setBackground(new java.awt.Color(255, 0, 51));
        log_out9.setForeground(new java.awt.Color(255, 255, 255));
        log_out9.setText("log out");
        log_out9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_out9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(jLabel10)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel18Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addComponent(jLabel48, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(is8, javax.swing.GroupLayout.DEFAULT_SIZE, 362, Short.MAX_VALUE))
                            .addGroup(jPanel18Layout.createSequentialGroup()
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel49, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel18Layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel51, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(82, 82, 82)
                                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(is10, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(is9)
                                    .addComponent(iss6, javax.swing.GroupLayout.Alignment.TRAILING))))))
                .addGap(151, 151, 151))
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(searchis2))
                    .addComponent(log_out9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel18Layout.createSequentialGroup()
                .addComponent(log_out9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel51)
                    .addGroup(jPanel18Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel48)
                            .addComponent(is8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel49)
                            .addComponent(is9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(is10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel50))
                        .addGap(36, 36, 36)
                        .addComponent(iss6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(28, 28, 28)
                .addComponent(searchis2)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane4.addTab("search", jPanel18);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );

        jTabbedPane1.addTab("seller", jPanel6);

        jTabbedPane3.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setText("Add Invantory Employee");

        Add.setText("Add");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });

        jLabel16.setText("id");

        jLabel17.setText("user name");

        jLabel18.setText("password");

        jLabel26.setText("department");

        log_out10.setBackground(new java.awt.Color(255, 0, 51));
        log_out10.setForeground(new java.awt.Color(255, 255, 255));
        log_out10.setText("log out");
        log_out10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_out10ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(log_out10)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel11))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addComponent(Add, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(309, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 75, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ai4, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                    .addComponent(ai2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ai1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ai3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(84, 84, 84))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11))
                    .addComponent(log_out10))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ai1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(40, 40, 40)
                        .addComponent(ai2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel17))
                .addGap(44, 44, 44)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(ai3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26)
                    .addComponent(ai4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(Add)
                .addGap(28, 28, 28))
        );

        jTabbedPane3.addTab("add", jPanel8);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel12.setText("Delete Invantory Employee");

        jLabel19.setText("input id to delete");

        deletei.setText("Delete");
        deletei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteiActionPerformed(evt);
            }
        });

        log_out11.setBackground(new java.awt.Color(255, 0, 51));
        log_out11.setForeground(new java.awt.Color(255, 255, 255));
        log_out11.setText("log out");
        log_out11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_out11ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(log_out11)
                        .addGap(84, 84, 84)
                        .addComponent(jLabel12))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deletei, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deltex, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(269, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel12))
                    .addComponent(log_out11))
                .addGap(30, 30, 30)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(deltex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addComponent(deletei)
                .addGap(155, 155, 155))
        );

        jTabbedPane3.addTab("delete", jPanel9);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel13.setText("Update Invantory Employee");

        jLabel20.setText("input id to update");

        updatei.setText("Update");
        updatei.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateiActionPerformed(evt);
            }
        });

        jLabel21.setText("User Name");

        jLabel22.setText("Password");

        log_out14.setBackground(new java.awt.Color(255, 0, 51));
        log_out14.setForeground(new java.awt.Color(255, 255, 255));
        log_out14.setText("log out");
        log_out14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_out14ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(log_out14)
                        .addGap(90, 90, 90)
                        .addComponent(jLabel13))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel10Layout.createSequentialGroup()
                                    .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(34, 34, 34)))
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(170, 170, 170)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(updatei2)
                            .addComponent(updatei1)
                            .addComponent(updatei3, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(updatei, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(189, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel13))
                    .addComponent(log_out14))
                .addGap(18, 18, 18)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(updatei1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatei2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(57, 57, 57)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(updatei3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(updatei)
                .addGap(65, 65, 65))
        );

        jTabbedPane3.addTab("update", jPanel10);

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel14.setText("List Invantory Employee");

        invantorylist.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Id", "User Name", "Password", "DepartMent"
            }
        ));
        invantorylist.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                invantorylistAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane1.setViewportView(invantorylist);

        log_out12.setBackground(new java.awt.Color(255, 0, 51));
        log_out12.setForeground(new java.awt.Color(255, 255, 255));
        log_out12.setText("log out");
        log_out12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_out12ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addComponent(log_out12)
                .addGap(90, 90, 90)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel14))
                    .addComponent(log_out12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jTabbedPane3.addTab("list", jPanel11);

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel15.setText("Search Invantory Employee");

        jLabel23.setText("Input id to search ");

        jLabel24.setText("user name");

        jLabel25.setText("depart ment");

        searchis1.setText("Search");
        searchis1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchis1ActionPerformed(evt);
            }
        });

        jLabel27.setText("password");

        log_out13.setBackground(new java.awt.Color(255, 0, 51));
        log_out13.setForeground(new java.awt.Color(255, 255, 255));
        log_out13.setText("log out");
        log_out13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                log_out13ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout is4Layout = new javax.swing.GroupLayout(is4);
        is4.setLayout(is4Layout);
        is4Layout.setHorizontalGroup(
            is4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(is4Layout.createSequentialGroup()
                .addGap(281, 281, 281)
                .addComponent(searchis1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(is4Layout.createSequentialGroup()
                .addGroup(is4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(is4Layout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(is4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(log_out13))
                .addGap(33, 33, 33)
                .addGroup(is4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(is4Layout.createSequentialGroup()
                        .addComponent(jLabel15)
                        .addContainerGap(183, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, is4Layout.createSequentialGroup()
                        .addGroup(is4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(iss4, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(is3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(is2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(is1))
                        .addGap(108, 108, 108))))
        );
        is4Layout.setVerticalGroup(
            is4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(is4Layout.createSequentialGroup()
                .addGroup(is4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(is4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel15))
                    .addComponent(log_out13))
                .addGap(31, 31, 31)
                .addGroup(is4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(is1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(is4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(is2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(is4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(is3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(is4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27)
                    .addComponent(iss4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addComponent(searchis1)
                .addGap(54, 54, 54))
        );

        jTabbedPane3.addTab("search", is4);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane3, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        jTabbedPane1.addTab("invantory", jPanel7);

        update.setBackground(new java.awt.Color(255, 0, 0));
        update.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        update.setText("update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(313, Short.MAX_VALUE))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(165, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Modify", jPanel16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
       if (evt.getSource() == Add) {
        
           try {
               database.InvantoryEmplyee_log_database.insert_user(ai1.getText(), ai2.getText(), ai3.getText(),ai4.getText());
               JOptionPane.showMessageDialog(null, "The product has updated", "Succed", JOptionPane.INFORMATION_MESSAGE);
           } catch (SQLException ex) {
               System.out.println(ex);
           }
           
        }
    }//GEN-LAST:event_AddActionPerformed

    private void deleteiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteiActionPerformed
        if (evt.getSource() == deletei) {
            try{
        database.InvantoryEmplyee_log_database.delete_user(Integer.parseInt(deltex.getText()));
         JOptionPane.showMessageDialog(null, "The order has canceld", "Succed", JOptionPane.INFORMATION_MESSAGE);
            }
         catch(NumberFormatException ex)
            {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_deleteiActionPerformed

    private void updateiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateiActionPerformed
         if (evt.getSource() ==  updatei) {
            try {
                database.InvantoryEmplyee_log_database.update_user(updatei2.getText(), updatei3.getText(),updatei1.getText());
                JOptionPane.showMessageDialog(null, "The invantory employee has updated", "Succed", JOptionPane.INFORMATION_MESSAGE);
            } catch (HeadlessException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_updateiActionPerformed

    private void invantorylistAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_invantorylistAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_invantorylistAncestorAdded

    private void searchis1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchis1ActionPerformed
        if (evt.getSource() == searchis1) {
            try{
            arrr = database.InvantoryEmplyee_log_database.search_user(Integer.parseInt(is1.getText()));
            is2.setText(arrr.get(0).getSusername());
            is3.setText(arrr.get(0).getSdepartment());
            iss4.setText(arrr.get(0).getPassword());
            }
            catch(NumberFormatException ex)
            {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_searchis1ActionPerformed

    private void Add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add1ActionPerformed
        if (evt.getSource() == Add1) {
        
           try {
               database.marketingrmployee_log_database.insert_user(ai5.getText(), ai6.getText(), ai7.getText(),ai8.getText());
               JOptionPane.showMessageDialog(null, "The seller has added", "Succed", JOptionPane.INFORMATION_MESSAGE);
           } catch (SQLException ex) {
               System.out.println(ex);
           }
           
        }
    }//GEN-LAST:event_Add1ActionPerformed

    private void deletei1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletei1ActionPerformed
         if (evt.getSource() == deletei1) {
            try{
        database.marketingrmployee_log_database.delete_user(Integer.parseInt(deltex1.getText()));
         JOptionPane.showMessageDialog(null, "the marketing employee has deleted", "Succed", JOptionPane.INFORMATION_MESSAGE);
            }
         catch(NumberFormatException ex)
            {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_deletei1ActionPerformed

    private void updatei7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatei7ActionPerformed
         if (evt.getSource() ==  updatei7) {
            try {
                database.marketingrmployee_log_database.update_user(updatei5.getText(), updatei6.getText(),updatei4.getText());
                JOptionPane.showMessageDialog(null, "The invantory employee has updated", "Succed", JOptionPane.INFORMATION_MESSAGE);
            } catch (HeadlessException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_updatei7ActionPerformed

    private void marketinglist1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_marketinglist1AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_marketinglist1AncestorAdded

    private void Add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Add2ActionPerformed
      if (evt.getSource() == Add2) {
        
           try {
               database.selle_log_database.insert_user(ai10.getText(), ai11.getText(), ai12.getText(),ai9.getText());
               JOptionPane.showMessageDialog(null, "The product has updated", "Succed", JOptionPane.INFORMATION_MESSAGE);
           } catch (SQLException ex) {
               System.out.println(ex);
           }
           
        }
    }//GEN-LAST:event_Add2ActionPerformed

    private void deletei2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletei2ActionPerformed
               if (evt.getSource() == deletei2) {
            try{
        database.selle_log_database.delete_user(Integer.parseInt(deltex2.getText()));
         JOptionPane.showMessageDialog(null, "The seller has deleted", "Succed", JOptionPane.INFORMATION_MESSAGE);
            }
         catch(NumberFormatException ex)
            {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_deletei2ActionPerformed

    private void updatei11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatei11ActionPerformed
        if (evt.getSource() ==  updatei11) {
            try {
                database.selle_log_database.update_user(updatei9.getText(), updatei10.getText(),updatei8.getText());
                JOptionPane.showMessageDialog(null, "The admin has updated", "Succed", JOptionPane.INFORMATION_MESSAGE);
            } catch (HeadlessException ex) {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_updatei11ActionPerformed

    private void seelerlistAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_seelerlistAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_seelerlistAncestorAdded

    private void searchis2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchis2ActionPerformed
        if (evt.getSource() == searchis2) {
            try{
            sellerar = database.selle_log_database.search_user(Integer.parseInt(is8.getText()));
            is9.setText(sellerar.get(0).getSusername());
            is10.setText(sellerar.get(0).getSdepartment());
            iss6.setText(sellerar.get(0).getPassword());
            }
            catch(NumberFormatException ex)
            {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_searchis2ActionPerformed

    private void searchis3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchis3ActionPerformed
        if (evt.getSource() == searchis3) {
            try{
            marketingar = database.marketingrmployee_log_database.search_user(Integer.parseInt(is5.getText()));
            is6.setText(marketingar.get(0).getSusername());
            is7.setText(marketingar.get(0).getSdepartment());
            iss5.setText(marketingar.get(0).getPassword());
            }
            catch(NumberFormatException ex)
            {
                System.out.println(ex);
            }
        }
    }//GEN-LAST:event_searchis3ActionPerformed

    private void log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_outActionPerformed
        select_user su=new select_user();
        su.show();
        dispose();
    }//GEN-LAST:event_log_outActionPerformed

    private void log_out1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_out1ActionPerformed
       select_user su=new select_user();
        su.show();
        dispose();
    }//GEN-LAST:event_log_out1ActionPerformed

    private void log_out2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_out2ActionPerformed
        select_user su=new select_user();
        su.show();
        dispose();
    }//GEN-LAST:event_log_out2ActionPerformed

    private void log_out3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_out3ActionPerformed
        select_user su=new select_user();
        su.show();
        dispose();
    }//GEN-LAST:event_log_out3ActionPerformed

    private void log_out4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_out4ActionPerformed
         select_user su=new select_user();
        su.show();
        dispose();
    }//GEN-LAST:event_log_out4ActionPerformed

    private void log_out5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_out5ActionPerformed
        select_user su=new select_user();
        su.show();
        dispose();
    }//GEN-LAST:event_log_out5ActionPerformed

    private void log_out6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_out6ActionPerformed
         select_user su=new select_user();
        su.show();
        dispose();
    }//GEN-LAST:event_log_out6ActionPerformed

    private void log_out7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_out7ActionPerformed
       select_user su=new select_user();
        su.show();
        dispose();
    }//GEN-LAST:event_log_out7ActionPerformed

    private void log_out8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_out8ActionPerformed
        select_user su=new select_user();
        su.show();
        dispose();
    }//GEN-LAST:event_log_out8ActionPerformed

    private void log_out9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_out9ActionPerformed
        select_user su=new select_user();
        su.show();
        dispose();
    }//GEN-LAST:event_log_out9ActionPerformed

    private void log_out10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_out10ActionPerformed
         select_user su=new select_user();
        su.show();
        dispose();
    }//GEN-LAST:event_log_out10ActionPerformed

    private void log_out11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_out11ActionPerformed
       select_user su=new select_user();
        su.show();
        dispose();
    }//GEN-LAST:event_log_out11ActionPerformed

    private void log_out12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_out12ActionPerformed
        select_user su=new select_user();
        su.show();
        dispose();
    }//GEN-LAST:event_log_out12ActionPerformed

    private void log_out13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_out13ActionPerformed
        select_user su=new select_user();
        su.show();
        dispose();
    }//GEN-LAST:event_log_out13ActionPerformed

    private void log_out14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_log_out14ActionPerformed
        select_user su=new select_user();
        su.show();
        dispose();
    }//GEN-LAST:event_log_out14ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        update_admin u1=new update_admin();
        u1.show();
        dispose();
    }//GEN-LAST:event_updateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JButton Add1;
    private javax.swing.JButton Add2;
    private javax.swing.JTextField ai1;
    private javax.swing.JTextField ai10;
    private javax.swing.JPasswordField ai11;
    private javax.swing.JTextField ai12;
    private javax.swing.JTextField ai2;
    private javax.swing.JPasswordField ai3;
    private javax.swing.JTextField ai4;
    private javax.swing.JTextField ai5;
    private javax.swing.JTextField ai6;
    private javax.swing.JPasswordField ai7;
    private javax.swing.JTextField ai8;
    private javax.swing.JTextField ai9;
    private javax.swing.JButton deletei;
    private javax.swing.JButton deletei1;
    private javax.swing.JButton deletei2;
    private javax.swing.JTextField deltex;
    private javax.swing.JTextField deltex1;
    private javax.swing.JTextField deltex2;
    private javax.swing.JTable invantorylist;
    private javax.swing.JTextField is1;
    private javax.swing.JTextField is10;
    private javax.swing.JTextField is2;
    private javax.swing.JTextField is3;
    private javax.swing.JPanel is4;
    private javax.swing.JTextField is5;
    private javax.swing.JTextField is6;
    private javax.swing.JTextField is7;
    private javax.swing.JTextField is8;
    private javax.swing.JTextField is9;
    private javax.swing.JTextField iss4;
    private javax.swing.JTextField iss5;
    private javax.swing.JTextField iss6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTabbedPane jTabbedPane3;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JButton log_out;
    private javax.swing.JButton log_out1;
    private javax.swing.JButton log_out10;
    private javax.swing.JButton log_out11;
    private javax.swing.JButton log_out12;
    private javax.swing.JButton log_out13;
    private javax.swing.JButton log_out14;
    private javax.swing.JButton log_out2;
    private javax.swing.JButton log_out3;
    private javax.swing.JButton log_out4;
    private javax.swing.JButton log_out5;
    private javax.swing.JButton log_out6;
    private javax.swing.JButton log_out7;
    private javax.swing.JButton log_out8;
    private javax.swing.JButton log_out9;
    private javax.swing.JTable marketinglist1;
    private javax.swing.JButton searchis1;
    private javax.swing.JButton searchis2;
    private javax.swing.JButton searchis3;
    private javax.swing.JTable seelerlist;
    private javax.swing.JButton update;
    private javax.swing.JButton updatei;
    private javax.swing.JTextField updatei1;
    private javax.swing.JPasswordField updatei10;
    private javax.swing.JButton updatei11;
    private javax.swing.JTextField updatei2;
    private javax.swing.JPasswordField updatei3;
    private javax.swing.JTextField updatei4;
    private javax.swing.JTextField updatei5;
    private javax.swing.JPasswordField updatei6;
    private javax.swing.JButton updatei7;
    private javax.swing.JTextField updatei8;
    private javax.swing.JTextField updatei9;
    // End of variables declaration//GEN-END:variables
}
