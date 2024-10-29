import java.util.*;

public class QuadraticEquation2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai a, b, c: ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double x1 = (double) (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        double x2 = (double) (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);

        if (b * b - 4 * a * c < 0) {
            System.out.println("Persamaan ini ga punya penyelesaian");
        } else if (x1 != x2) {
            System.out.println("Persamaannya punya 2 akar: " + x1 + " dan " + x2);
        } else {
            System.out.println("Persamaannya punya 1 akar yaitu " + x1);
        }
        main(args);
    }

}
