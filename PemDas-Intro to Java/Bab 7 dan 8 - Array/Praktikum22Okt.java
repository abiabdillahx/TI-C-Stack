import java.util.Scanner;

public class Praktikum22Okt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Array 2D untuk menyimpan data kereta api
        String[][] keretaApi = {
            {"Ekonomi", "50000", "2", "Tidak Ada", "Tidak Ada"},
            {"Bisnis", "100000", "5", "Ada", "Tidak Ada"},
            {"Eksekutif", "200000", "7", "Ada", "Tidak Ada"},
            {"Pariwisata", "300000", "10", "Ada", "Ada"}
        }; 

        // Array untuk menyimpan maksimal 10 pesanan tiket
        String[] pesananTiket = new String[10];
        double[] hargaPesanan = new double[10]; // Untuk menyimpan harga tiket setelah diskon
        int jumlahPesanan = 0; // Counter untuk pesanan tiket

        while (true) {
            // Menu pilihan
            System.out.println("Pilihan menunya adalah:");
            System.out.println("1. Melihat Daftar Kereta Api");
            System.out.println("2. Melihat Daftar Kereta Api yang ada AC");
            System.out.println("3. Melihat Daftar Kereta Api yang ada Colokan");
            System.out.println("4. Memesan Tiket Kereta Api");
            System.out.println("5. Melihat Pesanan Tiket");
            System.out.println("Masukkan nilai (masukkan angka selain 1-5 untuk keluar):");
            int pilihan = sc.nextInt();

            if (pilihan < 1 || pilihan > 5) {
                System.out.println("Program berhenti.");
                break;
            }

            switch (pilihan) {
                case 1:
                    // Menampilkan semua daftar kereta api
                    System.out.println("Daftar Kereta Api:");
                    for (String[] kereta : keretaApi) {
                        System.out.printf("Jenis: %s, Harga: Rp. %s, Diskon: %s%%, AC: %s, Colokan: %s\n", 
                            kereta[0], kereta[1], kereta[2], kereta[3], kereta[4]);
                    }
                    break;
                case 2:
                    // Menampilkan daftar kereta api yang ada AC
                    System.out.println("Daftar Kereta Api dengan AC:");
                    for (String[] kereta : keretaApi) {
                        if (kereta[3].equals("Ada")) {
                            System.out.printf("Jenis: %s, Harga: Rp. %s, Diskon: %s%%\n", kereta[0], kereta[1], kereta[2]);
                        }
                    }
                    break;
                case 3:
                    // Menampilkan daftar kereta api yang ada colokan
                    System.out.println("Daftar Kereta Api dengan Colokan:");
                    for (String[] kereta : keretaApi) {
                        if (kereta[4].equals("Ada")) {
                            System.out.printf("Jenis: %s, Harga: Rp. %s, Diskon: %s%%\n", kereta[0], kereta[1], kereta[2]);
                        }
                    }
                    break;
                case 4:
                    // Memesan tiket
                    if (jumlahPesanan >= 10) {
                        System.out.println("Anda telah mencapai batas maksimal pesanan (10 tiket).");
                    } else {
                        System.out.println("Masukkan jenis kereta api yang ingin dipesan:");
                        sc.nextLine(); // untuk membersihkan buffer
                        String jenisPesanan = sc.nextLine();
                        boolean ditemukan = false;
                        for (String[] kereta : keretaApi) {
                            if (kereta[0].equalsIgnoreCase(jenisPesanan)) {
                                double harga = Double.parseDouble(kereta[1]);
                                double diskon = Double.parseDouble(kereta[2]);
                                double hargaSetelahDiskon = harga - (harga * diskon / 100);
                                
                                pesananTiket[jumlahPesanan] = kereta[0];
                                hargaPesanan[jumlahPesanan] = hargaSetelahDiskon;
                                
                                System.out.printf("Tiket %s dengan harga setelah diskon: Rp. %.0f telah dipesan.\n", 
                                    kereta[0], hargaSetelahDiskon);
                                jumlahPesanan++;
                                ditemukan = true;
                                break;
                            }
                        }
                        if (!ditemukan) {
                            System.out.println("Jenis kereta api tidak ditemukan.");
                        }
                    }
                    break;
                case 5:
                    // Menampilkan pesanan tiket
                    if (jumlahPesanan > 0) {
                        System.out.println("Pesanan tiket Anda:");
                        double totalHarga = 0;
                        for (int i = 0; i < jumlahPesanan; i++) {
                            System.out.printf("%d. Tiket %s dengan harga setelah diskon: Rp. %.0f\n", 
                                (i + 1), pesananTiket[i], hargaPesanan[i]);
                            totalHarga += hargaPesanan[i];
                        }
                        System.out.printf("Total harga untuk semua tiket: Rp. %.0f\n", totalHarga);
                    } else {
                        System.out.println("Belum ada tiket yang dipesan.");
                    }
                    break;
            }
            System.out.println(); // Baris kosong untuk pemisah
        }

        sc.close();
    }
}