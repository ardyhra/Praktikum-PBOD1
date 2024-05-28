public class Helicopter extends Airplane {
    private double maxLoad;

    public Helicopter() {
        super();
    }

    public Helicopter(double maxLoad){
        this.maxLoad = maxLoad;
    }
    
    public double getMaxLoad(){
        return this.maxLoad;
    }

    @Override
    public void takeOff() {
        System.out.println("Helicopter lepas landas");
    }

    @Override
    public void land() {
        System.out.println("Helicopter mendarat");
    }

    @Override
    public void fly() {
        System.out.println("Helicopter terbang");
    }

    @Override
    public double calcFuelEfficiency(){
        return 0.0;
    }

    @Override
    public double calcTripDistance(){
        return 0.0;
    }

    @Override
    public String toString(){
        return "Helicopter hanya memerlukan landasan kecil";
    }
}
