/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Project {
static Statement ss;
    static Connection c;
    static String query;
    static ResultSet r;
    public static void main(String[] args) {
       // new first_screen().show_fisrt_screen();
       select_user s=new select_user();
       s.setVisible(true);
        Connectionn c1=new Connectionn();
    try {
        c=c1.connect();
        System.out.println("al7mdllah");
    } catch (SQLException ex) {
        System.out.println(ex);
    }
    }
    
}
