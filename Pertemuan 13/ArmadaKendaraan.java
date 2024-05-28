import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArmadaKendaraan {
    private List<Vehicle> armada;

    public ArmadaKendaraan() {
        this.armada = new ArrayList<>();
    }

    public void tambahArmada(Collection<? extends Vehicle> kendaraanBaru) {
        armada.addAll(kendaraanBaru);
    }

    public List<Vehicle> getAllArmada() {
        return armada;
    }
}
