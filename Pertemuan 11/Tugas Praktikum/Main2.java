/*
{Terjemahkan ke bahasa Java}
class Kupu has 
  procedure gerak()
class Ulat inherits Kupu has 
  procedure gerak() 
    output "ulat merayap"
class Kepompong inherits Kupu has 
  procedure gerak() 
    output "kepompong diam"
class KupuDewasa inherits Kupu has 
  procedure gerak() 
    output "kupu terbang"
class Data<T> has 
  isi is T
  function getIsi() -> T
     -> this.isi 
  procedure setIsi( input x : T )  
     this.isi <- x
class Main 
  {kamus}
  K : Ulat 
  anu : Data<Kupu>
  {algoritma}
  K <- new Ulat
  anu <- new Data<>()
  anu.setIsi(K)
  anu.getIsi().gerak()
  anu.setIsi( new Kepompong )
  anu.getIsi().gerak()
  anu.setIsi( new KupuDewasa )
  anu.getIsi().gerak()
 */

class Kupu {
    public void gerak() {}
}

class Ulat extends Kupu {
    public void gerak() {
        System.out.println("ulat merayap");
    }
}

class Kepompong extends Kupu {
    public void gerak() {
        System.out.println("kepompong diam");
    }
}

class KupuDewasa extends Kupu {
    public void gerak() {
        System.out.println("kupu terbang");
    }
}

class Data<T> {
    private T isi;

    public T getIsi() {
        return this.isi;
    }

    public void setIsi(T x) {
        this.isi = x;
    }
}

public class Main2 {
    public static void main(String[] args) {
        //kamus
        Ulat K;
        Data<Kupu> anu;

        //algoritma
        K = new Ulat();
        anu = new Data<>();
        anu.setIsi(K);
        anu.getIsi().gerak();
        anu.setIsi(new Kepompong());
        anu.getIsi().gerak();       
        anu.setIsi(new KupuDewasa());
        anu.getIsi().gerak();
    }
}
