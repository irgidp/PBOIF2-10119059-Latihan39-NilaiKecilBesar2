/* 
* @author
 * NAMA        : Irgi Dwiputra
 * KELAS       : IF-2
 * NIM         : 10119059
 * Deskripsi   : Program ini berisi menampilkan nilai kecil besar OO
 */
package pboif2.pkg10119059.latihan39.nilaikecilbesar;
/**
 *
 * @author Corazon
 */
import java.util.Scanner;
public class PBOIF210119059Latihan39NilaiKecilBesar {

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    Nilai nilai = new Nilai();
    String nama;
    
        System.out.println("===== Program Nilai Terbesar dan Terkecil Nilai Mahasiswa =====");
        System.out.print("Masukkan Nama Petugas : ");
        nama = input.nextLine();
        nilai.inputBanyakNilai();
        nilai.inputNilai();
        System.out.println("");
        System.out.println("Nilai Terbesar adalah "+ nilai.max());
        System.out.println("Nilai Terkecil adalah "+ nilai.min());
        System.out.println("");
        System.out.println("Petugas : " +nama);
    }
    
}
