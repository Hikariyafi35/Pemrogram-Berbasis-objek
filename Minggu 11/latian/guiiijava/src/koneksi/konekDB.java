/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package koneksi;
import java.sql.*;
/**
 *
 * @author ACER
 */
public class konekDB {
     static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DBURL = "jdbc:mysql://localhost/dbpbo";
    static final String USER = "root";
    static final String PASS = "";
    
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public void koneksidb(){
       try{
           Class.forName(JDBC_DRIVER);
           conn = DriverManager.getConnection(DBURL, USER, PASS);
           stmt = conn.createStatement();
       }
       catch(Exception e){
           e.printStackTrace();
       }
}
}
