public class MainTitik {
    public static void main(String args[]){
        Titik2 t1 = new Titik2();
        Titik2 t2 = new Titik2();

        t1.setAbsis(1);
        t1.setOrdinat(2);
        t2.setAbsis(4);
        t2.setOrdinat(5);
        System.out.println("t1(" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("t2(" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        System.out.println("jarak pusat t1 = " + t1.getJarakPusat());

        System.out.println("================refleksiX================");
        System.out.println("t1 sebelum refleksi sumbu X : (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        t1.refleksiX(t1);
        System.out.println("t1 setelah refleksi sumbu X : (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        System.out.println("================refleksiY================");
        System.out.println("t1 sebelum refleksi sumbu Y : (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");
        t1.refleksiY(t1);
        System.out.println("t1 setelah refleksi sumbu Y : (" + t1.getAbsis() + ", " + t1.getOrdinat() + ")");

        System.out.println("================getRefleksiX================");
        System.out.println("t2 awal : (" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        Titik2 t3 = t2.getRefleksiX();
        System.out.println("titik baru t3 sebagai refleksi titik t2 terhadap sumbu X  : (" + t3.getAbsis() + ", " + t3.getOrdinat() + ")");
        System.out.println("================getRefleksiY================");
        System.out.println("t2 awal : (" + t2.getAbsis() + ", " + t2.getOrdinat() + ")");
        Titik2 t4 = t2.getRefleksiY();
        System.out.println("titik baru t4 sebagai refleksi titik t2 terhadap sumbu Y : (" + t4.getAbsis() + ", " + t4.getOrdinat() + ")");
    }
}
