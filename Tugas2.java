import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Pilih Menu:");
        System.out.println("1.Konversi Nilai ");
        System.out.println("2.Operasi Aritmatika ");
        System.out.print("Masukan Pilihan: ");
        int pilihan = input.nextInt();
            if(pilihan == 1){
            System.out.print("Masukan Nilai Anda: ");
            int nilai = input.nextInt();

                String grade;
                if(nilai >= 85 && nilai <=100){
                    grade = "A";
                }else if(nilai >= 75 && nilai <=84){
                    grade = "B";
                }else if(nilai >= 65 && nilai <=74){
                    grade = "C";
                }else if(nilai >= 55 && nilai <=64){
                    grade = "D";
                }else {
                    grade = "E";
                };
            System.out.println("Nilai Anda: "+nilai);
            System.out.println("Grade: "+grade);
            }
        else if (pilihan ==2){
        System.out.print("Input bilangan 1: ");
        double bilangan1 = input.nextDouble();

        System.out.print("Input bilangan 2: ");
        double bilangan2 = input.nextDouble();

        System.out.print("Input Operator (+,-,*,/,%) : ");
        char operator = input.next().charAt(0);

        double hasil;

        switch (operator) {
            case '+':
                hasil = bilangan1 + bilangan2;
                System.out.println("Hasil penjumlahan " + bilangan1 + " dan " + bilangan2 + " adalah " + hasil);
                break;
            case '-':
                hasil = bilangan1 - bilangan2;
                System.out.println("Hasil pengurangan " + bilangan1 + " dan " + bilangan2 + " adalah " + hasil);
                break;
            case '*':
                hasil = bilangan1 * bilangan2;
                System.out.println("Hasil perkalian " + bilangan1 + " dan " + bilangan2 + " adalah " + hasil);
                break;
            case '/':
                hasil = bilangan1 / bilangan2;
                System.out.println("Hasil pembagian " + bilangan1 + " dan " + bilangan2 + " adalah " + hasil);
                break;
            case '%':
                hasil = bilangan1 % bilangan2;
                System.out.println("Hasil modulus " + bilangan1 + " dan " + bilangan2 + " adalah " + hasil);
                break;
            default:
                System.out.println("Operator yang dimasukkan salah.");
                break;
            }
        }
    }
}
