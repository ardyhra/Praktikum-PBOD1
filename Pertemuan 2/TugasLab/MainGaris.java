public class MainGaris {
    public static void main(String args[]){
        Titik2 t1 = new Titik2(1,2);
        Titik2 t2 = new Titik2(4,5);
        Titik2 t3 = new Titik2(2,8);
        Titik2 t4 = new Titik2(5,5);

        Garis g1 = new Garis();
        Garis g2 = new Garis();

        g1.setTitikAwal(t1);
        g1.setTitikAkhir(t2);
        g2.setTitikAwal(t3);
        g2.setTitikAkhir(t4);

        System.out.println("Garis g1 : Titik awal(" + g1.getTitikAwal().getAbsis() + "," + g1.getTitikAwal().getOrdinat()+") dan Titik akhir("+ g1.getTitikAkhir().getAbsis() + "," + g1.getTitikAkhir().getOrdinat()+")");
        System.out.println("Garis g2 : Titik awal(" + g2.getTitikAwal().getAbsis() + "," + g2.getTitikAwal().getOrdinat()+") dan Titik akhir("+ g2.getTitikAkhir().getAbsis() + "," + g2.getTitikAkhir().getOrdinat()+")");
        System.out.println("Panjang garis g1 dari pusat : " + g1.getPanjang());
        System.out.println("Panjang garis g2 dari pusat : " + g2.getPanjang());
        System.out.println("Gradien garis g1 : " + g1.getGradien());
        System.out.println("Gradien garis g2 : " + g2.getGradien());
        System.out.println("Apakah g1 dan g2 saling tegak lurus? : " + g1.isTegakLurus(g2));
        Garis g3 = g1.getRefleksiY();
        System.out.println("Garis g3 sebagai refleksi g1 terhadap sumbu Y : Titik awal(" + g3.getTitikAwal().getAbsis() + "," + g3.getTitikAwal().getOrdinat()+") dan Titik akhir("+ g3.getTitikAkhir().getAbsis() + "," + g3.getTitikAkhir().getOrdinat()+")");
    }
}
