/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exception;

/**
 *
 * @author Azzam Wildan
 */
public class ExcepTest4 {
    public static void main(String args[]) {
        try {
            // Deklarasi array dengan ukuran 2
            int a[] = new int[2];

            // Variabel b dideklarasikan sebagai 0
            int b = 0;

            // Melakukan pembagian dengan nol, yang menyebabkan ArithmeticException
            int c = 1 / b;

            // Mencoba mengakses elemen indeks 3 yang tidak ada
            System.out.println("Access element three :" + a[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Menangkap pengecualian ketika mencoba mengakses indeks yang tidak valid
            System.out.println("ArrayIndexOutOfBoundsException thrown :" + e);
        } catch (Exception e) {
            // Menangkap pengecualian umum (misalnya ArithmeticException)
            System.out.println("Exception thrown :" + e);
        }
        // Menunjukkan bahwa program tetap berjalan setelah pengecualian
        System.out.println("Out of the block");
    }
}

