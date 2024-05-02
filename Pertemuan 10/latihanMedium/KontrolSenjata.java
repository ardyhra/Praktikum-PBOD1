package latihanMedium;

public class KontrolSenjata {
    //Atribut
    private Senjata senjata;

    //Metode
    public KontrolSenjata(Senjata s) {
        this.senjata = s;
    }

    public boolean isAdaPeluru(){
        if (senjata.getPeluru() >= 1) {
            return true;
        }
        else {
            return false;
        }
    }

    public void isiPeluru(int jumPeluru) {
        senjata.setPeluru(jumPeluru);
        System.out.println("Peluru berhasil ditambah: " + jumPeluru);
    }

    public void menembak(int jumlah) {
        System.out.println("Siap menembak " + jumlah + " kali");
        if (senjata.getPeluru() >= 1) {
            for (int i = 0; i < jumlah; i++) {
                if (senjata.getPeluru() >= 1) {
                    System.out.println(senjata.getBunyi());
                    senjata.setPeluru(senjata.getPeluru()-1);
                }
                else {
                    System.out.println("Gagal tembak, Peluru Habis");
                }
            }
            System.out.println("Peluru sisa: " + senjata.getPeluru());
        }
        else {
            System.out.println("Peluru Habis");
        }
    }

    public String menusuk() {
        if (senjata.isMenusuk()) {
            return ("Siap menusuk");
        } 
        else {
            return ("Gagal menusuk, tidak ada bayonet terpasang");
        }
    }

    public void pasangBayonet() {
        senjata.setMenusuk(true);
    }
}
