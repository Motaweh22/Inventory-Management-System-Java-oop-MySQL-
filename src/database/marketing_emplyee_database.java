/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author mazen
 */
public class marketing_emplyee_database {
     public static Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "1234");
    }

    public static void insert_report(String report) throws SQLException {

        try {
            Connection con = connect();
            PreparedStatement p = con.prepareStatement("insert into marketing_employee values(?)");
            p.setString(1, report);
            p.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
