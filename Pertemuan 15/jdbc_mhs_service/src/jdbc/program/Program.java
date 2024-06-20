/*
 Nama File   : Program.java                
 Nama        : Ardy Hasan Rona Akhmad 
 NIM         : 24060122130053
 Deskripsi   : Kelas ini sebagai program utama
 */

package jdbc.program;

import java.util.*;
import jdbc.model.Mahasiswa;
import jdbc.service.MysqlMahasiswaService;

public class Program {
    static MysqlMahasiswaService service = new MysqlMahasiswaService();
    public static void main(String[] args) {
        List<Mahasiswa> listmhs = new ArrayList<>();
        System.out.println("");
        
        // INSERT
        System.out.println("===insert");
        Mahasiswa mhsAdd = new Mahasiswa(5, "Haryo");
        service.add(mhsAdd);
        System.out.println("Berhasil insert: " + mhsAdd);
        displayAll();
        
        // UPDATE
        System.out.println("===update");
        Mahasiswa mhsUpdate = service.getById(5);
        System.out.println("Akan diupdate data lama: " + mhsUpdate);
        mhsUpdate.setNama("Dinaya");
        System.out.println("dengan data baru: " + mhsUpdate);
        service.update(mhsUpdate);
        displayAll();
        
        // DELETE
        System.out.println("===delete");
        System.out.println("akan di delete: " + service.getById(5));
        service.delete(5);
        displayAll();
    }
    
    public static void displayAll() {
        System.out.println("===displayAll");
        List<Mahasiswa> listmhs = service.getAll();
        for (Mahasiswa mhs : listmhs) {
            System.out.println(mhs);
        }
        System.out.println();
    }
}
