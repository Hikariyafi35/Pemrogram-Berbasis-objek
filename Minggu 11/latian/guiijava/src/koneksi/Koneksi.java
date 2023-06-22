/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package koneksi;


import java.sql.*;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ACER
 */
public class Koneksi {

    /**
     * @param args the command line arguments
     */
    static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    static final String DBURL = "jdbc:mysql://localhost/dbpbo";
    static final String USER = "root";
    static final String PASS = "";
    
    static Connection conn;
    static Statement stmt;
    static ResultSet rs;
    
    public static void main(String[] args) {
        // TODO code application logic here
        insert();
        show();
    }
    public static void insert(){
        String kode_brg = "brg17";
        String nama_brg = "Mi goreng";
        String satuan = "bungkus";
        int stok = 20;
        int stok_min = 1;
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DBURL,USER,PASS);
            stmt = conn.createStatement();
            
            String sql = "INSERT INTO barang(kd_brg,nm_brg,satuan,stok_brg,stok_min) VALUES (?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            
            ps.setString(1, kode_brg);
            ps.setString(2, nama_brg);
	    ps.setString(3, satuan);
            ps.setInt(4, stok);
            ps.setInt(5, stok_min);
            
            ps.execute();
            
            stmt.close();
            conn.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static void show(){
        try{
            Class.forName(JDBC_DRIVER);
            conn = DriverManager.getConnection(DBURL,USER,PASS);
            stmt = conn.createStatement();
            
            rs = stmt.executeQuery("SELECT * FROM barang");
            int i = 1;
            while(rs.next()){
                System.out.println("Data ke-"+i);
				System.out.println("Kode Barang: " + rs.getString("kd_brg"));
				System.out.println("Nama Barang: "+rs.getString("nm_brg"));
				System.out.println("Satuan: "+rs.getString("satuan"));
				System.out.println("Stok: "+rs.getString("stok_brg"));
				System.out.println("Stok minimal: "+rs.getString("stok_min"));
				i++;
            }
        }
    
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
