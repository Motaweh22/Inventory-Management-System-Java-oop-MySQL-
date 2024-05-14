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
public class admin_log_database {
    public static Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "1234");
    }

    public static void insert_user(String user, String pass, String depart) throws SQLException {

        try {
            Connection con = connect();
            PreparedStatement p = con.prepareStatement("insert into admin_log values(?,?,?)");
            p.setString(1, user);
            p.setString(2, pass);
            p.setString(3, depart);
            p.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public static ArrayList<user> get_user() {
        ArrayList<user> list = new ArrayList<>();
        try {
            Connection con = connect();
            PreparedStatement p = con.prepareStatement("select*from admin_log");
            ResultSet r = p.executeQuery();
            while (r.next()) {
                list.add(new user(r.getString("admin_id"),r.getString("admin_username"), r.getString("admin_password"), r.getString("department")));
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
     public static void update_user(String user_name, String password)
    {
    try {
            Connection con = connect();
            PreparedStatement p = con.prepareStatement("update admin_log set admin_username=?,admin_password=?");
            p.setString(1, user_name);
            p.setString(2, password);
           
            p.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
