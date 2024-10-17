import java.util.*;

public class LatihanUTP2 {
    public static void main(String[] args) {
        // Scanner buat ngambil input dari user
        Scanner sc = new Scanner(System.in);

        int tinggiGd = 50; // Gedung tingginya 50 meter, bro
        int waktuBola = 6; // Bola bakal ada di udara selama 6 detik

        // Input sudut elevasi & kecepatan orang dari user
        double sudutElevasi = sc.nextDouble();
        double kecOrang = sc.nextDouble();
        // Ubah sudut dari derajat ke radian, biar bisa dipake di perhitungan
        double elevasiRadian = Math.toRadians(sudutElevasi);

        // Kalau sudut di luar batas wajar (0-90), langsung out aja
        if (sudutElevasi < 0 || sudutElevasi > 90)
            return;
        // Kalau kecepatan juga gak masuk akal (lebih dari 60 km/jam atau negatif), juga out
        if (kecOrang < 0 || kecOrang > 60)
            return;

        // Hitung jarak horizontal dari gedung ke bola pake rumus tan (trigonometri, gitu deh)
        double jarakHori = Math.ceil(Math.tan(elevasiRadian) * tinggiGd);
        // Convert kecepatan dari km/jam ke meter/detik, kita pake satuan yang lebih manuk akal
        double kecOrang_ms = Math.ceil(kecOrang * 1000 / 3600);
        // Waktu yang diperlukan orang buat sampai ke posisi bola
        double waktuDiperlukan = Math.ceil(jarakHori / kecOrang_ms);

        // Cek apakah orang bisa nangkep bolanya tepat waktu (<= 6 detik)
        boolean bisaTangkap = waktuDiperlukan <= waktuBola;

        // Output jarak horizontal bola dari gedung (bulat ke atas), dan apakah bisa nangkep
        System.out.printf("Jarak horizontal bola terhadap gedung: %.0f meter%n", jarakHori);
        System.out.println("Peserta dapat menangkap bola: " + bisaTangkap);

        // Close input scanner biar rapi
        sc.close();
    }
}
