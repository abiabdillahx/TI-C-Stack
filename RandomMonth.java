import java.util.Random;

public class RandomMonth {

    public static void main(String[] args) {
        Random rand = new Random();

        int num = rand.nextInt(12) + 1;
        System.out.println(num);

        if (num == 1) {
            System.out.println("Januari");
        } else if (num == 2) {
            System.out.println("Februari");
        } else if (num == 3) {
            System.out.println("Maret");
        } else if (num == 4) {
            System.out.println("April");
        } else if (num == 5) {
            System.out.println("Mei");
        } else if (num == 6) {
            System.out.println("Juni");
        } else if (num == 7) {
            System.out.println("Juli");
        } else if (num == 8) {
            System.out.println("Agustus");
        } else if (num == 9) {
            System.out.println("September");
        } else if (num == 10) {
            System.out.println("Oktober");
        } else if (num == 11) {
            System.out.println("November");
        } else if (num == 12) {
            System.out.println("Desember");
        }
    }
}