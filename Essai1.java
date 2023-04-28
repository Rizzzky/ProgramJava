import java.util.Scanner;

public class Essai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int totalNilai = 0;
        int[] nilaiMahasiswa = new int[5];

        System.out.println("Masukkan nilai dari 5 mahasiswa: ");
        for (int i = 0; i < 5; i++) {
            System.out.print("Nilai mahasiswa ke-" + (i+1) + ": ");
            nilaiMahasiswa[i] = input.nextInt();
            totalNilai += nilaiMahasiswa[i];
        }

        double rataRata = (double) totalNilai / 5; // Menghitung rata-rata
        System.out.println("Rata-rata nilai mahasiswa: " + rataRata);

        // Menampilkan nilai mahasiswa di atas rata-rata
        System.out.println("Nilai mahasiswa di atas rata-rata: ");
        for (int i = 0; i < 5; i++) {
            if (nilaiMahasiswa[i] > rataRata) {
                System.out.println("Mahasiswa ke-" + (i+1) + ": " + nilaiMahasiswa[i]);
            }
        }
    }
}
