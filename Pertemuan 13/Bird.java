public class Bird extends Animal implements IFlyer {
    @Override
    public void takeOff() {
        System.out.println("Burung lepas landas");
    }

    @Override
    public void land() {
        System.out.println("Burung mendarat");
    }

    @Override
    public void fly() {
        System.out.println("Burung terbang");
    }

    public void buildNest(){
        System.out.println("Burung membuat sarang");
    }

    public void layEggs(){
        System.out.println("Burung bertelur");
    }

    public void eat() {
        System.out.println("Makanan Burung");
    }
    
}
