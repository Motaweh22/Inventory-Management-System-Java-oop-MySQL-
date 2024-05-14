/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import domain.user;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author mazen
 */
public class selle_log_database {
     public static Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "1234");
    }

    public static void insert_user(String user, String pass, String depart, String id) throws SQLException {

        try {
            Connection con = connect();
            PreparedStatement p = con.prepareStatement("insert into seller_log values(?,?,?,?)");
            p.setString(1, user);
            p.setString(2, pass);
            p.setString(3, depart);
            p.setString(4, id);
            p.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static ArrayList<user> get_user() {
        ArrayList<user> list = new ArrayList<>();
        try {
            Connection con = connect();
            PreparedStatement p = con.prepareStatement("select*from seller_log");
            ResultSet r = p.executeQuery();
            while (r.next()) {
                list.add(new user(r.getString("seler_id"),r.getString("user_name"), r.getString("password"), r.getString("department")));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }

    public static int check_user(String user, String pass) {
        ArrayList<user> arr = get_user();
        int x = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getUser().equalsIgnoreCase(user)) {
                if (arr.get(i).getPassword().equalsIgnoreCase(pass)) {
                    x = 1;
                    break;
                } else {
                    x = 2;
                    break;
                }
            } else {
                x = 0;
            }
        }
        return x;
    }
     public static void update_user(String user_name, String password, String id)
    {
    try {
            Connection con = connect();
            PreparedStatement p = con.prepareStatement("update seller_log set user_name=?,password=? where seler_id=?");
            p.setString(1, user_name);
            p.setString(2, password);
            p.setString(3, id);
            p.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
     public static void delete_user(int id)
    {
    try {
            Connection con = connect();
            PreparedStatement p = con.prepareStatement("delete from seller_log where seler_id=?");
            p.setInt(1, id);
             p.execute();
             } catch (SQLException e) {
            System.out.println(e);
        }
    }
     public static ArrayList<domain.search_user> search_user(int id) {
        ArrayList<domain.search_user> list = new ArrayList<>();
        try {
            Connection con = connect();
            PreparedStatement p = con.prepareStatement("select*from seller_log where seler_id=?");
            p.setInt(1, id);
            ResultSet r = p.executeQuery();
            while (r.next()) {
                list.add(new domain.search_user(r.getInt("seler_id"), r.getString("user_name"),r.getString("department"),r.getString("password")));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
}
