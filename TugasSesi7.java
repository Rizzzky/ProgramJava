import java.util.Scanner;

public class TugasSesi7 {
    static final int MAX_SIZE = 10;
    static String[] queue1 = new String[MAX_SIZE];
    static String[] queue2 = new String[MAX_SIZE];
    static int front1 = -1, rear1 = -1;
    static int front2 = -1, rear2 = -1;
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah antrian");
            System.out.println("2. Hapus antrian");
            System.out.println("3. Lihat antrian");
            System.out.println("4. Keluar");
            System.out.print("Pilih menu (1-4): ");
            int choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nama: ");
                    String name = input.next();
                    System.out.print("Jalur (1/2): ");
                    int queueNumber = input.nextInt();
                    if (queueNumber == 1) {
                        if (rear1 == MAX_SIZE - 1) {
                            System.out.println("Antrian penuh!");
                        } else {
                            if (front1 == -1) {
                                front1 = 0;
                            }
                            rear1++;
                            queue1[rear1] = name;
                            System.out.println(name + " ditambahkan ke antrian 1.");
                        }
                    } else if (queueNumber == 2) {
                        if (rear2 == MAX_SIZE - 1) {
                            System.out.println("Antrian penuh!");
                        } else {
                            if (front2 == -1) {
                                front2 = 0;
                            }
                            rear2++;
                            queue2[rear2] = name;
                            System.out.println(name + " ditambahkan ke antrian 2.");
                        }
                    } else {
                        System.out.println("Jalur tidak valid!");
                    }
                    break;
                case 2:
                    System.out.print("Jalur (1/2): ");
                    queueNumber = input.nextInt();
                    if (queueNumber == 1) {
                        if (front1 == -1) {
                            System.out.println("Antrian 1 kosong!");
                        } else {
                            String removedName = queue1[front1];
                            queue1[front1] = null;
                            if (front1 == rear1) {
                                front1 = -1;
                                rear1 = -1;
                            } else {
                                front1++;
                            }
                            System.out.println(removedName + " dihapus dari antrian 1.");
                            shiftQueue(queue1);
                        }
                    } else if (queueNumber == 2) {
                        if (front2 == -1) {
                            System.out.println("Antrian 2 kosong!");
                        } else {
                            String removedName = queue2[front2];
                            queue2[front2] = null;
                            if (front2 == rear2) {
                                front2 = -1;
                                rear2 = -1;
                            } else {
                                front2++;
                            }
                            System.out.println(removedName + " dihapus dari antrian 2.");
                            shiftQueue(queue2);
                        }
                    } else {
                        System.out.println("Jalur tidak valid!");
                    }
                    break;
                case 3:
                    System.out.println("Antrian ")
