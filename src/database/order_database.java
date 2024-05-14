/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author mazen
 */
public class order_database {
     public static Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "1234");
    }

    public static void insert_order(String order_id, String product_name, String num_order, String product_id) throws SQLException {

        try {
            Connection con = connect();
            PreparedStatement p = con.prepareStatement("insert into order_tab values(?,?,?,?)");
            p.setString(1, order_id);
            p.setString(2, product_name);
            p.setString(3, num_order);
            p.setString(4, product_id);
            p.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public static void cancel_order(int id)
    {
    try {
            Connection con = connect();
            PreparedStatement p = con.prepareStatement("delete from order_tab where order_id=?");
            p.setInt(1, id);
             p.execute();
             } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
