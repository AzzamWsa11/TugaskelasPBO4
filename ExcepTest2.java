/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author Azzam Wildan
 */
public class ExcepTest2 {
    public static void main(String[] args) {
        // Array dengan 4 elemen, di mana indeks validnya adalah 0 hingga 3.
        int num[] = {1, 2, 3, 4};
        
        // Kita menggunakan try-catch untuk menangani kemungkinan ArrayIndexOutOfBoundsException.
        // ArrayIndexOutOfBoundsException adalah unchecked exception, artinya kesalahan ini terjadi
        // saat runtime ketika kita mencoba mengakses indeks yang di luar batas array.
        try {
            // Di sini kita mencoba mengakses elemen dengan indeks 5, yang sebenarnya tidak ada.
            // Karena array hanya memiliki 4 elemen, ini akan menyebabkan pengecualian.
            System.out.println(num[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Pengecualian akan ditangkap di sini, dan kita menampilkan pesan yang menjelaskan masalahnya.
            System.out.println("Indeks di luar batas: " + e.getMessage());
        }
        // Program akan tetap berjalan tanpa crash meskipun pengecualian terjadi.
    }
}
