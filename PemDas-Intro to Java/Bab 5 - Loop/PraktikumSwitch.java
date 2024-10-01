import java.util.*;

//ahmadthoriq

public class PraktikumSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println(" -- CHOOSE YOUR VOLUME CALCULATOR -- ");
            System.out.println("0. KELUAR");
            System.out.println("1. HITUNG VOLUME BALOK");
            System.out.println("2. HITUNG VOLUME BOLA");
            System.out.println("3. HITUNG VOLUME KERUCUT");
            System.out.println("4. HITUNG VOLUME SILINDER");
            System.out.println("5. HITUNG VOLUME LIMAS SEGITIGA");

            System.out.print("Masukkan pilihan anda: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 0:
                    System.out.println("KELUAR");
                    //break;
                    return;

                case 1:
                    System.out.println("HITUNG VOLUME BALOK");
                    System.out.println("--------------------------");

                    System.out.print("Masukkan panjang: ");
                    double panjang = sc.nextDouble();

                    System.out.print("Masukkan lebar: ");
                    double lebar = sc.nextDouble();

                    System.out.print("Masukkan tinggi: ");
                    double tinggi = sc.nextDouble();

                    double volBalok = (double) panjang * lebar * tinggi;
                    volBalok = Math.ceil(volBalok);
                    
                    System.out.printf("VOLUME BALOK = %.1f\n\n", volBalok);
                    break;

                case 2:
                    System.out.println("HITUNG VOLUME BOLA");
                    System.out.println("--------------------------");

                    System.out.print("Masukkan jari-jari: ");
                    double jariJari = sc.nextDouble();

                    double volBola = 4 / 3.0 * Math.PI * Math.pow(jariJari, 3);
                    volBola = Math.ceil(volBola);

                    System.out.printf("VOLUME BOLA = %.1f\n\n", volBola);
                    break;

                case 3:
                    System.out.println("HITUNG VOLUME KERUCUT");
                    System.out.println("--------------------------");

                    System.out.print("Masukkan jari-jari: ");
                    double jariJariKerucut = sc.nextDouble();

                    System.out.print("Masukkan tinggi: ");
                    double tinggiKerucut = sc.nextDouble();

                    double volKerucut = 1 / 3.0 * Math.PI * Math.pow(jariJariKerucut, 2) * tinggiKerucut;
                    volKerucut = Math.ceil(volKerucut);

                    System.out.printf("VOLUME KERUCUT = %.1f\n\n", volKerucut);
                    break;

                case 4:
                    System.out.println("HITUNG VOLUME SILINDER");
                    System.out.println("--------------------------");

                    System.out.print("Masukkan jari-jari: ");
                    double jariJariTabung = sc.nextDouble();

                    System.out.print("Masukkan tinggi tabung: ");
                    double tinggiTabung = sc.nextDouble();

                    double volTabung = Math.PI * Math.pow(jariJariTabung, 2) * tinggiTabung;
                    volTabung = Math.ceil(volTabung);

                    System.out.printf("VOLUME SILINDER = %.1f\n\n", volTabung);

                    break;

                case 5:
                    System.out.println("HITUNG VOLUME LIMAS SEGITIGA");
                    System.out.println("--------------------------");

                    System.out.println("Udah tau luas alasnya? (sudah / belum)");
                    String udahTau = sc.next();

                    if (udahTau.equalsIgnoreCase("sudah")) {

                        System.out.println(" ");
                        System.out.print("Masukkan luas alas: ");
                        double luasAlas1 = sc.nextDouble();
                        double luasAlas2 = luasAlas1 / 2.0;

                        System.out.print("Masukkan tinggi limas: ");
                        double tinggiLimas = sc.nextDouble();

                        double volLimas = 1 / 3.0 * luasAlas2 * tinggiLimas;
                        volLimas = Math.ceil(volLimas);
                        
                        System.out.printf("VOLUME LIMAS = %.1f\n\n", volLimas);

                    }
                    if (udahTau.equalsIgnoreCase("belum")) {

                        System.out.println(" ");
                        System.out.print("Masukkan alas segitiga: ");
                        double alasSegitigaLimas = sc.nextDouble();

                        System.out.print("Masukkan tinggi segitiga: ");
                        double tinggiSegitigaLimas = sc.nextDouble();

                        System.out.print("Masukkan tinggi limas: ");
                        double tinggiLimas = sc.nextDouble();

                        double luasAlas = 1 /2.0 * alasSegitigaLimas * tinggiSegitigaLimas;

                        double volLimas = 1 / 3.0 * luasAlas * tinggiLimas;
                        volLimas = Math.ceil(volLimas);
                        
                        System.out.printf("VOLUME LIMAS = %.1f\n\n", volLimas);

                    }

                    break;

                default:
                    System.out.println("GA ADA BANG");
                    System.out.println("~ ~ ~ ~ ~ ~ ~ ~ ~ ~");
            }
        } while (pilihan != 0);
    }

}

//CATATAN:
//1. Objek Math.ceil() fungsinya untuk ngebuletin hasil perhitungan ke atas
//2. "\n\n" itu fungsinya untuk bikin line / baris baru setiap selesai ngitung 1 case
