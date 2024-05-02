package tugas10B;

public class Manajer extends Pegawai {
    // Atribut
    private int tunjangan = 700000;

    // Metode
    public Manajer(String nama) {
        super(nama);
    }

    public int getTunjangan() {
        return tunjangan;
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Tunjangan : " + getTunjangan());
    }
}
