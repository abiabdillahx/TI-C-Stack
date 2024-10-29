import java.util.*;

public class AnswerASum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = (int) (System.currentTimeMillis() % 10);
        int b = (int) (System.currentTimeMillis() / 7 % 10);
        int c = (int) (System.currentTimeMillis() / 14 % 10);
        
        int d = a + b + c;

        System.out.print("Berapa hasil dari " + a + " + " + b + " + " + c + "? ");
        int jwb = sc.nextInt();

        if (jwb == d) {
            System.out.println("NAHHH"); 
        } else {
            System.out.println("kocak");
            System.out.println("harusnya tuh hasilnya " + d);
        }

        sc.close();
    }
}