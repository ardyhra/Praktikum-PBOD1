package latihanVeryEasy;

public class Senjata {
    //Atribut
    private String bunyi;
    private int peluru;

    //Metode
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
    }

    public String getBunyi() {
        return bunyi;
    }

    public int getPeluru() {
        return peluru;
    }

    public void menembak() {
        if (peluru >= 1) {
            System.out.println(getBunyi());
            peluru = peluru - 1;
            System.out.println("Sisa Peluru: " + getPeluru());
        }
        else {
            System.out.println("Gagal tembak, Peluru Habis");
        }
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

}
