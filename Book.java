
package models;

/**
 *
 * @author regina
 */

public class Book {
    public String judul;
    public String penulis;
    public int tahunTerbit;
    public boolean isBooked;
    
    public Book (String judul, String penulis, int tahunTerbit, boolean isBooked) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
        this.isBooked = isBooked;
    };
    
    public void getDetailBook() {
        System.out.println("Judul:" + judul );
        System.out.println("Penulis:" + penulis);
        System.out.println("Tahun Terbit:" + tahunTerbit);
        System.out.println("Apakah tersedia: " + (isBooked ? "Ya" : "Tidak"));
        System.out.println("================================ \n");
    }
    
}
