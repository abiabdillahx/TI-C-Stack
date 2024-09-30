import java.util.Scanner;
public class ArchieSatriaPamungkasdeposito {

    public static void main(String[] args)
    {
        //print nama dan nim
        //MENGGUNAKAN FORMAT AGAR RATA KIRI
        System.out.printf("%75s%n","Archie Satria Pamungkas");
        System.out.printf("%75s%n","245150300111031");

        //looping underline/garis bawah
        for (int i = 0;i<75 ; i++)
        {
            System.out.print("=");
        }
        System.out.println(" ");
        ratatengah("Program Penghitung Tabungan Deposito", 75);//print judul (PAKE RATA KIRI)

        System.out.printf("\n"); //BIAR ADA ENTER

        //deklarasi variable
        short bulan; //pakai short, kenapa? karena short lebih kecil jangkauannya daripada int, lebih hemat tempat...(Short juga bilangan bulat)
        double depositoawal,bunga; //Pakai double untuk bilangan koma

        Scanner insert = new Scanner(System.in); //Deklarasi Scanner untuk input

        System.out.print("Masukan nilai deposit: ");
        depositoawal = insert.nextDouble(); //masukan nilai deposito awal

        System.out.print("Masukan bunga tahunan: ");
        bunga = insert.nextDouble(); //masukan nilai bunga tahunan
        
        System.out.printf("Masukan bulan deposit: ");
        bulan = insert.nextShort(); //masukan nilai bulan deposit

        System.out.println(" ");//biar ada enter

        System.out.printf("%-10s%-20s\n","Bulan","Nilai Deposito"); //memanggil header bulan dan nilai deposito ditambah format agar rapih(rata kanan pake min)

        //anjay looping, ini biar prosesnya ngitung sebanyak bulan, jadi selama i kurang dari bulan yang di input, programnya akan ngulangin kode dibawah sampe keluar dari kondisi, alias sampai i > bulan
        for (int i = 1; i < bulan+1; i++)
        {
            depositoawal += (depositoawal*bunga/1200); // ini kaya rumus dibuku, dimana nilai depositoawal = nilai depositoawal + (depositoawal*bunga/1200)
            System.out.printf("%-10s%-20s\n",i,String.format("%.2f",depositoawal)); //ini buat ngeprint hasilnya dengan format rata kiri
        }

    }

    public static void ratatengah(String text, int lebar) //udh gausah mikirini ini, ini rumus buat rata tengah...
    {
        int jarak = lebar-(text.length()/2);
        String ratateng = String.format("%"+jarak+"s",text);
        System.out.println(ratateng);
    }

}
