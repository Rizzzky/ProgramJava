public class TugasSesi10b {
    public static void main(String[] args) {
        String[] arr = {"Semarang", "Malang", "Jakarta", "Cianjur", "Bogor", "Denpasar"};
        
        System.out.println("Sebelum pengurutan:");
        printArray(arr);
        
        bubbleSortDescending(arr);
        
        System.out.println("Setelah pengurutan:");
        printArray(arr);
    }
    
    public static void bubbleSortDescending(String[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j].compareTo(arr[j + 1]) < 0) {
                    String temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    
    public static void printArray(String[] arr) {
        int n = arr.length;
        
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        
        System.out.println();
    }
}