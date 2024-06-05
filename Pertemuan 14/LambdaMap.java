import java.util.*;
public class LambdaMap {
    public static void main(String[] args){
        Map<String, String> mahasiswaList = new HashMap<>();
        mahasiswaList.put("12345","Rizky");
        mahasiswaList.put("23456","Ojan");
        mahasiswaList.put("34567","Ucup");
        mahasiswaList.put("45678","John Doe");

        mahasiswaList.forEach((nim, nama) -> {
            System.out.println("NIM : "+nim+", Nama : "+nama);
        });
    }
}