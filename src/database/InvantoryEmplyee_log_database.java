/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;

import static database.marketingrmployee_log_database.connect;
import java.sql.*;
import domain.user;
import java.util.*;

public class InvantoryEmplyee_log_database {

    public static Connection connect() throws SQLException {
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/project", "root", "1234");
    }

    public static void insert_user(String user, String pass, String depart) throws SQLException {

        try {
            Connection con = connect();
            PreparedStatement p = con.prepareStatement("insert into user values(?,?,?)");
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
            PreparedStatement p = con.prepareStatement("select*from user");
            ResultSet r = p.executeQuery();
            while (r.next()) {
                list.add(new user(r.getString("invan_id"),r.getString("user_name"), r.getString("password"), r.getString("department")));
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
            PreparedStatement p = con.prepareStatement("update user set user_name=?,password=? where invan_id=?");
            p.setString(1, user_name);
            p.setString(2, password);
            p.setString(3, id);
            p.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public static void insert_user(String id, String username, String password, String department) throws SQLException {

        try {
            Connection con = connect();
            PreparedStatement p = con.prepareStatement("insert into user values(?,?,?,?)");
            p.setString(4, id);
            p.setString(1, username);
            p.setString(2, password);
            p.setString(3, department);
            p.execute();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public static void delete_user(int id)
    {
    try {
            Connection con = connect();
            PreparedStatement p = con.prepareStatement("delete from user where invan_id=?");
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
            PreparedStatement p = con.prepareStatement("select*from user where invan_id=?");
            p.setInt(1, id);
            ResultSet r = p.executeQuery();
            while (r.next()) {
                list.add(new domain.search_user(r.getInt("invan_id"), r.getString("user_name"),r.getString("department"),r.getString("password")));
            }
        } catch (SQLException e) {
            System.out.println(e);
        }
        return list;
    }
}
