/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author Azzam Wildan
 */
public class ExcepTest3 {
    public static void main(String args[]) {
        try {
            // Deklarasi array dengan ukuran 2
            int a[] = new int[2];

            // Mencoba mengakses elemen indeks 3 yang tidak ada
            System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Menangkap pengecualian ketika mencoba mengakses indeks yang tidak valid
            System.out.println("Exception thrown  :" + e);
        }
        // Menunjukkan bahwa program tetap berjalan setelah pengecualian
        System.out.println("Out of the block");
    }
}
