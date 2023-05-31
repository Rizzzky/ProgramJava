public class SelectionSort {
    public static void main(String[] args) {
        int[] nilai_1 = {30, 20, 15, 45, 70, 5};
        int[] nilai_2 = {10, 20, 30, 40, 25, 15, 5};

        goSort(nilai_1, "DESC");
        System.out.print("Hasil DESC nilai_1: ");
        printArray(nilai_1);

        goSort(nilai_1, "ASC");
        System.out.print("Hasil ASC nilai_1: ");
        printArray(nilai_1);

        goSort(nilai_2, "ASC");
        System.out.print("Hasil ASC nilai_2: ");
        printArray(nilai_2);

        goSort(nilai_2, "DESC");
        System.out.print("Hasil DESC nilai_2: ");
        printArray(nilai_2);
    }

    public static void goSort(int[] arr, String order) {
        int n = arr.length;
        int swapCount = 0;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (order.equalsIgnoreCase("ASC")) {
                    if (arr[j] < arr[minIndex]) {
                        minIndex = j;
                    }
                } else if (order.equalsIgnoreCase("DESC")) {
                    if (arr[j] > arr[minIndex]) {
                        minIndex = j;
                    }
                }
            }

            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                swapCount++;
            }
        }

        System.out.println("Jumlah swap: " + swapCount);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
