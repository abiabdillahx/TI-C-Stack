import java.util.Scanner; //memanggil fungsi scanner dari library java 

public class ArchieSatriaPamungkasCicilan {

    public static void main (String[] args)
    {
        //deklarasi variavle
        int NilaiHutang,tahun; 
        double bunga = 4.875; //bunga di set segini supaya di pengulangan pertama nilainya jadi lima karena ditambah 0,125
        Scanner insert = new Scanner(System.in);

        //print nama dan nim dengan tambahan format agar rata kanan
        System.out.printf("%75s%n","Archie Satria Pamungkas");
        System.out.printf("%75s%n","245150300111031");

        //looping buat underline
        for (int i = 0;i<75 ; i++)
        {
            System.out.print("=");
        }

        System.out.println(" ");//biar ada Enter

        ratatengah("Program Rencana Pinjaman", 75);//judul program dengan format agar rata tengah(pakai method)

        System.out.println(" "); //biar ada enter

        System.out.print("Masukan nilai pinjaman: ");
        NilaiHutang = insert.nextInt(); //masukin nilai pinjaman

        System.out.print("Masukan jangka cicilan: ");
        tahun = insert.nextInt(); //masukan jangka cicilan

        insert.close();//tutup scanner

        //looping biar bagus / hiasan aja
        for (int i = 0;i<75 ; i++)
        {
            System.out.print("*");
        }  

        System.out.println(" ");//biar ada enter
        System.out.printf("%-25s%-25s%-25s%n%n","Suku Bunga","Cicilan Bulanan","Total Tagihan");//print suku bunga, cicilan bulanan serta total bayarnya

        //kita pakai kondisi kurang dari 25 kenapa? karena dari soal disuruh dari range 5-8, tetapi nambah 0,125, jadi ada 5,5.125,5.250...,7.875,8, totalnya 25
        for (int i = 0; i < 25; i++)
        {
            bunga += 0.125; //looping biar bunganya nambah terus
            rumuscicilan(bunga, NilaiHutang, (tahun*12)); //nah kita pakai fungsi ges, kaya fungsi mtk yang f(x), gapaham? belajar!
        }

    }

    //iya ini gw pelan pelan ajarin ya...:)
    //jadi kita sebut ini namanya fungsi rumuscicilan, isi didalem () nyesuain sama cara kita manggil fungsi ini
    // contoh di line sebelumnya, kita manggil rumuscicilan dengan isi (bunga, NilaiHutang, (tahun*12))
    //artinya, nilai dari bunga, akan masuk ke variable bungas, nilai dari NilaiHutang akan masuk ke variable pinjams, dan nilai dari (tahun*12) masuk ke variable totalbulan
    //kalo ngga ngerti pc 08998748954 ygy
    public static void rumuscicilan(double bungas,double pinjams,int totalbulan)
    {
        double cicilanbulanan = (pinjams * (bungas/1200)) / (1 - (1 / Math.pow((1 + (bungas/1200)),totalbulan))); //ini berdasarkan rumus yah yang dibuku
        double totaltagihan = cicilanbulanan * totalbulan; //ini tinggal cicilan perbulan dikali banyak nyicilnya, jadi total cicilannya

        //nah ini manggil data data tadi, tapi di format agar rapih jadi bentuk ke kek tabel
        System.out.printf("%6s%19s%-25s%-25s%n",String.format("%.3f",bungas)+"%"," ",String.format("%.2f",cicilanbulanan),String.format("%.2f",totaltagihan));
    }

    //udh ini gapenting cuma buat ratatengahin judul
    public static void ratatengah(String text, int lebar)
    {
        int jarak = (lebar-text.length());
        String ratateng = String.format("%"+jarak+"s",text);
        System.out.println(ratateng);
    }

    //semoga bisa semua ya, Semangat!
    //salam ngoding!
    //#majubersamati #filkommeroket
}
