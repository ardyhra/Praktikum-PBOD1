import java.util.*;
public class ProgramEasy {
    public static void main(String[] args) {
        List<IFlyer> koleksiBisaTerbang = new ArrayList<>();

        IFlyer superman = new Superman("Superman");
        IFlyer superboy = new Superman("Superboy");
        IFlyer supergirl = new Superman("Supergirl");

        IFlyer merpati = new Bird();
        IFlyer eagle = new Bird();

        koleksiBisaTerbang.add(merpati);
        koleksiBisaTerbang.add(eagle);
        koleksiBisaTerbang.add(superman);
        koleksiBisaTerbang.add(supergirl);
        koleksiBisaTerbang.add(superboy);

        for (IFlyer bisaTerbang : koleksiBisaTerbang) {
            if (bisaTerbang instanceof Superman) {
                System.out.println("I'm " + ((Superman) bisaTerbang).getName());
                System.out.println("Bangsa: " + bisaTerbang.getClass().getSuperclass().getSimpleName());
                System.out.print("Makan: ");
                ((Animal) bisaTerbang).eat();
                System.out.println("");
            } else {
                System.out.println("I'm " + bisaTerbang.getClass().getSimpleName());
                System.out.println("Bisa terbang");
                System.out.print("Makan: ");
                ((Animal) bisaTerbang).eat();
                System.out.println("");
            }
        }
    }
}