import java.util.*;

public class Pemdas_Bab3_10 {
    public static void main(String[] args) {
        int angka1 = (int) (Math.random() * 100);
        int angka2 = (int) (Math.random() * 100);

        if (angka1 < angka2) {
            int temp = angka1;
            angka1 = angka2;
            angka2 = temp;
        }

        System.out.println("Berapa hasil dari " + angka1 + " - " + angka2 + "?");
        Scanner sc = new Scanner(System.in);
        int jawab = sc.nextInt();
        sc.close();

        if (jawab == angka1 - angka2) {
            System.out.println("tru min");
        } else {
            System.out.println("salah min");
            System.out.println(angka1 + " - " + angka2 + " harusnya " + (angka1 - angka2));
        }
    }
}