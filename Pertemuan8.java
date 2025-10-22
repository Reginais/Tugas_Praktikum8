package pertemuan8;

/**
 *
 * @author regina
 */

import java.util.Scanner;
import models.Book;

public class Pertemuan8 {

    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
        
//        int[] myInteger = {1, 2, 3, 4, 5};
//        myInteger[0] = 1;
//        myInteger[0] = 1;
//        myInteger[0] = 1;
//        myInteger[0] = 1;

//        String[] myString = new String[5];
//        myString[0] = "Bayu";
//        myString[1] = "Bayu1";
//        myString[2] = "Bayu2";
//        myString[3] = "Bayu3";
//        myString[4] = "Bayu4";
//        System.out.println(myString[3]);
        
//      int[][] myInteger2D = new int[3][4];
//      myInteger2D[0][0] =

//    String[][] nama = 
//    {
//        {"Bayu", "Ismail", "Joko"},
//        {"Ismi", "Renata", "Hena"},
//    }; 
//    System.out.println(nama[1][1]);
//    int pilihan;
//    input.close();

//  Data Buku
    Book[] koleksi = new Book [5];
    koleksi[0] = new Book("Harry Potter", "J.K. Rouling", 1991, false);
    koleksi[1] = new Book("Bumi", "Tere Liye", 1231, false);
    koleksi[2] = new Book("Hujan", "Tere Liye", 2004, false);
    koleksi[3] = new Book("Seminggu sebelum aku mati", "Orang Barat", 1991, false);
    koleksi[4] = new Book ("After", "Orang Barat", 2019, false);
    
    
Scanner input = new Scanner(System.in);
    int pilihan;

    do {
            System.out.println("\n===== SISTEM PERPUSTAKAAN =====");
            System.out.println("1. Lihat semua Book");
            System.out.println("2. Cari Book berdasarkan judul");
            System.out.println("3. Pinjam Book");
            System.out.println("4. Kembalikan Book");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("\n--- Daftar Book ---");
                    // Lakukan perulangan untuk tampilkan info buku disini
                    for (Book b : koleksi) {
                        b.getDetailBook();
                    }
                    break;

                case 2:
                    System.out.print("Masukkan judul Book yang dicari: ");
                    String cari = input.nextLine();
                    boolean ditemukan = false;
                    
                    // Lakukan logika untuk mencari buku disini
                    for (Book b : koleksi) {
                        if(cari.equalsIgnoreCase(b.judul)) {
                            System.out.println("Buku ditemukan: ");
                            b.getDetailBook();
                            ditemukan = true;
                            break;
                        }
                    } 
                    if(!ditemukan) {
                        System.out.println("Buku tidak ditemukan");
                    }
                    break;

                case 3: 
                    System.out.print("Masukkan judul Book yang ingin dipinjam: ");
                    String pinjam = input.nextLine();
                    boolean ada = false;
    
                    // Lakukan logika untuk meminjam buku disini
                    for (Book b : koleksi) {
                        if (pinjam.equalsIgnoreCase(b.judul)) {
                            if (!b.isBooked) {
                                b.isBooked = true;  
                                System.out.println("Buku berhasil dipinjam: ");
                                b.getDetailBook();
                                ada = true;
                            } else {
                                System.out.println("Buku sedang dipinjam.");
                                ada = true;
                            }
                            break;
                        }
                    }
                    if (!ada) {
                        System.out.println("Buku tidak ditemukan.");
                    }
                    break;  

                case 4:
                    System.out.print("Masukkan judul Book yang dikembalikan: ");
                    String kembali = input.nextLine();
                    boolean ditemukanKembali = false;
                    
                    // Lakukan logika untuk mengembalikan buku disini
                    for (Book b : koleksi) {
                        if (kembali.equalsIgnoreCase(b.judul)) {
                            if (b.isBooked) {
                                b.isBooked = false;
                                System.out.println("Buku berhasil dikembalikan:");
                                b.getDetailBook();
                                ditemukanKembali = true;
                            } else {
                                System.out.println("Buku tidak sedang dipinjam.");
                                ditemukanKembali = true;
                            }
                            break;
                        }
                    }
                    if (!ditemukanKembali) {
                        System.out.println("Buku tidak ditemukan.");
                    }
                    break;

                case 0:
                    System.out.println("Keluar dari sistem...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }

        } while (pilihan != 0);
   }
}