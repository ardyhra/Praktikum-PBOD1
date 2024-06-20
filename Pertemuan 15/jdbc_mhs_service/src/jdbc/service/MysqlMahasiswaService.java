/*
 Nama File   : MysqlMahasiswaService.java                
 Nama        : Ardy Hasan Rona Akhmad 
 NIM         : 24060122130053
 Deskripsi   : Kelas ini berperan menyediakan layanan (service/controller) 
bagi program utama dalam mengelola basisdata sehingga 
interaksi dengan basis data dapat dilakukan secara object 
oriented (dengan memanfaatkan model dan DB utility)
 */
package jdbc.service;

import java.sql.*;
import java.util.*;
import jdbc.model.Mahasiswa;
import jdbc.utilities.MysqlUtility;

public class MysqlMahasiswaService {
    Connection koneksi = null;
    
    // Constructor
    public MysqlMahasiswaService(){
        koneksi = MysqlUtility.getConnection();
    }
    
    public Mahasiswa makeMhsObject(){
        return new Mahasiswa();
    }
    
    public void add(Mahasiswa mhs){
        String query = "INSERT INTO mahasiswa(id, nama) VALUES (" + mhs.getId() + ", '" + mhs.getNama() + "')";
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Berhasil insert");
        } catch (SQLException e) {
            System.out.println("Gagal insert: " + e.getMessage());
        }
    }
    
    public void update(Mahasiswa mhs){
        String query = "UPDATE mahasiswa SET nama = '" + mhs.getNama() + "' WHERE id = " + mhs.getId();
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Berhasil update");
        } catch (SQLException e) {
            System.out.println("Gagal update: " + e.getMessage());
        }
    }
    
    public void delete(int id){
        String query = "DELETE FROM mahasiswa WHERE id = " + id;
        try {
            Statement s = koneksi.createStatement();
            s.executeUpdate(query);
            System.out.println("Berhasil delete");
        } catch (SQLException e) {
            System.out.println("Gagal delete: " + e.getMessage());
        }
    }
    
    public Mahasiswa getById(int id){
        Mahasiswa mhs = new Mahasiswa();
        String query = "SELECT * FROM mahasiswa WHERE id = " + id;
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if (rs.next()){
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
            }
        } catch (SQLException e) {
            System.out.println("Gagal getById: " + e.getMessage());
        }
        return mhs;
    }
    
    public List<Mahasiswa> getAll(){
        List<Mahasiswa> mahasiswaList = new ArrayList<>();
        String query = "SELECT * FROM mahasiswa";
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            while (rs.next()) {
                Mahasiswa mhs = makeMhsObject();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
                mahasiswaList.add(mhs);
            }
        } catch (SQLException e) {
            System.out.println("Gagal getAll: " + e.getMessage());
        }
        return mahasiswaList;
    }
}
