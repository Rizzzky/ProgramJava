import java.util.Scanner;

public class Tugas3 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String jawaban;
    do{
        System.out.println("Menu");
        System.out.println("1.Menentukan Kata Palindrome ");
        System.out.println("2.Menentukan Angka Palindrome ");
        System.out.print("Masukan Pilihan: ");
        int pilih = input.nextInt();
            if(pilih==1){
                System.out.print("Masukkan kata: ");
                String kata = input.next();    
                kata = kata.replaceAll("\\s+", "").toLowerCase();   
                String kataTerbalik = new StringBuilder(kata).reverse().toString();    
                if (kata.equals(kataTerbalik)) {
                System.out.println("Kata " + kata + " adalah palindrome");
                } else {
                System.out.println("Kata " + kata + " bukan palindrome");
                }
            }
            else if(pilih==2){
                System.out.print("Masukkan angka: ");
                int angka = input.nextInt();   
                int angkaPalindrome = angka;
                while (!isPalindrome(angkaPalindrome)) {
                angkaPalindrome++;
                    }  
                    System.out.println("Angka palindrome terdekat selanjutnya dari " + angka + " adalah " + angkaPalindrome);
                }
    System.out.print("Apakah ingin Mengulang: (Y/N)");
    jawaban = input.next();
                    
    }while(jawaban.equalsIgnoreCase("Y"));
            
        }    
        public static boolean isPalindrome(int angka) {
            String angkaStr = String.valueOf(angka);
            String angkaTerbalikStr = new StringBuilder(angkaStr).reverse().toString();
            return angkaStr.equals(angkaTerbalikStr);
                    
        }
}
