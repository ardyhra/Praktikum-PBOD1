/*
 Nama File   : MysqlUtility.java                
 Nama        : Ardy Hasan Rona Akhmad 
 NIM         : 24060122130053
 Deskripsi   : Kelas ini digunakan untuk mengelola koneksi dengan basis data yang digunakan
 */

package jdbc.utilities;

import java.sql.*;

public class MysqlUtility {
    private static Connection koneksi;
    
    public static Connection getConnection(){
        if (koneksi == null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                // Sesuaikan host, port, nama database
                String url = "jdbc:mysql://localhost:3306/jdbc_mhs";
                // Sesuaikan username dan password
                String user = "Ardy";
                String password = "ardy123";
                koneksi = DriverManager.getConnection(url, user, password);
                if (koneksi != null){
                    System.out.println("Koneksi berhasil");
                }
            } catch (ClassNotFoundException cne){
                System.out.println("Gagal load driver : " + cne.getMessage());
            } catch (SQLException sqle){
                    System.out.println("Koneksi berhasil");
            }
        }
        return koneksi;
    }
}
