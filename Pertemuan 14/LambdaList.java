import java.util.ArrayList;
public class LambdaList {
    public static void main(String[] args){
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Rizky");
        mahasiswaList.add("Ojan");
        mahasiswaList.add("Ucup");
        mahasiswaList.add("John Doe");

        mahasiswaList.forEach((mahasiswa) -> {
            System.out.println(mahasiswa);
        });
    }
}