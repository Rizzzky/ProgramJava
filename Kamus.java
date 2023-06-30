import java.util.Arrays;
import java.util.Scanner;

class Kamus {
    private String[] englishWords;
    private String[] indonesianWords;

    public Kamus() {
        // Inisialisasi kamus dengan beberapa kata
        englishWords = new String[] { "apple", "banana", "cat", "dog", "elephant" };
        indonesianWords = new String[] { "apel", "pisang", "kucing", "anjing", "gajah" };

        // Pastikan kamus terurut berdasarkan kata-kata dalam bahasa Inggris
        Arrays.sort(englishWords);
    }

    public String translate(String word, boolean englishToIndonesian) {
        // Binary Search untuk mencari terjemahan dari kata yang diberikan
        int index = englishToIndonesian ? binarySearch(englishWords, word) : binarySearch(indonesianWords, word);

        if (index != -1) {
            return englishToIndonesian ? indonesianWords[index] : englishWords[index];
        }

        return "Kata tidak ditemukan";
    }

    private int binarySearch(String[] array, String target) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            int result = target.compareTo(array[mid]);

            if (result == 0) {
                return mid; // Kata ditemukan
            } else if (result < 0) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1; // Kata tidak ditemukan
    }
}