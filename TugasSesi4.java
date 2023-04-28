import java.util.Scanner;

public class TugasSesi4 {
    public static void main(String[] args) {
        char[][] kamar = {
            {'*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*'},
            {'*', '*', '*', '*', '*'}
        };
        
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah tamu: ");
        int jumlahTamu = input.nextInt();
        
        for (int i = 1; i <= jumlahTamu; i++) {
            System.out.println("Tamu " + i + ":");
            System.out.print("Masukkan lantai (1-4): ");
            int lantai = input.nextInt() - 1;
            System.out.print("Masukkan nomor kamar (1-5): ");
            int kamarNo = input.nextInt() - 1;
            kamar[lantai][kamarNo] = 'X';
        }
        int jumlahKamarKosong = 0;
        for (int lantai = 0; lantai < kamar.length; lantai++) {
            for (int kamarNo = 0; kamarNo < kamar[lantai].length; kamarNo++) {
                if (kamar[lantai][kamarNo] == '*') {
                    jumlahKamarKosong++;
                } else {
                    System.out.println("Tamu berada di Lantai " + (lantai+1) + " Kamar " + (kamarNo+1));
                }
            }
        }
        
        System.out.println("Jumlah kamar yang tersedia adalah " + jumlahKamarKosong + " kamar");
    }
}
