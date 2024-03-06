class Lingkaran{
    private double jariJari;
    //ubah konstruktor
    public Lingkaran(){
        this.jariJari = 1;
    }
    public double hitungKeliling(){
        return 2*Math.PI*jariJari;
    }
    //tambahan kode
    public double getJariJari(){
        return this.jariJari;
    }
    public void setJariJari(double jariJari){
        this.jariJari = jariJari;
    }
}

public class Asersi2 {
    public static void main(String[] args){
        //tambahan kode
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.setJariJari(-1);
        // double jariJari = -1; {diganti dengan baris di atas}

        assert(lingkaran.getJariJari()>0): "jari-jari tidak boleh nol atau negatif";
        // Lingkaran lingkaran = new Lingkaran(jariJari); {diganti}
        double kelilingLingkaran = lingkaran.hitungKeliling();
        System.out.println("Keliling lingkaran = "+kelilingLingkaran);
    }
}

/*Pertanyaan : secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
Jawab : ada yaitu pada main, jari-jari langsung diset = -1, padahal jari-jari adalah atribut yang private dari class Lingkaran dan tidak boleh 
diakses kelas lainnya, dan juga objek lingkaran belum dibuat terlebih dahulu sebelum set jari-jarinya.
Penyelesaiannya adalah menyiapkan method getter dan setter dalam class Lingkaran dengan modifier public agar class lain bisa mendapatkan
atau mengassign jari-jari dari luar kelas. 
Lalu pada main, awalnya akan dibuat objek lingkaran baru dengan jari-jari tertentu, lalu mengeset jari-jarinya dengan method setJariJari().
Kemudian pada assert akan menggunakan parameter jari-jari yang didapatkan dari method getJarijari()
*/
