package KelasAbstrak;
public class BujurSangkar extends BangunDatar{
    public double hitungLuas(double sisi){
        luas = sisi*sisi;
        return luas;
    }
}

/*apa yang terjadi apabila kelas BujurSangkar tidak membuat implementasi metode abstrak yang ada pada kelas BangunDatar? jelaskan !
Jawab : akan muncul error karena metode abstrak hitungLuas(double sisi) dalam kelas abstrak bangun datar belum diimplementasikan 
dalam kelas BujurSangkar yang merupakan turunan dari kelas BangunDatar. Hal ini terjadi karena syarat dari kelas anak yang diturunkan dari 
kelas abstrak adalah harus mengimplementasikan semua metode abstrak dari kelas parentnya, jika tidak maka kelas anak juga harus menjadi kelas
abstrak.

*/
