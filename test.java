import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // deklarasi array antrian untuk 2 jalur
        String[] antrian1 = new String[10];
        String[] antrian2 = new String[10];

        // deklarasi variabel-variabel yang diperlukan
        int pilihan;
        String nama;
        int posisi;

        do {
            // menampilkan menu
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Antrian");
            System.out.println("2. Hapus Antrian Elemen Pertama");
            System.out.println("3. Hapus Antrian di Posisi Tertentu");
            System.out.println("4. Hapus Semua Elemen");
            System.out.println("5. Tampilkan Data");
            System.out.println("6. Keluar");
            System.out.print("Pilihan Anda: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan nama: ");
                    nama = input.next();

                    // menambahkan data antrian ke jalur dengan antrian terpendek
                    if (jumlah(antrian1) <= jumlah(antrian2)) {
                        tambah(antrian1, nama);
                    } else {
                        tambah(antrian2, nama);
                    }
                    break;

                case 2:
                    // menghapus antrian elemen pertama dari jalur yang paling depan
                    if (jumlah(antrian1) > 0) {
                        hapus(antrian1, 0);
                    } else if (jumlah(antrian2) > 0) {
                        hapus(antrian2, 0);
                    } else {
                        System.out.println("Antrian kosong");
                    }
                    break;

                case 3:
                    // menghapus antrian pada posisi tertentu dari salah satu jalur
                    System.out.print("Masukkan posisi: ");
                    posisi = input.nextInt();

                    if (posisi < 1 || posisi > 20) {
                        System.out.println("Posisi tidak valid");
                    } else if (posisi <= jumlah(antrian1)) {
                        hapus(antrian1, posisi-1);
                    } else if (posisi <= jumlah(antrian1) + jumlah(antrian2)) {
                        hapus(antrian2, posisi-jumlah(antrian1)-1);
                    } else {
                        System.out.println("Posisi tidak valid");
                    }
                    break;

                case 4:
                    // menghapus semua antrian dari kedua jalur
                    hapusSemua(antrian1);
                    hapusSemua(antrian2);
                    System.out.println("Semua antrian dihapus");
                    break;

                case 5:
                    // menampilkan data dari kedua jalur
                    System.out.println("Antrian Jalur 1:");
                    tampil(antrian1);
                    System.out.println("Antrian Jalur 2:");
                    tampil(antrian2);
                    break;

                case 6:
                    System.out.println("Terima kasih");
                    break;

                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }
    }
}