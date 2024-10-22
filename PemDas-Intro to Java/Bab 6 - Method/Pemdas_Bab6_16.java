public class Pemdas_Bab6_16 {
    public static int jumlahHariDalamTahun(int tahun) {
        if ((tahun % 4 == 0 && tahun % 100 != 0) || tahun % 400 == 0) {  // tahun kabisat
            return 366;
        } else {
            return 365;

        }
    }

    public static void main(String[] args) {
        for (int tahun = 2000; tahun <= 2020; tahun++) {
            System.out.println("Tahun " + tahun + " memiliki " + jumlahHariDalamTahun(tahun) + " hari");

        }
    }
}