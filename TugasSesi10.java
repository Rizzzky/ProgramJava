public class TugasSesi10 {
    public static void main(String[] args) {
        int[] angka = {5, 2, 8, 12, 3};
        
        System.out.println("Sebelum pengurutan:");
        printArray(angka);
        
        insertionSort(angka);
        
        System.out.println("Setelah pengurutan:");
        printArray(angka);
    }
    
    public static void insertionSort(int[] angka) {
        int n = angka.length;
        
        for (int i = 1; i < n; i++) {
            int key = angka[i];
            int j = i - 1;
            
            while (j >= 0 && angka[j] > key) {
                angka[j + 1] = angka[j];
                j = j - 1;
            }
            
            angka[j + 1] = key;
        }
    }
    
    public static void printArray(int[] angka) {
        int n = angka.length;
        
        for (int i = 0; i < n; i++) {
            System.out.print(angka[i] + " ");
        }
        
        System.out.println();
    }
}
