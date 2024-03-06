/**
 * File : AngkaSial.java
 * Deskripsi : Program penggunaan exception buatan sendiri
 *              Pengenalan klausa 'throw' dan 'throws'
 */
public class AngkaSial {
    public void cobaAngka(int angka) throws AngkaSialException{
        if(angka==13){
            throw new AngkaSialException();
        }
        else{
            System.out.println("Angka "+angka+" bukan angka sial");
        }
    }
    public static void main(String[] args){
        AngkaSial angkasial = new AngkaSial();
        try{
            angkasial.cobaAngka(10);
            angkasial.cobaAngka(13);
            angkasial.cobaAngka(12);
        }catch(AngkaSialException sial){
            System.out.println(sial.getMessage());
            System.out.println("hati-hati memasukkan angka");
        }
    }
}

/*
 PERTANYAAN:
1. Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
2. Apakah baris 21 pada AngkaSial.java di atas dieksekusi?

Jawab :
1. Tidak dieksekusi. Karena baris 12 yang mencetak "angka ... adalah bukan angka sial" hanya dieksekusi jika angka yang diterima bukan 13 
sehingga tidak akan terjadi eksepsi. Jika eksepsi terjadi maka baris 12 tersebut tidak dieksekusi
2. Iya. Karena dari kode di atas, akan terjadi eksepsi saat baris 19 {angkasial.cobaAngka(13);} dipanggil.
Setelah terjadinya eksepsi, program akan melompat ke baris catch dengan mengambil objek eksepsi lalu mengeksekusi proses catch
yaitu menampilkan pesan dari getMessage() dan mencetak "hati-hati memasukkan angka"
 */

