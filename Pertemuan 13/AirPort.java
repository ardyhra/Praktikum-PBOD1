public class AirPort extends Airplane {
    private Airplane airplane;
    private String name;

    public AirPort(String name) {
        this.name = name;
    }
    
    public Airplane getAirplane(){
        return airplane;
    }

    public String getName() {
        return name;
    }

    public String givePermissionToLand(IFlyer flyer){
        if (flyer instanceof Airplane) {
            return "Diizinkan mendarat";
        }
        else {
            return "Tidak diizinkan mendarat";
        }
    }

    @Override
    public void takeOff() {
        System.out.println("Airport mengizinkan lepas landas");
    }

    @Override
    public void land() {
        System.out.println("Airport mengizinkan mendarat");
    }

    @Override
    public void fly() {
        System.out.println("Airport mengizinkan terbang");
    }
}
