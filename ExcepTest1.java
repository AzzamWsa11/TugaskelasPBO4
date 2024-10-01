/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author Azzam Wildan
 */
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;

public class ExcepTest1 {
    public static void main(String[] args) {
        // Kita menggunakan blok try-catch untuk menangani FileNotFoundException.
        // FileNotFoundException adalah checked exception, yang artinya harus ditangani
        // karena file mungkin tidak ditemukan pada lokasi yang diberikan.
        try {
            File file = new File("E://file.txt");
            // FileReader akan mencoba membuka file yang lokasinya kita berikan.
            FileReader fr = new FileReader(file);
            // Jika file tidak ditemukan, maka pengecualian akan dilempar.
            // Di sini kita dapat menambahkan kode lain untuk memproses file jika dibutuhkan.
        } catch (FileNotFoundException e) {
            // Jika file tidak ditemukan, kita menangkap pengecualian di sini
            // dan menampilkan pesan kesalahan. Ini mencegah program crash.
            System.out.println("File tidak ditemukan: " + e.getMessage());
        }
        // Dengan penanganan pengecualian ini, program tetap berjalan meskipun file tidak ada.
    }
}


