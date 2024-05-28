public class Truck extends Vehicle{
    private double maxLoad;

    public Truck() {
        super();
    }

    public Truck(double maxLoad){
        this.maxLoad = maxLoad;
    }
    
    public double getMaxLoad(){
        return this.maxLoad;
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
        return "Truck adalah angkutan darat yang sangat handal";
    }
}
