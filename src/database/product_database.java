/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import domain.product;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

/**
 *
 * @author mazen
 */
public class product_database {

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "1234");
    }

    public static void insert_product(String product_name, String product_coste, String product_type, String product_id, String product_quantity) throws SQLException {

        try {
            Connection con = connect();
            PreparedStatement p = con.prepareStatement("insert into porduct values(?,?,?,?,?)");
            p.setString(1, product_name);
            p.setString(2, product_coste);
            p.setString(3, product_type);
            p.setString(4, product_id);
            p.setString(5, product_quantity);
            p.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static ArrayList<product> get_product() {
        ArrayList<product> list = new ArrayList<>();
        try {
            Connection con = connect();
            PreparedStatement p = con.prepareStatement("select*from porduct");
            ResultSet r = p.executeQuery();
            while (r.next()) {
                list.add(new product(r.getString("product_name"), r.getString("cost"), r.getString("product_type"), r.getString("product_id"), r.getString("quantity")));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
    public static void update_product(String product_name, String product_coste, String product_type, String product_id, String product_quantity)
    {
    try {
            Connection con = connect();
            PreparedStatement p = con.prepareStatement("update porduct set product_name=?,cost=?,product_type=?,quantity=? where product_id=?");
            p.setString(1, product_name);
            p.setString(2, product_coste);
            p.setString(3, product_type);
            p.setString(5, product_id);
            p.setString(4, product_quantity);
            p.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
   public static ArrayList<domain.search_id> search_product(int id) {
        ArrayList<domain.search_id> list = new ArrayList<>();
        try {
            Connection con = connect();
            PreparedStatement p = con.prepareStatement("select*from porduct where product_id=?");
            p.setInt(1, id);
            ResultSet r = p.executeQuery();
            while (r.next()) {
                list.add(new domain.search_id(r.getInt("product_id"), r.getString("product_name"),r.getString("cost"), r.getString("product_type"), r.getString("product_id"), r.getString("quantity")));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
}
