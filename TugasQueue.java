
import java.util.ArrayDeque;
import java.util.Scanner;


public class TugasQueue {

    public static void main(String[] args) {
        ArrayDeque<String> daftar1 = new ArrayDeque<String>();
        ArrayDeque<String> daftar2 = new ArrayDeque<String>();
        int pilihan;
        do{
            Scanner pilih = new Scanner(System.in);
            System.out.println("===================================");    
            System.out.println("Menu Antrian");
            System.out.println("1. Tambah Data Antrian");
            System.out.println("2. Hapus Antrian Elemen Pertama");
            System.out.println("3. Hapus Antrian di Posisi Tertentu");
            System.out.println("4. Hapus Semua Elemen");
            System.out.println("5. Tampilkan Data Antrian");
            System.out.println("6. Keluar");
            System.out.println("===================================");    
            System.out.print("Pilihan Anda: ");
            pilihan = pilih.nextInt();
            
        switch(pilihan){
            case 1:
                    Scanner pilih2 = new Scanner(System.in);
                    System.out.println("Tambah Data Antrian");
                    System.out.print("Pilih Antrian 1/2: ");
                    int pilihAntrian = pilih2.nextInt();
                    if(pilihAntrian == 1 && daftar1.size() < 10){
                        Scanner pilih3 = new Scanner(System.in);
                        System.out.print("Masukan Nama Antrian 1: ");
                        String antrian1 = pilih3.nextLine();
                        daftar1.addLast(antrian1);
                    }
                    else if (pilihAntrian ==2 && daftar2.size() < 10){
                        Scanner pilih4 = new Scanner(System.in);
                        System.out.print("Masukan Nama Antrian 2: ");
                        String antrian2 = pilih4.nextLine();
                        daftar2.addLast(antrian2);
                    }                
                break;
            case 2:
                Scanner pilih5 = new Scanner(System.in);
                System.out.println("Menghapus Antrian Pertama");
                System.out.print("Pilih Antrian 1/2: ");
                int pilihAntrian2 = pilih5.nextInt();
                if(pilihAntrian2 == 1){
                    System.out.println("Antrian 1 Elemen Pertama Telah Dihapus");
                    daftar1.removeFirst();
                }
                else if (pilihAntrian2 == 2){
                    System.out.println("Antrian 2 Elemen Pertama Telah Dihapus");
                    daftar2.removeFirst();
                }
                break;
            case 3:
                Scanner pilih6 = new Scanner(System.in);
                System.out.println("Menghapus Antrian Pertama");
                System.out.print("Pilih Antrian 1/2: ");
                int pilihAntrian3 = pilih6.nextInt();
                if(pilihAntrian3 == 1){
                    Scanner pilih7 = new Scanner(System.in);
                    System.out.print("Pilih Urutan Antrian Yang diHapus: ");
                    int hapus1 = pilih7.nextInt();
                    int nomor = 0;
                    for(String data : daftar1){
                        if(nomor == hapus1-1){
                            daftar1.remove(data);
                        }
                        nomor = nomor + 1;
                    }
                }
                else if (pilihAntrian3 == 2){
                    Scanner pilih7 = new Scanner(System.in);
                    System.out.print("Pilih Urutan Antrian Yang diHapus: ");
                    int hapus2 = pilih7.nextInt();
                    int nomor = 0;
                    for(String data : daftar2){
                        if(nomor == hapus2-1){
                            daftar2.remove(data);
                        }
                        nomor = nomor + 1;
                    }
                }
                break;          
            case 4:
                Scanner pilih8 = new Scanner(System.in);
                System.out.println("Menghapus Semua Elemen");
                System.out.print("Pilih Antrian 1/2: ");
                int pilihAntrian4 = pilih8.nextInt();
                if(pilihAntrian4 == 1){
                    System.out.println("Seluruh Antrian 1 Telah Terhapus");
                    daftar1.clear();
                    
                }
                else if (pilihAntrian4 == 2){
                    System.out.println("Seluruh Antrian 2 Telah Terhapus");
                    daftar1.clear();
                }
                break;
            case 5:
                Scanner pilih9 = new Scanner(System.in);
                System.out.println("Menampilkan Data Antrian");
                System.out.print("Pilih Antrian 1/2: ");
                int pilihAntrian5 = pilih9.nextInt();
                if(pilihAntrian5 == 1){
                    System.out.println("Menampilkan Data Antrian 1");
                    int nomor = 1;
                    for(String data : daftar1){
                        System.out.println(nomor+"."+data);
                        nomor = nomor + 1;
                    }
                }
                else if (pilihAntrian5 == 2){
                    System.out.println("Menampilkan Data Antrian 2");
                    int nomor = 1;
                    for(String data : daftar2){
                        System.out.println(nomor+"."+data);
                        nomor = nomor + 1;
                    }
                }break;
                
            }
        }while(pilihan!=6);
    }
    
}
