public class AirPort {
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
}
