import java.util.Scanner;

public class Play {
    public static void main(String[] args) {
        Kamus kamus = new Kamus();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih bahasa:");
        System.out.println("1. Bahasa Inggris ke Indonesia");
        System.out.println("2. Indonesia ke Bahasa Inggris");
        System.out.print("Pilihan: ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Membuang karakter newline setelah memasukkan pilihan

        System.out.print("Masukkan kata: ");
        String word = scanner.nextLine();

        boolean englishToIndonesian = (choice == 1);

        String translation = kamus.translate(word, englishToIndonesian);
        System.out.println("Terjemahan: " + translation);

        scanner.close();
    }
}