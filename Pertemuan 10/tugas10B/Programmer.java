package tugas10B;

public class Programmer extends Pegawai {
    // Atribut
    private int bonus = 450000;


    // Metode
    public Programmer(String nama) {
        super(nama);
    }

    public int getBonus() {
        return bonus;
    }

    public void tampilData() {
        super.tampilData();
        System.out.println("Bonus : " + getBonus());
    }
}
