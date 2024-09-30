import java.util.*;

// Mengubah angka desimal menjadi biner - PemDas
public class PemDas_5_37_Abi {

    public static void main(String[] args) {
        System.out.print("Masukkan bilangan bulat : ");
        Scanner sc = new Scanner(System.in);
        int dec = sc.nextInt();


        String bin = "";
        for(int i = dec; i > 0; i/=2){
            bin = i % 2 + bin;

        }

        System.out.println("Bilangan biner dari \"" + dec + "\" adalah = " + bin);

        
        sc.close();
        // Abi
}
}