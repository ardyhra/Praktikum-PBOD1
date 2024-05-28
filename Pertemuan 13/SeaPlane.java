public class SeaPlane extends Airplane{
    private double maxLoad;

    public SeaPlane() {
        super();
    }

    public SeaPlane(double maxLoad){
        this.maxLoad = maxLoad;
    }
    
    public double getMaxLoad(){
        return this.maxLoad;
    }

    @Override
    public void takeOff() {
        System.out.println("Sea Plane lepas landas");
    }

    @Override
    public void land() {
        System.out.println("Sea Plane mendarat");
    }

    @Override
    public void fly() {
        System.out.println("Sea Plane terbang");
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
        return "Seaplane dapat take-off dan mendarat di perairan laut";
    }
}
