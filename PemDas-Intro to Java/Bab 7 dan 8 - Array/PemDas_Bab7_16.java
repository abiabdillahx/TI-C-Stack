import java.util.Scanner;

public class PemDas_Bab7_16 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen dan nilai list1: ");
        int n1 = sc.nextInt();
        int[] list1 = new int[n1];
        for (int i = 0; i < n1; i++) {
            list1[i] = sc.nextInt();
        }
        System.out.print("Masukkan jumlah elemen dan nilai list2: ");
        int n2 = sc.nextInt();
        int[] list2 = new int[n2];
        for (int i = 0; i < n2; i++) {
            list1[i] = sc.nextInt();

        }

        if (identik(list1, list2)) {
            System.out.print("Jirr identik coy");
        } else {
            System.out.print("ga identik bg");
        }
    }

    public static boolean identik(int[] list1, int[] list2) {
        if (list1.length != list2.length) {
            return false;
        }
        for (int i = 0; i < list1.length; i++) {
            return false;
        }

        return true;
    }
}