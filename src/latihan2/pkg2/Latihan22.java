/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan2.pkg2;
import java.util.Scanner;

/**
 *
 * @author L340
 */
public class Latihan22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Deklarasi variabel
        double a, b, c, x1, x2;

        // Membaca input dari user
        Scanner input = new Scanner(System.in);
        System.out.println("nilai a: 1 ");
        a = 1;
        System.out.print("Masukkan nilai b: ");
        b = input.nextDouble();
        System.out.print("Masukkan nilai c: ");
        c = input.nextDouble();

        // Menghitung nilai determinan
        double d = b * b - 4 * a * c;

        // Menentukan jenis akar persamaan kuadrat
        if (d > 0) {
            // Akar persamaan kuadrat real dan berbeda
            x1 = (-b + Math.sqrt(d)) / (2 * a);
            x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("Akar persamaan kuadrat adalah " + x1 + " dan " + x2);
        } else if (d == 0) {
            // Akar persamaan kuadrat real dan sama
            x1 = (-b / (2 * a));
            System.out.println("Akar persamaan kuadrat adalah " + x1);
        } else {
            // Akar persamaan kuadrat imajiner
            System.out.println("Akar persamaan kuadrat adalah imajiner");
        }
    }
    
}
