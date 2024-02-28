public class Titik2 {
    //atribut
    private double x,y;
    
    //method
    Titik2(){
        this.x = 0;
        this.y = 0;
    }

    Titik2(double a, double b){
        this.x = a;
        this.y = b;
    }
    
    public void setAbsis(double x){
        this.x = x;
    }

    public void setOrdinat(double y){
        this.y = y;
    }

    public double getAbsis(){
        return this.x;
    }

    public double getOrdinat(){
        return this.y;
    }

    public double getJarakPusat(){
        return Math.sqrt(x*x+y*y);
    }

    public void refleksiX(Titik2 titik){
        titik.setOrdinat(-titik.getOrdinat());
    }

    public void refleksiY(Titik2 titik){
        titik.setAbsis(-titik.getAbsis());
    }

    public Titik2 getRefleksiX(){
        return new Titik2(this.x,-this.y);
    }
    public Titik2 getRefleksiY(){
        return new Titik2(-this.x,this.y);
    }

}
