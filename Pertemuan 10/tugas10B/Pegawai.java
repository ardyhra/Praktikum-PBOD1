package tugas10B;

public class Pegawai {
    // Atribut
    private String nama;
    private int gajiPokok = 5000000;

    // Metode
    public Pegawai(String nama) {
        this.nama = nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public int getGajiPokok() {
        return gajiPokok;
    }

    public void tampilData() {
        System.out.println("Nama : " + getNama() +", Gaji pokok : " + getGajiPokok() );
    }
}