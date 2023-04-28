import java.util.ArrayList;

public class TugasArrayList {
    public static void main(String[] args) {
        // Membuat ArrayList bilangan bulat
        ArrayList<Integer> angkaList = new ArrayList<Integer>();

        // Menambahkan beberapa bilangan ke dalam ArrayList
        angkaList.add(10);
        angkaList.add(20);
        angkaList.add(30);
        angkaList.add(40);
        angkaList.add(50);

        // Menampilkan isi ArrayList
        System.out.println("Isi ArrayList: " + angkaList);

        // Menampilkan jumlah bilangan dalam ArrayList
        System.out.println("Jumlah bilangan dalam ArrayList: " + angkaList.size());

        // Mengakses bilangan dalam ArrayList menggunakan indeks
        System.out.println("Bilangan pada indeks ke-1: " + angkaList.get(1));

        // Menghapus bilangan dari ArrayList
        angkaList.remove(3);
        System.out.println("Isi ArrayList setelah menghapus bilangan pada indeks ke-3: " + angkaList);

        // Menambahkan bilangan ke dalam ArrayList pada posisi tertentu
        angkaList.add(2, 35);
        System.out.println("Isi ArrayList setelah menambahkan bilangan 35 pada indeks ke-2: " + angkaList);
    }
}
