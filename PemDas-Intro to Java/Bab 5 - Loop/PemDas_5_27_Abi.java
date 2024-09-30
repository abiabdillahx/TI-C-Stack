public class PemDas_5_27_Abi {
    public static void main(String[] args) {
        int jml = 0; //  Jumlah tahun kabisat


        for(int y =101; y <= 2100; y++){
            if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
                jml++;
                if (jml % 10 == 0) {
                    System.out.print(y + "\n");
                }else{
                    System.out.print(y + " ");
                }
            }
        }

        System.out.println("\n\nJumlah tahun kabisat antara tahun 101-2100 adalah =  " + jml);

    }
}
