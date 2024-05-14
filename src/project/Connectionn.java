/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Connectionn {
    private final String user="root";
    private final String password="1234";
    private final String add="jdbc:mysql://localhost:3306/project";
    
    public Connection  connect() throws SQLException{
  
     return  DriverManager.getConnection(add,user,password);
    }
}

