import java.util.ArrayList;
import java.util.List;

public class ProgramMedium {
    public static void main(String[] args) {
        Truck truck = new Truck();
        System.out.println(truck);
        SeaPlane sPlane = new SeaPlane();
        System.out.println(sPlane);
        Helicopter copter = new Helicopter(); 
        System.out.println(copter);
        System.out.println("###########################################");
        List<Truck> armadaTruck = new ArrayList<>(); 
        List<SeaPlane> armadaSeaPlane = new ArrayList<>(); 
        List<Helicopter> armadaHelicopter = new ArrayList<>();

        // Menambahkan kendaraan ke kelompok armada yang sesuai
        armadaTruck.add(truck);
        armadaTruck.add(truck);
        armadaTruck.add(truck);
        System.out.println("jumlah Armada Truck: "+armadaTruck.size());
        armadaSeaPlane.add(sPlane);
        System.out.println("jumlah Armada Seaplane: "+armadaSeaPlane.size());
        armadaHelicopter.add(copter);
        armadaHelicopter.add(copter);
        System.out.println("jumlah Armada Helicopter: "+ armadaHelicopter.size()); 
        System.out.println("###########################################");

        /**
        * Buatlah Kelas ArmadaKendaraan yang memiliki 2 method yaitu tambahArmada ()
        * yang dapat menerima suatu Collection dengan batasan tipe kelas yang diijinkan,
        * ingat upperbound generic: Collection <? extends UpperboundClass>>
        * dan getAllArmada() untuk mengambil semua kendaraan
        */
        ArmadaKendaraan armadaKendaraan = new ArmadaKendaraan();

        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadaTruck);
        System.out.println(">> Jumlah unit kendaraan : " + armadaKendaraan.getAllArmada().size()); 
        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadaSeaPlane);
        System.out.println(">> Jumlah unit kendaraan : " + armadaKendaraan.getAllArmada().size());
        System.out.println("Menambahkan armada baru");
        armadaKendaraan.tambahArmada(armadaHelicopter);
        System.out.println(">> Jumlah unit kendaraan : " + armadaKendaraan.getAllArmada ().size());
    }
}
