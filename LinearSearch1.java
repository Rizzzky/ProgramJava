import java.util.Scanner;

public class LinearSearch1 {
    public static void main(String[] args) {
        int numbers[] = { 10, 50, 15, 13, 10, 5, 19, 33, 5, 35 };
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka yang ingin dicari: ");
        int target = scanner.nextInt();
        scanner.close();

        int position = linearSearch(numbers, target);

        if (position != -1) {
            System.out.println("Angka " + target + " ditemukan pada indeks ke-" + position);
        } else {
            System.out.println("Angka " + target + " tidak ditemukan dalam array.");
        }
    }

    static int linearSearch(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}