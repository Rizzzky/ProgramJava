import java.util.Scanner;

public class TugasEssay1 {
    public static void main(String[] args) {
        String[] buku = {"Harry Potter", "The Lord of The Rings", "The Hobbit", "Percy Jackson", "The Hunger Games"};
        int[] harga = {50000, 60000, 55000, 45000, 40000};
        System.out.println("List Buku");
        for (int i = 0; i < buku.length; i++) {
            System.out.println(buku[i]+ "\t" + harga[i]);
        }

        Scanner input = new Scanner(System.in);

        boolean ulang = true;
        do {
            System.out.print("Masukkan nama buku yang ingin dibeli: ");
            String namaBuku = input.nextLine();

            System.out.print("Masukkan jumlah buku yang ingin dibeli: ");
            int jumlahBuku = input.nextInt();

            input.nextLine(); 

            int indexBuku = -1;
            for (int i = 0; i < buku.length; i++) {
                if (buku[i].equalsIgnoreCase(namaBuku)) {
                    indexBuku = i;
                    break;
                }
            }

            if (indexBuku == -1) {
                System.out.println("Buku tidak ditemukan!");
                continue;
            }

            int totalHarga = harga[indexBuku] * jumlahBuku;

            System.out.println("Total harga pembelian: " + totalHarga);

            System.out.print("Apakah ingin membeli buku lagi? (y/n) ");
            String jawaban = input.nextLine();
            if (!jawaban.equalsIgnoreCase("y")) {
                ulang = false;
            }
        } while (ulang);
    }
}