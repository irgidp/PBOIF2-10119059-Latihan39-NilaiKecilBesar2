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
public class Nilai {
    Scanner input = new Scanner(System.in);
    int[]nilai = new int[10];
    int n;
    int max = 0;
    int min = 0;
    
    public int inputBanyakNilai() {
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        n = input.nextInt();
        return n;
    }
    
    public void inputNilai() {
        for(int i=1; i<=n; i++){
            System.out.print("Nilai Mahasiswa Ke-" + i +" = ");
            nilai[i] = input.nextInt();
        }
    }
    
    public void outputNilai() {
        for(int i=1; i<=n; i++){
            System.out.print("Nilai Mahasiswa Ke-" + i +" = "+nilai[i]);
        }
    }
    
    public int max() {
        max = nilai[1];
        for(int i=1; i<=n; i++){
            if (nilai[i] > max) {
                max = nilai[i];
            }
        }
        return max;
    }
    
    public int min() {
        min = nilai[1];
    for(int i=1; i<=n; i++){
        if (nilai[i] < min) {
            min = nilai[i];
            }
        }
    return min;
    }
    
}
