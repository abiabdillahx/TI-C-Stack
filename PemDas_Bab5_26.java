public class PemDas_Bab5_26 {
    public static void main(String[] args) {

        double e = 1.0; 
        double nilaiSementara = 1.0; 
        int batasMaks = 100_000;

        for (int i = 1; i <= batasMaks; i++) { 

            nilaiSementara = nilaiSementara / i; 
            e += nilaiSementara; 

            if (i % 10_000 == 0) {
                System.out.println("Nilai e untuk i = " + i + " adalah: " + e); 
            }

        }
    }
}
