import java.util.*;

public class Pemdas_Bab3_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Bulan ke-");
        int  bulan = sc.nextInt();
        System.out.print("Tahun (2000 - 2020): ");
        int tahun = sc.nextInt();

        if (bulan < 1 || bulan > 12 && tahun  < 2000 || tahun > 2020) 
        return;

    }
}
