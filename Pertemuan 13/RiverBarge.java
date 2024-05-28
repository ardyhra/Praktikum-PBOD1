public class RiverBarge extends Vehicle {
    private double maxLoad;

    public RiverBarge(double maxLoad){
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
}
