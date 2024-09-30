import java.util.*;

public class PemDas_Bab5_36 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan 9 digit ISBN: ");

        int d10;
        String digitAkhir;
        int semuadigit = 0;
        String isbn = sc.next();

        for (int i = 0; i < isbn.length(); i++) {
            String data = isbn.substring(i, i + 1);
            int ParseData = Integer.parseInt(data);

            int nilai = ParseData * (i + 1);
            semuadigit += nilai; //sama aja kayak semuadigit = semudaigit + nilai
       
        }
        d10 = semuadigit % 11;

        if (d10 == 10) {
            digitAkhir = "X";
        } else {
            digitAkhir = String.valueOf(d10);
        }
        System.out.println("ISBN 10-nya adalah: " + isbn + digitAkhir);


        sc.close();
    }

}
