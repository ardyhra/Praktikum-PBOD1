public class Garis {
    //atribut
    private Titik2 titikAwal,titikAkhir;
    
    //method
    Garis(){
        this.titikAwal = new Titik2();
        this.titikAkhir = new Titik2();
    }
    Garis(Titik2 titikAwal, Titik2 titikAkhir){
        this.titikAwal = new Titik2(titikAwal.getAbsis(),titikAwal.getOrdinat());
        this.titikAkhir = new Titik2(titikAkhir.getAbsis(),titikAkhir.getOrdinat());
    }
    public Titik2 getTitikAwal(){
        return this.titikAwal;
    }
    public Titik2 getTitikAkhir(){
        return this.titikAkhir;
    }
    public void setTitikAwal(Titik2 tAwal){
        this.titikAwal = tAwal;
    }
    public void setTitikAkhir(Titik2 tAkhir){
        this.titikAkhir = tAkhir;
    }
    public double getPanjang(){
        return Math.sqrt(Math.pow((titikAkhir.getAbsis()-titikAwal.getAbsis()),2) + Math.pow((titikAkhir.getOrdinat()-titikAwal.getOrdinat()),2) );
    }
    public double getGradien(){
        return (titikAkhir.getOrdinat()-titikAwal.getOrdinat())/(titikAkhir.getAbsis()-titikAwal.getAbsis());
    }
    public Garis getRefleksiY(){
        return new Garis(titikAwal.getRefleksiY(),titikAkhir.getRefleksiY());
    }

    public boolean isTegakLurus(Garis g){
        if(this.getGradien()*g.getGradien()==-1) 
            return true; 
        else 
            return false; 
    }
}
