import java.util.ArrayList;
import java.util.Scanner;

public class Tugas5 {
    public static void main(String[] args) {
        ArrayList<String> jalur = new ArrayList<String>();
        jalur.add("Sukabumi");
        jalur.add("Cianjur");
        jalur.add("Bandung");
        jalur.add("Garut");
        jalur.add("Tasik");
        jalur.add("Ciamis");
        jalur.add("Banjar");

        int[] tarif = {10000, 15000, 7500, 5000, 7500, 6000};

        Scanner input = new Scanner(System.in);
        String keberangkatan, tujuan;
        System.out.println("Pilih Titik Keberangkatan dan Kota Tujuan ");
        System.out.println(jalur);
        do {
            System.out.print("Kota keberangkatan: ");
            keberangkatan = input.nextLine();
        } while (!jalur.contains(keberangkatan));
        do {
            System.out.print("Kota tujuan: ");
            tujuan = input.nextLine();
        } while (!jalur.contains(tujuan));

        int indexKeberangkatan = jalur.indexOf(keberangkatan);
        int indexTujuan = jalur.indexOf(tujuan);
        int jarak = Math.abs(indexKeberangkatan - indexTujuan);
        int tarifTotal = 0;
        for (int i = indexKeberangkatan; i < indexTujuan; i++) {
            tarifTotal += tarif[i];
        }
        System.out.print("Pulang-pergi (y/n)? ");
        String ppInput = input.nextLine();
        boolean pp = ppInput.equalsIgnoreCase("y");
        if (pp) {
            tarifTotal *= 2;
        }
        if ((keberangkatan.equals("Sukabumi") && tujuan.equals("Banjar"))
                || (keberangkatan.equals("Banjar") && tujuan.equals("Sukabumi"))) {
            tarifTotal *= 0.95;
        }
        System.out.print("Anggota TNI/POLRI (y/n)? ");
        String tniInput = input.nextLine();
        boolean tni = tniInput.equalsIgnoreCase("y");
        if (tni) {
            tarifTotal *= 0.9;
        }
        System.out.println("Tarif: "+ keberangkatan + " - " + tujuan + " Adalah " + tarifTotal);
    }
}
