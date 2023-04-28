import java.util.Stack;

public class TugasStack {
    public static void main(String[] args) {
        // Membuat Stack bilangan bulat
        Stack<Integer> angkaStack = new Stack<Integer>();

        // Menambahkan beberapa bilangan ke dalam Stack
        angkaStack.push(10);
        angkaStack.push(20);
        angkaStack.push(30);
        angkaStack.push(40);
        angkaStack.push(50);

        // Menampilkan isi Stack secara terbalik
        System.out.println("Isi Stack secara terbalik:");
        while (!angkaStack.empty()) {
            System.out.println(angkaStack.pop());
        }
    }
}
