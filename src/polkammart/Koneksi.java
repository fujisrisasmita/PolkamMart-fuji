/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polkammart;

/**
 *
 * @author oryza
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
public class Koneksi {
    public static Connection connect;
    public static Statement statemen;
    
  
    public String konfigurasi() {
        String Messege;
        try{
            Class.forName("com.mysql.jdbc.Driver");
           connect=DriverManager.getConnection("jdbc:mysql://localhost/guipraktek","root","");
            statemen=connect.createStatement();
            
        }catch(Exception e){
            System.out.println("gagal koneksi"+ e);
            return Messege="Gagal Koneksi";
        }
        return Messege="Koneksi Basis Data Berhasil";
    }
/**
 * Method ini difungsikan untuk melakukan koneksi pada semua kelas selain kelas login
 * @return 
 */
   public static Connection getKoneksi( ){
    String host = "jdbc:mysql://localhost/guipraktek",
    user = "root",
    pass = "";
    try{
        connect = (Connection) DriverManager.getConnection(host, user, pass);
    }catch (SQLException err){
        JOptionPane.showMessageDialog(null, err.getMessage( ) );
    }
    return connect;
}
}
