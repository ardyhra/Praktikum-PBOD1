package latihanMedium;

public class Senjata {
    //Atribut
    private String bunyi;
    private boolean menusuk;
    private int peluru;

    //Metode
    public Senjata(String bunyi) {
        this.bunyi = bunyi;
        this.menusuk = false;
        this.peluru = 0;
    }

    public String getBunyi() {
        return bunyi;
    }

    public int getPeluru() {
        return peluru;
    }

    public boolean isMenusuk() {
        return menusuk;
    }
    
    public void setMenusuk(boolean menusuk) {
        this.menusuk = menusuk;
    }

    public void setBunyi(String bunyi) {
        this.bunyi = bunyi;
    }

    public void setPeluru(int peluru) {
        this.peluru = peluru;
    }

}
