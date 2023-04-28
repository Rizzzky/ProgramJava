import java.util.Scanner;
import java.util.Stack;

public class Playlist {
    public static void main(String[] args) {
        Stack<String> Playlist = new Stack<String>();
        int pilihan;
        do{
            Scanner input = new Scanner(System.in);
            System.out.println("Menu Playlist Lagu");
            System.out.println("==================");
            System.out.println("1. Tampilkan Data Playlist");
            System.out.println("2. Tambah Data Playlist");
            System.out.println("3. Hapus Data Playlist");
            System.out.println("4. Tambah Data Playlist di Urutan Tertentu");
            System.out.println("5. Hapus Data Playlist di Urutan Tertentu");
            System.out.println("6. Hapus Semua Playlist");
            System.out.println("7. Keluar");
            System.out.print("Pilihan anda: ");
            pilihan = input.nextInt();
        
        switch (pilihan){
            case 1:
                System.out.println("Playlist Lagu: ");
                int nomor = 1;
                for (String data:Playlist){
                System.out.println(nomor+"."+data);
                nomor = nomor+1;
                }break;
            case 2:
                Scanner input2 = new Scanner(System.in);
                System.out.print("Tambahkan Data PlayList: ");
                String pilihan2 = input2.nextLine();
                Playlist.push(pilihan2);
                break;
            
            case 3: case 5:
                System.out.println("Playlist Lagu: ");
                int nomor1 = 1;
                for (String data:Playlist){
                    System.out.println(nomor1+"."+data);
                    nomor1 = nomor1+1;
                }
                Scanner input3 = new Scanner(System.in);
                System.out.print("Pilih Lagu Yang Akan Dihapus: ");
                int pilihan3 = input3.nextInt();
                Playlist.remove(pilihan3-1);
                break;
            case 4:
                Scanner input4 = new Scanner(System.in);
                System.out.print("Tambahkan Playlist Lagu: ");
                String pilihan4 = input4.nextLine();
                Scanner input5 = new Scanner(System.in);
                System.out.print("Tentukan Urutan Lagu: ");
                int pilihan5 = input5.nextInt();
                Playlist.add(pilihan5-1, pilihan4);
                break;
            case 6:
                while(!Playlist.isEmpty()){
                    Playlist.pop();
                }   
            }                
        }while(pilihan!=7);
    }
}