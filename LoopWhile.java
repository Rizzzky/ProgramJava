
import java.util.Scanner;


public class LoopWhile {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            String jawaban;
            do{
                System.out.print("Bilangan 1:");
                int bil1 = input.nextInt();
                System.out.print("Bilangan 2:");
                int bil2 = input.nextInt();

                int hasil = bil1 * bil2;
                System.out.println("Hasil Perkalian="+hasil);
                System.out.print("Apakah ingin Mengulang: (Y/N)");
                jawaban = input.next();
                
            }while(jawaban.equalsIgnoreCase("Y"));
        }
    }
}
