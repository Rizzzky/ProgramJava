import java.util.LinkedList;
import java.util.Queue;

public class TugasQueue {
    public static void main(String[] args) {
        // Membuat Queue bilangan bulat
        Queue<Integer> angkaQueue = new LinkedList<Integer>();

        // Menambahkan beberapa bilangan ke dalam Queue
        angkaQueue.add(10);
        angkaQueue.add(20);
        angkaQueue.add(30);
        angkaQueue.add(40);
        angkaQueue.add(50);

        // Menampilkan isi Queue secara terurut
        System.out.println("Isi Queue secara terurut:");
        while (!angkaQueue.isEmpty()) {
            System.out.println(angkaQueue.poll());
        }
    }
}
