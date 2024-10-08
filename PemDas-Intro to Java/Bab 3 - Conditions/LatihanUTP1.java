import java.util.Scanner;

//ahmadthoriqhafidzurrohman
//245150701111026
//TI-C

public class LatihanUTP1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int kendaraan = sc.nextInt();
        int lamaParkir = sc.nextInt();
        int duitParkir = sc.nextInt();

        switch (kendaraan) {
            case 1:
                int duitMotor = 2_000 * lamaParkir;
                if (duitParkir < duitMotor) {
                    System.out.println("Uang anda belum mencukupi.");
                } else if (duitParkir == duitMotor) {
                    System.out.println("Uang yang dibayarkan pas.");
                } else if (duitParkir > duitMotor) {
                    int kembalian = duitParkir - duitMotor;

                    //metode untuk nyari banyaknya lembar duit
                    int sepuluhRibuan = kembalian / 10_000;
                    kembalian = kembalian % 10_000;
                    int limaRibuan = kembalian / 5_000;
                    kembalian = kembalian % 5_000;
                    int limaRatusan = kembalian / 500;
                    kembalian = kembalian % 500;
                    int seratusan = kembalian / 100;
                    kembalian = kembalian % 100;
                    //selesai

                    System.out.println("Anda mendapatkan kembalian sebesar: ");
                    System.out.println(sepuluhRibuan + " uang 10.000");
                    System.out.println(limaRibuan + " uang 5.000");
                    System.out.println(limaRatusan + " uang 500");
                    System.out.println(seratusan + " uang 100");

                }

                break;

            case 2:
                int duitMobil = 4_000 * lamaParkir;
                if (duitParkir < duitMobil) {
                    System.out.println("Uang anda belum mencukupi.");
                } else if (duitParkir == duitMobil) {
                    System.out.println("Uang yang dibayarkan pas.");
                } else if (duitParkir > duitMobil) {
                    int kembalian = duitParkir - duitMobil;

                    int sepuluhRibuan = kembalian / 10_000;
                    kembalian = kembalian % 10_000;
                    int limaRibuan = kembalian / 5_000;
                    kembalian = kembalian % 5_000;
                    int limaRatusan = kembalian / 500;
                    kembalian = kembalian % 500;
                    int seratusan = kembalian / 100;
                    kembalian = kembalian % 100;

                    System.out.println("Anda mendapatkan kembalian sebesar: ");
                    System.out.println(sepuluhRibuan + " uang 10.000");
                    System.out.println(limaRibuan + " uang 5.000");
                    System.out.println(limaRatusan + " uang 500");
                    System.out.println(seratusan + " uang 100");

                }

                break;

            case 3:
                int duitBus = 9_000 * lamaParkir;
                if (duitParkir < duitBus) {
                    System.out.println("Uang anda belum mencukupi.");
                } else if (duitParkir == duitBus) {
                    System.out.println("Uang yang dibayarkan pas.");
                } else if (duitParkir > duitBus) {
                    int kembalian = duitParkir - duitBus;

                    int sepuluhRibuan = kembalian / 10_000;
                    kembalian = kembalian % 10_000;
                    int limaRibuan = kembalian / 5_000;
                    kembalian = kembalian % 5_000;
                    int limaRatusan = kembalian / 500;
                    kembalian = kembalian % 500;
                    int seratusan = kembalian / 100;
                    kembalian = kembalian % 100;

                    System.out.println("Anda mendapatkan kembalian sebesar: ");
                    System.out.println(sepuluhRibuan + " uang 10.000");
                    System.out.println(limaRibuan + " uang 5.000");
                    System.out.println(limaRatusan + " uang 500");
                    System.out.println(seratusan + " uang 100");

                }

                break;

        }

    }

}

//penjelasan tentang -- metode untuk nyari banyaknya lembar duit --

// Misal, kembaliannya itu 26.000, jadinya:
// 1. int sepuluhRibuan = kembalian / 10_000;
// ini bakal ngebuat program nampilin berapa banyak lembar duit 10.000 yang bisa diambil dari 26.000
// 26.000 / 10.000 = 2 (2 lembar)

// 2. kembalian = kembalian % 10_000;
// nah karena udah dapet berapa lembarnya (2 lembar), kita hitung berapa sisa 26.000 dibagi 10.000 untuk dijalanin ke program berikutnya
// 26.000 % 10.000 = 6.000 (sisanya 6.000)

// nah kan udah dapet tuh nilai kembalian ke-2-nya 6.000, nanti dia bakal ngulangin langkah (1) sama (2) sampe hasilnya 0 (ga ada lembar duit lagi)

// semoga bisa dipahami yh teman" 

// kalo ada koreksi dan tambahan, boleh banget diedit / dikomen yhh
