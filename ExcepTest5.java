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
import java.io.FileWriter;
import java.io.IOException;

public class ExcepTest5 {
    public static void main(String args[]) {
        try {
            // Membuat objek file yang menunjuk ke file tertentu
            File file = new File("d:/test/testFile1.txt");

            // Mencoba membuat file baru, jika berhasil mencetak pesan "File is created!"
            if (file.createNewFile()) {
                System.out.println("File is created!");
            } else {
                // Jika file sudah ada, mencetak pesan "File already exists."
                System.out.println("File already exists.");
            }
            
            // Membuka FileWriter untuk menulis konten ke dalam file
            FileWriter writer = new FileWriter(file);
            writer.write("Test data"); // Menulis "Test data" ke file
            writer.close(); // Menutup FileWriter setelah penulisan selesai
            
            // Membuka FileReader untuk membaca konten dari file
            FileReader reader = new FileReader(file);
            int c;
            // Membaca setiap karakter dari file hingga akhir (EOF)
            while ((c = reader.read()) != -1) {
                char ch = (char) c; // Mengkonversi integer menjadi karakter
                System.out.print(ch); // Mencetak karakter yang dibaca
            }
            reader.close(); // Menutup FileReader setelah selesai membaca
        } catch (IOException e) {
            // Menangkap pengecualian terkait I/O (misalnya file tidak ditemukan atau tidak bisa diakses)
            System.out.print("Exception");
        }
    }
}

