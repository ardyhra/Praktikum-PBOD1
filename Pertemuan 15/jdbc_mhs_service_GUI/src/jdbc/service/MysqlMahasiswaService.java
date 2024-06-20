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
        String query = "INSERT INTO mahasiswa(nama) VALUES ('" + mhs.getNama() + "')";
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
    
    public void indexReset() {
        String resetQuery1 = "SET @count = 0";
        String resetQuery2 = "UPDATE mahasiswa SET id = @count:= @count + 1";
        String resetQuery3 = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
        try {
            koneksi.setAutoCommit(false);
            Statement s = koneksi.createStatement();
            s.executeUpdate(resetQuery1);
            s.executeUpdate(resetQuery2);
            s.executeUpdate(resetQuery3);
            koneksi.commit();
            System.out.println("Berhasil reset index");
        } catch (SQLException e) {
            try {
                koneksi.rollback();
            } catch (SQLException rollbackException) {
                System.out.println("Gagal rollback: " + rollbackException.getMessage());
            }
            System.out.println("Gagal reset index: " + e.getMessage());
        } finally {
            try {
                koneksi.setAutoCommit(true);
            } catch (SQLException autoCommitException) {
                System.out.println("Gagal mengatur auto-commit: " + autoCommitException.getMessage());
            }
        }
    }

    public boolean isEmpty() {
        String query = "SELECT COUNT(*) FROM mahasiswa";
        try {
            Statement s = koneksi.createStatement();
            ResultSet rs = s.executeQuery(query);
            if (rs.next()) {
                return rs.getInt(1) == 0;
            }
        } catch (SQLException e) {
            System.out.println("Gagal mengecek apakah tabel kosong: " + e.getMessage());
        }
        return true;
    }

    public void closeConnection() {
        if (koneksi != null) {
            try {
                koneksi.close();
                System.out.println("Koneksi berhasil ditutup");
            } catch (SQLException e) {
                System.out.println("Gagal menutup koneksi: " + e.getMessage());
            }
        }
    }
}
